package X;

import java.util.NoSuchElementException;

/* renamed from: X.17s, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C17s extends AbstractC225617t {
    public static final float A01(float f) {
        return A02(f, 0.0f, 1.0f);
    }

    public static final int A04(AbstractC50712Us abstractC50712Us, C17u c17u) {
        C14360o3.A0B(abstractC50712Us, 1);
        try {
            return AbstractC172607mU.A00(abstractC50712Us, c17u);
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public static final long A06(long j, long j2, long j3) {
        if (j2 <= j3) {
            if (j < j2) {
                return j2;
            }
            if (j > j3) {
                return j3;
            }
            return j;
        }
        throw new IllegalArgumentException(AnonymousClass001.A0Y("Cannot coerce value to an empty range: maximum ", " is less than minimum ", '.', j3, j2));
    }

    public static final Comparable A09(Comparable comparable, InterfaceC58315Pt7 interfaceC58315Pt7) {
        C14360o3.A0B(interfaceC58315Pt7, 1);
        if (!interfaceC58315Pt7.isEmpty()) {
            Comparable BzZ = interfaceC58315Pt7.BzZ();
            if (interfaceC58315Pt7.ChA(comparable, BzZ) && !interfaceC58315Pt7.ChA(BzZ, comparable)) {
                return BzZ;
            }
            Comparable B1t = interfaceC58315Pt7.B1t();
            if (interfaceC58315Pt7.ChA(B1t, comparable) && !interfaceC58315Pt7.ChA(comparable, B1t)) {
                return B1t;
            }
            return comparable;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot coerce value to an empty range: ");
        sb.append(interfaceC58315Pt7);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString());
    }

    public static final C17v A0B(C17v c17v, int i) {
        boolean z = i > 0;
        Integer valueOf = Integer.valueOf(i);
        if (z) {
            int i2 = c17v.A00;
            int i3 = c17v.A01;
            if (c17v.A02 <= 0) {
                i = -i;
            }
            return new C17v(i2, i3, i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Step must be positive, was: ");
        sb.append(valueOf);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString());
    }

    public static final double A00(double d, double d2, double d3) {
        if (d2 <= d3) {
            if (d < d2) {
                return d2;
            }
            if (d > d3) {
                return d3;
            }
            return d;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot coerce value to an empty range: maximum ");
        sb.append(d3);
        sb.append(" is less than minimum ");
        sb.append(d2);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString());
    }

    public static final float A02(float f, float f2, float f3) {
        if (f2 <= f3) {
            if (f < f2) {
                return f2;
            }
            if (f > f3) {
                return f3;
            }
            return f;
        }
        throw new IllegalArgumentException(AnonymousClass001.A0U("Cannot coerce value to an empty range: maximum ", " is less than minimum ", '.', f3, f2));
    }

    public static final int A03(int i, int i2, int i3) {
        if (i2 <= i3) {
            if (i < i2) {
                return i2;
            }
            if (i > i3) {
                return i3;
            }
            return i;
        }
        throw new IllegalArgumentException(AnonymousClass001.A0X("Cannot coerce value to an empty range: maximum ", " is less than minimum ", '.', i3, i2));
    }

    public static final int A05(C17w c17w, int i) {
        Object BzZ;
        if (c17w instanceof InterfaceC58315Pt7) {
            BzZ = A09(Integer.valueOf(i), (InterfaceC58315Pt7) c17w);
        } else if (!c17w.isEmpty()) {
            BzZ = c17w.BzZ();
            if (i >= ((Number) BzZ).intValue()) {
                BzZ = c17w.B1t();
                if (i <= ((Number) BzZ).intValue()) {
                    return i;
                }
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot coerce value to an empty range: ");
            sb.append(c17w);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString());
        }
        return ((Number) BzZ).intValue();
    }

    public static final long A07(C17w c17w, long j) {
        Object BzZ;
        if (c17w instanceof InterfaceC58315Pt7) {
            BzZ = A09(Long.valueOf(j), (InterfaceC58315Pt7) c17w);
        } else if (!c17w.isEmpty()) {
            BzZ = c17w.BzZ();
            if (j >= ((Number) BzZ).longValue()) {
                BzZ = c17w.B1t();
                if (j <= ((Number) BzZ).longValue()) {
                    return j;
                }
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot coerce value to an empty range: ");
            sb.append(c17w);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString());
        }
        return ((Number) BzZ).longValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
    
        if (r3 != null) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0045 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Comparable A08(java.lang.Comparable r1, java.lang.Comparable r2, java.lang.Comparable r3) {
        /*
            if (r2 == 0) goto L3c
            if (r3 == 0) goto L35
            int r0 = r2.compareTo(r3)
            if (r0 > 0) goto L11
            int r0 = r1.compareTo(r2)
            if (r0 >= 0) goto L3e
            return r2
        L11:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Cannot coerce value to an empty range: maximum "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " is less than minimum "
            r1.append(r0)
            r1.append(r2)
            r0 = 46
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L35:
            int r0 = r1.compareTo(r2)
            if (r0 >= 0) goto L45
            return r2
        L3c:
            if (r3 == 0) goto L45
        L3e:
            int r0 = r1.compareTo(r3)
            if (r0 <= 0) goto L45
            return r3
        L45:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17s.A08(java.lang.Comparable, java.lang.Comparable, java.lang.Comparable):java.lang.Comparable");
    }

    public static final C17v A0A(C17v c17v) {
        return new C17v(c17v.A01, c17v.A00, -c17v.A02);
    }

    public static final C17u A0C(int i, int i2) {
        if (i2 <= Integer.MIN_VALUE) {
            return C17u.A00;
        }
        return new C17u(i, i2 - 1);
    }
}
