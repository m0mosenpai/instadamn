package X;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class BFF implements ValueAnimator.AnimatorUpdateListener {
    public final int A00;
    public final Object A01;

    public BFF(C2XI c2xi, int i) {
        this.A00 = i;
        this.A01 = c2xi;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object animatedValue;
        float f;
        C25317BIm c25317BIm;
        int i;
        Number number;
        C2XI c2xi;
        C2XI c2xi2;
        Object animatedValue2;
        float f2;
        Object valueOf;
        Number number2;
        float f3;
        Number number3;
        switch (this.A00) {
            case 0:
                Q2O q2o = (Q2O) this.A01;
                if (q2o.A0L()) {
                    q2o.invalidateSelf();
                    return;
                }
                C58808QAr c58808QAr = q2o.A0K;
                if (c58808QAr == null) {
                    return;
                }
                c58808QAr.A0A(q2o.A0c.A00());
                return;
            case 1:
                C14360o3.A0B(valueAnimator, 0);
                animatedValue = valueAnimator.getAnimatedValue();
                C14360o3.A0C(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                c2xi = (C2XI) this.A01;
                c2xi.A00(animatedValue);
                return;
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 25:
            case 26:
            case 28:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
            default:
                C14360o3.A0B(valueAnimator, 0);
                c2xi2 = (C2XI) this.A01;
                valueOf = valueAnimator.getAnimatedValue();
                C14360o3.A0C(valueOf, "null cannot be cast to non-null type kotlin.Float");
                c2xi2.A00(valueOf);
                return;
            case 4:
                C14360o3.A0B(valueAnimator, 0);
                Object animatedValue3 = valueAnimator.getAnimatedValue();
                if (!(animatedValue3 instanceof Float)) {
                    return;
                }
                CT8 ct8 = ((C47529Kyw) this.A01).A01;
                Number number4 = (Number) animatedValue3;
                ct8.A02.setAlpha(number4.floatValue());
                ct8.A07.setAlpha(number4.floatValue());
                ct8.A01.setAlpha(number4.floatValue());
                ct8.A06.setAlpha(number4.floatValue());
                ct8.A04.setAlpha(number4.floatValue());
                return;
            case 11:
                C14360o3.A0B(valueAnimator, 0);
                C49495Lu8 c49495Lu8 = (C49495Lu8) this.A01;
                Object animatedValue4 = valueAnimator.getAnimatedValue();
                if ((animatedValue4 instanceof Integer) && (number = (Number) animatedValue4) != null) {
                    i = number.intValue();
                } else {
                    i = 0;
                }
                c49495Lu8.A00 = i;
                Iterator it = c49495Lu8.A01.iterator();
                while (it.hasNext()) {
                    ((C3O0) it.next()).A0B(c49495Lu8);
                }
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                C14360o3.A0B(valueAnimator, 0);
                C51762Yz c51762Yz = (C51762Yz) this.A01;
                Object animatedValue5 = valueAnimator.getAnimatedValue();
                C14360o3.A0C(animatedValue5, "null cannot be cast to non-null type kotlin.Float");
                c51762Yz.A01(animatedValue5);
                return;
            case 14:
                C14360o3.A0B(valueAnimator, 0);
                Object animatedValue6 = valueAnimator.getAnimatedValue();
                C14360o3.A0C(animatedValue6, "null cannot be cast to non-null type kotlin.Float");
                float floatValue = ((Number) animatedValue6).floatValue();
                C25317BIm c25317BIm2 = (C25317BIm) this.A01;
                if (c25317BIm2.A03) {
                    f = floatValue * c25317BIm2.A01;
                } else {
                    f = 0.0f;
                }
                c25317BIm2.A00 = f;
                c25317BIm = c25317BIm2;
                c25317BIm.invalidateSelf();
                return;
            case Process.SIGTERM /* 15 */:
                BXA bxa = (BXA) this.A01;
                TimeInterpolator timeInterpolator = BXA.A09;
                bxa.A05.setColor(AbstractC25689BWz.A00(bxa.A02, ((Number) valueAnimator.getAnimatedValue()).floatValue()));
                c25317BIm = bxa;
                c25317BIm.invalidateSelf();
                return;
            case 16:
            case 17:
                C14360o3.A0B(valueAnimator, 0);
                View view = (View) this.A01;
                Object animatedValue7 = valueAnimator.getAnimatedValue();
                C14360o3.A0C(animatedValue7, "null cannot be cast to non-null type kotlin.Float");
                view.setScaleX(((Number) animatedValue7).floatValue());
                Object animatedValue8 = valueAnimator.getAnimatedValue();
                C14360o3.A0C(animatedValue8, "null cannot be cast to non-null type kotlin.Float");
                view.setScaleY(((Number) animatedValue8).floatValue());
                return;
            case 18:
            case Process.SIGSTOP /* 19 */:
                C14360o3.A0B(valueAnimator, 0);
                animatedValue = valueAnimator.getAnimatedValue();
                if (!(animatedValue instanceof Float) || animatedValue == null) {
                    return;
                }
                c2xi = (C2XI) this.A01;
                c2xi.A00(animatedValue);
                return;
            case 20:
            case 21:
            case 22:
            case 23:
                C14360o3.A0B(valueAnimator, 0);
                c2xi2 = (C2XI) this.A01;
                animatedValue2 = valueAnimator.getAnimatedValue();
                if (!(animatedValue2 instanceof Float) && (number2 = (Number) animatedValue2) != null) {
                    f2 = number2.floatValue();
                } else {
                    f2 = 0.0f;
                }
                valueOf = Float.valueOf(f2);
                c2xi2.A00(valueOf);
                return;
            case 24:
                C14360o3.A0B(valueAnimator, 0);
                c2xi2 = ((C25728BYo) this.A01).A08;
                animatedValue2 = valueAnimator.getAnimatedValue();
                if (!(animatedValue2 instanceof Float)) {
                    break;
                }
                f2 = 0.0f;
                valueOf = Float.valueOf(f2);
                c2xi2.A00(valueOf);
                return;
            case 27:
                C14360o3.A0B(valueAnimator, 0);
                animatedValue = valueAnimator.getAnimatedValue();
                if (!(animatedValue instanceof Float) || animatedValue == null) {
                    return;
                }
                c2xi = (C2XI) this.A01;
                c2xi.A00(animatedValue);
                c2xi.A00(animatedValue);
                return;
            case 30:
                C14360o3.A0B(valueAnimator, 0);
                C25371BKo c25371BKo = (C25371BKo) this.A01;
                if (c25371BKo.A0G || c25371BKo.A02 != c25371BKo.A03 || !c25371BKo.A0D) {
                    return;
                }
                Object animatedValue9 = valueAnimator.getAnimatedValue();
                if ((animatedValue9 instanceof Float) && (number3 = (Number) animatedValue9) != null) {
                    f3 = number3.floatValue();
                } else {
                    f3 = c25371BKo.A00;
                }
                c25371BKo.A00 = f3;
                GradientSpinner gradientSpinner = c25371BKo.A0A;
                if (gradientSpinner == null) {
                    return;
                }
                gradientSpinner.A09(f3);
                return;
        }
    }

    public BFF(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
