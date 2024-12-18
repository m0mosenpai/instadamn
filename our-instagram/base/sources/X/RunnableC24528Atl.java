package X;

import com.facebook.cameracore.ardelivery.xplat.assetmanager.XplatAssetManagerCompletionCallback;

/* renamed from: X.Atl, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24528Atl implements Runnable {
    public final /* synthetic */ XplatAssetManagerCompletionCallback A00;
    public final /* synthetic */ String A01;

    public RunnableC24528Atl(XplatAssetManagerCompletionCallback xplatAssetManagerCompletionCallback, String str) {
        this.A00 = xplatAssetManagerCompletionCallback;
        this.A01 = str;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.SLV, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC203698zY interfaceC203698zY = this.A00.stateListener;
        ?? obj = new Object();
        obj.A00 = C05F.A15;
        obj.A01 = this.A01;
        interfaceC203698zY.DFx(obj.A00());
    }
}
