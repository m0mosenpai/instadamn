package com.facebook.cameracore.ardelivery.xplat.models;

import X.C14360o3;

/* loaded from: classes4.dex */
public final class XplatAssetIdentifier {
    public final String assetId;
    public final String cacheKey;
    public final String effectInstanceId;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public XplatAssetIdentifier(com.facebook.cameracore.ardelivery.model.ARRequestAsset r4) {
        /*
            r3 = this;
            r0 = 1
            X.C14360o3.A0B(r4, r0)
            X.7pa r0 = r4.A02
            java.lang.String r2 = r0.A09
            X.C14360o3.A07(r2)
            java.lang.String r1 = r0.A0A
            java.lang.String r0 = r0.A08
            r3.<init>(r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.ardelivery.xplat.models.XplatAssetIdentifier.<init>(com.facebook.cameracore.ardelivery.model.ARRequestAsset):void");
    }

    public final String getAssetId() {
        return this.assetId;
    }

    public final String getCacheKey() {
        return this.cacheKey;
    }

    public final String getEffectInstanceId() {
        return this.effectInstanceId;
    }

    public XplatAssetIdentifier(String str, String str2, String str3) {
        C14360o3.A0B(str, 1);
        this.assetId = str;
        this.effectInstanceId = str2;
        this.cacheKey = str3;
    }
}
