package X;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.Iterator;

/* renamed from: X.Iey, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41782Iey implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C148176ln A00;

    public C41782Iey(C148176ln c148176ln) {
        this.A00 = c148176ln;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C14360o3.A0B(valueAnimator, 0);
        C148176ln c148176ln = this.A00;
        Iterator it = c148176ln.A0R.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            view.setScaleX(AbstractC37303Gc4.A00(valueAnimator));
            view.setScaleY(AbstractC37303Gc4.A00(valueAnimator));
        }
        Iterator it2 = c148176ln.A0T.iterator();
        while (it2.hasNext()) {
            View view2 = (View) it2.next();
            view2.setScaleX(AbstractC37303Gc4.A00(valueAnimator));
            view2.setScaleY(AbstractC37303Gc4.A00(valueAnimator));
        }
        c148176ln.A0C.setAlpha(AbstractC37303Gc4.A00(valueAnimator));
    }
}
