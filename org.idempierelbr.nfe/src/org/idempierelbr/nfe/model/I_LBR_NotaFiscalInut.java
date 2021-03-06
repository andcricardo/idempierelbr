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
package org.idempierelbr.nfe.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.model.*;
import org.compiere.util.KeyNamePair;

/** Generated Interface for LBR_NotaFiscalInut
 *  @author iDempiere (generated) 
 *  @version Release 2.1
 */
@SuppressWarnings("all")
public interface I_LBR_NotaFiscalInut 
{

    /** TableName=LBR_NotaFiscalInut */
    public static final String Table_Name = "LBR_NotaFiscalInut";

    /** AD_Table_ID=800009 */
    public static final int Table_ID = 800009;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 1 - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(1);

    /** Load Meta Data */

    /** Column name AD_Client_ID */
    public static final String COLUMNNAME_AD_Client_ID = "AD_Client_ID";

	/** Get Client.
	  * Client/Tenant for this installation.
	  */
	public int getAD_Client_ID();

    /** Column name AD_Org_ID */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

	/** Set Organization.
	  * Organizational entity within client
	  */
	public void setAD_Org_ID (int AD_Org_ID);

	/** Get Organization.
	  * Organizational entity within client
	  */
	public int getAD_Org_ID();

    /** Column name Created */
    public static final String COLUMNNAME_Created = "Created";

	/** Get Created.
	  * Date this record was created
	  */
	public Timestamp getCreated();

    /** Column name CreatedBy */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";

	/** Get Created By.
	  * User who created this records
	  */
	public int getCreatedBy();

    /** Column name DateDoc */
    public static final String COLUMNNAME_DateDoc = "DateDoc";

	/** Set Document Date.
	  * Date of the Document
	  */
	public void setDateDoc (Timestamp DateDoc);

	/** Get Document Date.
	  * Date of the Document
	  */
	public Timestamp getDateDoc();

    /** Column name Description */
    public static final String COLUMNNAME_Description = "Description";

	/** Set Description.
	  * Optional short description of the record
	  */
	public void setDescription (String Description);

	/** Get Description.
	  * Optional short description of the record
	  */
	public String getDescription();

    /** Column name DocumentNo */
    public static final String COLUMNNAME_DocumentNo = "DocumentNo";

	/** Set Document No.
	  * Document sequence number of the document
	  */
	public void setDocumentNo (String DocumentNo);

	/** Get Document No.
	  * Document sequence number of the document
	  */
	public String getDocumentNo();

    /** Column name IsActive */
    public static final String COLUMNNAME_IsActive = "IsActive";

	/** Set Active.
	  * The record is active in the system
	  */
	public void setIsActive (boolean IsActive);

	/** Get Active.
	  * The record is active in the system
	  */
	public boolean isActive();

    /** Column name LBR_Justification */
    public static final String COLUMNNAME_LBR_Justification = "LBR_Justification";

	/** Set Justification	  */
	public void setLBR_Justification (String LBR_Justification);

	/** Get Justification	  */
	public String getLBR_Justification();

    /** Column name LBR_LotSendingProt */
    public static final String COLUMNNAME_LBR_LotSendingProt = "LBR_LotSendingProt";

	/** Set NF-e Lot Sending Protocol.
	  * Indicates the protocol of the sending process to Sefaz
	  */
	public void setLBR_LotSendingProt (String LBR_LotSendingProt);

	/** Get NF-e Lot Sending Protocol.
	  * Indicates the protocol of the sending process to Sefaz
	  */
	public String getLBR_LotSendingProt();

    /** Column name LBR_LotSendingStatus */
    public static final String COLUMNNAME_LBR_LotSendingStatus = "LBR_LotSendingStatus";

	/** Set NF-e Lot Sending Status.
	  * Indicates the status of the sending process to Sefaz
	  */
	public void setLBR_LotSendingStatus (String LBR_LotSendingStatus);

	/** Get NF-e Lot Sending Status.
	  * Indicates the status of the sending process to Sefaz
	  */
	public String getLBR_LotSendingStatus();

