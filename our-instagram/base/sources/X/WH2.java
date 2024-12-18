package X;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes11.dex */
public final class WH2 implements ValueAnimator.AnimatorUpdateListener {
    public final RecyclerView A00;
    public final UH9 A01;

    public WH2(RecyclerView recyclerView, UH9 uh9) {
        this.A00 = recyclerView;
        this.A01 = uh9;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A01.A00 = ((Number) valueAnimator.getAnimatedValue()).floatValue();
        this.A00.invalidate();
    }
}
