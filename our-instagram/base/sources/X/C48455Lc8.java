package X;

import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.Lc8, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48455Lc8 implements InterfaceC1345866i {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ K3U A02;
    public final /* synthetic */ boolean A03;

    public C48455Lc8(K3U k3u, int i, int i2, boolean z) {
        this.A02 = k3u;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = z;
    }

    @Override // X.InterfaceC1345866i
    public final void EpD(C1346766r c1346766r) {
        C14360o3.A0B(c1346766r, 0);
        K3U k3u = this.A02;
        int i = this.A01;
        int i2 = this.A00;
        boolean z = this.A03;
        InterfaceExecutorC135866Co ASj = k3u.mMailboxApiHandleMetaProvider.ASj(3);
        MailboxFutureImpl A0D = AbstractC43592JPx.A0D(ASj);
        AbstractC25231BEo.A1C(ASj, new C48181LUf(i, i2, 1, A0D, k3u, z), A0D);
        A0D.addResultCallback(new JVL(c1346766r, 17));
    }
}
