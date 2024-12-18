package X;

import android.animation.ValueAnimator;

/* loaded from: classes5.dex */
public final class BF7 implements ValueAnimator.AnimatorUpdateListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public BF7(ValueAnimator valueAnimator, C51762Yz c51762Yz, int i) {
        this.A00 = i;
        switch (i) {
            case 6:
            case 8:
            case 9:
                this.A01 = c51762Yz;
                this.A02 = valueAnimator;
                break;
            case 7:
            default:
                this.A02 = c51762Yz;
                this.A01 = valueAnimator;
                break;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C51762Yz c51762Yz;
        Object animatedValue;
        Object obj;
        Object animatedValue2;
        float f;
        Number number;
        switch (this.A00) {
            case 5:
                C14360o3.A0B(valueAnimator, 0);
                ((C51762Yz) this.A01).A03(new C30170DRa(30, this.A02, valueAnimator));
                return;
            case 6:
            case 9:
                c51762Yz = (C51762Yz) this.A01;
                animatedValue = ((ValueAnimator) this.A02).getAnimatedValue();
                C14360o3.A0C(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                c51762Yz.A01(animatedValue);
                return;
            case 7:
                c51762Yz = (C51762Yz) this.A02;
                obj = this.A01;
                animatedValue2 = ((ValueAnimator) obj).getAnimatedValue();
                if (!(animatedValue2 instanceof Float) && (number = (Number) animatedValue2) != null) {
                    f = number.floatValue();
                } else {
                    f = 0.0f;
                }
                animatedValue = Float.valueOf(f);
                c51762Yz.A01(animatedValue);
                return;
            case 8:
                c51762Yz = (C51762Yz) this.A01;
                obj = this.A02;
                animatedValue2 = ((ValueAnimator) obj).getAnimatedValue();
                if (!(animatedValue2 instanceof Float)) {
                    break;
                }
                f = 0.0f;
                animatedValue = Float.valueOf(f);
                c51762Yz.A01(animatedValue);
                return;
            case 10:
            case 11:
                C14360o3.A0B(valueAnimator, 0);
                Object animatedValue3 = valueAnimator.getAnimatedValue();
                if (!(animatedValue3 instanceof Float) || animatedValue3 == null) {
                    return;
                }
                ((C2XI) this.A02).A00(animatedValue3);
                ((C2XI) this.A01).A00(animatedValue3);
                return;
            default:
                C14360o3.A0B(valueAnimator, 0);
                C2XI c2xi = (C2XI) this.A01;
                Object animatedValue4 = valueAnimator.getAnimatedValue();
                if ((animatedValue4 instanceof Float) && animatedValue4 != null) {
                    c2xi.A00(animatedValue4);
                    return;
                }
                return;
        }
    }

    public BF7(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }
}
