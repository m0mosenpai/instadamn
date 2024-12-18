package X;

/* renamed from: X.6DZ, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6DZ {
    public static Number A00(double d) {
        int i = (int) d;
        if (i == d) {
            return Integer.valueOf(i);
        }
        return Double.valueOf(d);
    }

    public static boolean A01(Object obj) {
        String obj2;
        if (obj instanceof Number) {
            if (((Number) obj).intValue() == 0) {
                return false;
            }
            return true;
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj == null) {
            obj2 = "null";
        } else {
            obj2 = obj.toString();
        }
        throw new IllegalArgumentException(AnonymousClass001.A0R("Expected Number or Boolean: ", obj2));
    }
}
