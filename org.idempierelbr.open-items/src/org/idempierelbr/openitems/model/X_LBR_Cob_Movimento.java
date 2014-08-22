/******************************************************************************
 * Product: iDempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2012 ComPiere, Inc. All Rights Reserved.                *
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
package org.idempierelbr.openitems.model;

import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.model.*;

/** Generated Model for LBR_Cob_Movimento
 *  @author iDempiere (generated) 
 *  @version Release 2.0 - $Id$ */
public class X_LBR_Cob_Movimento extends PO implements I_LBR_Cob_Movimento, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20140821L;

    /** Standard Constructor */
    public X_LBR_Cob_Movimento (Properties ctx, int LBR_Cob_Movimento_ID, String trxName)
    {
      super (ctx, LBR_Cob_Movimento_ID, trxName);
      /** if (LBR_Cob_Movimento_ID == 0)
        {
			setLBR_CNAB240MovementType (null);
			setName (null);
        } */
    }

    /** Load Constructor */
    public X_LBR_Cob_Movimento (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 6 - System - Client 
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuffer sb = new StringBuffer ("X_LBR_Cob_Movimento[")
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

	/** 1 - Remessa (Cliente -> Banco) = 1 */
	public static final String LBR_CNAB240MOVEMENTTYPE_1_RemessaCliente_GtBanco = "1";
	/** 2 - Retorno (Banco -> Cliente) = 2 */
	public static final String LBR_CNAB240MOVEMENTTYPE_2_RetornoBanco_GtCliente = "2";
	/** Set Movement Type.
		@param LBR_CNAB240MovementType Movement Type	  */
	public void setLBR_CNAB240MovementType (String LBR_CNAB240MovementType)
	{

		set_Value (COLUMNNAME_LBR_CNAB240MovementType, LBR_CNAB240MovementType);
	}

	/** Get Movement Type.
		@return Movement Type	  */
	public String getLBR_CNAB240MovementType () 
	{
		return (String)get_Value(COLUMNNAME_LBR_CNAB240MovementType);
	}

	public I_LBR_Cob_GO getLBR_Cob_GO() throws RuntimeException
    {
		return (I_LBR_Cob_GO)MTable.get(getCtx(), I_LBR_Cob_GO.Table_Name)
			.getPO(getLBR_Cob_GO_ID(), get_TrxName());	}

	/** Set Collection Occurrences Group.
		@param LBR_Cob_GO_ID Collection Occurrences Group	  */
	public void setLBR_Cob_GO_ID (int LBR_Cob_GO_ID)
	{
		if (LBR_Cob_GO_ID < 1) 
			set_Value (COLUMNNAME_LBR_Cob_GO_ID, null);
		else 
			set_Value (COLUMNNAME_LBR_Cob_GO_ID, Integer.valueOf(LBR_Cob_GO_ID));
	}

	/** Get Collection Occurrences Group.
		@return Collection Occurrences Group	  */
	public int getLBR_Cob_GO_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_LBR_Cob_GO_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Collection Movement.
		@param LBR_Cob_Movimento_ID Collection Movement	  */
	public void setLBR_Cob_Movimento_ID (int LBR_Cob_Movimento_ID)
	{
		if (LBR_Cob_Movimento_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_LBR_Cob_Movimento_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_LBR_Cob_Movimento_ID, Integer.valueOf(LBR_Cob_Movimento_ID));
	}

	/** Get Collection Movement.
		@return Collection Movement	  */
	public int getLBR_Cob_Movimento_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_LBR_Cob_Movimento_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Collection Movement.
		@param LBR_Cob_Movimento_UU Collection Movement	  */
	public void setLBR_Cob_Movimento_UU (String LBR_Cob_Movimento_UU)
	{
		set_ValueNoCheck (COLUMNNAME_LBR_Cob_Movimento_UU, LBR_Cob_Movimento_UU);
	}

	/** Get Collection Movement.
		@return Collection Movement	  */
	public String getLBR_Cob_Movimento_UU () 
	{
		return (String)get_Value(COLUMNNAME_LBR_Cob_Movimento_UU);
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

	/** Set Search Key.
		@param Value 
		Search key for the record in the format required - must be unique
	  */
	public void setValue (String Value)
	{
		set_Value (COLUMNNAME_Value, Value);
	}

	/** Get Search Key.
		@return Search key for the record in the format required - must be unique
	  */
	public String getValue () 
	{
		return (String)get_Value(COLUMNNAME_Value);
	}
}