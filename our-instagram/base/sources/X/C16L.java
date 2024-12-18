package X;

import java.io.Closeable;
import java.io.OutputStream;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;

/* renamed from: X.16L, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C16L implements Closeable {
    public static final C16N A01 = C16N.A00(C16M.values());
    public int A00;

    public Object A0V() {
        return null;
    }

    public Object A0W() {
        return null;
    }

    public Object A0X() {
        return null;
    }

    public boolean A0a() {
        return false;
    }

    public boolean A0b() {
        return false;
    }

    public boolean A0d() {
        return A1A(false);
    }

    public boolean A0e() {
        return false;
    }

    public int A0f(Writer writer) {
        return -1;
    }

    public abstract double A0g();

    public abstract float A0h();

    public abstract int A0i();

    public abstract long A0j();

    public abstract C16Q A0m();

    public abstract Integer A0n();

    public abstract Number A0p();

    public abstract String A0q();

    public abstract BigDecimal A0r();

    public abstract BigInteger A0s();

    public abstract boolean A0u();

    public abstract boolean A0v();

    public abstract double A0w(double d);

    public abstract int A0x();

    public abstract long A0y();

    public abstract C16L A0z();

    public abstract C16R A10();

    public abstract C16R A11();

    public abstract C16R A12();

    public abstract void A13();

    public abstract boolean A14();

    public abstract boolean A15();

    public abstract boolean A16();

    public abstract boolean A17();

    public abstract boolean A18(int i);

    public abstract boolean A19(C16R c16r);

    public abstract boolean A1A(boolean z);

    public abstract int A1B();

    public abstract int A1C();

    public abstract int A1D();

    public int A1E(int i) {
        if (A1J() == C16R.A0I) {
            return A0i();
        }
        return -1;
    }

    public abstract int A1F(C912044w c912044w, OutputStream outputStream);

    public int A1G(OutputStream outputStream) {
        return -1;
    }

    public abstract TID A1H();

    public abstract TID A1I();

    public abstract C16R A1J();

    public abstract C44T A1K();

    public abstract C16N A1L();

    public Object A1M() {
        return null;
    }

    public abstract String A1P();

    public abstract String A1Q();

    public abstract void A1R(C44T c44t);

    public abstract byte[] A1S(C912044w c912044w);

    public abstract char[] A1T();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    public double A0U() {
        return A0w(0.0d);
    }

    @Deprecated
    public C16L A0k(int i) {
        this.A00 = i;
        return this;
    }

    public C16L A0l(int i, int i2) {
        A0k((i & i2) | (this.A00 & (i2 ^ (-1))));
        return this;
    }

    public byte A0T() {
        int A0i = A0i();
        if (A0i >= -128 && A0i <= 255) {
            return (byte) A0i;
        }
        throw new R8l(this, String.format("Numeric value (%s) out of range of Java byte", A1P()));
    }

    public String A0Y() {
        return A0q();
    }

    public short A0Z() {
        int A0i = A0i();
        if (A0i >= -32768 && A0i <= 32767) {
            return (short) A0i;
        }
        throw new R8l(this, String.format("Numeric value (%s) out of range of Java short", A1P()));
    }

    public boolean A0c() {
        C16R A10 = A10();
        boolean z = true;
        if (A10 != C16R.A0K) {
            z = false;
            if (A10 != C16R.A0F) {
                throw new C90173zy(this, String.format("Current token (%s) not of boolean type", A10));
            }
        }
        return z;
    }

    public Number A0o() {
        return A0p();
    }

    public void A0t(Object obj) {
        C16Q A0m = A0m();
        if (A0m != null) {
            A0m.A04(obj);
        }
    }

    public String A1N() {
        if (A1J() == C16R.A0A) {
            return A0q();
        }
        return null;
    }

    public String A1O() {
        if (A1J() == C16R.A0J) {
            return A1P();
        }
        return null;
    }
}
