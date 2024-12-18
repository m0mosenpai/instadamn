package X;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes8.dex */
public final class LWD implements XCF {
    public float A00;
    public float A01;
    public boolean A02;
    public boolean A03;

    @Override // X.XCF
    public final Animator ALf(View view, ViewGroup viewGroup) {
        float f;
        if (this.A03) {
            f = this.A00;
        } else {
            f = this.A01;
        }
        return A00(view, f, 1.0f);
    }

    @Override // X.XCF
    public final Animator AM4(View view, ViewGroup viewGroup) {
        float f;
        if (!this.A02) {
            return null;
        }
        if (this.A03) {
            f = this.A01;
        } else {
            f = this.A00;
        }
        return A00(view, 1.0f, f);
    }

    public LWD(boolean z) {
        this.A01 = 1.1f;
        this.A00 = 0.8f;
        this.A02 = true;
        this.A03 = z;
    }

    public static ObjectAnimator A00(View view, float f, float f2) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, scaleX * f, scaleX * f2), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, f * scaleY, f2 * scaleY));
        ofPropertyValuesHolder.addListener(new C44328JiQ(view, scaleX, scaleY));
        return ofPropertyValuesHolder;
    }

    public LWD() {
        this(true);
    }
}
