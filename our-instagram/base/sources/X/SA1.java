package X;

/* loaded from: classes10.dex */
public abstract class SA1 {
    public static final RTQ A00;
    public static final RTQ A01;
    public static final RTO A02;
    public static final RTO A03;
    public static final C58529Pwx A04;
    public static final C58529Pwx A05;
    public static final RTK A06;
    public static final RTL A07;

    static {
        try {
            SXz sXz = SXz.A03;
            A04 = new C58529Pwx(sXz, 16);
            try {
                A05 = new C58529Pwx(sXz, 32);
                try {
                    C62931SXy c62931SXy = C62931SXy.A03;
                    A02 = S3E.A00(c62931SXy, 16, 16);
                    try {
                        A03 = S3E.A00(c62931SXy, 16, 32);
                        try {
                            SYA sya = SYA.A03;
                            C62930SXx c62930SXx = C62930SXx.A03;
                            A00 = SSR.A00(sya, c62930SXx);
                            try {
                                A01 = SSR.A01(sya, c62930SXx, 32, 32, 16, 32);
                                A06 = new RTK(SY1.A03);
                                A07 = new RTL(SY2.A03);
                            } catch (Exception e) {
                                throw new RuntimeException(e);
                            }
                        } catch (Exception e2) {
                            throw new RuntimeException(e2);
                        }
                    } catch (Exception e3) {
                        throw new RuntimeException(e3);
                    }
                } catch (Exception e4) {
                    throw new RuntimeException(e4);
                }
            } catch (Exception e5) {
                throw new RuntimeException(e5);
            }
        } catch (Exception e6) {
            throw new RuntimeException(e6);
        }
    }
}
