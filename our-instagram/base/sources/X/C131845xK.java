package X;

/* renamed from: X.5xK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C131845xK {
    public final C6FQ A00;

    public C131845xK(C6FQ c6fq) {
        this.A00 = c6fq;
    }

    public static Object A00(C6FQ c6fq, C6FW c6fw, InterfaceC103384lE interfaceC103384lE) {
        AnonymousClass630 A02;
        AnonymousClass630 A022;
        try {
            C6FQ A00 = C6FQ.A00(interfaceC103384lE.Byi(), c6fq, null);
            C1LN.A01("LispyEvaluation");
            AbstractC102954kW.A05.incrementAndGet();
            C6FG c6fg = A00.A03;
            if (c6fg != null && (A022 = AnonymousClass634.A02(c6fg)) != null && AbstractC79383gk.A03()) {
                A022.A00++;
            }
            try {
                return C6FY.A00(A00, c6fw, interfaceC103384lE);
            } finally {
                C1LN.A00();
                if (c6fg != null && (A02 = AnonymousClass634.A02(c6fg)) != null) {
                    A02.A08();
                }
            }
        } catch (C1338562t e) {
            AbstractC25241Le.A00(c6fq.A03, "BloksInterpreter", "Exception while evaluating Lispy Script", e);
            return null;
        }
    }
}
