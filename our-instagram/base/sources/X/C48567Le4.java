package X;

/* renamed from: X.Le4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48567Le4 implements InterfaceC43071ya {
    public final C62802tJ A00 = new C62802tJ(0.5f);
    public final C47694L4b A01;

    public C48567Le4(C47694L4b c47694L4b) {
        this.A01 = c47694L4b;
    }

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
        if (A00 >= 250) {
            C47694L4b c47694L4b = this.A01;
            double d = A00;
            Object obj = c59062n7.A03;
            C14360o3.A06(obj);
            C45205Jzl c45205Jzl = (C45205Jzl) obj;
            C14360o3.A0B(c45205Jzl, A1a ? 1 : 0);
            C45128JyU c45128JyU = c45205Jzl.A02;
            C4F5 c4f5 = c45128JyU.A05;
            LLR llr = c47694L4b.A03;
            if (c4f5 != null) {
                llr.A0B(c47694L4b.A02, c45128JyU, (long) d, A1a);
            } else {
                llr.A09((long) d, C45128JyU.A00(c45128JyU), A1a);
            }
        }
        c62802tJ.A01.remove(str);
    }
}
