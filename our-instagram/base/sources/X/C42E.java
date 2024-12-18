package X;

import android.view.View;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;

/* renamed from: X.42E, reason: invalid class name */
/* loaded from: classes2.dex */
public class C42E extends C3Vd {
    public final float A00;
    public final int A01;
    public final int A02;

    @Override // X.C3Vd, X.InterfaceC74243Ve
    public void E4r(View view, ReboundViewPager reboundViewPager, float f, int i) {
        C14360o3.A0B(reboundViewPager, 0);
        C14360o3.A0B(view, 1);
        float A01 = A01(f);
        if (view.getHeight() == 0) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC48095LQv(view, this, A01));
        } else {
            A00(view, A01);
        }
        float f2 = f - ((int) f);
        if (Math.abs(f2) >= 0.5d) {
            if (f2 < 0.0f) {
                f2 += 1.0f;
            } else {
                f2 -= 1.0f;
            }
        }
        int round = Math.round(f - f2);
        float A012 = A01(f2);
        float f3 = this.A02;
        float f4 = A012 * f3;
        float f5 = this.A01;
        float width = (reboundViewPager.getWidth() / 2.0f) + ((f2 - 0.5f) * f4) + (f5 * f2);
        float A013 = A01(f2 + 1.0f) * f3;
        float f6 = width + f4 + f5;
        float A014 = (width - f5) - (A01(f2 - 1.0f) * f3);
        if (round != 0) {
            if (round == 1) {
                width = f6;
            } else if (round == -1) {
                width = A014;
            } else if (round > 0) {
                width = f6 + A013 + (r5 * (round - 1)) + (f3 * this.A00 * (round - 2));
            } else {
                width = A014 + (r5 * r1) + (f3 * this.A00 * (round + 1));
            }
        }
        if (reboundViewPager.A0S()) {
            width = (width + f4) - reboundViewPager.getWidth();
        }
        view.setTranslationX(width);
    }

    public C42E(int i, int i2, float f) {
        this.A02 = i;
        this.A01 = i2;
        this.A00 = f;
    }

    public static final void A00(View view, float f) {
        view.setScaleX(f);
        view.setScaleY(f);
        view.setPivotX(0.0f);
        view.setPivotY(view.getHeight() / 2.0f);
    }

    public final float A01(float f) {
        float abs = Math.abs(f);
        if (abs <= 1.0f) {
            return (float) AbstractC70163Da.A04(abs, 0.0d, 1.0d, 1.0d, this.A00);
        }
        return this.A00;
    }
}
