package X;

/* loaded from: classes5.dex */
public abstract class CJ3 {
    public static final int A00(double d) {
        int i = 0;
        if (d > 0.0d) {
            i = 16777215;
        }
        return (((int) (Math.abs(d) * 255.0d)) << 24) | i;
    }
}
