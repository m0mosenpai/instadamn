package X;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.OverScroller;

/* loaded from: classes11.dex */
public final class WXb implements InterfaceC55932he {
    public static final FrameLayout.LayoutParams A0c = new FrameLayout.LayoutParams(-1, -1);
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public Drawable A0D;
    public View A0E;
    public ViewGroup.LayoutParams A0F;
    public Ut9 A0G;
    public C55982hj A0H;
    public C55982hj A0I;
    public C55982hj A0J;
    public UBP A0K;
    public Integer A0L;
    public InterfaceC16820sZ A0M;
    public InterfaceC16820sZ A0N;
    public InterfaceC16820sZ A0O;
    public boolean A0P;
    public boolean A0Q;
    public final int A0R;
    public final Context A0S;
    public final PointF A0T;
    public final ScaleGestureDetector A0U;
    public final View A0V;
    public final OverScroller A0W;
    public final InterfaceC09390do A0X;
    public final InterfaceC09390do A0Y;
    public final InterfaceC09390do A0Z;
    public final float A0a;
    public final ScaleGestureDetectorOnScaleGestureListenerC70227WKy A0b;

    public static final void A02(WXb wXb) {
        wXb.A0P = false;
        View A00 = A00(wXb);
        PointF pointF = wXb.A0T;
        pointF.x = A00.getWidth() / 2.0f;
        pointF.y = A00.getHeight() / 2.0f;
        C55982hj c55982hj = wXb.A0J;
        c55982hj.A08(wXb.A02, true);
        C55982hj c55982hj2 = wXb.A0H;
        c55982hj2.A08(wXb.A04, true);
        C55982hj c55982hj3 = wXb.A0I;
        c55982hj3.A08(wXb.A05, true);
        c55982hj.A0B(wXb);
        c55982hj2.A0B(wXb);
        c55982hj3.A0B(wXb);
        A00.setHasTransientState(false);
        if (wXb.A0Q) {
            float f = wXb.A06;
            View A002 = A00(wXb);
            A002.setTranslationX(0.0f);
            A002.setTranslationY(f);
        }
        wXb.A04 = 0.0f;
        wXb.A05 = 0.0f;
        wXb.A08 = 0;
        wXb.A0F = null;
        wXb.A08(C05F.A00);
    }

    @Override // X.InterfaceC55932he
    public final void Dnj(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnl(C55982hj c55982hj) {
    }

    public static final View A00(WXb wXb) {
        if (wXb.A0L == C05F.A0C) {
            View view = wXb.A0E;
            if (view == null) {
                throw AbstractC166997dE.A0g();
            }
            return view;
        }
        return wXb.A0V;
    }

    public static final void A03(WXb wXb, double d, double d2, double d3, boolean z) {
        wXb.A08(C05F.A01);
        wXb.A0P = false;
        C55982hj c55982hj = wXb.A0J;
        c55982hj.A0A(wXb);
        C55982hj c55982hj2 = wXb.A0H;
        c55982hj2.A0A(wXb);
        C55982hj c55982hj3 = wXb.A0I;
        c55982hj3.A0A(wXb);
        c55982hj.A06(d);
        c55982hj2.A06(d2);
        c55982hj3.A06(d3);
        if (z || (c55982hj.A0C() && c55982hj2.A0C() && c55982hj3.A0C())) {
            A02(wXb);
        }
    }

    public static final boolean A04(WXb wXb, float f) {
        float f2 = wXb.A02;
        View view = wXb.A0V;
        float width = ((f2 * view.getWidth()) - view.getWidth()) / 2.0f;
        float f3 = -width;
        float f4 = wXb.A04;
        float signum = Math.signum(f);
        float f5 = wXb.A0a;
        float f6 = f4 - (signum * f5);
        if (f3 <= f6 && f6 <= width && Math.abs(f) > f5) {
            return true;
        }
        return false;
    }

    public static final boolean A05(WXb wXb, float f) {
        float f2 = wXb.A02;
        View view = wXb.A0V;
        float height = ((f2 * view.getHeight()) - view.getHeight()) / 2.0f;
        float f3 = -height;
        float f4 = wXb.A05;
        float signum = Math.signum(f);
        float f5 = wXb.A0a;
        float f6 = f4 - (signum * f5);
        if (f3 <= f6 && f6 <= height && Math.abs(f) > f5) {
            return true;
        }
        return false;
    }

    public final void A06() {
        C09530e4 A01 = A01(this, 1.0f);
        A03(this, 1.0d, ((Number) A01.A00).floatValue(), ((Number) A01.A01).floatValue(), true);
    }

    public final void A07(float f) {
        float A02 = C17s.A02(f, 0.0f, this.A07);
        if (A02 != this.A02) {
            this.A02 = A02;
            Drawable drawable = this.A0D;
            if (drawable != null) {
                float f2 = A02 - 1.0f;
                if (f2 < 0.0f) {
                    f2 = 0.0f;
                }
                float f3 = this.A07 - 1.0f;
                if (f3 < Float.MIN_VALUE) {
                    f3 = Float.MIN_VALUE;
                }
                int A01 = C1H4.A01(((f2 / f3) * this.A09) + this.A0A);
                if (A01 < 0) {
                    A01 = 0;
                } else if (A01 > 255) {
                    A01 = 255;
                }
                drawable.setAlpha(A01);
            }
        }
    }

    public final void A08(Integer num) {
        InterfaceC16820sZ interfaceC16820sZ;
        if (this.A0L != num) {
            this.A0L = num;
            int intValue = num.intValue();
            if (intValue != 0) {
                if (intValue == 2) {
                    interfaceC16820sZ = this.A0N;
                } else {
                    return;
                }
            } else {
                interfaceC16820sZ = this.A0M;
            }
            if (interfaceC16820sZ != null) {
                interfaceC16820sZ.invoke();
            }
        }
    }

    @Override // X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
        Integer num;
        if (this.A0Q && ((num = this.A0L) == C05F.A0C || num == C05F.A01)) {
            this.A0P = false;
            Ut9 ut9 = this.A0G;
            if (ut9 != null) {
                UBP ubp = this.A0K;
                if (ubp != null) {
                    View A00 = A00(this);
                    ut9.getParent().requestDisallowInterceptTouchEvent(false);
                    ut9.requestDisallowInterceptTouchEvent(false);
                    ubp.getParent().requestDisallowInterceptTouchEvent(false);
                    A00.setHasTransientState(false);
                    ut9.A00.A01(0);
                    ubp.detachViewFromParent(A00);
                    ut9.attachViewToParent(A00, this.A08, this.A0F);
                    A00.requestLayout();
                    ((ViewGroup) this.A0X.getValue()).removeView(this.A0K);
                    this.A0E = A00;
                    this.A0K = null;
                } else {
                    throw AbstractC166997dE.A0g();
                }
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        A02(this);
    }

    @Override // X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        if (this.A0L == C05F.A01) {
            A07((float) this.A0J.A09.A00);
            float f = this.A02;
            View A00 = A00(this);
            if (Float.isNaN(f)) {
                f = 1.0f;
            }
            A00.setScaleX(f);
            A00.setScaleY(f);
            float f2 = (float) this.A0H.A09.A00;
            this.A04 = f2;
            float f3 = (float) this.A0I.A09.A00;
            this.A05 = f3;
            View A002 = A00(this);
            A002.setTranslationX(f2);
            A002.setTranslationY(f3);
        }
    }

