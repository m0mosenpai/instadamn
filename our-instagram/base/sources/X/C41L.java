package X;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.41L, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C41L extends View implements InterfaceC021908q, InterfaceC55932he, InterfaceC62892tS {
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public C50I A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final int A0D;
    public final ArgbEvaluator A0E;
    public final Paint A0F;
    public final InterfaceC09390do A0G;
    public final boolean A0H;

    @Override // X.InterfaceC62892tS
    public final void DXb(int i, int i2, boolean z) {
    }

    @Override // X.InterfaceC62892tS
    public final void Diq(C3VZ c3vz, float f, float f2) {
        this.A02 = (float) Math.min(Math.max(f, 0.0d), this.A05 - 1);
        invalidate();
    }

    @Override // X.InterfaceC62892tS
    public final void Diy(C3VZ c3vz, C3VZ c3vz2) {
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

    @Override // X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        int i;
        double d;
        C14360o3.A0B(c55982hj, 0);
        if (this.A05 > this.A06) {
            if (this.A0H) {
                d = 1.0d - c55982hj.A09.A00;
            } else {
                d = c55982hj.A09.A00;
            }
            i = C1H4.A00(d);
        } else {
            i = 0;
        }
        setScrollX(i);
    }

    @Override // X.InterfaceC62892tS
    public final void DrZ(int i, int i2) {
    }

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ void DyE(int i, float f) {
    }

    @Override // X.InterfaceC62892tS
    public final void E0r(View view) {
    }

    public abstract int getCurrentPage();

    public abstract boolean getGestureInProgress();

    @Override // X.InterfaceC021908q
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // X.InterfaceC021908q
    public final void onPageScrolled(int i, float f, int i2) {
    }

    public abstract void setCurrentPage(int i);

    public abstract void setGestureInProgress(boolean z);

    public final void setProgressBarEnabled(boolean z) {
    }

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ boolean CtU() {
        return false;
    }

    public final float getActiveCircleAlpha() {
        return this.A00;
    }

    public final int getActiveColor() {
        return this.A03;
    }

    public final boolean getAnimatePageDotSelection() {
        return this.A09;
    }

    public final int getDefaultSize() {
        return this.A0D;
    }

    public final ArgbEvaluator getEvaluator() {
        return this.A0E;
    }

    public final boolean getHasUserInteractedWithCarousel() {
        return this.A0C;
    }

    public final int getInactiveColor() {
        return this.A04;
    }

    public final float getIndicatorProgress() {
        return this.A01;
    }

    public final int getPageCount() {
        return this.A05;
    }

    public final Paint getPaint() {
        return this.A0F;
    }

    public final float getScrollOffset() {
        return this.A02;
    }

    public final InterfaceC09390do getScrollSpring() {
        return this.A0G;
    }

    public final int getScrollingItemCountThreshold() {
        return this.A06;
    }

    public final boolean getShouldCarouselIndicatorProgressAnimate() {
        return this.A0B;
    }

    public final int getSpacing() {
        return this.A07;
    }

    public final void setActiveCircleAlpha(float f) {
        this.A00 = f;
        invalidate();
    }

    public final void setActiveColor(int i) {
        this.A03 = i;
        invalidate();
    }

    public final void setDarkMode(boolean z) {
        this.A0A = z;
        invalidate();
    }

    public final void setHasUserInteractedWithCarousel(boolean z) {
        this.A0C = z;
        invalidate();
    }

    public final void setInactiveColor(int i) {
        this.A04 = i;
        invalidate();
    }

    public final void setIndicatorProgress(float f) {
        this.A01 = f;
        if (f != 0.0f) {
            invalidate();
        }
    }

    public final void setPageCount(int i) {
        this.A05 = i;
        invalidate();
    }

    public C41L(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0F = new Paint(1);
        this.A0E = new ArgbEvaluator();
        this.A0G = AbstractC09440dt.A01(C41N.A00);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        RectF rectF = AbstractC13880nE.A01;
        int applyDimension = (int) TypedValue.applyDimension(1, 3.0f, displayMetrics);
        this.A0D = applyDimension;
        this.A07 = applyDimension;
        this.A0H = AbstractC13620mo.A02(getContext());
        this.A00 = 1.0f;
    }

    public final void A01(int i, int i2) {
        setCurrentPage(i);
        setPageCount(i2);
        requestLayout();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(-414870792);
        super.onAttachedToWindow();
        ((C55982hj) this.A0G.getValue()).A0A(this);
        C0f9.A0D(1253372409, A06);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(133308048);
        super.onDetachedFromWindow();
        C55982hj c55982hj = (C55982hj) this.A0G.getValue();
        c55982hj.A01();
        c55982hj.A0B(this);
        C0f9.A0D(-950801674, A06);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent;
        int A05 = C0f9.A05(687039881);
        C14360o3.A0B(motionEvent, 0);
        C50I c50i = this.A08;
        if (c50i != null) {
            onTouchEvent = c50i.A05.onTouchEvent(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 1 || actionMasked == 3) {
                c50i.A04.removeCallbacks(c50i.A07);
                if (c50i.A00) {
                    c50i.A06.setGestureInProgress(false);
                    c50i.A00 = false;
                }
            }
        } else {
            onTouchEvent = super.onTouchEvent(motionEvent);
        }
        C0f9.A0C(420402286, A05);
        return onTouchEvent;
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        super.setAlpha(f);
        this.A0F.setAlpha((int) (f * 255.0f));
        invalidate();
    }

    @Override // X.InterfaceC62892tS
    public final void DXP(int i, int i2) {
        setCurrentPage(i);
    }

    @Override // X.InterfaceC021908q
    public final void onPageSelected(int i) {
        setCurrentPage(i);
    }

    public final void setAnimatePageDotSelection(boolean z) {
        this.A09 = z;
    }

    public final void setScrollOffset(float f) {
        this.A02 = f;
    }

    public final void setScrollingItemCountThreshold(int i) {
        this.A06 = i;
    }

    public final void setShouldCarouselIndicatorProgressAnimate(boolean z) {
        this.A0B = z;
    }

    public final void setSpacing(int i) {
        this.A07 = i;
    }
}
