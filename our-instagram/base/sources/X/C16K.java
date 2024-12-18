package X;

import com.instagram.react.modules.base.IgReactQEModule;
import java.math.BigDecimal;
import java.math.BigInteger;

/* renamed from: X.16K, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C16K extends C16L {
    public static final BigDecimal A01;
    public static final BigDecimal A02;
    public static final BigDecimal A03;
    public static final BigDecimal A04;
    public static final BigInteger A05;
    public static final BigInteger A06;
    public static final BigInteger A07;
    public static final BigInteger A08;
    public static final byte[] A09 = new byte[0];
    public C16R A00;

    static {
        BigInteger valueOf = BigInteger.valueOf(-2147483648L);
        A07 = valueOf;
        BigInteger valueOf2 = BigInteger.valueOf(2147483647L);
        A05 = valueOf2;
        BigInteger valueOf3 = BigInteger.valueOf(Long.MIN_VALUE);
        A08 = valueOf3;
        BigInteger valueOf4 = BigInteger.valueOf(Long.MAX_VALUE);
        A06 = valueOf4;
        A04 = new BigDecimal(valueOf3);
        A02 = new BigDecimal(valueOf4);
        A03 = new BigDecimal(valueOf);
        A01 = new BigDecimal(valueOf2);
    }

    public static final String A0H(int i) {
        StringBuilder sb;
        char c = (char) i;
        if (Character.isISOControl(c)) {
            sb = new StringBuilder();
            sb.append("(CTRL-CHAR, code ");
        } else {
            sb = new StringBuilder();
            sb.append("'");
            sb.append(c);
            sb.append("' (code ");
            if (i > 255) {
                sb.append(i);
                sb.append(" / 0x");
                sb.append(Integer.toHexString(i));
                sb.append(")");
                return sb.toString();
            }
        }
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }

    @Override // X.C16L
    public final boolean A18(int i) {
        C16R c16r = this.A00;
        if (c16r != null && c16r.A00 == 5) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C16L
    public final boolean A1A(boolean z) {
        C16R c16r = this.A00;
        if (c16r != null) {
            switch (c16r.A00) {
                case 6:
                    if ("true".equals(A1P().trim())) {
                        return true;
                    }
                    break;
                case 7:
                    if (A0i() != 0) {
                        return true;
                    }
                    return false;
                case 9:
                    return true;
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                    Object A0V = A0V();
                    if (A0V instanceof Boolean) {
                        return ((Boolean) A0V).booleanValue();
                    }
                    break;
            }
        }
        return false;
    }

    @Override // X.C16L
    public String A1Q() {
        return A1V(null);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0012. Please report as an issue. */
    public int A1U(int i) {
        C16R c16r = this.A00;
        if (c16r != C16R.A0I && c16r != C16R.A0H) {
            if (c16r != null) {
                int i2 = c16r.A00;
                if (i2 == 6) {
                    String A1P = A1P();
                    if (!"null".equals(A1P)) {
                        return C16Y.A01(A1P);
                    }
                } else {
                    switch (i2) {
                        case 9:
                            return 1;
                        case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                            Object A0V = A0V();
                            if (A0V instanceof Number) {
                                return ((Number) A0V).intValue();
                            }
                        case 10:
                        case 11:
                        default:
                            return 0;
                    }
                }
            }
            return 0;
        }
        return A0i();
    }

    public String A1V(String str) {
        C16R c16r = this.A00;
        if (c16r != C16R.A0J) {
            if (c16r == C16R.A0A) {
                return A0q();
            }
            if (c16r == null || c16r == C16R.A0G || !c16r.A03) {
                return null;
            }
        }
        return A1P();
    }

    public abstract void A1X();

    public final void A1Y(int i) {
        A1c(AnonymousClass001.A0g("Illegal character (", A0H((char) i), "): only regular white space (\\r, \\n, \\t) is allowed between tokens"));
        throw C00O.createAndThrow();
    }

    @Override // X.C16L, java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    public static final void A0I() {
        throw new RuntimeException("Internal error: this code path should never get executed");
    }

    @Override // X.C16L
    public final double A0w(double d) {
        C16R c16r = this.A00;
        if (c16r != null) {
            switch (c16r.A00) {
                case 6:
                    String A1P = A1P();
                    if (!"null".equals(A1P)) {
                        String str = C16Y.A01;
                        if (A1P != null) {
                            String trim = A1P.trim();
                            if (trim.length() != 0) {
                                try {
                                    return C16Y.A00(trim);
                                } catch (NumberFormatException unused) {
                                }
                            }
                        }
                        return 0.0d;
                    }
                    return 0.0d;
                case 7:
                case 8:
                    return A0g();
                case 9:
                    return 1.0d;
                case 10:
                case 11:
                    return 0.0d;
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                    Object A0V = A0V();
                    if (A0V instanceof Number) {
                        return ((Number) A0V).doubleValue();
                    }
                default:
                    return 0.0d;
            }
        }
        return 0.0d;
    }

    @Override // X.C16L
    public final int A0x() {
        C16R c16r = this.A00;
        if (c16r == null) {
            return 0;
        }
        return c16r.A00;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0013. Please report as an issue. */
    @Override // X.C16L
    public final long A0y() {
        String trim;
        int length;
        C16R c16r = this.A00;
        if (c16r != C16R.A0I && c16r != C16R.A0H) {
            if (c16r != null) {
                int i = c16r.A00;
                if (i == 6) {
                    String A1P = A1P();
                    if (!"null".equals(A1P)) {
                        String str = C16Y.A01;
                        if (A1P != null && (length = (trim = A1P.trim()).length()) != 0) {
                            int i2 = 0;
                            char charAt = trim.charAt(0);
                            if (charAt == '+') {
                                trim = trim.substring(1);
                                length = trim.length();
                            } else if (charAt == '-') {
                                i2 = 1;
                            }
                            while (i2 < length) {
                                try {
                                    char charAt2 = trim.charAt(i2);
                                    if (charAt2 <= '9' && charAt2 >= '0') {
                                        i2++;
                                    } else {
                                        return (long) C16Y.A00(trim);
                                    }
                                } catch (NumberFormatException unused) {
                                }
                            }
                            return Long.parseLong(trim);
                        }
                    }
                } else {
                    switch (i) {
                        case 9:
                            return 1L;
                        case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                            Object A0V = A0V();
                            if (A0V instanceof Number) {
                                return ((Number) A0V).longValue();
                            }
                        case 10:
                        case 11:
                        default:
                            return 0L;
                    }
                }
            }
            return 0L;
        }
        return A0j();
    }

    @Override // X.C16L
    public final C16L A0z() {
        C16R c16r = this.A00;
        if (c16r != C16R.A0D && c16r != C16R.A0C) {
            return this;
        }
        int i = 1;
        while (true) {
            C16R A1J = A1J();
            if (A1J == null) {
                A1X();
                return this;
            }
            if (A1J.A05) {
                i++;
            } else if (A1J.A04) {
                i--;
                if (i == 0) {
                    return this;
                }
            } else if (A1J == C16R.A0B) {
                A1g("Not enough content available for `skipChildren()`: non-blocking parser? (%s)", getClass().getName());
                throw C00O.createAndThrow();
            }
        }
    }

    @Override // X.C16L
    public final C16R A10() {
        return this.A00;
    }

    @Override // X.C16L
    public final C16R A11() {
        return this.A00;
    }

    @Override // X.C16L
    public final void A13() {
        if (this.A00 != null) {
            this.A00 = null;
        }
    }

    @Override // X.C16L
    public final boolean A14() {
        if (this.A00 == null) {
            return false;
        }
        return true;
    }

    @Override // X.C16L
    public final boolean A15() {
        if (this.A00 != C16R.A0I) {
            return false;
        }
        return true;
    }

    @Override // X.C16L
    public final boolean A16() {
        if (this.A00 != C16R.A0C) {
            return false;
        }
        return true;
    }

    @Override // X.C16L
    public final boolean A17() {
        if (this.A00 != C16R.A0D) {
            return false;
        }
        return true;
    }

    @Override // X.C16L
    public final boolean A19(C16R c16r) {
        if (this.A00 != c16r) {
            return false;
        }
        return true;
    }

    @Override // X.C16L
    public int A1D() {
        C16R c16r = this.A00;
        if (c16r != C16R.A0I && c16r != C16R.A0H) {
            return A1U(0);
        }
        return A0i();
    }

    public final void A1W() {
        StringBuilder sb = new StringBuilder();
        sb.append(" in ");
        sb.append(this.A00);
        A1d(sb.toString());
        throw C00O.createAndThrow();
    }

    public final void A1Z(int i, String str) {
        if (i < 0) {
            A1W();
        } else {
            String format = String.format("Unexpected character (%s)", A0H(i));
            if (str != null) {
                format = AnonymousClass001.A0g(format, ": ", str);
            }
            A1c(format);
        }
        throw C00O.createAndThrow();
    }

    public final void A1c(String str) {
        throw new C90173zy(this, str);
    }

    public final void A1d(String str) {
        throw new C60566R8g(this, AnonymousClass001.A0R("Unexpected end-of-input", str));
    }

    @Override // X.C16L
    public final C16R A12() {
        C16R A1J = A1J();
        if (A1J == C16R.A0A) {
            return A1J();
        }
        return A1J;
    }

    public final void A1a(int i, String str) {
        A1c(AnonymousClass001.A0g(String.format("Unexpected character (%s) in numeric value", A0H(i)), ": ", str));
        throw C00O.createAndThrow();
    }

    public final void A1b(C912044w c912044w, C61052ReQ c61052ReQ, String str) {
        try {
            c912044w.A06(c61052ReQ, str);
        } catch (IllegalArgumentException e) {
            A1c(e.getMessage());
            throw C00O.createAndThrow();
        }
    }

    public final void A1e(String str) {
        int length = str.length();
        if (length >= 1000) {
            if (str.startsWith("-")) {
                length--;
            }
            str = String.format("[Integer with %d digits]", Integer.valueOf(length));
        }
        throw new R8l(this, String.format("Numeric value (%s) out of range of int (%d - %s)", str, Integer.MIN_VALUE, Integer.MAX_VALUE));
    }

    public final void A1f(String str) {
        int length = str.length();
        if (length >= 1000) {
            if (str.startsWith("-")) {
                length--;
            }
            str = String.format("[Integer with %d digits]", Integer.valueOf(length));
        }
        throw new R8l(this, String.format("Numeric value (%s) out of range of long (%d - %s)", str, Long.MIN_VALUE, Long.MAX_VALUE));
    }

    public final void A1g(String str, Object obj) {
        throw new C90173zy(this, String.format(str, obj));
    }
}
