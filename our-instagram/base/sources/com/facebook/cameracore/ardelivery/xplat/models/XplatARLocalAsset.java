package com.facebook.cameracore.ardelivery.xplat.models;

import X.AbstractC167007dF;
import X.AbstractC167027dH;
import X.C14360o3;
import com.facebook.cameracore.ardelivery.model.ARAssetType;
import com.facebook.cameracore.ardelivery.model.XplatAssetType;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* loaded from: classes4.dex */
public final class XplatARLocalAsset {
    public final String assetId;
    public final String cacheKey;
    public final String effectInstanceId;
    public final String filePath;
    public final XplatAssetType xplatAssetType;

    public XplatARLocalAsset(String str, String str2, String str3, String str4, int i) {
        AbstractC167027dH.A0a(1, str, str2, str3, str4);
        this.assetId = str;
        this.effectInstanceId = str2;
        this.cacheKey = str3;
        this.filePath = str4;
        XplatAssetType ofCppValue = XplatAssetType.ofCppValue(i);
        C14360o3.A07(ofCppValue);
        this.xplatAssetType = ofCppValue;
    }

    public ARAssetType getARAssetType() {
        XplatAssetType xplatAssetType = this.xplatAssetType;
        switch (xplatAssetType.ordinal()) {
            case 1:
            case 3:
            case 4:
                return ARAssetType.EFFECT;
            case 2:
                return ARAssetType.ASYNC;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case Process.SIGTERM /* 15 */:
                return ARAssetType.SUPPORT;
            case 6:
                return ARAssetType.REMOTE;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case 14:
            default:
                throw AbstractC167007dF.A0c("unsupported xplat asset type ", xplatAssetType.name());
        }
    }

    public String getAssetId() {
        return this.assetId;
    }

    public String getCacheKey() {
        return this.cacheKey;
    }

    public String getEffectInstanceId() {
        return this.effectInstanceId;
    }

    public String getFilePath() {
        return this.filePath;
    }
}