    /** Column name LBR_LotSentOn */
    public static final String COLUMNNAME_LBR_LotSentOn = "LBR_LotSentOn";

	/** Set NF-e Lot Sent On.
	  * The date+time (expressed in decimal format) when the NF-e Lot has been sent
	  */
	public void setLBR_LotSentOn (Timestamp LBR_LotSentOn);

	/** Get NF-e Lot Sent On.
	  * The date+time (expressed in decimal format) when the NF-e Lot has been sent
	  */
	public Timestamp getLBR_LotSentOn();

    /** Column name LBR_NFBModel */
    public static final String COLUMNNAME_LBR_NFBModel = "LBR_NFBModel";

	/** Set NFB (DocType) Model	  */
	public void setLBR_NFBModel (String LBR_NFBModel);

	/** Get NFB (DocType) Model	  */
	public String getLBR_NFBModel();

    /** Column name LBR_NFeEnv */
    public static final String COLUMNNAME_LBR_NFeEnv = "LBR_NFeEnv";

	/** Set Sefaz NF-e Environment	  */
	public void setLBR_NFeEnv (String LBR_NFeEnv);

	/** Get Sefaz NF-e Environment	  */
	public String getLBR_NFeEnv();

    /** Column name LBR_NFeSerie */
    public static final String COLUMNNAME_LBR_NFeSerie = "LBR_NFeSerie";

	/** Set NF Serie	  */
	public void setLBR_NFeSerie (String LBR_NFeSerie);

	/** Get NF Serie	  */
	public String getLBR_NFeSerie();

    /** Column name LBR_NotaFiscalInut_ID */
    public static final String COLUMNNAME_LBR_NotaFiscalInut_ID = "LBR_NotaFiscalInut_ID";

	/** Set Unused NF-e Numbering.
	  * Identifies a Unused NF-e Numbering
	  */
	public void setLBR_NotaFiscalInut_ID (int LBR_NotaFiscalInut_ID);

	/** Get Unused NF-e Numbering.
	  * Identifies a Unused NF-e Numbering
	  */
	public int getLBR_NotaFiscalInut_ID();

    /** Column name LBR_NotaFiscalInut_UU */
    public static final String COLUMNNAME_LBR_NotaFiscalInut_UU = "LBR_NotaFiscalInut_UU";

	/** Set Unused NF-e Numbering.
	  * Identifies a Unused NF-e Numbering
	  */
	public void setLBR_NotaFiscalInut_UU (String LBR_NotaFiscalInut_UU);

	/** Get Unused NF-e Numbering.
	  * Identifies a Unused NF-e Numbering
	  */
	public String getLBR_NotaFiscalInut_UU();

    /** Column name LBR_Number_End */
    public static final String COLUMNNAME_LBR_Number_End = "LBR_Number_End";

	/** Set Number (End).
	  * Indicates the end number
	  */
	public void setLBR_Number_End (String LBR_Number_End);

	/** Get Number (End).
	  * Indicates the end number
	  */
	public String getLBR_Number_End();

    /** Column name LBR_Number_Start */
    public static final String COLUMNNAME_LBR_Number_Start = "LBR_Number_Start";

	/** Set Number (Start).
	  * Indicates the start number
	  */
	public void setLBR_Number_Start (String LBR_Number_Start);

	/** Get Number (Start).
	  * Indicates the start number
	  */
	public String getLBR_Number_Start();

    /** Column name Processed */
    public static final String COLUMNNAME_Processed = "Processed";

	/** Set Processed.
	  * The document has been processed
	  */
	public void setProcessed (boolean Processed);

	/** Get Processed.
	  * The document has been processed
	  */
	public boolean isProcessed();

    /** Column name Updated */
    public static final String COLUMNNAME_Updated = "Updated";

	/** Get Updated.
	  * Date this record was updated
	  */
	public Timestamp getUpdated();

    /** Column name UpdatedBy */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

	/** Get Updated By.
	  * User who updated this records
	  */
	public int getUpdatedBy();
}
