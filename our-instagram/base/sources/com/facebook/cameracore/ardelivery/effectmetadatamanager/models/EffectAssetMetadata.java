package com.facebook.cameracore.ardelivery.effectmetadatamanager.models;

import X.C0K8;
import com.facebook.cameracore.ardelivery.model.ARCapabilityMinVersionModeling;
import com.facebook.cameracore.ardelivery.model.ARRequestAsset;
import com.facebook.cameracore.ardelivery.model.XplatAssetType;
import com.google.common.collect.ImmutableList;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* loaded from: classes4.dex */
public class EffectAssetMetadata {

    @SerializedName("asset_type")
    public XplatAssetType mAssetType;

    @SerializedName("cache_key")
    public String mCacheKey;

    @SerializedName("capabilities_min_version")
    public List<ARCapabilityMinVersionModeling> mCapabilityMinVersionList;

    @SerializedName("compression_method")
    public ARRequestAsset.CompressionMethod mCompressionMethod;

    @SerializedName("effect_id")
    public String mEffectId;

    @SerializedName("instance_id")
    public String mEffectInstanceId;

    @SerializedName("file_name")
    public String mFileName;

    @SerializedName("file_size")
    public long mFileSizeBytes;

    @SerializedName("manifest_capabilities")
    public String mManifestCapabilities;

    @SerializedName("md5")
    public String mMd5Hash;

    @SerializedName("uri")
    public String mUri;

    public XplatAssetType getAssetType() {
        return this.mAssetType;
    }

    public String getCacheKey() {
        return this.mCacheKey;
    }

    public List getCapabilityMinVersionList() {
        return this.mCapabilityMinVersionList;
    }

    public ARRequestAsset.CompressionMethod getCompressionMethod() {
        return this.mCompressionMethod;
    }

    public String getEffectId() {
        return this.mEffectId;
    }

    public String getEffectInstanceId() {
        return this.mEffectInstanceId;
    }

    public String getFileName() {
        return this.mFileName;
    }

    public long getFileSizeBytes() {
        return this.mFileSizeBytes;
    }

    public String getManifestCapabilities() {
        return this.mManifestCapabilities;
    }

    public String getMd5Hash() {
        return this.mMd5Hash;
    }

    public String getUri() {
        return this.mUri;
    }

    public EffectAssetMetadata(String str, String str2, String str3, String str4, ImmutableList immutableList, String str5, long j, String str6, int i, int i2, String str7) {
        this.mEffectId = str;
        this.mEffectInstanceId = str2;
        this.mCacheKey = str3;
        this.mUri = str4;
        if (immutableList == null) {
            C0K8.A0Q("EffectAssetMetadata", "capabilityMinVersionList is null. effect id: %s", str);
        }
        this.mCapabilityMinVersionList = immutableList;
        this.mFileName = str5;
        this.mFileSizeBytes = j;
        this.mMd5Hash = str6;
        this.mAssetType = XplatAssetType.ofCppValue(i);
        this.mCompressionMethod = ARRequestAsset.CompressionMethod.fromCompressionTypeCppValue(i2);
        this.mManifestCapabilities = str7;
    }
}
