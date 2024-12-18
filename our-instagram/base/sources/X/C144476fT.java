package X;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.DecelerateInterpolator;

/* renamed from: X.6fT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C144476fT {
    public boolean A00;
    public final ValueAnimator A01;
    public final InterfaceC56392iX A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;

    public C144476fT(InterfaceC56392iX interfaceC56392iX) {
        this.A02 = interfaceC56392iX;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.setDuration(500L);
        ofFloat.setStartDelay(500L);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.6fU
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C14360o3.A0B(valueAnimator, 0);
                Object animatedValue = valueAnimator.getAnimatedValue();
                C14360o3.A0C(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                float floatValue = ((Number) animatedValue).floatValue();
                C144476fT c144476fT = C144476fT.this;
                InterfaceC09390do interfaceC09390do = c144476fT.A03;
                Object value = interfaceC09390do.getValue();
                C14360o3.A07(value);
                C14360o3.A07(interfaceC09390do.getValue());
                ((View) value).setTranslationY((1.0f - floatValue) * ((View) r0).getHeight());
                Object value2 = interfaceC09390do.getValue();
                C14360o3.A07(value2);
                ((View) value2).setAlpha(floatValue);
                if (floatValue == 1.0f) {
                    c144476fT.A00 = true;
                }
            }
        });
        this.A01 = ofFloat;
        this.A03 = C1XM.A00(new C9E9(this, 49));
        this.A0B = C1XM.A00(new C9E7(this, 7));
        this.A07 = C1XM.A00(new C9E7(this, 3));
        this.A04 = C1XM.A00(new C9E7(this, 0));
        this.A06 = C1XM.A00(new C9E7(this, 2));
        this.A05 = C1XM.A00(new C9E7(this, 1));
        this.A08 = C1XM.A00(new C9E7(this, 4));
        this.A0A = C1XM.A00(new C9E7(this, 6));
        this.A09 = C1XM.A00(new C9E7(this, 5));
    }

    public static final void A00(C144476fT c144476fT) {
        ValueAnimator valueAnimator = c144476fT.A01;
        valueAnimator.cancel();
        valueAnimator.removeAllListeners();
        c144476fT.A00 = false;
        InterfaceC09390do interfaceC09390do = c144476fT.A03;
        Object value = interfaceC09390do.getValue();
        C14360o3.A07(value);
        C14360o3.A07(interfaceC09390do.getValue());
        ((View) value).setTranslationY(((View) r0).getHeight());
        Object value2 = interfaceC09390do.getValue();
        C14360o3.A07(value2);
        C14360o3.A07(interfaceC09390do.getValue());
        ((View) value2).setAlpha(((View) r0).getHeight());
    }
}
