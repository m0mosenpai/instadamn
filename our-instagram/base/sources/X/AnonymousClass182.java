package X;

import java.io.Closeable;
import java.io.Flushable;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

/* renamed from: X.182, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class AnonymousClass182 implements Closeable, Flushable {
    public static final C16N A01;
    public static final C16N A02;
    public static final C16N A03;
    public AnonymousClass162 A00;

    public static final void A08(int i, int i2) {
        if (i2 <= i) {
        } else {
            throw new IllegalArgumentException(String.format("invalid argument(s) (offset=%d, length=%d) for input array of %d element", 0, Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public AnonymousClass182 A0B(int i) {
        throw C00O.createAndThrow();
    }

    public abstract AnonymousClass182 A0C(AnonymousClass160 anonymousClass160);

    public abstract C44T A0D();

    public abstract AnonymousClass184 A0E();

    public abstract void A0J(Object obj);

    public abstract void A0N(String str);

    public boolean A0U() {
        return false;
    }

    public boolean A0V() {
        return false;
    }

    public boolean A0W() {
        return false;
    }

    public abstract boolean A0X(AnonymousClass160 anonymousClass160);

    public abstract int A0Y(C912044w c912044w, InputStream inputStream, int i);

    public abstract void A0Z();

    public abstract void A0a();

    public abstract void A0b();

    public abstract void A0c();

    public abstract void A0d();

    public abstract void A0e(char c);

    public abstract void A0f(double d);

    public abstract void A0g(float f);

    public abstract void A0h(int i);

    public abstract void A0i(long j);

    public abstract void A0j(C912044w c912044w, byte[] bArr, int i, int i2);

    public abstract void A0l(AnonymousClass165 anonymousClass165);

    public abstract void A0m(AnonymousClass165 anonymousClass165);

    public abstract void A0n(AnonymousClass165 anonymousClass165);

    public abstract void A0o(Object obj);

    public abstract void A0p(Object obj);

    public abstract void A0q(Object obj, int i);

    public abstract void A0r(String str);

    public abstract void A0s(String str);

    public abstract void A0t(String str);

    public abstract void A0u(String str);

    public abstract void A0v(BigDecimal bigDecimal);

    public abstract void A0w(BigInteger bigInteger);

    public abstract void A0x(short s);

    public abstract void A0y(boolean z);

    public abstract void A0z(char[] cArr, int i, int i2);

    public abstract void A10(char[] cArr, int i, int i2);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    public abstract void flush();

    public void A0G(Object obj) {
        if (obj == null) {
            A0b();
        } else {
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                A0j(C911944v.A01, bArr, 0, bArr.length);
                return;
            }
            throw new C60567R8h(this, AnonymousClass001.A0R("No native support for writing embedded objects of type ", obj.getClass().getName()));
        }
    }

    public void A0H(Object obj) {
        throw new C60567R8h(this, "No native support for writing Object Ids");
    }

    public void A0I(Object obj) {
        throw new C60567R8h(this, "No native support for writing Type Ids");
    }

    public final void A0L(String str) {
        throw new C60567R8h(this, str);
    }

    public void A0k(AnonymousClass165 anonymousClass165) {
        A0N(((AnonymousClass164) anonymousClass165).A03);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.16N] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, X.16N] */
    static {
        C16N c16n;
        C16N A00 = C16N.A00(AnonymousClass183.values());
        A03 = A00;
        AnonymousClass183 anonymousClass183 = AnonymousClass183.CAN_WRITE_FORMATTED_NUMBERS;
        int i = A00.A00;
        int i2 = anonymousClass183.A00 | i;
        if (i2 == i) {
            c16n = A00;
        } else {
            ?? obj = new Object();
            obj.A00 = i2;
            c16n = obj;
        }
        A02 = c16n;
        AnonymousClass183 anonymousClass1832 = AnonymousClass183.CAN_WRITE_BINARY_NATIVELY;
        int i3 = A00.A00;
        int i4 = anonymousClass1832.A00 | i3;
        C16N c16n2 = A00;
        if (i4 != i3) {
            ?? obj2 = new Object();
            obj2.A00 = i4;
            c16n2 = obj2;
        }
        A01 = c16n2;
    }

    public void A0F(Object obj) {
        AnonymousClass184 A0E = A0E();
        if (A0E != null) {
            A0E.A04(obj);
        }
    }

    public void A0K(Object obj, int i) {
        A0d();
        A0F(obj);
    }

    public final void A0M(String str) {
        A0r(str);
        A0c();
    }

    public final void A0O(String str, double d) {
        A0r(str);
        A0f(d);
    }

    public final void A0P(String str, float f) {
        A0r(str);
        A0g(f);
    }

    public final void A0Q(String str, int i) {
        A0r(str);
        A0h(i);
    }

    public final void A0R(String str, long j) {
        A0r(str);
        A0i(j);
    }

    public final void A0S(String str, String str2) {
        A0r(str);
        A0u(str2);
    }

    public final void A0T(String str, boolean z) {
        A0r(str);
        A0y(z);
    }
}
