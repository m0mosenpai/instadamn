package X;

import android.animation.ValueAnimator;
import android.graphics.Rect;

/* loaded from: classes8.dex */
public final class M2E implements Runnable {
    public final /* synthetic */ C44761Jri A00;

    public M2E(C44761Jri c44761Jri) {
        this.A00 = c44761Jri;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Rect A0U = AbstractC166987dD.A0U();
        C44761Jri c44761Jri = this.A00;
        if (c44761Jri.itemView.getGlobalVisibleRect(A0U) && A0U.width() >= c44761Jri.itemView.getWidth()) {
            C45696KKz A00 = c44761Jri.A00();
            if (A00 != null) {
                boolean z = C45510KCz.A03(c44761Jri.A02).A00;
                ValueAnimator valueAnimator = A00.A08;
                if (!valueAnimator.isRunning() && !A00.A05) {
                    A00.A04 = z;
                    A00.A05 = false;
                    A00.A00 = 1.0f;
                    if (z) {
                        valueAnimator.cancel();
                        valueAnimator.start();
                        return;
                    } else {
                        A00.invalidate();
                        return;
                    }
                }
                return;
            }
            return;
        }
        C45696KKz A002 = c44761Jri.A00();
        if (A002 == null) {
            return;
        }
        A002.A04 = false;
        A002.A0I();
    }
}
