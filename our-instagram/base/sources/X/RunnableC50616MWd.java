package X;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: X.MWd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC50616MWd implements Runnable {
    public final /* synthetic */ C71L A00;

    public RunnableC50616MWd(C71L c71l) {
        this.A00 = c71l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Float f;
        C71L c71l = this.A00;
        ValueAnimator valueAnimator = c71l.A01;
        if (valueAnimator != null && !valueAnimator.isRunning()) {
            View view = c71l.A02;
            if (view != null) {
                f = Float.valueOf(view.getTranslationY());
            } else {
                f = null;
            }
            if (C14360o3.A0I(f, c71l.A05)) {
                c71l.A03 = C05F.A00;
                ValueAnimator valueAnimator2 = c71l.A01;
                if (valueAnimator2 != null) {
                    valueAnimator2.start();
                }
            }
        }
    }
}
