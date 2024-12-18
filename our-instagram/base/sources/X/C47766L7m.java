package X;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.AccelerateInterpolator;

/* renamed from: X.L7m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47766L7m {
    public final float A00;
    public final float A01;
    public final long A02;
    public final long A03;
    public final View A04;

    public /* synthetic */ C47766L7m(View view, float f, float f2, int i, long j, long j2) {
        f = (i & 8) != 0 ? 1.0f : f;
        f2 = (i & 16) != 0 ? 1.1f : f2;
        this.A04 = view;
        this.A03 = j;
        this.A02 = j2;
        this.A00 = f;
        this.A01 = f2;
    }

    public final ValueAnimator A00() {
        float[] A1b = AbstractC43592JPx.A1b();
        A1b[0] = this.A00;
        A1b[1] = this.A01;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(A1b);
        ofFloat.setStartDelay(this.A03);
        ofFloat.setDuration(this.A02);
        ofFloat.setInterpolator(new AccelerateInterpolator());
        LMA.A01(ofFloat, this, 34);
        return ofFloat;
    }
}
