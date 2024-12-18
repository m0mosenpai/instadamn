package X;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;

/* loaded from: classes11.dex */
public abstract class VMO {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void A00(Drawable drawable, float f) {
        drawable.setLevel(C1H4.A01(f * 10000.0f));
        boolean A1P = AbstractC58319PtB.A1P(drawable.getLevel(), 9990);
        if (drawable instanceof Animatable) {
            Animatable animatable = (Animatable) drawable;
            if (A1P) {
                animatable.start();
            } else {
                animatable.stop();
            }
        }
    }
}
