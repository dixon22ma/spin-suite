/*************************************************************************************
 * Product: SFAndroid (Sales Force Mobile)                                           *
 * This program is free software; you can redistribute it and/or modify it           *
 * under the terms version 2 of the GNU General Public License as published          *
 * by the Free Software Foundation. This program is distributed in the hope          *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied        *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.                  *
 * See the GNU General Public License for more details.                              *
 * You should have received a copy of the GNU General Public License along           *
 * with this program; if not, write to the Free Software Foundation, Inc.,           *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                            *
 * For the text or an alternative of this public license, you may reach us           *
 * Copyright (C) 2012-2014 E.R.P. Consultores y Asociados, S.A. All Rights Reserved. *
 * Contributor(s): Yamel Senih www.erpconsultoresyasociados.com                      *
 *************************************************************************************/
package org.spinsuite.adapters;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.spinsuite.base.R;
import org.spinsuite.util.DisplayType;
import org.spinsuite.util.TextViewArrayHolder;
import org.spinsuite.view.report.ColumnPrintData;
import org.spinsuite.view.report.InfoReportField;
import org.spinsuite.view.report.RowPrintData;

import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;

/**
 * @author <a href="mailto:yamelsenih@gmail.com">Yamel Senih</a>
 *
 */
public class ReportAdapter extends BaseAdapter implements Filterable {

	/**
	 * 
	 * *** Constructor ***
	 * @author <a href="mailto:yamelsenih@gmail.com">Yamel Senih</a> 29/03/2014, 15:35:03
	 * @param ctx
	 * @param data
	 * @param columns
	 * @param ll_HeaderReport
	 */
	public ReportAdapter(Context ctx, ArrayList<RowPrintData> data, InfoReportField[] columns, LinearLayout ll_HeaderReport) {		
		this.ctx = ctx;
		this.data = data;
		this.columns = columns;
		//	Set Parameter
    	v_param = new LayoutParams(200, 
    			LayoutParams.WRAP_CONTENT, WEIGHT);
    	//	
    	inflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    	//	
    	loadHeader(ll_HeaderReport);
    	instanceFormat();
    	notifyDataSetChanged();
	}
	
	/**
	 * 
	 * *** Constructor ***
	 * @author <a href="mailto:yamelsenih@gmail.com">Yamel Senih</a> 29/03/2014, 15:35:28
	 * @param ctx
	 * @param data
	 * @param columns
	 */
	public ReportAdapter(Context ctx, ArrayList<RowPrintData> data, InfoReportField[] columns) {		
		this(ctx, data, columns, null);
	}
	
	/**	Context						*/
	private Context 					ctx 			= null;
	/**	Data						*/
	private ArrayList<RowPrintData> 	originalData 	= null;
	/**	Data						*/
	private ArrayList<RowPrintData> 	data 			= null;
	/**	Columns						*/
	private InfoReportField[]			columns 		= null;
	/**	Column Parameter			*/
	private LayoutParams				v_param			= null;
	/**	Inflater					*/
	private LayoutInflater 				inflater 		= null;
	/**	Parameter					*/
	private static final float 			WEIGHT 			= 1;
	/**	Column Decimal Format		*/
	private DecimalFormat[]				cDecimalFormat 	= null;
	/**	Column Date Format			*/
	private SimpleDateFormat[]			cDateFormat 	= null;
	
	/**
	 * Add Item
	 * @author <a href="mailto:yamelsenih@gmail.com">Yamel Senih</a> 25/03/2014, 22:03:50
	 * @param row
	 * @return void
	 */
	public void addItem(RowPrintData row) {
		data.add(row);
		notifyDataSetChanged();
	}
	
	@Override
	public int getCount() {
		return data.size();
	}

	@Override
	public Object getItem(int position) {
		return data.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}
	
