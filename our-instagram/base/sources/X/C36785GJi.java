package X;

/* renamed from: X.GJi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36785GJi implements GZY {
    public final /* synthetic */ C32279EJq A00;
    public final /* synthetic */ boolean A01;
    public final /* synthetic */ boolean A02;

    @Override // X.GZY
    public final void onAuthorizeFail() {
    }

    public C36785GJi(C32279EJq c32279EJq, boolean z, boolean z2) {
        this.A01 = z;
        this.A00 = c32279EJq;
        this.A02 = z2;
    }

    @Override // X.GZY
    public final void onAuthorizeSuccess(String str, String str2) {
        if (this.A01) {
            C32279EJq c32279EJq = this.A00;
            C151546s0 c151546s0 = C151546s0.A00;
            InterfaceC09390do interfaceC09390do = c32279EJq.A0C;
            c151546s0.A0F(c32279EJq, AbstractC166987dD.A0r(interfaceC09390do), "facebook_page", false);
            c151546s0.A08(c32279EJq.requireContext(), EnumC31499Dsj.FACEBOOK_PAGE, c32279EJq, AbstractC166987dD.A0r(interfaceC09390do));
            C34649FOh c34649FOh = new C34649FOh();
            c34649FOh.A0c = true;
            AbstractC35216Fg9.A01(c32279EJq, AbstractC166987dD.A0r(interfaceC09390do), c34649FOh, new GSi(c32279EJq, 1));
            return;
        }
        if (!this.A02) {
            return;
        }
        C32279EJq c32279EJq2 = this.A00;
        C34649FOh c34649FOh2 = new C34649FOh();
        c34649FOh2.A0b = true;
        C151546s0 c151546s02 = C151546s0.A00;
        InterfaceC09390do interfaceC09390do2 = c32279EJq2.A0C;
        c151546s02.A0F(c32279EJq2, AbstractC166987dD.A0r(interfaceC09390do2), "facebook", false);
        c151546s02.A08(c32279EJq2.requireContext(), EnumC31499Dsj.FACEBOOK, c32279EJq2, AbstractC166987dD.A0r(interfaceC09390do2));
        AbstractC35216Fg9.A00(c32279EJq2, AbstractC166987dD.A0r(interfaceC09390do2), c34649FOh2, new GSi(c32279EJq2, 2));
    }
}
