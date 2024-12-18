package X;

/* renamed from: X.1VG, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1VG {
    public static boolean A00;

    public static final synchronized void A00() {
        synchronized (C1VG.class) {
            C1V7 c1v7 = C1VY.A01;
            C14360o3.A08(c1v7);
            C1V7 c1v72 = C1VY.A00;
            C14360o3.A08(c1v72);
            A01(c1v7, c1v72, c1v7, c1v72, null, null, 0, false, false, false, false, false, false, false, false, true, true, true);
        }
    }

    public static final synchronized void A01(C1V7 c1v7, C1V7 c1v72, C1V7 c1v73, C1V7 c1v74, C25761Ni c25761Ni, Long l, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        synchronized (C1VG.class) {
            C14360o3.A0B(c1v7, 6);
            C14360o3.A0B(c1v72, 7);
            C14360o3.A0B(c1v73, 10);
            C14360o3.A0B(c1v74, 11);
            if (!A00) {
                C1VI.A00();
                A00 = true;
                C1VM.A00 = false;
                C1VO.A04 = i;
                C1VX.A03 = c1v7;
                C1VX.A02 = c1v72;
                C1VX.A01 = c1v73;
                C1VX.A00 = c1v74;
                C27511Ve.A04 = z6;
                C27511Ve.A01 = z9;
                C27511Ve.A03 = z10;
                C27511Ve.A02 = z11;
                if (l != null) {
                    C27511Ve.A00 = l.longValue();
                }
                C27581Vl c27581Vl = new C27581Vl(c25761Ni, z, z2, z3, z4, z5, z7, z8);
                synchronized (C1WP.class) {
                    if (C1WP.A00 != null) {
                        C0I2.A03("FrescoVitoProvider", "Fresco Vito already initialized! Vito must be initialized only once.");
                    }
                    C1WP.A00 = c27581Vl;
                }
            }
        }
    }
}