	/**
	 * Get Items
	 * @author <a href="mailto:yamelsenih@gmail.com">Yamel Senih</a> 25/03/2014, 22:04:21
	 * @return
	 * @return ArrayList<RowPrintData>
	 */
	public ArrayList<RowPrintData> getItems(){
		return data;
	}
	
	/**
	 * Format Text Field
	 * @author <a href="mailto:yamelsenih@gmail.com">Yamel Senih</a> 27/03/2014, 14:44:53
	 * @param tv_column
	 * @param index
	 * @return void
	 */
	private void formatField(TextView tv_column, int index){
		//	Valid Columns
		if(columns != null){
			InfoReportField formatField = columns[index];
			//	Set Style
			if(formatField.FieldAlignmentType
					.equals(InfoReportField.FIELD_ALIGNMENT_TYPE_TRAILING_RIGHT))
				tv_column.setGravity(Gravity.RIGHT);
			else if(formatField.FieldAlignmentType
					.equals(InfoReportField.FIELD_ALIGNMENT_TYPE_CENTER))
				tv_column.setGravity(Gravity.CENTER_HORIZONTAL);
			else 
				tv_column.setGravity(Gravity.LEFT);
		}
	}
	
	/**
	 * Load Labels Header
	 * @author <a href="mailto:yamelsenih@gmail.com">Yamel Senih</a> 29/03/2014, 15:42:00
	 * @param ll_HeaderReport
	 * @return void
	 */
	private void loadHeader(LinearLayout ll_HeaderReport){
		//	
		if(ll_HeaderReport == null)
			return;
		//	Remove Old Labels
		if(ll_HeaderReport.getChildCount() > 0)
			ll_HeaderReport.removeAllViews();
		//	Add Labels
		for(int i = 0; i < columns.length; i++){
			InfoReportField column = columns[i];
			//	Load Text View
			TextView tv_column = loadTextView(
					column.PrintName + (column.PrintNameSuffix != null
														? " " + column.PrintNameSuffix
														:""), i);
			//	Add to Layout
			ll_HeaderReport.addView(tv_column);
		}
	}
	
	/**
	 * Instance Decimal Format Column
	 * @author <a href="mailto:yamelsenih@gmail.com">Yamel Senih</a> 04/04/2014, 11:43:54
	 * @return void
	 */
	private void instanceFormat(){
		//	New Decimal Format
		cDecimalFormat = new DecimalFormat[columns.length];
		cDateFormat = new SimpleDateFormat[columns.length];
		//	
		for(int i = 0; i < columns.length; i++){
			InfoReportField column = columns[i];
			//	Only Numeric
			if(DisplayType.isNumeric(column.DisplayType))
				cDecimalFormat[i] = DisplayType.getNumberFormat(ctx, column.DisplayType, 
					column.FormatPattern);
			//	Only Date
			else if(DisplayType.isDate(column.DisplayType))
				cDateFormat[i] = DisplayType.getDateFormat(ctx, column.DisplayType, 
						column.FormatPattern);	
		}
		
	}
	
