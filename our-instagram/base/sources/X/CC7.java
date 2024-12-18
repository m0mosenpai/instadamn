package X;

/* loaded from: classes5.dex */
public abstract class CC7 {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        C6FG c6fg = c6fq.A03;
        if (c6fg != null) {
            C102884kP c102884kP = (C102884kP) c6fw.A03(0);
            if (c102884kP.A05 == 16444) {
                Object A06 = AnonymousClass634.A06(c6fg, c102884kP);
                A06.getClass();
                C28182CbU c28182CbU = (C28182CbU) A06;
                InterfaceC09390do interfaceC09390do = c28182CbU.A04;
                if (((CUA) interfaceC09390do.getValue()).A02.isShowing() && !((CUA) interfaceC09390do.getValue()).A01) {
                    C28182CbU.A00(c28182CbU, c102884kP, false, true);
                    return null;
                }
                return null;
            }
            AbstractC25241Le.A02(AbstractC111324zv.A00(757), "Signature called with invalid model.");
            return null;
        }
        throw AbstractC25227BEk.A0n();
    }
}
