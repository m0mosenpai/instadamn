package X;

/* loaded from: classes11.dex */
public abstract class VS1 {
    public static final float A00(int i) {
        int i2;
        float f;
        int i3 = i % 30;
        float f2 = 4.0f;
        if (i3 < 3) {
            i2 = 3 - i3;
        } else {
            if (i3 < 27) {
                double random = Math.random();
                if (random < 0.25d) {
                    f = 0.5f - ((float) random);
                    return f / f2;
                }
                return 0.0f;
            }
            i2 = (i3 - 3) - 24;
        }
        f = i2 * 4.0f;
        f2 = 3.0f;
        return f / f2;
    }
}
