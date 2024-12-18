package X;

import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.TreeMap;

/* renamed from: X.R8k, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60570R8k extends C16K {
    public int A00;
    public TID A01;
    public C63216SfM A02;
    public C44T A03;
    public C60569R8j A04;
    public boolean A05;
    public final boolean A06;
    public final boolean A07;
    public transient C61052ReQ A08;

    public C60570R8k(C16Q c16q, C44T c44t, C63216SfM c63216SfM, boolean z, boolean z2) {
        C60569R8j c60569R8j;
        ((C16L) this).A00 = 0;
        this.A01 = null;
        this.A02 = c63216SfM;
        this.A00 = -1;
        this.A03 = c44t;
        if (c16q == null) {
            c60569R8j = new C60569R8j();
        } else {
            c60569R8j = new C60569R8j(c16q, C16D.A02);
        }
        this.A04 = c60569R8j;
        this.A07 = z;
        this.A06 = z2;
    }

    @Override // X.C16L
    public final boolean A0u() {
        return false;
    }

    @Override // X.C16L
    public final int A1C() {
        return 0;
    }

    @Override // X.C16L
    public final Object A0V() {
        if (((C16K) this).A00 == C16R.A0E) {
            C63216SfM c63216SfM = this.A02;
            return c63216SfM.A03[this.A00];
        }
        return null;
    }

    @Override // X.C16L
    public final Object A0W() {
        C63216SfM c63216SfM = this.A02;
        int i = this.A00;
        TreeMap treeMap = c63216SfM.A02;
        if (treeMap == null) {
            return null;
        }
        return AbstractC58319PtB.A0n(treeMap, i + i + 1);
    }

    @Override // X.C16L
    public final Object A0X() {
        C63216SfM c63216SfM = this.A02;
        int i = this.A00;
        TreeMap treeMap = c63216SfM.A02;
        if (treeMap == null) {
            return null;
        }
        return AbstractC58319PtB.A0n(treeMap, i + i);
    }

    @Override // X.C16L
    public final String A0Y() {
        C16R c16r = ((C16K) this).A00;
        if (c16r != C16R.A0D && c16r != C16R.A0C) {
            return this.A04.A00;
        }
        return this.A04.A03.A03();
    }

    @Override // X.C16L
    public final boolean A0a() {
        return this.A06;
    }

    @Override // X.C16L
    public final boolean A0b() {
        return this.A07;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        if (r0 >= 0) goto L42;
     */
    @Override // X.C16L
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A0i() {
        /*
            r6 = this;
            X.16R r1 = r6.A00
            X.16R r0 = X.C16R.A0I
            if (r1 != r0) goto L85
            X.SfM r0 = r6.A02
            int r1 = r6.A00
            java.lang.Object[] r0 = r0.A03
            r2 = r0[r1]
            java.lang.Number r2 = (java.lang.Number) r2
        L10:
            boolean r0 = r2 instanceof java.lang.Integer
            if (r0 != 0) goto L8a
            boolean r0 = r2 instanceof java.lang.Short
            if (r0 != 0) goto L8a
            boolean r0 = r2 instanceof java.lang.Byte
            if (r0 != 0) goto L8a
            boolean r0 = r2 instanceof java.lang.Long
            if (r0 == 0) goto L36
            long r3 = r2.longValue()
            int r5 = (int) r3
            long r1 = (long) r5
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L8e
        L2a:
            java.lang.String r0 = r6.A1P()
            r6.A1e(r0)
        L31:
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L36:
            boolean r0 = r2 instanceof java.math.BigInteger
            if (r0 == 0) goto L4e
            r1 = r2
            java.math.BigInteger r1 = (java.math.BigInteger) r1
            java.math.BigInteger r0 = X.C16K.A07
            int r0 = r0.compareTo(r1)
            if (r0 > 0) goto L2a
            java.math.BigInteger r0 = X.C16K.A05
            int r0 = r0.compareTo(r1)
        L4b:
            if (r0 >= 0) goto L8a
            goto L2a
        L4e:
            boolean r0 = r2 instanceof java.lang.Double
            if (r0 != 0) goto L70
            boolean r0 = r2 instanceof java.lang.Float
            if (r0 != 0) goto L70
            boolean r0 = r2 instanceof java.math.BigDecimal
            if (r0 == 0) goto L6c
            r1 = r2
            java.math.BigDecimal r1 = (java.math.BigDecimal) r1
            java.math.BigDecimal r0 = X.C16K.A03
            int r0 = r0.compareTo(r1)
            if (r0 > 0) goto L2a
            java.math.BigDecimal r0 = X.C16K.A01
            int r0 = r0.compareTo(r1)
            goto L4b
        L6c:
            X.C16K.A0I()
            goto L31
        L70:
            double r3 = r2.doubleValue()
            r1 = -4476578029606273024(0xc1e0000000000000, double:-2.147483648E9)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L2a
            r1 = 4746794007244308480(0x41dfffffffc00000, double:2.147483647E9)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L2a
            int r5 = (int) r3
            return r5
        L85:
            java.lang.Number r2 = r6.A0p()
            goto L10
        L8a:
            int r5 = r2.intValue()
        L8e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60570R8k.A0i():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        if (r0 >= 0) goto L39;
     */
    @Override // X.C16L
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long A0j() {
        /*
            r5 = this;
            X.16R r1 = r5.A00
            X.16R r0 = X.C16R.A0I
            if (r1 != r0) goto L77
            X.SfM r0 = r5.A02
            int r1 = r5.A00
            java.lang.Object[] r0 = r0.A03
            r2 = r0[r1]
            java.lang.Number r2 = (java.lang.Number) r2
        L10:
            boolean r0 = r2 instanceof java.lang.Long
            if (r0 != 0) goto L7c
            boolean r0 = r2 instanceof java.lang.Integer
            if (r0 != 0) goto L7c
            boolean r0 = r2 instanceof java.lang.Short
            if (r0 != 0) goto L7c
            boolean r0 = r2 instanceof java.lang.Byte
            if (r0 != 0) goto L7c
            boolean r0 = r2 instanceof java.math.BigInteger
            if (r0 == 0) goto L43
            r1 = r2
            java.math.BigInteger r1 = (java.math.BigInteger) r1
            java.math.BigInteger r0 = X.C16K.A08
            int r0 = r0.compareTo(r1)
            if (r0 > 0) goto L37
            java.math.BigInteger r0 = X.C16K.A06
            int r0 = r0.compareTo(r1)
        L35:
            if (r0 >= 0) goto L7c
        L37:
            java.lang.String r0 = r5.A1P()
            r5.A1f(r0)
        L3e:
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L43:
            boolean r0 = r2 instanceof java.lang.Double
            if (r0 != 0) goto L65
            boolean r0 = r2 instanceof java.lang.Float
            if (r0 != 0) goto L65
            boolean r0 = r2 instanceof java.math.BigDecimal
            if (r0 == 0) goto L61
            r1 = r2
            java.math.BigDecimal r1 = (java.math.BigDecimal) r1
            java.math.BigDecimal r0 = X.C16K.A04
            int r0 = r0.compareTo(r1)
            if (r0 > 0) goto L37
            java.math.BigDecimal r0 = X.C16K.A02
            int r0 = r0.compareTo(r1)
            goto L35
        L61:
            X.C16K.A0I()
            goto L3e
        L65:
            double r3 = r2.doubleValue()
            r1 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L37
            r1 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L37
            long r0 = (long) r3
            return r0
        L77:
            java.lang.Number r2 = r5.A0p()
            goto L10
        L7c:
            long r0 = r2.longValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60570R8k.A0j():long");
    }

    @Override // X.C16L
    public final C16Q A0m() {
        return this.A04;
    }

    @Override // X.C16L
    public final Number A0p() {
        C16R c16r = ((C16K) this).A00;
        if (c16r != null && c16r.A02) {
            C63216SfM c63216SfM = this.A02;
            Object obj = c63216SfM.A03[this.A00];
            if (obj instanceof Number) {
                return (Number) obj;
            }
            if (obj instanceof String) {
                String str = (String) obj;
                if (str.indexOf(46) >= 0) {
                    return Double.valueOf(Double.parseDouble(str));
                }
                return AbstractC25228BEl.A13(str);
            }
            if (obj == null) {
                return null;
            }
            throw AbstractC31175DnJ.A0V("Internal error: entry should be a Number, but is of type ", MSY.A0h(obj));
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Current token (");
        A1C.append(c16r);
        throw new C90173zy(this, AbstractC166997dE.A0x(") not numeric, cannot use numeric value accessors", A1C));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    @Override // X.C16L
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0v() {
        /*
            r3 = this;
            X.16R r1 = r3.A00
            X.16R r0 = X.C16R.A0H
            r2 = 0
            if (r1 != r0) goto L22
            X.SfM r0 = r3.A02
            int r1 = r3.A00
            java.lang.Object[] r0 = r0.A03
            r1 = r0[r1]
            boolean r0 = r1 instanceof java.lang.Double
            if (r0 == 0) goto L23
            java.lang.Double r1 = (java.lang.Double) r1
            boolean r0 = r1.isNaN()
            if (r0 != 0) goto L21
            boolean r0 = r1.isInfinite()
        L1f:
            if (r0 == 0) goto L22
        L21:
            r2 = 1
        L22:
            return r2
        L23:
            boolean r0 = r1 instanceof java.lang.Float
            if (r0 == 0) goto L22
            java.lang.Float r1 = (java.lang.Float) r1
            boolean r0 = r1.isNaN()
            if (r0 != 0) goto L21
            boolean r0 = r1.isInfinite()
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60570R8k.A0v():boolean");
    }

    @Override // X.C16L
    public final TID A1H() {
        TID tid = this.A01;
        if (tid == null) {
            return TID.A06;
        }
        return tid;
    }

    @Override // X.C16L
    public final TID A1I() {
        TID tid = this.A01;
        if (tid == null) {
            return TID.A06;
        }
        return tid;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r3 == null) goto L10;
     */
    @Override // X.C16L
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C16R A1J() {
        /*
            r5 = this;
            boolean r0 = r5.A05
            r1 = 0
            if (r0 != 0) goto L1c
            X.SfM r3 = r5.A02
            if (r3 == 0) goto L1c
            int r0 = r5.A00
            int r4 = r0 + 1
            r5.A00 = r4
            r0 = 16
            if (r4 < r0) goto L1d
            r4 = 0
            r5.A00 = r4
            X.SfM r3 = r3.A01
            r5.A02 = r3
            if (r3 != 0) goto L1d
        L1c:
            return r1
        L1d:
            long r1 = r3.A00
            if (r4 <= 0) goto L24
            int r0 = r4 << 2
            long r1 = r1 >> r0
        L24:
            int r0 = (int) r1
            r1 = r0 & 15
            X.16R[] r0 = X.C63216SfM.A04
            r1 = r0[r1]
            r5.A00 = r1
            X.16R r0 = X.C16R.A0A
            if (r1 != r0) goto L47
            java.lang.Object[] r0 = r3.A03
            r1 = r0[r4]
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L42
            java.lang.String r1 = (java.lang.String) r1
        L3b:
            X.R8j r0 = r5.A04
            r0.A00 = r1
        L3f:
            X.16R r1 = r5.A00
            return r1
        L42:
            java.lang.String r1 = r1.toString()
            goto L3b
        L47:
            X.16R r0 = X.C16R.A0D
            if (r1 != r0) goto L5c
            X.R8j r3 = r5.A04
            int r0 = r3.A00
            int r0 = r0 + 1
            r3.A00 = r0
            r1 = 2
        L54:
            X.R8j r2 = new X.R8j
            r2.<init>(r3, r1)
        L59:
            r5.A04 = r2
            goto L3f
        L5c:
            X.16R r0 = X.C16R.A0C
            if (r1 != r0) goto L6a
            X.R8j r3 = r5.A04
            int r0 = r3.A00
            r1 = 1
            int r0 = r0 + 1
            r3.A00 = r0
            goto L54
        L6a:
            X.16R r0 = X.C16R.A09
            if (r1 == r0) goto L7b
            X.16R r0 = X.C16R.A08
            if (r1 == r0) goto L7b
            X.R8j r1 = r5.A04
            int r0 = r1.A00
            int r0 = r0 + 1
            r1.A00 = r0
            goto L3f
        L7b:
            X.R8j r2 = r5.A04
            X.16Q r1 = r2.A03
            boolean r0 = r1 instanceof X.C60569R8j
            if (r0 == 0) goto L87
            r2 = r1
            X.R8j r2 = (X.C60569R8j) r2
            goto L59
        L87:
            if (r1 != 0) goto L8f
            X.R8j r2 = new X.R8j
            r2.<init>()
            goto L59
        L8f:
            X.TID r0 = r2.A02
            X.R8j r2 = new X.R8j
            r2.<init>(r0, r1)
            goto L59
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60570R8k.A1J():X.16R");
    }

    @Override // X.C16L
    public final C44T A1K() {
        return this.A03;
    }

    @Override // X.C16L
    public final C16N A1L() {
        return C16L.A01;
    }

    @Override // X.C16L
    public final String A1N() {
        C63216SfM c63216SfM;
        String str = null;
        if (!this.A05 && (c63216SfM = this.A02) != null) {
            int i = this.A00 + 1;
            if (i < 16) {
                long j = c63216SfM.A00;
                if (i > 0) {
                    j >>= i << 2;
                }
                C16R c16r = C63216SfM.A04[((int) j) & 15];
                C16R c16r2 = C16R.A0A;
                if (c16r == c16r2) {
                    this.A00 = i;
                    ((C16K) this).A00 = c16r2;
                    Object obj = c63216SfM.A03[i];
                    if (obj instanceof String) {
                        str = (String) obj;
                    } else {
                        str = obj.toString();
                    }
                    this.A04.A00 = str;
                }
            }
            if (A1J() == C16R.A0A) {
                return A0Y();
            }
        }
        return str;
    }

    @Override // X.C16L
    public final String A1P() {
        Object obj;
        C16R c16r = ((C16K) this).A00;
        if (c16r != C16R.A0J && c16r != C16R.A0A) {
            if (c16r != null) {
                int ordinal = c16r.ordinal();
                if (ordinal != 8 && ordinal != 9) {
                    return c16r.A01;
                }
                C63216SfM c63216SfM = this.A02;
                obj = c63216SfM.A03[this.A00];
            } else {
                return null;
            }
        } else {
            C63216SfM c63216SfM2 = this.A02;
            obj = c63216SfM2.A03[this.A00];
            if (obj instanceof String) {
                return (String) obj;
            }
        }
        Iterator it = C914045z.A00;
        if (obj != null) {
            return obj.toString();
        }
        return null;
    }

    @Override // X.C16L
    public final byte[] A1S(C912044w c912044w) {
        C16R c16r = ((C16K) this).A00;
        if (c16r == C16R.A0E) {
            C63216SfM c63216SfM = this.A02;
            Object obj = c63216SfM.A03[this.A00];
            if (obj instanceof byte[]) {
                return (byte[]) obj;
            }
        }
        if (c16r == C16R.A0J) {
            String A1P = A1P();
            if (A1P == null) {
                return null;
            }
            C61052ReQ c61052ReQ = this.A08;
            if (c61052ReQ == null) {
                c61052ReQ = new C61052ReQ(100);
                this.A08 = c61052ReQ;
            } else {
                c61052ReQ.A01();
            }
            A1b(c912044w, c61052ReQ, A1P);
            return c61052ReQ.A05();
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Current token (");
        A1C.append(c16r);
        throw new C90173zy(this, AbstractC166997dE.A0x(") not VALUE_STRING (or VALUE_EMBEDDED_OBJECT with byte[]), cannot access as binary", A1C));
    }

    @Override // X.C16K, X.C16L, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.A05) {
            this.A05 = true;
        }
    }

    @Override // X.C16L
    public final double A0g() {
        return A0p().doubleValue();
    }

    @Override // X.C16L
    public final float A0h() {
        return A0p().floatValue();
    }

    @Override // X.C16L
    public final Integer A0n() {
        Number A0p = A0p();
        if (!(A0p instanceof Integer)) {
            if (A0p instanceof Long) {
                return C05F.A01;
            }
            if (A0p instanceof Double) {
                return C05F.A0Y;
            }
            if (A0p instanceof BigDecimal) {
                return C05F.A0j;
            }
            if (A0p instanceof BigInteger) {
                return C05F.A0C;
            }
            if (A0p instanceof Float) {
                return C05F.A0N;
            }
            if (!(A0p instanceof Short)) {
                return null;
            }
        }
        return C05F.A00;
    }

    @Override // X.C16L
    public final String A0q() {
        return A0Y();
    }

    @Override // X.C16L
    public final BigDecimal A0r() {
        Number A0p = A0p();
        if (A0p instanceof BigDecimal) {
            return (BigDecimal) A0p;
        }
        int intValue = A0n().intValue();
        if (intValue != 0) {
            if (intValue != 2) {
                if (intValue != 1) {
                    return BigDecimal.valueOf(A0p.doubleValue());
                }
            } else {
                return new BigDecimal((BigInteger) A0p);
            }
        }
        return BigDecimal.valueOf(A0p.longValue());
    }

    @Override // X.C16L
    public final BigInteger A0s() {
        Number A0p = A0p();
        if (A0p instanceof BigInteger) {
            return (BigInteger) A0p;
        }
        if (A0n() == C05F.A0j) {
            return ((BigDecimal) A0p).toBigInteger();
        }
        return BigInteger.valueOf(A0p.longValue());
    }

    @Override // X.C16L
    public final int A1B() {
        String A1P = A1P();
        if (A1P == null) {
            return 0;
        }
        return A1P.length();
    }

    @Override // X.C16L
    public final int A1F(C912044w c912044w, OutputStream outputStream) {
        byte[] A1S = A1S(c912044w);
        if (A1S == null) {
            return 0;
        }
        int length = A1S.length;
        outputStream.write(A1S, 0, length);
        return length;
    }

    @Override // X.C16L
    public final void A1R(C44T c44t) {
        this.A03 = c44t;
    }

    @Override // X.C16L
    public final char[] A1T() {
        String A1P = A1P();
        if (A1P == null) {
            return null;
        }
        return A1P.toCharArray();
    }

    @Override // X.C16K
    public final void A1X() {
        C16K.A0I();
        throw C00O.createAndThrow();
    }
}
