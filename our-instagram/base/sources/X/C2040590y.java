package X;

import com.facebook.cameracore.ardelivery.effectasyncassetfetcher.listener.OnAsyncAssetFetchCompletedListener;
import com.facebook.cameracore.ardelivery.model.ARAssetType;
import com.facebook.cameracore.ardelivery.model.ARRequestAsset;
import com.facebook.cameracore.ardelivery.xplat.assetmanager.XplatAssetManagerCompletionCallback;
import com.facebook.cameracore.ardelivery.xplat.models.XplatRemoteAsset;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.90y, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2040590y implements InterfaceC2040690z {
    public static final List A01 = Arrays.asList(ARAssetType.ASYNC, ARAssetType.REMOTE);
    public final C150156pL A00;

    /* JADX WARN: Type inference failed for: r4v0, types: [X.AV3, java.lang.Object, X.8zY] */
    @Override // X.InterfaceC2040690z
    public final InterfaceC150176pN CxV(OnAsyncAssetFetchCompletedListener onAsyncAssetFetchCompletedListener, ARRequestAsset aRRequestAsset) {
        ?? obj = new Object();
        obj.A00 = onAsyncAssetFetchCompletedListener;
        C150156pL c150156pL = this.A00;
        return c150156pL.A05.fetchAsyncAsset(new XplatRemoteAsset(aRRequestAsset), new XplatAssetManagerCompletionCallback(obj, c150156pL.A08));
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.AV3, java.lang.Object, X.8zY] */
    @Override // X.InterfaceC2040690z
    public final InterfaceC150176pN CxW(OnAsyncAssetFetchCompletedListener onAsyncAssetFetchCompletedListener, ARAssetType aRAssetType, EnumC202068wl enumC202068wl, String str, String str2, String str3, boolean z) {
        ?? obj = new Object();
        obj.A00 = onAsyncAssetFetchCompletedListener;
        C150156pL c150156pL = this.A00;
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        return c150156pL.A05.fetchAsyncAssetByFBID(str, str2, new XplatAssetManagerCompletionCallback(obj, c150156pL.A08));
    }

    @Override // X.InterfaceC2040690z
    public final InterfaceC150176pN DGe(OnAsyncAssetFetchCompletedListener onAsyncAssetFetchCompletedListener, String str, String str2) {
        C150156pL c150156pL = this.A00;
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        C14360o3.A0B(onAsyncAssetFetchCompletedListener, 2);
        return c150156pL.A05.fetchAsyncAssetMetadata(str, str2, onAsyncAssetFetchCompletedListener);
    }

    public C2040590y(C150156pL c150156pL) {
        this.A00 = c150156pL;
    }
}
