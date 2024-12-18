package X;

import com.facebook.cameracore.ardelivery.effectasyncassetfetcher.listener.OnAsyncAssetFetchCompletedListener;
import com.facebook.cameracore.ardelivery.xplat.models.XplatARLocalAsset;
import java.io.IOException;
import java.util.List;

/* loaded from: classes4.dex */
public final class AV3 implements InterfaceC203698zY {
    public OnAsyncAssetFetchCompletedListener A00;

    @Override // X.InterfaceC203698zY
    public final void DFx(RkH rkH) {
        this.A00.onAsyncAssetFetchCompleted(null, rkH.A00());
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.SLV, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.SLV, java.lang.Object] */
    @Override // X.InterfaceC203698zY
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        List list = (List) obj;
        if (list != null && !list.isEmpty()) {
            if (list.size() > 1) {
                str = "should not fetch more than 1 asset for at a time for async assets";
            } else {
                XplatARLocalAsset xplatARLocalAsset = (XplatARLocalAsset) AbstractC166987dD.A16(list);
                if (!C2040590y.A01.contains(xplatARLocalAsset.getARAssetType())) {
                    str = AnonymousClass001.A0R("Unsupported asset type used in Async Asset request : ", xplatARLocalAsset.getARAssetType().toString());
                } else {
                    try {
                        this.A00.onAsyncAssetFetchCompleted(xplatARLocalAsset.filePath, null);
                        return;
                    } catch (IOException | SecurityException unused) {
                        ?? obj2 = new Object();
                        obj2.A00 = C05F.A0B;
                        obj2.A01 = "bad async asset file path";
                        DFx(obj2.A00());
                        return;
                    }
                }
            }
        } else {
            str = "empty asset downloaded";
        }
        ?? obj3 = new Object();
        obj3.A00 = C05F.A0B;
        obj3.A01 = str;
        DFx(obj3.A00());
    }
}
