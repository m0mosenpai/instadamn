package X;

import android.animation.Animator;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: X.OIf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54768OIf {
    public boolean A00;
    public boolean A01;
    public final View A02;

    public C54768OIf(View view) {
        C14360o3.A0B(view, 1);
        this.A02 = view;
    }

    public final void A00(boolean z) {
        ViewPropertyAnimator duration;
        Animator.AnimatorListener c66300U7y;
        View view = this.A02;
        if (z) {
            if (!this.A00) {
                if (this.A01) {
                    view.clearAnimation();
                    view.setVisibility(8);
                    this.A01 = false;
                }
                if (view.getVisibility() != 0) {
                    this.A00 = true;
                    view.setAlpha(0.0f);
                    view.setVisibility(0);
                    duration = MSX.A0A(view, 1.0f).setDuration(300L);
                    c66300U7y = new C50730MaX(this, 4);
                } else {
                    return;
                }
            } else {
                return;
            }
        } else {
            if (this.A01) {
                return;
            }
            if (this.A00) {
                view.clearAnimation();
                this.A00 = false;
            }
            if (view.getVisibility() == 8) {
                return;
            }
            this.A01 = true;
            view.setAlpha(1.0f);
            duration = MSX.A0A(view, 0.0f).setDuration(300L);
            c66300U7y = new C66300U7y(5, view, this);
        }
        duration.setListener(c66300U7y);
    }
}