	/**
	 * Load a dynamic TextView
	 * @author <a href="mailto:yamelsenih@gmail.com">Yamel Senih</a> 26/03/2014, 11:47:32
	 * @param text
	 * @param index
	 * @return
	 * @return TextView
	 */
	private TextView loadTextView(String text, int index){
    	//	New Text Field
		TextView tv_column = new TextView(ctx);
		//	Set Parameters
		tv_column.setLayoutParams(v_param);
		//	Set Style
		tv_column.setTextAppearance(ctx, R.style.TextItemReport);
		//	Format Field
		formatField(tv_column, index);
		//	Set Text
		tv_column.setText(text);
		//	Return
		return tv_column;
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View view = convertView;
		//	
		TextViewArrayHolder holder = new TextViewArrayHolder();
		//	Data
		RowPrintData reportItem = data.get(position);
		//	Is not view
		if(view == null){
			view = (LinearLayout) inflater.inflate(R.layout.i_report, null);
			LinearLayout ll_ReportItem = (LinearLayout) view.findViewById(R.id.ll_ReportItem);
			//	
			ll_ReportItem.setWeightSum(columns.length);
			//	Add Columns
			for(int i = 0; i < columns.length; i++){
				//	Format
				String textValue = reportItem.getValue(i);
				//	Format Numeric
				if(DisplayType.isNumeric(columns[i].DisplayType)){
					DecimalFormat decimalFormat = cDecimalFormat[i];
					if(decimalFormat != null)
						textValue = decimalFormat.format(DisplayType.getNumber(textValue));
				} else if(DisplayType.isDate(columns[i].DisplayType)){
					SimpleDateFormat dateFormat = cDateFormat[i];
					if(dateFormat != null){
						long date = Long.getLong(textValue, 0);
						textValue = dateFormat.format(new Date(date));
					}
				}
				//	Set Value
				TextView tv_column = loadTextView(textValue, i);
				//	Add Holder
				holder.addTextView(tv_column);
				//	Add to Layout
				ll_ReportItem.addView(tv_column);
				//	Set Tag
				view.setTag(holder);
			}
		} else {
			//	Holder
			holder = (TextViewArrayHolder) view.getTag();
			//	Set Holder
			for(int i = 0; i < reportItem.getColumnsQty(); i++){
				//	Load Text View
				String textValue = reportItem.getValue(i);
				//	Format Numeric
				if(DisplayType.isNumeric(columns[i].DisplayType)){
					DecimalFormat decimalFormat = cDecimalFormat[i];
					if(decimalFormat != null)
						textValue = decimalFormat.format(DisplayType.getNumber(textValue));
				} else if(DisplayType.isDate(columns[i].DisplayType)){
					SimpleDateFormat dateFormat = cDateFormat[i];
					if(dateFormat != null){
						long date = Long.getLong(textValue, 0);
						textValue = dateFormat.format(new Date(date));
					}
				}
				//	Set Text
				holder.setText(textValue, i);
			}
		}
		//	Return
		return view;
	}

	@Override
	public Filter getFilter() {
		return new Filter() {
	        @SuppressWarnings("unchecked")
	        @Override
	        protected void publishResults(CharSequence constraint, FilterResults results) {
	            data = (ArrayList<RowPrintData>) results.values;
	            if (results.count > 0) {
	            	notifyDataSetChanged();
	            } else {
	            	notifyDataSetInvalidated();
	            }  
	        }

	        @Override
	        protected FilterResults performFiltering(CharSequence constraint) {
	            //	Populate Original Data
	        	if(originalData == null)
	            	originalData = data;
	        	//	Get filter result
	        	ArrayList<RowPrintData> filteredResults = getResults(constraint);
	            //	Result
	            FilterResults results = new FilterResults();
	            //	
	            results.values = filteredResults;
	            results.count = filteredResults.size();
	            
	            return results;
	        }

	        /**
	         * Search
	         * @author <a href="mailto:yamelsenih@gmail.com">Yamel Senih</a> 02/03/2014, 03:19:33
	         * @param constraint
	         * @return
	         * @return ArrayList<RowPrintData>
	         */
	        private ArrayList<RowPrintData> getResults(CharSequence constraint) {
	        	//	Verify
	            if(constraint != null
	            		&& constraint.length() > 0) {
	            	//	new Filter
	            	ArrayList<RowPrintData> filteredResult = new ArrayList<RowPrintData>();
	                for(RowPrintData item : originalData) {
	                	for(ColumnPrintData column : item.getColumns()){
	                		if((column.getValue() != null 
		                    		&& column.getValue().toLowerCase().contains(constraint.toString()))
		                    	|| (column.getSuffix() != null 
			                    		&& column.getSuffix().toLowerCase().contains(constraint.toString())))
		                        filteredResult.add(item);
	                	}
	                }
	                return filteredResult;
	            }
	            //	Only Data
	            return originalData;
	        }
	    };
	}
	
}
