package X;

import android.animation.ValueAnimator;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.4yi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C110704yi extends AbstractC110714yj {
    public final ValueAnimator.AnimatorUpdateListener A00;
    public final IgTextView A01;
    public final IgTextView A02;
    public final InterfaceC110654yd A03;
    public final IgdsButton A04;

    public C110704yi(IgTextView igTextView, IgTextView igTextView2, InterfaceC110654yd interfaceC110654yd, IgdsButton igdsButton) {
        C14360o3.A0B(interfaceC110654yd, 1);
        C14360o3.A0B(igTextView, 2);
        C14360o3.A0B(igTextView2, 3);
        C14360o3.A0B(igdsButton, 4);
        this.A03 = interfaceC110654yd;
        this.A01 = igTextView;
        this.A02 = igTextView2;
        this.A04 = igdsButton;
        this.A00 = new ValueAnimator.AnimatorUpdateListener() { // from class: X.4yk
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C14360o3.A0B(valueAnimator, 0);
                Object obj = C110704yi.this.A03;
                Object animatedValue = valueAnimator.getAnimatedValue();
                C14360o3.A0C(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                ((C110644yc) obj).A00(((Number) animatedValue).floatValue());
            }
        };
    }
}
