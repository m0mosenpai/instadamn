package com.facebook.cameracore.ardelivery.xplat.models;

import X.C203608zN;

/* loaded from: classes4.dex */
public final class XplatRemoteAsset {
    public static final C203608zN Companion = new Object();
    public static final String UNKNOWN = "unknown";
    public final String assetId;
    public final String cacheKey;
    public final int compressionType;
    public final String effectInstanceId;
    public final boolean encrypted;
    public final String fileName;
    public final long fileSizeInBytes;
    public final String md5Hash;
    public final String modelAssetType;
    public final String url;
    public final int xplatAssetType;

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if (r8.length() == 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public XplatRemoteAsset(com.facebook.cameracore.ardelivery.model.ARRequestAsset r10) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.ardelivery.xplat.models.XplatRemoteAsset.<init>(com.facebook.cameracore.ardelivery.model.ARRequestAsset):void");
    }

    public final String getAssetId() {
        return this.assetId;
    }

    public final String getCacheKey() {
        return this.cacheKey;
    }

    public final int getCompressionType() {
        return this.compressionType;
    }

    public final String getEffectInstanceId() {
        return this.effectInstanceId;
    }

    public final boolean getEncrypted() {
        return this.encrypted;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final long getFileSizeInBytes() {
        return this.fileSizeInBytes;
    }

    public final String getMd5Hash() {
        return this.md5Hash;
    }

    public final String getModelAssetType() {
        return this.modelAssetType;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int getXplatAssetType() {
        return this.xplatAssetType;
    }
}
