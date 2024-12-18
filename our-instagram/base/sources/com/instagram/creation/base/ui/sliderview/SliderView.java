package com.instagram.creation.base.ui.sliderview;

import X.AbstractC166987dD;
import X.C0f9;
import X.C14360o3;
import X.C2J9;
import X.C56236Oxj;
import X.C56244Oxr;
import X.InterfaceC57814Pkg;
import X.InterfaceC58143Pq8;
import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.View;
import android.widget.HorizontalScrollView;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel;

/* loaded from: classes9.dex */
public final class SliderView extends HorizontalScrollView {
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public RulerView A04;
    public InterfaceC57814Pkg A05;
    public boolean A06;
    public float A07;
    public float A08;
    public float A09;
    public float A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A01 = -1.0f;
        this.A00 = 1.0f;
        this.A09 = Float.NaN;
    }

    private final float A00(int i) {
        return ((((int) (i + (getWidth() / 2.0d))) - this.A03) * 2) / this.A02;
    }

    @Override // android.widget.HorizontalScrollView
    public final void fling(int i) {
    }

    public final void A01(boolean z, float f) {
        int max = (int) (this.A02 * ((Math.max(this.A01, Math.min(this.A00, f)) + 1.0f) / 2.0f));
        if (z) {
            smoothScrollTo(max, 0);
        } else {
            scrollTo(max, 0);
        }
    }

    public final void A02(boolean z, float f) {
        if (this.A0B) {
            A01(z, f / 25.0f);
            return;
        }
        this.A0C = true;
        this.A07 = f;
        this.A0D = z;
    }

    private final float getCurrentScrollPercent() {
        return A00(getScrollX());
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        int A06 = C0f9.A06(-1882591759);
        super.onFinishInflate();
        View childAt = getChildAt(0);
        C14360o3.A0C(childAt, "null cannot be cast to non-null type com.instagram.creation.base.ui.sliderview.RulerView");
        RulerView rulerView = (RulerView) childAt;
        this.A04 = rulerView;
        C14360o3.A0A(rulerView);
        rulerView.A01 = 0.05f;
        RulerView rulerView2 = this.A04;
        C14360o3.A0A(rulerView2);
        rulerView2.A00 = 0.2f;
        RulerView rulerView3 = this.A04;
        C14360o3.A0A(rulerView3);
        rulerView3.A02 = 0.85f;
        RulerView rulerView4 = this.A04;
        C14360o3.A0A(rulerView4);
        rulerView4.setLeftRightMarginRatio(0.5f);
        RulerView rulerView5 = this.A04;
        C14360o3.A0A(rulerView5);
        rulerView5.setNumIncrements(50);
        C0f9.A0D(-1695533085, A06);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.A0B) {
            this.A06 = false;
            RulerView rulerView = this.A04;
            C14360o3.A0A(rulerView);
            int left = rulerView.getLeft();
            RulerView rulerView2 = this.A04;
            C14360o3.A0A(rulerView2);
            scrollTo(((left + rulerView2.getRight()) - getWidth()) / 2, getScrollY());
            this.A03 = getScrollX() + (getWidth() / 2);
            this.A06 = true;
            C14360o3.A0A(this.A04);
            this.A02 = r0.getWidth() - getWidth();
            this.A01 = -1.0f;
            this.A00 = 25.0f / 25.0f;
            this.A0B = true;
        }
        if (this.A0C) {
            A01(this.A0D, this.A07 / 25.0f);
            this.A0C = false;
            this.A07 = 0.0f;
            this.A0D = false;
        }
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (this.A06) {
            float A00 = A00(getScrollX());
            float f = this.A00;
            if (A00 > f) {
                A01(false, f);
                A00 = this.A00;
            } else {
                float f2 = this.A01;
                if (A00 < f2) {
                    A01(false, f2);
                    A00 = this.A01;
                }
            }
            InterfaceC57814Pkg interfaceC57814Pkg = this.A05;
            if (interfaceC57814Pkg != null) {
                float A0A = AbstractC166987dD.A0A(25.0f * A00, 10.0f) / 10.0f;
                if (this.A09 != A0A) {
                    C14360o3.A0A(interfaceC57814Pkg);
                    C56236Oxj c56236Oxj = ((C56244Oxr) interfaceC57814Pkg).A00;
                    Integer num = c56236Oxj.A0C;
                    if (c56236Oxj.A08 != null) {
                        int intValue = num.intValue();
                        if (intValue != 2) {
                            if (intValue != 0) {
                                if (intValue == 1) {
                                    InterfaceC58143Pq8 interfaceC58143Pq8 = c56236Oxj.A04;
                                    interfaceC58143Pq8.getClass();
                                    interfaceC58143Pq8.setDegree(A0A);
                                    c56236Oxj.A0U.A04 = A0A;
                                    c56236Oxj.A08.A0G(A0A);
                                }
                            } else {
                                InterfaceC58143Pq8 interfaceC58143Pq82 = c56236Oxj.A03;
                                interfaceC58143Pq82.getClass();
                                interfaceC58143Pq82.setDegree(A0A);
                                c56236Oxj.A0U.A03 = A0A;
                                c56236Oxj.A08.A0F(A0A);
                            }
                        } else {
                            InterfaceC58143Pq8 interfaceC58143Pq83 = c56236Oxj.A05;
                            interfaceC58143Pq83.getClass();
                            interfaceC58143Pq83.setDegree(A0A);
                            c56236Oxj.A0U.A05 = A0A;
                            c56236Oxj.A08.A0H(A0A);
                        }
                        if (c56236Oxj.A0D != null && C2J9.A03(c56236Oxj.A0b)) {
                            SurfaceCropFilterModel.FitTransformParams fitTransformParams = new SurfaceCropFilterModel.FitTransformParams();
                            c56236Oxj.A08.A0L(fitTransformParams);
                            c56236Oxj.A0c.AAI(new PointF(fitTransformParams.A00, fitTransformParams.A01), c56236Oxj.A0D, fitTransformParams.A02);
                        }
                    }
                    C56236Oxj.A03(c56236Oxj);
                    this.A09 = A0A;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (r1 != 3) goto L10;
     */
    @Override // android.widget.HorizontalScrollView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.base.ui.sliderview.SliderView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setOnSlideListener(InterfaceC57814Pkg interfaceC57814Pkg) {
        this.A05 = interfaceC57814Pkg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        this.A01 = -1.0f;
        this.A00 = 1.0f;
        this.A09 = Float.NaN;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderView(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
        this.A01 = -1.0f;
        this.A00 = 1.0f;
        this.A09 = Float.NaN;
    }
}
