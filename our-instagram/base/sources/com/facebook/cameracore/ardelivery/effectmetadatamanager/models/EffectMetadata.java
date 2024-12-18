package com.facebook.cameracore.ardelivery.effectmetadatamanager.models;

import X.AbstractC166987dD;
import X.AbstractC167027dH;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* loaded from: classes10.dex */
public class EffectMetadata {
    public final String mEffectId;
    public final String mEffectName;
    public final List mInstructionModels;
    public final String mManifestCapabilities;
    public final String mProductList;
    public final int mSortOrder;
    public final String mThumbnailUrl;
    public final int mThumbnailUrlExpirationTimestamp;
    public final String mThumbnailUrlFallback;

    public String getEffectId() {
        return this.mEffectId;
    }

    public String getEffectName() {
        return this.mEffectName;
    }

    public List getInstructionModels() {
        return this.mInstructionModels;
    }

    public String getManifestCapabilities() {
        return this.mManifestCapabilities;
    }

    public String getProductList() {
        return this.mProductList;
    }

    public int getSortOrder() {
        return this.mSortOrder;
    }

    public String getThumbnailUrl() {
        return this.mThumbnailUrl;
    }

    public int getThumbnailUrlExpirationTimestamp() {
        return this.mThumbnailUrlExpirationTimestamp;
    }

    public String getThumbnailUrlFallback() {
        return this.mThumbnailUrlFallback;
    }

    public EffectMetadata(String str, String str2, String str3, int i, String str4, String str5, int i2, String str6, ImmutableList immutableList) {
        this.mEffectId = str;
        this.mEffectName = str2;
        this.mProductList = str3;
        this.mSortOrder = i;
        this.mManifestCapabilities = str4;
        this.mThumbnailUrl = str5;
        this.mThumbnailUrlExpirationTimestamp = i2;
        this.mThumbnailUrlFallback = str6;
        this.mInstructionModels = immutableList;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("EffectMetadata{mEffectId='");
        A1C.append(this.mEffectId);
        A1C.append('\'');
        A1C.append(", mEffectName='");
        A1C.append(this.mEffectName);
        A1C.append('\'');
        A1C.append(", mProductList='");
        A1C.append(this.mProductList);
        A1C.append('\'');
        A1C.append(", mSortOrder=");
        A1C.append(this.mSortOrder);
        A1C.append(", mManifestCapabilities='");
        A1C.append(this.mManifestCapabilities);
        A1C.append('\'');
        A1C.append(", mThumbnailUrl='");
        A1C.append(this.mThumbnailUrl);
        A1C.append('\'');
        A1C.append(", mThumbnailUrlExpirationTimestamp=");
        A1C.append(this.mThumbnailUrlExpirationTimestamp);
        A1C.append(", mThumbnailUrlFallback='");
        A1C.append(this.mThumbnailUrlFallback);
        A1C.append('\'');
        A1C.append(", mInstructionModels=");
        A1C.append(this.mInstructionModels);
        return AbstractC167027dH.A0R(A1C);
    }
}
