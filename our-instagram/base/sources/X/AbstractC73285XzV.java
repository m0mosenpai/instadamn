package X;

/* renamed from: X.XzV, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC73285XzV {
    public static final C17u A06 = new C17u(1, 108);
    public static final C17u A01 = new C17u(-140, 0);
    public static final C17u A02 = new C17u(-140, -43);
    public static final C17u A03 = new C17u(-34, 3);
    public static final C17u A05 = new C17u(-20, 30);
    public static final C17u A04 = new C17u(-140, -43);
    public static final C17u A00 = new C17u(0, 15);
    public static final C17u A07 = new C17u(0, Integer.MAX_VALUE);
    public static final C17u A08 = new C17u(-120, -20);

    public static final Integer A00(Integer num, C17u c17u, int i) {
        if (num != null) {
            int intValue = num.intValue();
            if (c17u.A01(intValue)) {
                return Integer.valueOf(intValue + i);
            }
            return null;
        }
        return null;
    }
}
