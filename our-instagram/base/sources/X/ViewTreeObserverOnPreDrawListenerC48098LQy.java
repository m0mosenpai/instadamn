package X;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.DecelerateInterpolator;

/* renamed from: X.LQy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ViewTreeObserverOnPreDrawListenerC48098LQy implements ViewTreeObserver.OnPreDrawListener {
    public final int A00;
    public final Object A01;

    public ViewTreeObserverOnPreDrawListenerC48098LQy(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        if (this.A00 != 0) {
            L40 l40 = (L40) this.A01;
            if (!l40.A00) {
                l40.A00 = true;
                View view = (View) l40.A02.get();
                if (view != null) {
                    view.postDelayed(new M0A(l40), 300L);
                    return true;
                }
                return true;
            }
            return true;
        }
        View view2 = ((C44427JkQ) this.A01).A01;
        view2.getViewTreeObserver().removeOnPreDrawListener(this);
        view2.setTranslationY(AbstractC166987dD.A08(view2));
        view2.animate().translationY(0.0f).setInterpolator(new DecelerateInterpolator()).setListener(null).setDuration(250L).start();
        return false;
    }
}
