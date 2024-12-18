package X;

import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.LcE, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48461LcE implements InterfaceC1345866i {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C1351169k A02;
    public final /* synthetic */ C132065xh A03;
    public final /* synthetic */ boolean A04;

    public C48461LcE(C1351169k c1351169k, C132065xh c132065xh, int i, int i2, boolean z) {
        this.A02 = c1351169k;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = z;
        this.A03 = c132065xh;
    }

    @Override // X.InterfaceC1345866i
    public final void EpD(C1346766r c1346766r) {
        C14360o3.A0B(c1346766r, 0);
        C1351169k c1351169k = this.A02;
        int i = this.A01;
        int i2 = this.A00;
        boolean z = this.A04;
        JWY jwy = new JWY(i2, 1, c1346766r, this.A03, z);
        InterfaceExecutorC135866Co A0C = AbstractC43592JPx.A0C(c1351169k, 0);
        MailboxFutureImpl A0I = AbstractC43593JPy.A0I(A0C, jwy);
        AbstractC25231BEo.A1C(A0C, new C48181LUf(i, i2, 0, A0I, c1351169k, z), A0I);
    }
}
