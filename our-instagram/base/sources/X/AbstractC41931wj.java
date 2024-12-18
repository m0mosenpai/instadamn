package X;

/* renamed from: X.1wj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC41931wj {
    public static void A01(int i, int i2, int i3) {
        if ((i2 | i3) >= 0 && i2 <= i && i - i2 >= i3) {
        } else {
            throw new ArrayIndexOutOfBoundsException(AnonymousClass001.A0p("length=", "; regionStart=", "; regionLength=", i, i2, i3));
        }
    }

    public static StringIndexOutOfBoundsException A00(String str, int i, int i2) {
        return new StringIndexOutOfBoundsException(AnonymousClass001.A0p("length=", "; regionStart=", "; regionLength=", str.length(), i, i2));
    }
}
