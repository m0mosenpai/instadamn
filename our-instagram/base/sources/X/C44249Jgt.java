package X;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.TransitionDrawable;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.common.dextricks.DexOptimizationMessageHandler;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.wearable.mediastream.layouts.SupToggle;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Jgt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44249Jgt implements ValueAnimator.AnimatorUpdateListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C44249Jgt(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public static void A00(ValueAnimator valueAnimator, Object obj, Object obj2, int i) {
        valueAnimator.addUpdateListener(new C44249Jgt(i, obj, obj2));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ViewGroup.LayoutParams layoutParams;
        View view;
        String str;
        float f;
        C2XI c2xi;
        float f2;
        Number number;
        Number number2;
        float f3;
        float f4;
        C51762Yz c51762Yz;
        Number number3;
        float f5;
        Number number4;
        switch (this.A00) {
            case 3:
                View view2 = ((SupToggle) this.A02).A07;
                Object animatedValue = ((ValueAnimator) this.A01).getAnimatedValue();
                C14360o3.A0C(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                int intValue = ((Number) animatedValue).intValue();
                ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                layoutParams2.height = intValue;
                view2.setLayoutParams(layoutParams2);
                return;
            case 4:
                C14360o3.A0B(valueAnimator, 0);
                if (((Fragment) this.A02).getContext() == null) {
                    return;
                }
                ((ValueAnimator.AnimatorUpdateListener) this.A01).onAnimationUpdate(valueAnimator);
                return;
            case 5:
                C14360o3.A0B(valueAnimator, 0);
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                C14360o3.A0C(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                float floatValue = ((Number) animatedValue2).floatValue();
                C214759fD c214759fD = (C214759fD) this.A02;
                TextView textView = c214759fD.A0D;
                str = "arrowView";
                if (textView != null) {
                    View view3 = (View) this.A01;
                    textView.setX(view3.getWidth() * floatValue);
                    TextView textView2 = c214759fD.A0D;
                    if (textView2 != null) {
                        textView2.setY(((view3.getHeight() / 2) + (view3.getWidth() / 2)) - (view3.getWidth() * floatValue));
                        return;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 6:
                C14360o3.A0B(valueAnimator, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.A01;
                Object animatedValue3 = valueAnimator.getAnimatedValue();
                C14360o3.A0C(animatedValue3, "null cannot be cast to non-null type kotlin.Int");
                marginLayoutParams.topMargin = ((Number) animatedValue3).intValue();
                IgEditText igEditText = ((C45466KBb) this.A02).A0J;
                view = igEditText;
                layoutParams = marginLayoutParams;
                if (igEditText == null) {
                    str = "promptEditText";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                view.setLayoutParams(layoutParams);
                return;
            case 7:
                Iterator it = ((List) this.A02).iterator();
                while (it.hasNext()) {
                    ((View) it.next()).setAlpha(((Number) valueAnimator.getAnimatedValue()).floatValue());
                }
                return;
            case 8:
                if (!C14360o3.A0K(((ValueAnimator) this.A01).getAnimatedValue(), 1)) {
                    return;
                }
                C6TY c6ty = (C6TY) this.A02;
                c6ty.A00();
                TransitionDrawable transitionDrawable = c6ty.A02;
                if (transitionDrawable == null) {
                    return;
                }
                transitionDrawable.resetTransition();
                transitionDrawable.startTransition(DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD);
                return;
            case 9:
            case 16:
                C14360o3.A0B(valueAnimator, 0);
                Object animatedValue4 = valueAnimator.getAnimatedValue();
                if ((animatedValue4 instanceof Float) && (number = (Number) animatedValue4) != null) {
                    f = number.floatValue();
                } else {
                    f = 0.0f;
                }
                ((C2XI) this.A01).A00(Float.valueOf(f));
                c2xi = (C2XI) this.A02;
                f2 = f - 75.0f;
                c2xi.A00(Float.valueOf(f2));
                return;
            case 10:
            case 17:
                C14360o3.A0B(valueAnimator, 0);
                Object animatedValue5 = valueAnimator.getAnimatedValue();
                if (animatedValue5 instanceof Float) {
                    number2 = (Number) animatedValue5;
                } else {
                    number2 = null;
                }
                f3 = 1.0f;
                if (number2 != null) {
                    f4 = number2.floatValue();
                } else {
                    f4 = 1.0f;
                }
                ((C51762Yz) this.A01).A01(Float.valueOf(f4));
                c51762Yz = (C51762Yz) this.A02;
                c51762Yz.A01(Float.valueOf(f3 - f4));
                return;
            case 11:
            case 18:
                C14360o3.A0B(valueAnimator, 0);
                Object animatedValue6 = valueAnimator.getAnimatedValue();
                if (animatedValue6 instanceof Float) {
                    number3 = (Number) animatedValue6;
                } else {
                    number3 = null;
                }
                if (number3 != null) {
                    f5 = number3.floatValue();
                } else {
                    f5 = 75.0f;
                }
                ((C2XI) this.A01).A00(Float.valueOf(f5));
                c2xi = (C2XI) this.A02;
                f2 = f5 - 75.0f;
                c2xi.A00(Float.valueOf(f2));
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case Process.SIGSTOP /* 19 */:
                C14360o3.A0B(valueAnimator, 0);
                Object animatedValue7 = valueAnimator.getAnimatedValue();
                if ((animatedValue7 instanceof Float) && (number4 = (Number) animatedValue7) != null) {
                    f4 = number4.floatValue();
                } else {
                    f4 = 0.0f;
                }
                ((C51762Yz) this.A01).A01(Float.valueOf(f4));
                c51762Yz = (C51762Yz) this.A02;
                f3 = 1.0f;
                c51762Yz.A01(Float.valueOf(f3 - f4));
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                C14360o3.A0B(valueAnimator, 0);
                Object animatedValue8 = valueAnimator.getAnimatedValue();
                C14360o3.A0C(animatedValue8, "null cannot be cast to non-null type kotlin.Float");
                float floatValue2 = ((Number) animatedValue8).floatValue();
                ViewGroup.LayoutParams layoutParams3 = (ViewGroup.LayoutParams) this.A01;
                int i = (int) floatValue2;
                layoutParams3.width = i;
                layoutParams3.height = i;
                view = (View) this.A02;
                layoutParams = layoutParams3;
                view.setLayoutParams(layoutParams);
                return;
            case 14:
                C14360o3.A0B(valueAnimator, 0);
                Object animatedValue9 = valueAnimator.getAnimatedValue();
                C14360o3.A0C(animatedValue9, "null cannot be cast to non-null type kotlin.Float");
                float floatValue3 = ((Number) animatedValue9).floatValue();
                C44412Jjs c44412Jjs = (C44412Jjs) this.A02;
                float height = (c44412Jjs.getHeight() * 3) / 4.0f;
                int[] iArr = C44412Jjs.A0D;
                int[] iArr2 = C44412Jjs.A0E;
                ArgbEvaluator argbEvaluator = (ArgbEvaluator) this.A01;
                int min = Math.min(4, 4);
                ArrayList arrayList = new ArrayList(min);
                for (int i2 = 0; i2 < min; i2++) {
                    Object evaluate = argbEvaluator.evaluate(floatValue3, Integer.valueOf(iArr[i2]), Integer.valueOf(iArr2[i2]));
                    C14360o3.A0C(evaluate, "null cannot be cast to non-null type kotlin.Int");
                    arrayList.add(evaluate);
                }
                c44412Jjs.A01.setShader(new LinearGradient(height, c44412Jjs.getHeight() - height, c44412Jjs.getWidth() - height, height, AbstractC001800i.A0x(arrayList), C44412Jjs.A0C, Shader.TileMode.CLAMP));
                c44412Jjs.invalidate();
                return;
            case Process.SIGTERM /* 15 */:
                C14360o3.A0B(valueAnimator, 0);
                float f6 = ((C37661Ghu) this.A02).A00;
                Object animatedValue10 = valueAnimator.getAnimatedValue();
                C14360o3.A0C(animatedValue10, "null cannot be cast to non-null type kotlin.Float");
                float floatValue4 = f6 * ((Number) animatedValue10).floatValue();
                if (floatValue4 > 0.0f) {
                    floatValue4 *= 0.95f;
                }
                C37556GgC c37556GgC = (C37556GgC) this.A01;
                ViewPager2 viewPager2 = c37556GgC.A00;
                if (viewPager2 != null) {
                    C43741JWa c43741JWa = viewPager2.A06;
                    C65842Tv3 c65842Tv3 = c43741JWa.A06;
                    if (!c65842Tv3.A07 && c65842Tv3.A02 != 1) {
                        c43741JWa.A01 = 0;
                        c43741JWa.A00 = 0.0f;
                        c43741JWa.A03 = SystemClock.uptimeMillis();
                        VelocityTracker velocityTracker = c43741JWa.A04;
                        if (velocityTracker == null) {
                            c43741JWa.A04 = VelocityTracker.obtain();
                            c43741JWa.A02 = ViewConfiguration.get(c43741JWa.A07.getContext()).getScaledMaximumFlingVelocity();
                        } else {
                            velocityTracker.clear();
                        }
                        c65842Tv3.A00 = 4;
                        C65842Tv3.A03(c65842Tv3, true);
                        if (c65842Tv3.A02 != 0) {
                            c43741JWa.A05.A0k();
                        }
                        long j = c43741JWa.A03;
                        MotionEvent obtain = MotionEvent.obtain(j, j, 0, 0.0f, 0.0f, 0);
                        c43741JWa.A04.addMovement(obtain);
                        obtain.recycle();
                    }
                }
                ViewPager2 viewPager22 = c37556GgC.A00;
                if (viewPager22 == null) {
                    return;
                }
                C43741JWa c43741JWa2 = viewPager22.A06;
                int i3 = 0;
                if (!c43741JWa2.A06.A07) {
                    return;
                }
                float f7 = c43741JWa2.A00 - floatValue4;
                c43741JWa2.A00 = f7;
                int i4 = c43741JWa2.A01;
                int round = Math.round(f7 - i4);
                c43741JWa2.A01 = i4 + round;
                long uptimeMillis = SystemClock.uptimeMillis();
                int i5 = round;
                float f8 = f7;
                float f9 = 0.0f;
                if (c43741JWa2.A07.getOrientation() != 0) {
                    i5 = 0;
                    i3 = round;
                    f8 = 0.0f;
                    f9 = f7;
                }
                c43741JWa2.A05.scrollBy(i5, i3);
                MotionEvent obtain2 = MotionEvent.obtain(c43741JWa2.A03, uptimeMillis, 2, f8, f9, 0);
                c43741JWa2.A04.addMovement(obtain2);
                obtain2.recycle();
                return;
            default:
                C14360o3.A0B(valueAnimator, 0);
                C6FX c6fx = new C6FX();
                c6fx.A03(valueAnimator, 0);
                C131845xK.A00((C6FQ) this.A01, c6fx.A00(), (InterfaceC103384lE) this.A02);
                return;
        }
    }
}
