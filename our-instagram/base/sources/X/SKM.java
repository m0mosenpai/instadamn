package X;

import com.facebook.cameracore.ardelivery.model.ARRequestAsset;
import com.facebook.cameracore.ardelivery.xplat.async.XplatAsyncMetadataCompletionCallback;
import com.facebook.cameracore.ardelivery.xplat.async.XplatAsyncMetadataResponse;

/* loaded from: classes10.dex */
public final class SKM {
    public final /* synthetic */ XplatAsyncMetadataCompletionCallback A00;

    public final void A00(SHK shk) {
        C14360o3.A0B(shk, 0);
        String str = shk.A02;
        String str2 = shk.A00;
        String str3 = shk.A03;
        EnumC203618zO xplatCompressionType = ARRequestAsset.CompressionMethod.toXplatCompressionType(ARRequestAsset.CompressionMethod.fromString(shk.A01));
        C14360o3.A07(xplatCompressionType);
        this.A00.onSuccess(new XplatAsyncMetadataResponse(str, str2, str3, xplatCompressionType));
    }

    public SKM(XplatAsyncMetadataCompletionCallback xplatAsyncMetadataCompletionCallback) {
        this.A00 = xplatAsyncMetadataCompletionCallback;
    }
}
