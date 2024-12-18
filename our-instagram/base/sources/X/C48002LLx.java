package X;

import android.animation.ValueAnimator;
import android.view.View;
import java.lang.ref.Reference;
import java.util.Iterator;

/* renamed from: X.LLx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48002LLx implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C4ZF A00;

    public C48002LLx(C4ZF c4zf) {
        this.A00 = c4zf;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Iterator it = this.A00.A07.iterator();
        while (it.hasNext()) {
            Object obj = (C3WC) ((Reference) it.next()).get();
            if (obj != null) {
                ((View) obj).setAlpha(AbstractC166987dD.A09(valueAnimator.getAnimatedValue()));
            }
        }
    }
}
