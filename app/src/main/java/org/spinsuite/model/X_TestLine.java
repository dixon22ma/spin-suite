/******************************************************************************
 * Product: Adempiere ERP & CRM Smart Business Solution                       *
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
import java.util.Date;
import org.spinsuite.base.DB;
import org.spinsuite.util.KeyNamePair;

/** Generated Model for TestLine
 *  @author Adempiere (generated) 
 *  @version Release 3.7.0LTS (1252452765) - $Id$ */
public class X_TestLine extends PO implements I_TestLine, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20140407L;

    /** Standard Constructor */
    public X_TestLine (Context ctx, int TestLine_ID, DB conn)
    {
      super (ctx, TestLine_ID, conn);
      /** if (TestLine_ID == 0)
        {
			setTestLine_ID (0);
        } */
    }

    /** Load Constructor */
    public X_TestLine (Context ctx, Cursor rs, DB conn)
    {
      super (ctx, rs, conn);
    }


    /** Load Meta Data */
    protected POInfo initPO (Context ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, SFA_Table_ID, get_Connection());
      return poi;
    }

    public String toString()
    {
      StringBuffer sb = new StringBuffer ("X_TestLine[")
        .append(get_ID()).append("]");
      return sb.toString();
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

	/** Set Line.
		@param LineNo 
		Line No
	  */
	public void setLineNo (int LineNo)
	{
		set_Value (COLUMNNAME_LineNo, Integer.valueOf(LineNo));
	}

	/** Get Line.
		@return Line No
	  */
	public int getLineNo () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_LineNo);
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

	/** Set Test ID.
		@param Test_ID Test ID	  */
	public void setTest_ID (int Test_ID)
	{
		if (Test_ID < 1) 
			set_Value (COLUMNNAME_Test_ID, null);
		else 
			set_Value (COLUMNNAME_Test_ID, Integer.valueOf(Test_ID));
	}

	/** Get Test ID.
		@return Test ID	  */
	public int getTest_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Test_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Test Line.
		@param TestLine_ID Test Line	  */
	public void setTestLine_ID (int TestLine_ID)
	{
		if (TestLine_ID < 1) 
			set_Value (COLUMNNAME_TestLine_ID, null);
		else 
			set_Value (COLUMNNAME_TestLine_ID, Integer.valueOf(TestLine_ID));
	}

	/** Get Test Line.
		@return Test Line	  */
	public int getTestLine_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TestLine_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}