package com.facebook.cameracore.ardelivery.xplat.async;

import X.C14360o3;
import X.C150076p5;
import X.EnumC203618zO;
import X.InterfaceC150086p6;
import X.SHK;
import com.facebook.cameracore.ardelivery.model.ARRequestAsset;

/* loaded from: classes3.dex */
public final class XplatAsyncMetadataFetcher {
    public InterfaceC150086p6 metadataDownloader;

    public XplatAsyncMetadataFetcher(InterfaceC150086p6 interfaceC150086p6) {
        C14360o3.A0B(interfaceC150086p6, 1);
        this.metadataDownloader = interfaceC150086p6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x008e, code lost:
    
        if (r10.equals(r11.get("pvr_compression")) != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void fetchAsyncAssetMetadata(java.lang.String r18, java.lang.String r19, com.facebook.cameracore.ardelivery.xplat.async.XplatAsyncMetadataCompletionCallback r20) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.ardelivery.xplat.async.XplatAsyncMetadataFetcher.fetchAsyncAssetMetadata(java.lang.String, java.lang.String, com.facebook.cameracore.ardelivery.xplat.async.XplatAsyncMetadataCompletionCallback):void");
    }

    public final XplatAsyncMetadataResponse fetchMetadataFromCache(String str) {
        C14360o3.A0B(str, 0);
        SHK shk = (SHK) ((C150076p5) this.metadataDownloader).A03.get(str);
        if (shk == null) {
            return null;
        }
        String str2 = shk.A02;
        String str3 = shk.A00;
        String str4 = shk.A03;
        EnumC203618zO xplatCompressionType = ARRequestAsset.CompressionMethod.toXplatCompressionType(ARRequestAsset.CompressionMethod.fromString(shk.A01));
        C14360o3.A07(xplatCompressionType);
        return new XplatAsyncMetadataResponse(str2, str3, str4, xplatCompressionType);
    }

    public final void setMetadataDownloader(InterfaceC150086p6 interfaceC150086p6) {
        C14360o3.A0B(interfaceC150086p6, 0);
        this.metadataDownloader = interfaceC150086p6;
    }

    public final void clearMetadataCache() {
        ((C150076p5) this.metadataDownloader).A03.clear();
    }

    public final InterfaceC150086p6 getMetadataDownloader() {
        return this.metadataDownloader;
    }
}
