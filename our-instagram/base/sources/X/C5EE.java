package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.5EE, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5EE extends C5AY implements InterfaceC1129358c, InterfaceC1129458d {
    public int A00;
    public InterfaceC132245y2 A01;
    public UserSession A02;
    public InterfaceC60442pS A03;
    public final BZn A04;
    public final J2G A05;

    public C5EE(InterfaceC132245y2 interfaceC132245y2, Integer num, int i) {
        C14360o3.A0B(interfaceC132245y2, 1);
        C14360o3.A0B(num, 3);
        this.A01 = interfaceC132245y2;
        this.A00 = i;
        J2G j2g = new J2G(this);
        this.A05 = j2g;
        BZn bZn = new BZn(j2g, CMB.A00, num, interfaceC132245y2.BKd(), this.A01.Bet().A03);
        A0F(bZn);
        this.A04 = bZn;
    }

    @Override // X.InterfaceC1129358c
    public final void DWO() {
        AbstractC137676Lo.A00(this, new C50155MDi(this, 32));
    }
}
