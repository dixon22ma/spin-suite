/******************************************************************************
 * Product: Spin-Suite (Making your Business Spin)                            *
 * Copyright (C) 1999-2007 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
/** Generated Model - DO NOT CHANGE */
package org.spinsuite.model;

import android.content.Context;
import android.database.Cursor;
import org.spinsuite.base.DB;
import org.spinsuite.util.KeyNamePair;

/** Generated Model for AD_PrintForm
 *  @author Adempiere (generated) 
 *  @version Release 3.7.0LTS (1252452765) - $Id$ */
public class X_AD_PrintForm extends PO implements I_AD_PrintForm {
    /** Standard Constructor */
    public X_AD_PrintForm (Context ctx, int AD_PrintForm_ID, DB conn)
    {
      super (ctx, AD_PrintForm_ID, conn);
      /** if (AD_PrintForm_ID == 0)
        {
			setAD_PrintForm_ID (0);
			setName (null);
        } */
    }

    /** Load Constructor */
    public X_AD_PrintForm (Context ctx, Cursor rs, DB conn)
    {
      super (ctx, rs, conn);
    }


    /** Load Meta Data */
    protected POInfo initPO (Context ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, SPS_Table_ID, get_Connection());
      return poi;
    }

    public String toString()
    {
      StringBuffer sb = new StringBuffer ("X_AD_PrintForm[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Print Form.
		@param AD_PrintForm_ID 
		Form
	  */
	public void setAD_PrintForm_ID (int AD_PrintForm_ID)
	{
		if (AD_PrintForm_ID < 1) 
			set_Value (COLUMNNAME_AD_PrintForm_ID, null);
		else 
			set_Value (COLUMNNAME_AD_PrintForm_ID, Integer.valueOf(AD_PrintForm_ID));
	}

	/** Get Print Form.
		@return Form
	  */
	public int getAD_PrintForm_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_PrintForm_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Description.
		@param Description 
		Optional short description of the record
	  */
	public void setDescription (String Description)
	{
		set_Value (COLUMNNAME_Description, Description);
	}

	/** Get Description.
		@return Optional short description of the record
	  */
	public String getDescription () 
	{
		return (String)get_Value(COLUMNNAME_Description);
	}

	/** Set Distribution Order Mail Text.
		@param Distrib_Order_MailText_ID 
		Email text used for sending Distribution Order
	  */
	public void setDistrib_Order_MailText_ID (int Distrib_Order_MailText_ID)
	{
		if (Distrib_Order_MailText_ID < 1) 
			set_Value (COLUMNNAME_Distrib_Order_MailText_ID, null);
		else 
			set_Value (COLUMNNAME_Distrib_Order_MailText_ID, Integer.valueOf(Distrib_Order_MailText_ID));
	}

	/** Get Distribution Order Mail Text.
		@return Email text used for sending Distribution Order
	  */
	public int getDistrib_Order_MailText_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Distrib_Order_MailText_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Distribution Order Print Format.
		@param Distrib_Order_PrintFormat_ID 
		Print Format for printing Distribution Order
	  */
	public void setDistrib_Order_PrintFormat_ID (int Distrib_Order_PrintFormat_ID)
	{
		if (Distrib_Order_PrintFormat_ID < 1) 
			set_Value (COLUMNNAME_Distrib_Order_PrintFormat_ID, null);
		else 
			set_Value (COLUMNNAME_Distrib_Order_PrintFormat_ID, Integer.valueOf(Distrib_Order_PrintFormat_ID));
	}

	/** Get Distribution Order Print Format.
		@return Print Format for printing Distribution Order
	  */
	public int getDistrib_Order_PrintFormat_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Distrib_Order_PrintFormat_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Invoice Mail Text.
		@param Invoice_MailText_ID 
		Email text used for sending invoices
	  */
	public void setInvoice_MailText_ID (int Invoice_MailText_ID)
	{
		if (Invoice_MailText_ID < 1) 
			set_Value (COLUMNNAME_Invoice_MailText_ID, null);
		else 
			set_Value (COLUMNNAME_Invoice_MailText_ID, Integer.valueOf(Invoice_MailText_ID));
	}

	/** Get Invoice Mail Text.
		@return Email text used for sending invoices
	  */
	public int getInvoice_MailText_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Invoice_MailText_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Invoice Print Format.
		@param Invoice_PrintFormat_ID 
		Print Format for printing Invoices
	  */
	public void setInvoice_PrintFormat_ID (int Invoice_PrintFormat_ID)
	{
		if (Invoice_PrintFormat_ID < 1) 
			set_Value (COLUMNNAME_Invoice_PrintFormat_ID, null);
		else 
			set_Value (COLUMNNAME_Invoice_PrintFormat_ID, Integer.valueOf(Invoice_PrintFormat_ID));
	}

	/** Get Invoice Print Format.
		@return Print Format for printing Invoices
	  */
	public int getInvoice_PrintFormat_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Invoice_PrintFormat_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Manufacturing Order Mail Text.
		@param Manuf_Order_MailText_ID 
		Email text used for sending Manufacturing Order
	  */
	public void setManuf_Order_MailText_ID (int Manuf_Order_MailText_ID)
	{
		if (Manuf_Order_MailText_ID < 1) 
			set_Value (COLUMNNAME_Manuf_Order_MailText_ID, null);
		else 
			set_Value (COLUMNNAME_Manuf_Order_MailText_ID, Integer.valueOf(Manuf_Order_MailText_ID));
	}

	/** Get Manufacturing Order Mail Text.
		@return Email text used for sending Manufacturing Order
	  */
	public int getManuf_Order_MailText_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Manuf_Order_MailText_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Manufacturing Order Print Format.
		@param Manuf_Order_PrintFormat_ID 
		Print Format for printing Manufacturing Order
	  */
	public void setManuf_Order_PrintFormat_ID (int Manuf_Order_PrintFormat_ID)
	{
		if (Manuf_Order_PrintFormat_ID < 1) 
			set_Value (COLUMNNAME_Manuf_Order_PrintFormat_ID, null);
		else 
			set_Value (COLUMNNAME_Manuf_Order_PrintFormat_ID, Integer.valueOf(Manuf_Order_PrintFormat_ID));
	}

	/** Get Manufacturing Order Print Format.
		@return Print Format for printing Manufacturing Order
	  */
	public int getManuf_Order_PrintFormat_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Manuf_Order_PrintFormat_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Name.
		@param Name 
		Alphanumeric identifier of the entity
	  */
	public void setName (String Name)
	{
		set_Value (COLUMNNAME_Name, Name);
	}

	/** Get Name.
		@return Alphanumeric identifier of the entity
	  */
	public String getName () 
	{
		return (String)get_Value(COLUMNNAME_Name);
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair() 
    {
        return new KeyNamePair(get_ID(), getName());
    }

	/** Set Order Mail Text.
		@param Order_MailText_ID 
		Email text used for sending order acknowledgements or quotations
	  */
	public void setOrder_MailText_ID (int Order_MailText_ID)
	{
		if (Order_MailText_ID < 1) 
			set_Value (COLUMNNAME_Order_MailText_ID, null);
		else 
			set_Value (COLUMNNAME_Order_MailText_ID, Integer.valueOf(Order_MailText_ID));
	}

	/** Get Order Mail Text.
		@return Email text used for sending order acknowledgements or quotations
	  */
	public int getOrder_MailText_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Order_MailText_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Order Print Format.
		@param Order_PrintFormat_ID 
		Print Format for Orders, Quotes, Offers
	  */
	public void setOrder_PrintFormat_ID (int Order_PrintFormat_ID)
	{
		if (Order_PrintFormat_ID < 1) 
			set_Value (COLUMNNAME_Order_PrintFormat_ID, null);
		else 
			set_Value (COLUMNNAME_Order_PrintFormat_ID, Integer.valueOf(Order_PrintFormat_ID));
	}

	/** Get Order Print Format.
		@return Print Format for Orders, Quotes, Offers
	  */
	public int getOrder_PrintFormat_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Order_PrintFormat_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Project Mail Text.
		@param Project_MailText_ID 
		Standard text for Project EMails
	  */
	public void setProject_MailText_ID (int Project_MailText_ID)
	{
		if (Project_MailText_ID < 1) 
			set_Value (COLUMNNAME_Project_MailText_ID, null);
		else 
			set_Value (COLUMNNAME_Project_MailText_ID, Integer.valueOf(Project_MailText_ID));
	}

	/** Get Project Mail Text.
		@return Standard text for Project EMails
	  */
	public int getProject_MailText_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Project_MailText_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Project Print Format.
		@param Project_PrintFormat_ID 
		Standard Project Print Format
	  */
	public void setProject_PrintFormat_ID (int Project_PrintFormat_ID)
	{
		if (Project_PrintFormat_ID < 1) 
			set_Value (COLUMNNAME_Project_PrintFormat_ID, null);
		else 
			set_Value (COLUMNNAME_Project_PrintFormat_ID, Integer.valueOf(Project_PrintFormat_ID));
	}

	/** Get Project Print Format.
		@return Standard Project Print Format
	  */
	public int getProject_PrintFormat_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Project_PrintFormat_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Remittance Mail Text.
		@param Remittance_MailText_ID 
		Email text used for sending payment remittances
	  */
	public void setRemittance_MailText_ID (int Remittance_MailText_ID)
	{
		if (Remittance_MailText_ID < 1) 
			set_Value (COLUMNNAME_Remittance_MailText_ID, null);
		else 
			set_Value (COLUMNNAME_Remittance_MailText_ID, Integer.valueOf(Remittance_MailText_ID));
	}

	/** Get Remittance Mail Text.
		@return Email text used for sending payment remittances
	  */
	public int getRemittance_MailText_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Remittance_MailText_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Remittance Print Format.
		@param Remittance_PrintFormat_ID 
		Print Format for separate Remittances
	  */
	public void setRemittance_PrintFormat_ID (int Remittance_PrintFormat_ID)
	{
		if (Remittance_PrintFormat_ID < 1) 
			set_Value (COLUMNNAME_Remittance_PrintFormat_ID, null);
		else 
			set_Value (COLUMNNAME_Remittance_PrintFormat_ID, Integer.valueOf(Remittance_PrintFormat_ID));
	}

	/** Get Remittance Print Format.
		@return Print Format for separate Remittances
	  */
	public int getRemittance_PrintFormat_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Remittance_PrintFormat_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Shipment Mail Text.
		@param Shipment_MailText_ID 
		Email text used for sending delivery notes
	  */
	public void setShipment_MailText_ID (int Shipment_MailText_ID)
	{
		if (Shipment_MailText_ID < 1) 
			set_Value (COLUMNNAME_Shipment_MailText_ID, null);
		else 
			set_Value (COLUMNNAME_Shipment_MailText_ID, Integer.valueOf(Shipment_MailText_ID));
	}

	/** Get Shipment Mail Text.
		@return Email text used for sending delivery notes
	  */
	public int getShipment_MailText_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Shipment_MailText_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Shipment Print Format.
		@param Shipment_PrintFormat_ID 
		Print Format for Shipments, Receipts, Pick Lists
	  */
	public void setShipment_PrintFormat_ID (int Shipment_PrintFormat_ID)
	{
		if (Shipment_PrintFormat_ID < 1) 
			set_Value (COLUMNNAME_Shipment_PrintFormat_ID, null);
		else 
			set_Value (COLUMNNAME_Shipment_PrintFormat_ID, Integer.valueOf(Shipment_PrintFormat_ID));
	}

	/** Get Shipment Print Format.
		@return Print Format for Shipments, Receipts, Pick Lists
	  */
	public int getShipment_PrintFormat_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Shipment_PrintFormat_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}