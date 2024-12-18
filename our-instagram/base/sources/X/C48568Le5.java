package X;

/* renamed from: X.Le5, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48568Le5 implements InterfaceC43071ya {
    public final C62802tJ A00 = new C62802tJ(1.0f);
    public final C47445Kxa A01;

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        boolean A1a = AbstractC167017dG.A1a(c59062n7, interfaceC57162jr);
        if (interfaceC57162jr.CFq(c59062n7) != C05F.A0C && interfaceC57162jr.CGk(c59062n7) > 0.5f) {
            this.A00.A01(c59062n7.A05, interfaceC57162jr.CGk(c59062n7), interfaceC57162jr.BmE());
            return;
        }
        C62802tJ c62802tJ = this.A00;
        String str = c59062n7.A05;
        long A00 = c62802tJ.A00(str, interfaceC57162jr.BmE());
        if (A00 >= 500) {
            C47445Kxa c47445Kxa = this.A01;
            Object obj = c59062n7.A03;
            C14360o3.A06(obj);
            C45045Jwa c45045Jwa = (C45045Jwa) obj;
            C14360o3.A0B(c45045Jwa, A1a ? 1 : 0);
            LLR.A03(null, null, c47445Kxa.A00, Boolean.valueOf(A1a), null, Integer.valueOf(c45045Jwa.A01), Integer.valueOf(c45045Jwa.A02), Integer.valueOf(c45045Jwa.A03), Integer.valueOf(c45045Jwa.A00), Long.valueOf(A00), "INTERACTION_CARD_VIEW", "IMPRESSION", c45045Jwa.A04, null);
        }
        c62802tJ.A01.remove(str);
    }

    public C48568Le5(C47445Kxa c47445Kxa) {
        this.A01 = c47445Kxa;
    }
}