    public WXb(Context context, View view) {
        this.A0S = context;
        this.A0V = view;
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A0X = AbstractC09440dt.A00(enumC09460dv, new C57514Pfo(this, 38));
        this.A09 = 255;
        this.A07 = 4.0f;
        this.A02 = 1.0f;
        this.A0L = C05F.A00;
        this.A03 = 4.0f;
        this.A0W = new OverScroller(context);
        this.A0R = ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
        this.A0a = 4.0f * AbstractC65702TsY.A00(this.A0S);
        this.A0T = new PointF();
        AbstractC79383gk.A02("init() must be called on the main thread");
        C55952hg A00 = C55952hg.A00();
        C55982hj A02 = A00.A02();
        A02.A09(C55942hf.A04(90.0d, 10.0d));
        A02.A02();
        this.A0J = A02;
        C55982hj A022 = A00.A02();
        A022.A09(C55942hf.A04(90.0d, 10.0d));
        this.A0H = A022;
        C55982hj A023 = A00.A02();
        A023.A09(C55942hf.A04(90.0d, 10.0d));
        this.A0I = A023;
        ScaleGestureDetectorOnScaleGestureListenerC70227WKy scaleGestureDetectorOnScaleGestureListenerC70227WKy = new ScaleGestureDetectorOnScaleGestureListenerC70227WKy(this);
        this.A0b = scaleGestureDetectorOnScaleGestureListenerC70227WKy;
        this.A0Z = AbstractC09440dt.A00(enumC09460dv, new C57514Pfo(this, 40));
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, scaleGestureDetectorOnScaleGestureListenerC70227WKy);
        scaleGestureDetector.setQuickScaleEnabled(false);
        this.A0U = scaleGestureDetector;
        this.A0Y = AbstractC09440dt.A01(new C57514Pfo(this, 39));
    }

    public static final C09530e4 A01(WXb wXb, float f) {
        View A00 = A00(wXb);
        float width = ((A00.getWidth() * f) - A00.getWidth()) / 2.0f;
        float height = ((f * A00.getHeight()) - A00.getHeight()) / 2.0f;
        float f2 = -width;
        float floatValue = ((Number) C17s.A09(Float.valueOf(wXb.A04), new JTC(f2, width))).floatValue();
        float f3 = -height;
        float floatValue2 = ((Number) C17s.A09(Float.valueOf(wXb.A05), new JTC(f3, height))).floatValue();
        float f4 = wXb.A0a;
        if (floatValue > f2 + f4 || f2 > floatValue) {
            f2 = floatValue;
        }
        if (width - f4 > f2 || f2 > width) {
            width = f2;
        }
        if (floatValue2 > f3 + f4 || f3 > floatValue2) {
            f3 = floatValue2;
        }
        if (height - f4 > f3 || f3 > height) {
            height = f3;
        }
        return new C09530e4(Float.valueOf(width), Float.valueOf(height));
    }
}
