package com.instagram.ui.widget.refresh;

import X.AbstractC009003e;
import X.AbstractC13560mi;
import X.AbstractC13890nF;
import X.AbstractC55922hc;
import X.C011504d;
import X.C03H;
import X.C03I;
import X.C03K;
import X.C0f9;
import X.C55982hj;
import X.C70523Eo;
import X.C71094Wnq;
import X.InterfaceC55932he;
import X.InterfaceC61462r9;
import X.InterfaceC70533Ep;
import X.InterfaceC71293Hq;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.R;

/* loaded from: classes2.dex */
public class RefreshableNestedScrollingParent extends FrameLayout implements InterfaceC55932he, C03H {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public View A04;
    public C71094Wnq A05;
    public InterfaceC61462r9 A06;
    public InterfaceC71293Hq A07;
    public InterfaceC70533Ep A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public int A0C;
    public int A0D;
    public boolean A0E;
    public boolean A0F;
    public final C03I A0G;
    public final C03K A0H;
    public final C55982hj A0I;

    public RefreshableNestedScrollingParent(Context context) {
        this(context, null);
    }

    @Override // X.InterfaceC55932he
    public final void Dnj(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnl(C55982hj c55982hj) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        View view = this.A04;
        if (!this.A0F && view != null) {
            canvas.save();
            int i = this.A03 - this.A01;
            canvas.translate(0.0f, this.A02);
            InterfaceC70533Ep interfaceC70533Ep = this.A08;
            if (interfaceC70533Ep != null) {
                interfaceC70533Ep.EGe(canvas, view, this, (float) (this.A0I.A09.A00 / i), i, this.A0E);
            }
            canvas.restore();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        if (!this.A0A && !this.A0F) {
            C55982hj c55982hj = this.A0I;
            float f = (float) c55982hj.A09.A00;
            int i5 = this.A0D;
            int i6 = -i4;
            if (i5 == 0) {
                i6 = i4;
            }
            float f2 = f - i6;
            float f3 = this.A03 - this.A01;
            if (f2 > this.A00 * f3) {
                f2 = f + (f - ((float) Math.sqrt(Math.max(0.0f, (r8 * r1) + (f * f)))));
            }
            float max = Math.max(0.0f, f2);
            c55982hj.A08(max, true);
            int i7 = (int) (max - f);
            if (i5 != 0) {
                i7 = -i7;
            }
            dispatchNestedScroll(i, i7, i3, i4 - i7, null);
            InterfaceC61462r9 interfaceC61462r9 = this.A06;
            if (interfaceC61462r9 != null) {
                interfaceC61462r9.E6p(f / f3, max / f3);
            }
        }
    }

    public static void A00(RefreshableNestedScrollingParent refreshableNestedScrollingParent, boolean z, boolean z2) {
        float f;
        View view;
        if (!refreshableNestedScrollingParent.A0F) {
            if (refreshableNestedScrollingParent.A0B != z) {
                refreshableNestedScrollingParent.A0B = z;
                InterfaceC70533Ep interfaceC70533Ep = refreshableNestedScrollingParent.A08;
                if (interfaceC70533Ep != null) {
                    interfaceC70533Ep.EWc(z);
                }
            }
            if (z2) {
                if (z) {
                    f = refreshableNestedScrollingParent.A03 - refreshableNestedScrollingParent.A01;
                } else {
                    f = 0.0f;
                }
                C55982hj c55982hj = refreshableNestedScrollingParent.A0I;
                float f2 = (float) c55982hj.A09.A00;
                c55982hj.A06(f);
                if (f2 != f && (view = refreshableNestedScrollingParent.A04) != null && (view instanceof C03H) && !z) {
                    refreshableNestedScrollingParent.stopNestedScroll();
                }
            }
        }
    }

    private int getkeyboardOffsetRefreshIndicatorHeight() {
        return this.A03 - this.A01;
    }

    public final boolean A01() {
        if (!this.A0F && this.A0I.A09.A00 > this.A03 - this.A01) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        View view = this.A04;
        if (view != null && !this.A0F) {
            float f = (float) c55982hj.A09.A00;
            float f2 = -f;
            if (this.A0D == 0) {
                f2 = f;
            }
            view.setTranslationY(f2);
            invalidate(0, 0, getWidth(), (int) f);
            InterfaceC71293Hq interfaceC71293Hq = this.A07;
            if (f >= this.A03 - this.A01 && !this.A0B && interfaceC71293Hq != null && this.A0E) {
                A00(this, true, false);
                interfaceC71293Hq.DeM();
            }
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.A0G.A04(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.A0G.A03(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.A0G.A07(iArr, iArr2, i, i2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.A0G.A06(i, i2, i3, i4, iArr);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C03K c03k = this.A0H;
        return c03k.A01 | c03k.A00;
    }

    public int getRefreshingDistance() {
        return this.A03;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        if (this.A0G.A01 == null) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.A0G.A02;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return this.A0G.A03(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (!this.A0A && !this.A0F) {
            C55982hj c55982hj = this.A0I;
            float f = (float) c55982hj.A09.A00;
            int i3 = this.A0D;
            int i4 = -i2;
            if (i3 == 0) {
                i4 = i2;
            }
            if (f > 0.0f && i4 > 0) {
                float max = Math.max(0.0f, f - i4);
                c55982hj.A08(max, true);
                int i5 = (int) (f - max);
                if (i3 != 0) {
                    i5 = -i5;
                }
                iArr[1] = i5;
                C71094Wnq c71094Wnq = this.A05;
                if (c71094Wnq != null) {
                    c71094Wnq.ARj();
                }
            } else {
                C71094Wnq c71094Wnq2 = this.A05;
                if (c71094Wnq2 != null) {
                    c71094Wnq2.APU();
                }
            }
            dispatchNestedPreScroll(i, i2, iArr, null);
            return;
        }
        iArr[0] = 0;
        iArr[1] = 0;
        C71094Wnq c71094Wnq3 = this.A05;
        if (c71094Wnq3 == null) {
            return;
        }
        c71094Wnq3.ARj();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        if (!this.A0F) {
            this.A0C = (int) this.A0I.A09.A00;
        }
        this.A04 = view2;
        this.A0H.A01 = i;
        startNestedScroll(2);
        this.A0E = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) != 0 && isEnabled()) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        boolean z = true;
        if (!this.A0F) {
            double d = this.A0C;
            C55982hj c55982hj = this.A0I;
            if (d != c55982hj.A09.A00 && c55982hj.A0C()) {
                if (!A01() || !this.A0B) {
                    z = false;
                }
                setRefreshing(z);
                this.A0H.A01 = 0;
                stopNestedScroll();
                this.A0E = false;
            }
        }
        C71094Wnq c71094Wnq = this.A05;
        if (c71094Wnq != null) {
            c71094Wnq.ARj();
        }
        this.A0H.A01 = 0;
        stopNestedScroll();
        this.A0E = false;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.A0G.A02(z);
    }

    public void setPTRSpinnerListener(C71094Wnq c71094Wnq) {
        this.A05 = c71094Wnq;
        this.A0F = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0011, code lost:
    
        if (r6.A0I.A09.A00 != 0.0d) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setRefreshing(boolean r7) {
        /*
            r6 = this;
            boolean r0 = r6.A0F
            if (r0 != 0) goto L17
            if (r7 == 0) goto L13
            X.2hj r0 = r6.A0I
            X.2hk r0 = r0.A09
            double r4 = r0.A00
            r2 = 0
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 0
            if (r1 == 0) goto L14
        L13:
            r0 = 1
        L14:
            A00(r6, r7, r0)
        L17:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent.setRefreshing(boolean):void");
    }

    public void setRefreshingDistance(int i) {
        if (i != this.A03) {
            this.A03 = i;
        }
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        int i2;
        int i3 = 0;
        if (this.A09) {
            int A00 = AbstractC13890nF.A00(getContext());
            C011504d A002 = AbstractC009003e.A00(this);
            if (A002 != null && (i2 = A002.A00.A05(8).A00) > 0 && A00 > 0 && i2 < A00) {
                i3 = (this.A03 * i2) / A00;
            }
        }
        this.A01 = i3;
        return this.A0G.A05(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.A0G.A01(0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(-607004218);
        super.onAttachedToWindow();
        if (!this.A0F) {
            this.A0I.A0A(this);
        }
        C0f9.A0D(-966360282, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(-749896235);
        super.onDetachedFromWindow();
        if (!this.A0F) {
            this.A0I.A0B(this);
            InterfaceC70533Ep interfaceC70533Ep = this.A08;
            if (interfaceC70533Ep != null) {
                interfaceC70533Ep.DA2(this);
            }
        }
        C0f9.A0D(1851313911, A06);
    }

    public void setForceDisableNestedScrolling(boolean z) {
        this.A0A = z;
    }

    public void setListener(InterfaceC71293Hq interfaceC71293Hq) {
        this.A07 = interfaceC71293Hq;
    }

    public void setPullDownProgressDelegate(InterfaceC61462r9 interfaceC61462r9) {
        this.A06 = interfaceC61462r9;
    }

    public void setRefreshDrawableVerticalOffset(int i) {
        this.A02 = i;
    }

    public void setRenderer(InterfaceC70533Ep interfaceC70533Ep) {
        this.A08 = interfaceC70533Ep;
    }

    public void setScrollFrictionCutoffMultiplier(float f) {
        this.A00 = f;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.03K] */
    public RefreshableNestedScrollingParent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A02 = 0;
        this.A01 = 0;
        this.A09 = false;
        this.A0H = new Object();
        this.A0G = new C03I(this);
        C55982hj A02 = AbstractC13560mi.A00().A02();
        A02.A06 = true;
        this.A0I = A02;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC55922hc.A1x, 0, 0);
        try {
            this.A0D = obtainStyledAttributes.getInt(2, 0);
            this.A03 = obtainStyledAttributes.getDimensionPixelSize(1, getResources().getDimensionPixelSize(R.dimen.action_button_min_width));
            this.A00 = obtainStyledAttributes.getFloat(0, 1.4f);
            this.A08 = new C70523Eo(this, obtainStyledAttributes.getBoolean(3, true));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public RefreshableNestedScrollingParent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
