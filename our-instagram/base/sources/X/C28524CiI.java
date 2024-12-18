package X;

import android.animation.ValueAnimator;
import android.graphics.PathMeasure;
import android.view.View;
import android.widget.ImageView;

/* renamed from: X.CiI, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28524CiI implements ValueAnimator.AnimatorUpdateListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C28524CiI(ImageView imageView, BZA bza, float[] fArr, int i) {
        this.A00 = i;
        this.A03 = bza;
        if (4 - i != 0) {
            this.A02 = fArr;
            this.A01 = imageView;
        } else {
            this.A01 = fArr;
            this.A02 = imageView;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Number number;
        float f;
        char c;
        float[] fArr;
        Object obj;
        PathMeasure pathMeasure;
        switch (this.A00) {
            case 0:
                InterfaceC103384lE interfaceC103384lE = (InterfaceC103384lE) this.A03;
                C131845xK.A00((C6FQ) this.A02, (C6FW) this.A01, interfaceC103384lE);
                return;
            case 1:
                C14360o3.A0B(valueAnimator, 0);
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue instanceof Float) {
                    number = (Number) animatedValue;
                } else {
                    number = null;
                }
                float f2 = 0.0f;
                if (number != null) {
                    f = number.floatValue();
                } else {
                    f = 0.0f;
                }
                ((C55087Oak) this.A03).A03().setY(f);
                View view = (View) this.A02;
                if (((C26044BfX) this.A01).A01 != 0.0f) {
                    f2 = f;
                }
                view.setY(f2);
                return;
            case 2:
            case 3:
            default:
                C14360o3.A0B(valueAnimator, 0);
                View view2 = (View) this.A01;
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                C14360o3.A0C(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                view2.setAlpha(AbstractC166987dD.A09(animatedValue2));
                View view3 = (View) this.A03;
                Object animatedValue3 = valueAnimator.getAnimatedValue();
                C14360o3.A0C(animatedValue3, "null cannot be cast to non-null type kotlin.Float");
                view3.setAlpha(AbstractC166987dD.A09(animatedValue3));
                View view4 = (View) this.A02;
                Object animatedValue4 = valueAnimator.getAnimatedValue();
                C14360o3.A0C(animatedValue4, "null cannot be cast to non-null type kotlin.Float");
                view4.setAlpha(AbstractC166987dD.A09(animatedValue4));
                return;
            case 4:
                c = 0;
                C14360o3.A0B(valueAnimator, 0);
                PathMeasure pathMeasure2 = ((BZA) this.A03).A02;
                float length = pathMeasure2.getLength() * AbstractC167017dG.A00(valueAnimator);
                fArr = (float[]) this.A01;
                pathMeasure2.getPosTan(length, fArr, null);
                obj = this.A02;
                View view5 = (View) obj;
                view5.setTranslationX(fArr[c]);
                view5.setTranslationY(fArr[1]);
                return;
            case 5:
                c = 0;
                C14360o3.A0B(valueAnimator, 0);
                pathMeasure = ((BZA) this.A03).A03;
                float length2 = pathMeasure.getLength() * AbstractC167017dG.A00(valueAnimator);
                fArr = (float[]) this.A02;
                pathMeasure.getPosTan(length2, fArr, null);
                obj = this.A01;
                View view52 = (View) obj;
                view52.setTranslationX(fArr[c]);
                view52.setTranslationY(fArr[1]);
                return;
            case 6:
                c = 0;
                C14360o3.A0B(valueAnimator, 0);
                pathMeasure = ((BZA) this.A03).A04;
                float length22 = pathMeasure.getLength() * AbstractC167017dG.A00(valueAnimator);
                fArr = (float[]) this.A02;
                pathMeasure.getPosTan(length22, fArr, null);
                obj = this.A01;
                View view522 = (View) obj;
                view522.setTranslationX(fArr[c]);
                view522.setTranslationY(fArr[1]);
                return;
        }
    }

    public C28524CiI(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj3;
        this.A03 = obj2;
        this.A02 = obj;
    }
}
