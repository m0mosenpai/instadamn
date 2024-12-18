package X;

/* renamed from: X.IpZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42372IpZ implements InterfaceC43071ya {
    public final C147466kW A00;

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        boolean A1R = AbstractC167007dF.A1R(0, c59062n7, interfaceC57162jr);
        float CGk = interfaceC57162jr.CGk(c59062n7);
        int A01 = AbstractC37301Gc2.A01(c59062n7, interfaceC57162jr);
        if (A01 != 0 && A01 != A1R) {
            C147466kW c147466kW = this.A00;
            Object obj = c59062n7.A03;
            C14360o3.A06(obj);
            C138276Oi c138276Oi = (C138276Oi) obj;
            C14360o3.A0B(c138276Oi, 0);
            if (!c147466kW.A00) {
                c147466kW.A02(c138276Oi, "scroll", false);
                c147466kW.A02.remove(c138276Oi);
                return;
            }
            return;
        }
        C147466kW c147466kW2 = this.A00;
        Object obj2 = c59062n7.A03;
        C14360o3.A06(obj2);
        C138276Oi c138276Oi2 = (C138276Oi) obj2;
        C14360o3.A0B(c138276Oi2, 0);
        if (c147466kW2.A00) {
            return;
        }
        c147466kW2.A01(c138276Oi2);
        c147466kW2.A02.put(c138276Oi2, Float.valueOf(CGk));
    }

    public C42372IpZ(C147466kW c147466kW) {
        this.A00 = c147466kW;
    }
}
