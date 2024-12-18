package X;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;

/* loaded from: classes8.dex */
public final class JUX extends JUV implements Animatable {
    public AnimatorSet A00;
    public boolean A01;
    public final ValueAnimator[] A02;

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.A01;
    }

    public JUX(int i, int i2, int i3) {
        super(i, i2, i3);
        this.A02 = new ValueAnimator[3];
    }

    @Override // X.JUV, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.A01) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (visible) {
            if (z) {
                start();
            } else {
                stop();
                return visible;
            }
        }
        return visible;
    }
}
