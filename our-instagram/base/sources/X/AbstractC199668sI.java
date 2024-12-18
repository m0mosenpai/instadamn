package X;

/* renamed from: X.8sI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC199668sI {
    public static final int[] A00(float f, int i, int i2) {
        int i3 = (int) (i / f);
        return i3 <= i2 ? new int[]{i, i3} : new int[]{(int) (i2 * f), i2};
    }

    public static final int[] A01(int i, int i2, int i3) {
        float f = 720.0f / 1280.0f;
        if (i / i2 == f) {
            if (i3 != -1 && i3 <= 2014 && i >= 720) {
                return A00(f, 720, 1280);
            }
            return new int[]{i, i2};
        }
        throw new IllegalArgumentException(AnonymousClass001.A02(i, i2, "The final output and scale output aspect ratios do not match. Final output is ", " x "));
    }
}
