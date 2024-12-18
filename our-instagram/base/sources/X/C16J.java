package X;

import java.math.BigDecimal;
import java.math.BigInteger;

/* renamed from: X.16J, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C16J extends C16K {
    public static final C16N A0P = C16L.A01;
    public double A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public long A0A;
    public C16P A0B;
    public BigDecimal A0C;
    public BigInteger A0D;
    public boolean A0E;
    public long A0F;
    public long A0G;
    public C16R A0H;
    public C61052ReQ A0I;
    public boolean A0J;
    public boolean A0K;
    public byte[] A0L;
    public char[] A0M;
    public final C16O A0N;
    public final C16H A0O;

    public abstract char A1h();

    public abstract void A1r();

    public static final IllegalArgumentException A0G(C912044w c912044w, String str, int i, int i2) {
        String str2;
        StringBuilder sb;
        String str3;
        String obj;
        if (i <= 32) {
            obj = String.format("Illegal white space character (code 0x%s) as character #%d of 4-char base64 unit: can only used between units", Integer.toHexString(i), Integer.valueOf(i2 + 1));
        } else {
            char c = c912044w.A00;
            if (i == c) {
                sb = new StringBuilder();
                sb.append("Unexpected padding character ('");
                sb.append(c);
                sb.append("') as character #");
                sb.append(i2 + 1);
                str2 = " of 4-char base64 unit: padding only legal as 3rd or 4th character";
            } else {
                str2 = ") in base64 content";
                if (Character.isDefined(i) && !Character.isISOControl(i)) {
                    sb = new StringBuilder();
                    sb.append("Illegal character '");
                    sb.append((char) i);
                    str3 = "' (code 0x";
                } else {
                    sb = new StringBuilder();
                    str3 = "Illegal character (code 0x";
                }
                sb.append(str3);
                sb.append(Integer.toHexString(i));
            }
            sb.append(str2);
            obj = sb.toString();
        }
        if (str != null) {
            obj = AnonymousClass001.A0g(obj, ": ", str);
        }
        return new IllegalArgumentException(obj);
    }

    @Override // X.C16L
    public final double A0g() {
        double d;
        Number number;
        int i = this.A06;
        if ((i & 8) == 0) {
            if (i == 0) {
                A1t(8);
            }
            int i2 = this.A06;
            if ((i2 & 8) == 0) {
                if ((i2 & 16) != 0) {
                    number = this.A0C;
                } else if ((i2 & 4) != 0) {
                    number = this.A0D;
                } else {
                    if ((i2 & 2) != 0) {
                        d = this.A0A;
                    } else if ((i2 & 1) != 0) {
                        d = this.A07;
                    } else {
                        C16K.A0I();
                        throw C00O.createAndThrow();
                    }
                    this.A00 = d;
                    this.A06 |= 8;
                }
                d = number.doubleValue();
                this.A00 = d;
                this.A06 |= 8;
            }
        }
        return this.A00;
    }

    @Override // X.C16L
    public final int A0i() {
        int i = this.A06;
        if ((i & 1) == 0) {
            if (i == 0) {
                return A1i();
            }
            A1q();
        }
        return this.A07;
    }

    @Override // X.C16L
    public final long A0j() {
        Number number;
        long j;
        int i = this.A06;
        if ((i & 2) == 0) {
            if (i == 0) {
                A1t(2);
            }
            int i2 = this.A06;
            if ((i2 & 2) == 0) {
                if ((i2 & 1) != 0) {
                    j = this.A07;
                } else {
                    if ((i2 & 4) != 0) {
                        if (C16K.A08.compareTo(this.A0D) <= 0 && C16K.A06.compareTo(this.A0D) >= 0) {
                            number = this.A0D;
                            j = number.longValue();
                        }
                        A1f(A1P());
                        throw C00O.createAndThrow();
                    }
                    if ((i2 & 8) != 0) {
                        double d = this.A00;
                        if (d >= -9.223372036854776E18d && d <= 9.223372036854776E18d) {
                            j = (long) d;
                        }
                    } else if ((i2 & 16) != 0) {
                        if (C16K.A04.compareTo(this.A0C) <= 0 && C16K.A02.compareTo(this.A0C) >= 0) {
                            number = this.A0C;
                            j = number.longValue();
                        }
                    } else {
                        C16K.A0I();
                        throw C00O.createAndThrow();
                    }
                    A1f(A1P());
                    throw C00O.createAndThrow();
                }
                this.A0A = j;
                this.A06 |= 2;
            }
        }
        return this.A0A;
    }

    @Override // X.C16L
    @Deprecated
    public final C16L A0k(int i) {
        int i2 = ((C16L) this).A00 ^ i;
        if (i2 != 0) {
            ((C16L) this).A00 = i;
            A1v(i, i2);
        }
        return this;
    }

    @Override // X.C16L
    public final C16L A0l(int i, int i2) {
        int i3 = ((C16L) this).A00;
        int i4 = (i & i2) | ((i2 ^ (-1)) & i3);
        int i5 = i3 ^ i4;
        if (i5 != 0) {
            ((C16L) this).A00 = i4;
            A1v(i4, i5);
        }
        return this;
    }

    @Override // X.C16L
    public final /* bridge */ /* synthetic */ C16Q A0m() {
        return this.A0B;
    }

    @Override // X.C16L
    public final Integer A0n() {
        if (this.A06 == 0) {
            A1t(0);
        }
        C16R c16r = ((C16K) this).A00;
        C16R c16r2 = C16R.A0I;
        int i = this.A06;
        if (c16r == c16r2) {
            if ((i & 1) != 0) {
                return C05F.A00;
            }
            if ((i & 2) != 0) {
                return C05F.A01;
            }
            return C05F.A0C;
        }
        if ((i & 16) != 0) {
            return C05F.A0j;
        }
        return C05F.A0Y;
    }

    @Override // X.C16L
    public final Number A0o() {
        C16R c16r = ((C16K) this).A00;
        C16R c16r2 = C16R.A0I;
        int i = this.A06;
        if (c16r == c16r2) {
            if (i == 0) {
                A1t(0);
            }
            int i2 = this.A06;
            if ((i2 & 1) != 0) {
                return Integer.valueOf(this.A07);
            }
            if ((i2 & 2) != 0) {
                return Long.valueOf(this.A0A);
            }
            if ((i2 & 4) != 0) {
                return this.A0D;
            }
        } else {
            if (i == 0) {
                A1t(16);
            }
            int i3 = this.A06;
            if ((i3 & 16) != 0) {
                return this.A0C;
            }
            if ((i3 & 8) != 0) {
                return Double.valueOf(this.A00);
            }
        }
        C16K.A0I();
        throw C00O.createAndThrow();
    }

    @Override // X.C16L
    public final Number A0p() {
        if (this.A06 == 0) {
            A1t(0);
        }
        C16R c16r = ((C16K) this).A00;
        C16R c16r2 = C16R.A0I;
        int i = this.A06;
        if (c16r == c16r2) {
            if ((i & 1) != 0) {
                return Integer.valueOf(this.A07);
            }
            if ((i & 2) != 0) {
                return Long.valueOf(this.A0A);
            }
            if ((i & 4) != 0) {
                return this.A0D;
            }
        } else {
            if ((i & 16) != 0) {
                return this.A0C;
            }
            if ((i & 8) != 0) {
                return Double.valueOf(this.A00);
            }
        }
        C16K.A0I();
        throw C00O.createAndThrow();
    }

    @Override // X.C16L
    public final String A0q() {
        C16P c16p;
        C16R c16r = ((C16K) this).A00;
        if ((c16r != C16R.A0D && c16r != C16R.A0C) || (c16p = this.A0B.A06) == null) {
            c16p = this.A0B;
        }
        return c16p.A04;
    }

    @Override // X.C16L
    public final BigDecimal A0r() {
        long j;
        BigDecimal valueOf;
        int i = this.A06;
        if ((i & 16) == 0) {
            if (i == 0) {
                A1t(16);
            }
            int i2 = this.A06;
            if ((i2 & 16) == 0) {
                if ((i2 & 8) != 0) {
                    String A1P = A1P();
                    String str = C16Y.A01;
                    valueOf = C63128SdY.A01(A1P.toCharArray());
                } else if ((i2 & 4) != 0) {
                    valueOf = new BigDecimal(this.A0D);
                } else {
                    if ((i2 & 2) != 0) {
                        j = this.A0A;
                    } else if ((i2 & 1) != 0) {
                        j = this.A07;
                    } else {
                        C16K.A0I();
                        throw C00O.createAndThrow();
                    }
                    valueOf = BigDecimal.valueOf(j);
                }
                this.A0C = valueOf;
                this.A06 |= 16;
            }
        }
        return this.A0C;
    }

    @Override // X.C16L
    public final BigInteger A0s() {
        BigInteger bigInteger;
        int i = this.A06;
        if ((i & 4) == 0) {
            if (i == 0) {
                A1t(4);
            }
            int i2 = this.A06;
            if ((i2 & 4) == 0) {
                if ((i2 & 16) != 0) {
                    bigInteger = this.A0C.toBigInteger();
                } else if ((i2 & 2) != 0) {
                    bigInteger = BigInteger.valueOf(this.A0A);
                } else if ((i2 & 1) != 0) {
                    bigInteger = BigInteger.valueOf(this.A07);
                } else if ((i2 & 8) != 0) {
                    bigInteger = BigDecimal.valueOf(this.A00).toBigInteger();
                } else {
                    C16K.A0I();
                    throw C00O.createAndThrow();
                }
                this.A0D = bigInteger;
                this.A06 |= 4;
            }
        }
        return this.A0D;
    }

    @Override // X.C16L
    public final void A0t(Object obj) {
        this.A0B.A03 = obj;
    }

    @Override // X.C16L
    public final boolean A0u() {
        C16R c16r = ((C16K) this).A00;
        if (c16r == C16R.A0J) {
            return true;
        }
        if (c16r == C16R.A0A) {
            return this.A0K;
        }
        return false;
    }

    @Override // X.C16L
    public final boolean A0v() {
        if (((C16K) this).A00 != C16R.A0H || (this.A06 & 8) == 0) {
            return false;
        }
        double d = this.A00;
        if (!Double.isNaN(d) && !Double.isInfinite(d)) {
            return false;
        }
        return true;
    }

    @Override // X.C16K
    public final void A1X() {
        String str;
        C16P c16p = this.A0B;
        int i = ((C16Q) c16p).A01;
        if (i == 0) {
            return;
        }
        if (i == 1) {
            str = "Array";
        } else {
            str = "Object";
        }
        A1d(String.format(": expected close marker for %s (start marker at %s)", str, new TID(A1m(), c16p.A01, c16p.A00, -1L, -1L)));
        throw C00O.createAndThrow();
    }

    public final int A1i() {
        if (this.A0J) {
            A1c("Internal error: _parseNumericValue called when parser instance closed");
            throw C00O.createAndThrow();
        }
        if (((C16K) this).A00 == C16R.A0I && this.A05 <= 9) {
            int A05 = this.A0N.A05(this.A0E);
            this.A07 = A05;
            this.A06 = 1;
            return A05;
        }
        A1t(1);
        if ((this.A06 & 1) == 0) {
            A1q();
        }
        return this.A07;
    }

    public final int A1j(C912044w c912044w, char c, int i) {
        if (c == '\\') {
            c = A1h();
            if (c <= ' ' && i == 0) {
                return -1;
            }
            int A00 = c912044w.A00(c);
            if (A00 >= 0) {
                return A00;
            }
            if (A00 == -2 && i >= 2) {
                return A00;
            }
        }
        throw A0G(c912044w, null, c, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0012, code lost:
    
        if (r4 <= 127) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A1k(X.C912044w r3, int r4, int r5) {
        /*
            r2 = this;
            r0 = 92
            if (r4 != r0) goto L1e
            char r4 = r2.A1h()
            r0 = 32
            if (r4 > r0) goto L10
            if (r5 != 0) goto L14
            r1 = -1
        Lf:
            return r1
        L10:
            r0 = 127(0x7f, float:1.78E-43)
            if (r4 > r0) goto L1e
        L14:
            int[] r0 = r3.A07
            r1 = r0[r4]
            if (r1 >= 0) goto Lf
            r0 = -2
            if (r1 != r0) goto L1e
            return r1
        L1e:
            r0 = 0
            java.lang.IllegalArgumentException r0 = A0G(r3, r0, r4, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16J.A1k(X.44w, int, int):int");
    }

    public final C16R A1l(String str, double d) {
        C16O c16o = this.A0N;
        c16o.A08 = null;
        c16o.A02 = -1;
        c16o.A01 = 0;
        c16o.A04 = str;
        c16o.A09 = null;
        if (c16o.A06) {
            C16O.A00(c16o);
        }
        c16o.A00 = 0;
        this.A00 = d;
        this.A06 = 8;
        return C16R.A0H;
    }

    public final C16D A1m() {
        if ((((C16L) this).A00 & EnumC222315z.INCLUDE_SOURCE_IN_LOCATION.A00) != 0) {
            return this.A0O.A07;
        }
        return C16D.A02;
    }

    public final C61052ReQ A1n() {
        C61052ReQ c61052ReQ = this.A0I;
        if (c61052ReQ == null) {
            this.A0I = new C61052ReQ();
        } else {
            c61052ReQ.A01();
        }
        return this.A0I;
    }

    public final String A1o() {
        if ((((C16L) this).A00 & EnumC222315z.ALLOW_NON_NUMERIC_NUMBERS.A00) != 0) {
            return "(JSON String, Number (or 'NaN'/'INF'/'+INF'), Array, Object or token 'null', 'true' or 'false')";
        }
        return "(JSON String, Number, Array, Object or token 'null', 'true' or 'false')";
    }

    public void A1p() {
        this.A0N.A07();
        char[] cArr = this.A0M;
        if (cArr != null) {
            this.A0M = null;
            C16H c16h = this.A0O;
            char[] cArr2 = c16h.A04;
            if (cArr != cArr2 && cArr.length < cArr2.length) {
                throw new IllegalArgumentException("Trying to release buffer smaller than original");
            }
            c16h.A04 = null;
            c16h.A08.A01.set(3, cArr);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (r5 != r3) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A1q() {
        /*
            r6 = this;
            int r1 = r6.A06
            r0 = r1 & 2
            if (r0 == 0) goto L1a
            long r3 = r6.A0A
            int r5 = (int) r3
            long r1 = (long) r5
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L38
        Le:
            java.lang.String r0 = r6.A1P()
            r6.A1e(r0)
        L15:
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L1a:
            r0 = r1 & 4
            if (r0 == 0) goto L41
            java.math.BigInteger r1 = X.C16K.A07
            java.math.BigInteger r0 = r6.A0D
            int r0 = r1.compareTo(r0)
            if (r0 > 0) goto Le
            java.math.BigInteger r1 = X.C16K.A05
            java.math.BigInteger r0 = r6.A0D
            int r0 = r1.compareTo(r0)
            if (r0 < 0) goto Le
            java.math.BigInteger r0 = r6.A0D
        L34:
            int r5 = r0.intValue()
        L38:
            r6.A07 = r5
            int r0 = r6.A06
            r0 = r0 | 1
            r6.A06 = r0
            return
        L41:
            r0 = r1 & 8
            if (r0 == 0) goto L58
            double r3 = r6.A00
            r1 = -4476578029606273024(0xc1e0000000000000, double:-2.147483648E9)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto Le
            r1 = 4746794007244308480(0x41dfffffffc00000, double:2.147483647E9)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto Le
            int r5 = (int) r3
            goto L38
        L58:
            r0 = r1 & 16
            if (r0 == 0) goto L73
            java.math.BigDecimal r1 = X.C16K.A03
            java.math.BigDecimal r0 = r6.A0C
            int r0 = r1.compareTo(r0)
            if (r0 > 0) goto Le
            java.math.BigDecimal r1 = X.C16K.A01
            java.math.BigDecimal r0 = r6.A0C
            int r0 = r1.compareTo(r0)
            if (r0 < 0) goto Le
            java.math.BigDecimal r0 = r6.A0C
            goto L34
        L73:
            X.C16K.A0I()
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16J.A1q():void");
    }

    public final void A1s(char c) {
        EnumC222315z enumC222315z = EnumC222315z.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
        int i = ((C16L) this).A00;
        if ((enumC222315z.A00 & i) == 0) {
            if (c == '\'' && (i & EnumC222315z.ALLOW_SINGLE_QUOTES.A00) != 0) {
                return;
            }
            A1c(AnonymousClass001.A0R("Unrecognized character escape ", C16K.A0H(c)));
            throw C00O.createAndThrow();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00be, code lost:
    
        if (r1 < 0) goto L65;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [X.3zz, java.lang.Throwable, X.400] */
    /* JADX WARN: Type inference failed for: r0v62 */
    /* JADX WARN: Type inference failed for: r0v63 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A1t(int r11) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16J.A1t(int):void");
    }

    public final void A1u(int i, char c) {
        C16P c16p = this.A0B;
        A1c(String.format("Unexpected close marker '%s': expected '%c' (for %s starting at %s)", Character.valueOf((char) i), Character.valueOf(c), c16p.A02(), new TID(A1m(), c16p.A01, c16p.A00, -1L, -1L)));
        throw C00O.createAndThrow();
    }

    public final void A1v(int i, int i2) {
        C5F1 c5f1;
        int i3 = EnumC222315z.STRICT_DUPLICATE_DETECTION.A00;
        if ((i2 & i3) != 0 && (i & i3) != 0) {
            C16P c16p = this.A0B;
            if (c16p.A02 == null) {
                c5f1 = new C5F1(this);
            } else {
                c5f1 = null;
            }
            c16p.A02 = c5f1;
            this.A0B = c16p;
        }
    }

    public final void A1w(int i, String str) {
        if ((((C16L) this).A00 & EnumC222315z.ALLOW_UNQUOTED_CONTROL_CHARS.A00) != 0 && i <= 32) {
            return;
        }
        A1c(AnonymousClass001.A0u("Illegal unquoted character (", C16K.A0H((char) i), "): has to be escaped using backslash to be included in ", str));
        throw C00O.createAndThrow();
    }

    public final void A1x(C912044w c912044w) {
        A1c(String.format("Unexpected end of base64-encoded String: base64 variant '%s' expects padding (one or more '%c' characters) at the end. This Base64Variant might have been incorrectly configured", c912044w.A03, Character.valueOf(c912044w.A00)));
        throw C00O.createAndThrow();
    }

    @Override // X.C16K, X.C16L, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.A0J) {
            this.A04 = Math.max(this.A04, this.A03);
            this.A0J = true;
            try {
                A1r();
            } finally {
                A1p();
            }
        }
    }

    public C16J(C16H c16h, int i) {
        C5F1 c5f1;
        ((C16L) this).A00 = i;
        this.A01 = 1;
        this.A09 = 1;
        this.A06 = 0;
        this.A0O = c16h;
        this.A0N = new C16O(c16h.A08);
        if ((i & EnumC222315z.STRICT_DUPLICATE_DETECTION.A00) != 0) {
            c5f1 = new C5F1(this);
        } else {
            c5f1 = null;
        }
        this.A0B = new C16P(c5f1, null, 0, 1, 0);
    }

    @Override // X.C16L
    public final float A0h() {
        return (float) A0g();
    }
}
