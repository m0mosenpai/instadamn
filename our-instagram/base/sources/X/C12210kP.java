package X;

/* renamed from: X.0kP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12210kP {
    public InterfaceC11380iw A00;
    public String A01;
    public C12180kM A02 = C12180kM.A02;
    public final AbstractC12990ll A03;

    public final void A01(C12180kM c12180kM) {
        C14360o3.A0B(c12180kM, 0);
        this.A02 = c12180kM;
    }

    public final C18920wW A00() {
        String str = this.A01;
        InterfaceC11380iw interfaceC11380iw = this.A00;
        if (str != null) {
            if (interfaceC11380iw == null) {
                interfaceC11380iw = new C19270xB(str);
            } else {
                throw new IllegalStateException("must set one of mModuleName or mAnalyticsModule");
            }
        }
        return new C18920wW(interfaceC11380iw, this.A02, this.A03);
    }

    public C12210kP(AbstractC12990ll abstractC12990ll) {
        this.A03 = abstractC12990ll;
    }
}
