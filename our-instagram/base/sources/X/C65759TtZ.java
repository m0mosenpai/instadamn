package X;

import android.animation.ValueAnimator;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import com.instagram.direct.ui.countertextview.CounterTextView;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.ArrayList;

/* renamed from: X.TtZ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65759TtZ implements ValueAnimator.AnimatorUpdateListener {
    public final int A00;
    public final Object A01;

    public C65759TtZ(AbstractC70175WEx abstractC70175WEx, int i) {
        this.A00 = i;
        this.A01 = abstractC70175WEx;
    }

    public static void A00(ValueAnimator valueAnimator, Object obj, int i) {
        valueAnimator.addUpdateListener(new C65759TtZ(obj, i));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        long currentPlayTime;
        float floatValue;
        View view;
        int i;
        InterfaceC09390do interfaceC09390do;
        U8Z u8z;
        float floatValue2;
        View view2;
        switch (this.A00) {
            case 0:
                long animatedFraction = valueAnimator.getAnimatedFraction() * ((float) valueAnimator.getDuration());
                U8Z u8z2 = (U8Z) this.A01;
                C68657VZq[] c68657VZqArr = u8z2.A07;
                int length = c68657VZqArr.length - 1;
                int i2 = 0;
                int max = Math.max(Math.min((int) (animatedFraction / 3000), length), 0);
                if (max != length) {
                    i2 = max + 1;
                }
                u8z2.A01 = c68657VZqArr[max];
                u8z2.A02 = c68657VZqArr[i2];
                u8z2.A00 = ((float) (animatedFraction - (max * 3000))) / 3000.0f;
                u8z = u8z2;
                u8z.invalidateSelf();
                return;
            case 1:
                C66249U5t c66249U5t = (C66249U5t) this.A01;
                currentPlayTime = super/*android.animation.ValueAnimator*/.getCurrentPlayTime();
                c66249U5t.A01 = currentPlayTime;
                return;
            case 2:
                C14360o3.A0B(valueAnimator, 0);
                View view3 = (View) this.A01;
                ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
                Object animatedValue = valueAnimator.getAnimatedValue();
                C14360o3.A0C(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                layoutParams.height = ((Number) animatedValue).intValue();
                view3.requestLayout();
                return;
            case 3:
                ((CollapsingToolbarLayout) this.A01).setScrimAlpha(((Number) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 4:
                float floatValue3 = ((Number) valueAnimator.getAnimatedValue()).floatValue();
                C65O c65o = ((BottomSheetBehavior) this.A01).A0K;
                if (c65o == null) {
                    return;
                }
                c65o.A0B(floatValue3);
                return;
            case 5:
                ((AbstractC70175WEx) this.A01).A09.setAlpha(((Number) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 6:
                floatValue = ((Number) valueAnimator.getAnimatedValue()).floatValue();
                view = ((AbstractC70175WEx) this.A01).A09;
                view.setScaleX(floatValue);
                view.setScaleY(floatValue);
                return;
            case 7:
            case 8:
                int intValue = ((Number) valueAnimator.getAnimatedValue()).intValue();
                Handler handler = AbstractC70175WEx.A0D;
                ((AbstractC70175WEx) this.A01).A09.setTranslationY(intValue);
                return;
            case 9:
            case 11:
            default:
                floatValue2 = ((Number) valueAnimator.getAnimatedValue()).floatValue();
                view2 = ((AbstractC69084Vha) this.A01).A01;
                view2.setAlpha(floatValue2);
                return;
            case 10:
                floatValue = ((Number) valueAnimator.getAnimatedValue()).floatValue();
                view = ((AbstractC69084Vha) this.A01).A01;
                view.setScaleX(floatValue);
                view.setScaleY(floatValue);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                ((TextInputLayout) this.A01).A1G.A07(((Number) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                int intValue2 = ((Number) valueAnimator.getAnimatedValue()).intValue();
                C69338Vlk c69338Vlk = (C69338Vlk) this.A01;
                long j = intValue2;
                ArrayList arrayList = c69338Vlk.A03;
                synchronized (arrayList) {
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        C69466Vnp c69466Vnp = (C69466Vnp) arrayList.get(i3);
                        if (j <= 2000) {
                            float f = (float) j;
                            c69466Vnp.A02 = c69466Vnp.A0A + (c69466Vnp.A06 * f) + (c69466Vnp.A00 * f * f);
                            c69466Vnp.A03 = c69466Vnp.A0B + (c69466Vnp.A07 * f) + (c69466Vnp.A01 * f * f);
                            int i4 = c69466Vnp.A09;
                            if (i4 > 0) {
                                if (j < 2000 - i4) {
                                    i = 255;
                                } else {
                                    i = (int) (((((float) (2000 - j)) * 1.0f) / i4) * 255.0f);
                                }
                                c69466Vnp.A08 = i;
                            }
                        }
                    }
                }
                UAK uak = c69338Vlk.A01;
                uak.getClass();
                uak.postInvalidate();
                return;
            case 14:
                C14360o3.A0B(valueAnimator, 0);
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                C14360o3.A0C(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                float floatValue4 = ((Number) animatedValue2).floatValue();
                UHS uhs = (UHS) this.A01;
                int i5 = uhs.A05;
                float f2 = ((-i5) * floatValue4) / 2.0f;
                float f3 = ((-uhs.A04) * floatValue4) + f2;
                ((View) uhs.A09.getValue()).setTranslationY(f3);
                InterfaceC09390do interfaceC09390do2 = uhs.A0A;
                ((View) interfaceC09390do2.getValue()).setTranslationY(f3);
                ((View) uhs.A0D.getValue()).setTranslationY(f2);
                ((View) interfaceC09390do2.getValue()).setAlpha(floatValue4);
                if (uhs.A0E) {
                    interfaceC09390do = uhs.A0B;
                } else {
                    interfaceC09390do = uhs.A0C;
                }
                View view4 = (View) interfaceC09390do.getValue();
                ViewGroup.LayoutParams layoutParams2 = view4.getLayoutParams();
                layoutParams2.height = (int) ((floatValue4 * i5) + uhs.A03);
                ((View) uhs.A0C.getValue()).setLayoutParams(layoutParams2);
                return;
            case Process.SIGTERM /* 15 */:
                C14360o3.A0B(valueAnimator, 0);
                Object animatedValue3 = valueAnimator.getAnimatedValue();
                C14360o3.A0C(animatedValue3, "null cannot be cast to non-null type kotlin.Float");
                floatValue2 = ((Number) animatedValue3).floatValue();
                view2 = (View) ((UHS) this.A01).A0B.getValue();
                view2.setAlpha(floatValue2);
                return;
            case 16:
                C14360o3.A0B(valueAnimator, 0);
                CounterTextView counterTextView = (CounterTextView) this.A01;
                CounterTextView.A05(counterTextView, valueAnimator.getAnimatedFraction());
                CounterTextView.A02(counterTextView);
                counterTextView.invalidate();
                return;
            case 17:
                C14360o3.A0B(valueAnimator, 0);
                Object animatedValue4 = valueAnimator.getAnimatedValue();
                C14360o3.A0C(animatedValue4, "null cannot be cast to non-null type kotlin.Int");
                Integer num = (Integer) animatedValue4;
                C69633Vsa c69633Vsa = (C69633Vsa) this.A01;
                if (c69633Vsa.A03 != null && c69633Vsa.A04 != null) {
                    float f4 = c69633Vsa.A00;
                    if (f4 > 0.0f && valueAnimator.getAnimatedFraction() <= f4) {
                        c69633Vsa.A02.A02(num, null);
                        return;
                    } else {
                        c69633Vsa.A02.A02(num, Integer.valueOf(c69633Vsa.A01));
                        return;
                    }
                }
                c69633Vsa.A02.A02(null, Integer.valueOf(c69633Vsa.A01));
                return;
            case 18:
                C14360o3.A0B(valueAnimator, 0);
                floatValue2 = valueAnimator.getAnimatedFraction();
                C65724Tsy c65724Tsy = (C65724Tsy) this.A01;
                c65724Tsy.A02.setAlpha(1.0f - floatValue2);
                view2 = c65724Tsy.A03;
                view2.setAlpha(floatValue2);
                return;
            case Process.SIGSTOP /* 19 */:
                C14360o3.A0B(valueAnimator, 0);
                Object animatedValue5 = valueAnimator.getAnimatedValue();
                C14360o3.A0C(animatedValue5, "null cannot be cast to non-null type kotlin.Float");
                float max2 = Math.max(0.0f, Math.min(1.0f, ((Number) animatedValue5).floatValue())) * 4.0f;
                int i6 = (int) max2;
                float f5 = max2 - i6;
                float[] fArr = U5F.A0C;
                Interpolator interpolator = U5F.A0A;
                float f6 = fArr[i6];
                int i7 = (i6 + 1) % 5;
                float f7 = fArr[i7];
                float interpolation = interpolator.getInterpolation(f5);
                float f8 = (f6 * (1.0f - interpolation)) + (f7 * interpolation);
                float[] fArr2 = U5F.A0D;
                Interpolator interpolator2 = U5F.A09;
                float f9 = fArr2[i6];
                float f10 = fArr2[i7];
                float interpolation2 = interpolator2.getInterpolation(f5);
                float f11 = (f9 * (1.0f - interpolation2)) + (f10 * interpolation2);
                float[] fArr3 = U5F.A0B;
                float f12 = fArr3[i6];
                float f13 = fArr3[i7];
                float interpolation3 = interpolator2.getInterpolation(f5);
                U5F u5f = (U5F) this.A01;
                u5f.A01 = ((f11 * 360.0f) + f8) - 90.0f;
                u5f.A00 = (((f12 * (1.0f - interpolation3)) + (f13 * interpolation3)) - f11) * 360.0f;
                u8z = u5f;
                u8z.invalidateSelf();
                return;
        }
    }

    public C65759TtZ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
