package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Handler;
import android.view.View;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* renamed from: X.U7w, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66298U7w extends AnimatorListenerAdapter {
    public final int A00;
    public final int A01;
    public final Object A02;

    public C66298U7w(Object obj, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (2 - this.A00 != 0) {
            ((AbstractC70175WEx) this.A02).A05();
        } else {
            ((View) this.A02).setVisibility(this.A01);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (1 - this.A00 != 0) {
            super.onAnimationStart(animator);
            return;
        }
        AbstractC70175WEx abstractC70175WEx = (AbstractC70175WEx) this.A02;
        Handler handler = AbstractC70175WEx.A0D;
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) abstractC70175WEx.A0A;
        snackbarContentLayout.A01.setAlpha(1.0f);
        snackbarContentLayout.A01.animate().alpha(0.0f).setDuration(180L).setStartDelay(0L).start();
        if (snackbarContentLayout.A00.getVisibility() != 0) {
            return;
        }
        snackbarContentLayout.A00.setAlpha(1.0f);
        snackbarContentLayout.A00.animate().alpha(0.0f).setDuration(180L).setStartDelay(0L).start();
    }
}
