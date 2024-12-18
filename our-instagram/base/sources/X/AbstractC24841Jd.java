package X;

/* renamed from: X.1Jd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC24841Jd {
    public static void A00(int value, String name) {
        if (value >= 0) {
        } else {
            throw new IllegalArgumentException(AnonymousClass001.A0b(name, " cannot be negative but was: ", value));
        }
    }

    public static void A01(Object key, Object value) {
        if (key != null) {
            if (value != null) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("null value in entry: ");
            sb.append(key);
            sb.append("=null");
            throw new NullPointerException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("null key in entry: null=");
        sb2.append(value);
        throw new NullPointerException(sb2.toString());
    }
}
