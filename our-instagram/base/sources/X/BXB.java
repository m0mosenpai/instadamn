package X;

import android.animation.TimeInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* loaded from: classes5.dex */
public final class BXB implements TimeInterpolator {
    public final Interpolator A00 = new PathInterpolator(0.5f, 0.0f, 0.5f, 1.0f);

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        if (f < 0.5f) {
            return this.A00.getInterpolation(f * 2.0f);
        }
        return 1.0f - this.A00.getInterpolation((f - 0.5f) * 2.0f);
    }
}
