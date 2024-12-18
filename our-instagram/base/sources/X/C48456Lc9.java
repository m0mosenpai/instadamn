package X;

import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.Lc9, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48456Lc9 implements InterfaceC1345866i {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ K3U A02;
    public final /* synthetic */ String A03;

    public C48456Lc9(K3U k3u, String str, int i, int i2) {
        this.A02 = k3u;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = str;
    }

    @Override // X.InterfaceC1345866i
    public final void EpD(C1346766r c1346766r) {
        C14360o3.A0B(c1346766r, 0);
        K3U k3u = this.A02;
        int i = this.A01;
        int i2 = this.A00;
        String str = this.A03;
        InterfaceExecutorC135866Co ASj = k3u.mMailboxApiHandleMetaProvider.ASj(3);
        MailboxFutureImpl A0D = AbstractC43592JPx.A0D(ASj);
        AbstractC25231BEo.A1C(ASj, new LUU(A0D, k3u, str, i, i2), A0D);
        A0D.addResultCallback(new JVL(c1346766r, 18));
    }
}
