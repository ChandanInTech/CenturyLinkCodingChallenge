package com.example.centurylinkcodingchallenge.model;

public class BasePojo {

    private String id;

    private String transferredTo;

    private String phoneNumber;

    private AssetStatusHistories[] assetStatusHistories;

    private String verification;

    private String techId;

    private String transferredFrom;

    private String releaseReason;

    private String lastModifiedDate;

    private String remarks;

    private String createdDate;

    private String assetTag;

    private String assetStatus;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getTransferredTo ()
    {
        return transferredTo;
    }

    public void setTransferredTo (String transferredTo)
    {
        this.transferredTo = transferredTo;
    }

    public String getPhoneNumber ()
    {
        return phoneNumber;
    }

    public void setPhoneNumber (String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public AssetStatusHistories[] getAssetStatusHistories ()
    {
        return assetStatusHistories;
    }

    public void setAssetStatusHistories (AssetStatusHistories[] assetStatusHistories)
    {
        this.assetStatusHistories = assetStatusHistories;
    }

    public String getVerification ()
    {
        return verification;
    }

    public void setVerification (String verification)
    {
        this.verification = verification;
    }

    public String getTechId ()
    {
        return techId;
    }

    public void setTechId (String techId)
    {
        this.techId = techId;
    }

    public String getTransferredFrom ()
    {
        return transferredFrom;
    }

    public void setTransferredFrom (String transferredFrom)
    {
        this.transferredFrom = transferredFrom;
    }

    public String getReleaseReason ()
    {
        return releaseReason;
    }

    public void setReleaseReason (String releaseReason)
    {
        this.releaseReason = releaseReason;
    }

    public String getLastModifiedDate ()
    {
        return lastModifiedDate;
    }

    public void setLastModifiedDate (String lastModifiedDate)
    {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getRemarks ()
    {
        return remarks;
    }

    public void setRemarks (String remarks)
    {
        this.remarks = remarks;
    }

    public String getCreatedDate ()
    {
        return createdDate;
    }

    public void setCreatedDate (String createdDate)
    {
        this.createdDate = createdDate;
    }

    public String getAssetTag ()
    {
        return assetTag;
    }

    public void setAssetTag (String assetTag)
    {
        this.assetTag = assetTag;
    }

    public String getAssetStatus ()
    {
        return assetStatus;
    }

    public void setAssetStatus (String assetStatus)
    {
        this.assetStatus = assetStatus;
    }

}
