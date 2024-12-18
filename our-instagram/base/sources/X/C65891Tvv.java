package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.activity.ComponentActivity;

/* renamed from: X.Tvv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65891Tvv implements InterfaceC55932he {
    public static final int A0U = Color.parseColor("#CC000000");
    public static final FrameLayout.LayoutParams A0V = new FrameLayout.LayoutParams(-1, -1);
    public double A00;
    public double A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public float A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public View A0D;
    public ViewGroup.LayoutParams A0E;
    public C55982hj A0F;
    public C55982hj A0G;
    public UBP A0H;
    public UBP A0I;
    public Integer A0J;
    public boolean A0K;
    public final float A0L;
    public final Context A0M;
    public final PointF A0N;
    public final Rect A0O;
    public final Drawable A0P;
    public final ScaleGestureDetector A0Q;
    public final ViewGroup A0R;
    public final C65893Tvx A0S;
    public final ScaleGestureDetectorOnScaleGestureListenerC65892Tvw A0T;

    public static final void A01(C65891Tvv c65891Tvv) {
        c65891Tvv.A03 = 0.0f;
        c65891Tvv.A04 = 0.0f;
        c65891Tvv.A08 = 0.0f;
        c65891Tvv.A09 = 0.0f;
        c65891Tvv.A06 = 0.0f;
        c65891Tvv.A07 = 0.0f;
        c65891Tvv.A0A = 0;
        c65891Tvv.A01 = 0.0d;
        c65891Tvv.A00 = 0.0d;
        c65891Tvv.A0E = null;
        c65891Tvv.A0J = C05F.A00;
    }

    public final void A04() {
        this.A0K = false;
        View A00 = A00(this);
        C55982hj c55982hj = this.A0G;
        if (c55982hj != null) {
            C55982hj c55982hj2 = this.A0F;
            if (c55982hj2 != null) {
                float width = A00.getWidth() / 2.0f;
                float height = A00.getHeight() / 2.0f;
                PointF pointF = this.A0N;
                pointF.x = width;
                pointF.y = height;
                View A002 = A00(this);
                A002.setPivotX(width);
                A002.setPivotY(height);
                c55982hj.A0B(this);
                c55982hj2.A0B(this);
                A00.setHasTransientState(false);
                float f = this.A05;
                View A003 = A00(this);
                A003.setTranslationX(0.0f);
                A003.setTranslationY(f);
                A02(this, 1.0f);
                A01(this);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC55932he
    public final void Dnj(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnl(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        C14360o3.A0B(c55982hj, 0);
        if (this.A0J == C05F.A01) {
            double d = c55982hj.A09.A00;
            C55982hj c55982hj2 = this.A0G;
            if (c55982hj2 != null) {
                A02(this, (float) AbstractC70163Da.A03(d, 1.0d, c55982hj2.A09.A00));
                float A03 = (float) AbstractC70163Da.A03(d, this.A00, this.A03 * d);
                float A032 = (float) AbstractC70163Da.A03(d, this.A01, this.A04 * d);
                View A00 = A00(this);
                A00.setTranslationX(A03);
                A00.setTranslationY(A032);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    public /* synthetic */ C65891Tvv(Context context) {
        ColorDrawable colorDrawable = new ColorDrawable(A0U);
        this.A0M = context;
        this.A0P = colorDrawable;
        this.A02 = 1.0f;
        this.A0J = C05F.A00;
        this.A0L = 4.0f * AbstractC65702TsY.A00(context);
        this.A0N = new PointF();
        this.A0O = new Rect();
        ScaleGestureDetectorOnScaleGestureListenerC65892Tvw scaleGestureDetectorOnScaleGestureListenerC65892Tvw = new ScaleGestureDetectorOnScaleGestureListenerC65892Tvw(this);
        this.A0T = scaleGestureDetectorOnScaleGestureListenerC65892Tvw;
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, scaleGestureDetectorOnScaleGestureListenerC65892Tvw);
        scaleGestureDetector.setQuickScaleEnabled(false);
        this.A0Q = scaleGestureDetector;
        Activity A00 = C51362Xj.A00(context);
        if ((A00 instanceof ComponentActivity) && A00 != null) {
            View A08 = AbstractC43592JPx.A08(A00);
            C14360o3.A0C(A08, "null cannot be cast to non-null type android.view.ViewGroup");
            this.A0R = (ViewGroup) A08;
            this.A0S = new C65893Tvx(this);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final View A00(C65891Tvv c65891Tvv) {
        if (c65891Tvv.A0J == C05F.A0C) {
            View view = c65891Tvv.A0D;
            if (view == null) {
                throw AbstractC166997dE.A0g();
            }
            return view;
        }
        UBP ubp = c65891Tvv.A0I;
        if (ubp != null) {
            return ((C65895Tvz) ubp).A00;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final void A03(C65891Tvv c65891Tvv, float f, float f2) {
        PointF pointF = c65891Tvv.A0N;
        float f3 = f - pointF.x;
        float f4 = f2 - pointF.y;
        View A00 = A00(c65891Tvv);
        float f5 = c65891Tvv.A03 + f3;
        c65891Tvv.A03 = f5;
        c65891Tvv.A04 += f4;
        float scaleX = f5 * A00.getScaleX();
        float scaleY = c65891Tvv.A04 * A00.getScaleY();
        View A002 = A00(c65891Tvv);
        A002.setTranslationX(scaleX);
        A002.setTranslationY(scaleY);
        pointF.x = f;
        pointF.y = f2;
        View A003 = A00(c65891Tvv);
        A003.setPivotX(f);
        A003.setPivotY(f2);
    }

    @Override // X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
        Integer num = this.A0J;
        if (num == C05F.A0C || num == C05F.A01) {
            this.A0K = false;
            UBP ubp = this.A0I;
            if (ubp != null) {
                UBP ubp2 = this.A0H;
                if (ubp2 != null) {
                    View A00 = A00(this);
                    ubp.getParent().requestDisallowInterceptTouchEvent(false);
                    ubp.requestDisallowInterceptTouchEvent(false);
                    ubp2.getParent().requestDisallowInterceptTouchEvent(false);
                    A00.setHasTransientState(false);
                    ubp2.detachViewFromParent(A00);
                    ubp.attachViewToParent(A00, this.A0A, this.A0E);
                    A00.requestLayout();
                    this.A0R.removeView(this.A0H);
                    this.A0D = A00;
                    this.A0H = null;
                    this.A0J = C05F.A00;
                } else {
                    throw AbstractC166997dE.A0g();
                }
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        A04();
    }

    public static final void A02(C65891Tvv c65891Tvv, float f) {
        View A00 = A00(c65891Tvv);
        float f2 = f;
        if (Float.isNaN(f)) {
            f2 = 1.0f;
        }
        c65891Tvv.A02 = f;
        A00.setScaleX(f2);
        A00.setScaleY(f2);
    }
}
