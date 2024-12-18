package X;

import android.animation.ValueAnimator;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.ui.widget.recyclerview.CustomScrollingLinearLayoutManager;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;

/* renamed from: X.OfA, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55238OfA implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ RecyclerView A02;
    public final /* synthetic */ RecyclerView A03;
    public final /* synthetic */ CustomScrollingLinearLayoutManager A04;
    public final /* synthetic */ TouchInterceptorFrameLayout A05;

    public C55238OfA(RecyclerView recyclerView, RecyclerView recyclerView2, CustomScrollingLinearLayoutManager customScrollingLinearLayoutManager, TouchInterceptorFrameLayout touchInterceptorFrameLayout, int i, int i2) {
        this.A05 = touchInterceptorFrameLayout;
        this.A00 = i;
        this.A04 = customScrollingLinearLayoutManager;
        this.A01 = i2;
        this.A03 = recyclerView;
        this.A02 = recyclerView2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Number number;
        C14360o3.A0B(valueAnimator, 0);
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.A05;
        if (touchInterceptorFrameLayout != null) {
            int i = this.A00;
            CustomScrollingLinearLayoutManager customScrollingLinearLayoutManager = this.A04;
            int i2 = this.A01;
            RecyclerView recyclerView = this.A03;
            RecyclerView recyclerView2 = this.A02;
            Object animatedValue = valueAnimator.getAnimatedValue();
            if ((animatedValue instanceof Float) && (number = (Number) animatedValue) != null) {
                int floatValue = (int) (number.floatValue() * i);
                AbstractC13880nE.A0g(touchInterceptorFrameLayout, floatValue);
                Context A0L = AbstractC166997dE.A0L(recyclerView);
                customScrollingLinearLayoutManager.A1p(i2, (((AbstractC167007dF.A0K(A0L).widthPixels - floatValue) / 2) - recyclerView2.getPaddingStart()) + AbstractC167017dG.A06(A0L));
            }
        }
    }
}
