package X;

/* loaded from: classes10.dex */
public final class SUZ {
    public static final int A00;
    public static volatile Vh1 A01;

    static {
        int i;
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min > 16777216) {
            i = (min / 4) * 3;
        } else {
            i = min / 2;
        }
        A00 = i;
    }
}
