package X;

import com.facebook.cameracore.ardelivery.xplat.modelmanager.versionfetcher.XplatRemoteModelVersionFetchCompletionCallback;

/* renamed from: X.AXd, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23354AXd implements InterfaceC48212Jk {
    public final int A00;
    public final Object A01;

    public C23354AXd(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC48212Jk
    public final void invoke(Throwable th) {
        switch (this.A00) {
            case 0:
                XplatRemoteModelVersionFetchCompletionCallback xplatRemoteModelVersionFetchCompletionCallback = (XplatRemoteModelVersionFetchCompletionCallback) this.A01;
                String message = th.getMessage();
                if (message == null) {
                    message = "";
                }
                xplatRemoteModelVersionFetchCompletionCallback.onFailure(message);
                return;
            case 1:
                C23553Ac7 c23553Ac7 = (C23553Ac7) this.A01;
                C14360o3.A0A(th);
                c23553Ac7.onFailure(th);
                return;
            case 2:
                C14360o3.A0B(th, 0);
                ((AbstractC192798gL) this.A01).A00.A02(new C115095Ie(th));
                return;
            case 3:
                ((InterfaceC24741Ir) this.A01).F8s(new C194848jk(th));
                return;
            default:
                ((C173207nY) this.A01).A00(th);
                return;
        }
    }
}
