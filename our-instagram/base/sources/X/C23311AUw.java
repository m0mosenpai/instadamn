package X;

import com.facebook.cameracore.ardelivery.effectasyncassetfetcher.listener.OnAsyncAssetFetchCompletedListener;
import com.facebook.cameracore.ardelivery.model.ARAssetType;
import com.facebook.cameracore.ardelivery.model.ARRequestAsset;

/* renamed from: X.AUw, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23311AUw implements InterfaceC2040690z {
    @Override // X.InterfaceC2040690z
    public final InterfaceC150176pN CxV(OnAsyncAssetFetchCompletedListener onAsyncAssetFetchCompletedListener, ARRequestAsset aRRequestAsset) {
        return new AV2(this, 0);
    }

    @Override // X.InterfaceC2040690z
    public final InterfaceC150176pN CxW(OnAsyncAssetFetchCompletedListener onAsyncAssetFetchCompletedListener, ARAssetType aRAssetType, EnumC202068wl enumC202068wl, String str, String str2, String str3, boolean z) {
        return new AV2(this, 1);
    }

    @Override // X.InterfaceC2040690z
    public final InterfaceC150176pN DGe(OnAsyncAssetFetchCompletedListener onAsyncAssetFetchCompletedListener, String str, String str2) {
        return new AV2(this, 2);
    }
}
