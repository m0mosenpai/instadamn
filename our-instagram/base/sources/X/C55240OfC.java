package X;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;

/* renamed from: X.OfC, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55240OfC implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ RecyclerView A04;
    public final /* synthetic */ TouchInterceptorFrameLayout A05;
    public final /* synthetic */ C211029Uz A06;
    public final /* synthetic */ InterfaceC16660sJ A07;
    public final /* synthetic */ C15100pQ A08;
    public final /* synthetic */ boolean A09;

    public C55240OfC(RecyclerView recyclerView, TouchInterceptorFrameLayout touchInterceptorFrameLayout, C211029Uz c211029Uz, InterfaceC16660sJ interfaceC16660sJ, C15100pQ c15100pQ, int i, int i2, int i3, int i4, boolean z) {
        this.A05 = touchInterceptorFrameLayout;
        this.A00 = i;
        this.A09 = z;
        this.A04 = recyclerView;
        this.A02 = i2;
        this.A01 = i3;
        this.A03 = i4;
        this.A06 = c211029Uz;
        this.A07 = interfaceC16660sJ;
        this.A08 = c15100pQ;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Number number;
        float f;
        C14360o3.A0B(valueAnimator, 0);
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.A05;
        if (touchInterceptorFrameLayout != null) {
            int i = this.A00;
            boolean z = this.A09;
            RecyclerView recyclerView = this.A04;
            int i2 = this.A02;
            int i3 = this.A01;
            int i4 = this.A03;
            C211029Uz c211029Uz = this.A06;
            InterfaceC16660sJ interfaceC16660sJ = this.A07;
            C15100pQ c15100pQ = this.A08;
            Object animatedValue = valueAnimator.getAnimatedValue();
            if ((animatedValue instanceof Float) && (number = (Number) animatedValue) != null) {
                float floatValue = number.floatValue();
                AbstractC13880nE.A0g(touchInterceptorFrameLayout, (int) (i * floatValue));
                if (z) {
                    f = floatValue;
                } else {
                    f = 1.0f - floatValue;
                }
                float min = Math.min(Math.max(0.0f, 1.0f), Math.max(Math.min(0.0f, 1.0f), floatValue));
                touchInterceptorFrameLayout.setAlpha(min);
                AbstractC13880nE.A0W(recyclerView, i2 + ((int) (f * (i3 - i2))));
                float f2 = i4;
                int i5 = -1;
                if (z) {
                    i5 = 0;
                }
                float f3 = (i5 + floatValue) * f2;
                if (z) {
                    int i6 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                    View A0d = AbstractC166987dD.A0d(c211029Uz.A0B);
                    A0d.setScaleX(min);
                    A0d.setScaleY(min);
                    A0d.setAlpha(min);
                    AbstractC13880nE.A0V(A0d, (int) (f2 * (floatValue - 1.0f)));
                }
                int i7 = (int) f3;
                AbstractC43592JPx.A19(i7 - c15100pQ.A00, interfaceC16660sJ);
                c15100pQ.A00 = i7;
            }
        }
    }
}
