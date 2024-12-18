package com.instagram.ui.widget.rangeseekbar;

import X.AbstractC13600mm;
import X.AbstractC166987dD;
import X.AbstractC25228BEl;
import X.AbstractC53242c7;
import X.AbstractC65703TsZ;
import X.C0f9;
import X.GestureDetectorOnGestureListenerC148016lX;
import X.InterfaceC1119253e;
import X.MSX;
import X.VCY;
import X.XBP;
import X.XEE;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.widget.LinearLayout;
import com.facebook.R;
import com.facebook.common.dextricks.StringTreeSet;
import com.instagram.common.ui.base.IgTextView;

/* loaded from: classes11.dex */
public class RangeSeekBar extends LinearLayout implements InterfaceC1119253e {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public int A05;
    public XBP A06;
    public VCY A07;
    public float A08;
    public float A09;
    public float A0A;
    public float A0B;
    public int A0C;
    public Paint A0D;
    public Paint A0E;
    public Paint A0F;
    public Paint A0G;
    public GestureDetectorOnGestureListenerC148016lX A0H;
    public boolean A0I;

    @Override // X.InterfaceC1119253e
    public final boolean DBd(GestureDetectorOnGestureListenerC148016lX gestureDetectorOnGestureListenerC148016lX, float f, float f2) {
        this.A0I = true;
        return false;
    }

    @Override // X.InterfaceC1119253e
    public final boolean Dmo(GestureDetectorOnGestureListenerC148016lX gestureDetectorOnGestureListenerC148016lX, float f, float f2) {
        return false;
    }

    @Override // X.InterfaceC1119253e
    public final void Dwn(GestureDetectorOnGestureListenerC148016lX gestureDetectorOnGestureListenerC148016lX) {
        this.A0I = false;
        invalidate();
    }

    private void A00() {
        XBP xbp = this.A06;
        if (xbp != null) {
            float f = this.A03;
            float f2 = this.A09;
            if (f > f2) {
                f = f2;
            }
            float f3 = this.A02;
            if (f3 <= f2) {
                f2 = f3;
            }
            float f4 = this.A01;
            float f5 = this.A00;
            xbp.Dcy(f, f2, AbstractC13600mm.A01(f, f4, f5, 0.0f, 1.0f), AbstractC13600mm.A01(f2, f4, f5, 0.0f, 1.0f));
        }
    }

    private void A01(Context context) {
        this.A03 = Float.NaN;
        this.A02 = Float.NaN;
        this.A0H = new GestureDetectorOnGestureListenerC148016lX(context, this);
        Resources resources = context.getResources();
        Paint paint = new Paint();
        this.A0D = paint;
        AbstractC166987dD.A1N(context, paint, AbstractC53242c7.A0C(context));
        this.A0D.setAntiAlias(true);
        this.A0D.setStrokeWidth(resources.getDimension(R.dimen.abc_control_corner_material));
        Paint paint2 = new Paint();
        this.A0E = paint2;
        AbstractC166987dD.A1N(context, paint2, AbstractC53242c7.A09(context));
        this.A0E.setAntiAlias(true);
        this.A0E.setStrokeWidth(resources.getDimension(R.dimen.abc_control_corner_material));
        Paint paint3 = new Paint();
        this.A0G = paint3;
        AbstractC166987dD.A1N(context, paint3, AbstractC53242c7.A0C(context));
        this.A0G.setAntiAlias(true);
        Paint paint4 = new Paint();
        this.A0F = paint4;
        AbstractC166987dD.A1N(context, paint4, AbstractC53242c7.A0B(context));
        this.A0F.setAntiAlias(true);
        this.A0F.setAlpha(StringTreeSet.MAX_SYMBOL_COUNT);
        this.A0C = (int) resources.getDimension(R.dimen.accent_edge_thickness);
        this.A05 = (int) resources.getDimension(R.dimen.account_discovery_bottom_gap);
    }

    private int getLeftBound() {
        return this.A05;
    }

    private void setCurrentPosition(float f) {
        if (this.A07 != null) {
            float f2 = this.A05;
            float width = getWidth() - this.A05;
            float f3 = this.A01;
            float f4 = this.A00;
            float A01 = AbstractC13600mm.A01(f, f2, width, f3, f4);
            if (this.A07 == VCY.START) {
                this.A03 = AbstractC13600mm.A00(A01, f3, this.A02);
            } else {
                this.A02 = AbstractC13600mm.A00(A01, this.A03, f4);
            }
            invalidate();
            A00();
        }
    }

    public final void A02(float f, float f2) {
        if (f < f2) {
            this.A01 = f;
            this.A09 = f2;
            this.A00 = this.A04 + f2;
            float f3 = this.A03;
            if (Float.isNaN(f3) && Float.isNaN(this.A02)) {
                this.A03 = f;
                f3 = f;
                this.A02 = f2;
            }
            boolean z = false;
            if (f3 < f) {
                this.A03 = f;
                z = true;
            }
            if (this.A02 > f2) {
                this.A02 = f2;
            } else if (!z) {
                return;
            }
            invalidate();
            A00();
            return;
        }
        throw new IllegalArgumentException("Minimum seekbar value equal or greater than maximum value");
    }

    @Override // X.InterfaceC1119253e
    public final void DC2(GestureDetectorOnGestureListenerC148016lX gestureDetectorOnGestureListenerC148016lX, float f, float f2, float f3, float f4, float f5) {
        this.A0B = AbstractC65703TsZ.A01(this, this.A03);
        this.A0A = AbstractC65703TsZ.A01(this, this.A02);
    }

    public VCY getCurrentThumb() {
        return this.A07;
    }

    public float getEndThumbX() {
        return AbstractC65703TsZ.A01(this, this.A02);
    }

    public float getEndThumbXWithBuffer() {
        return AbstractC65703TsZ.A01(this, this.A02 + this.A04);
    }

    public float getStartThumbX() {
        return AbstractC65703TsZ.A01(this, this.A03);
    }

    public void setEndingRangeValue(float f) {
        if (f <= this.A09 && this.A03 <= f) {
            this.A02 = f;
            invalidate();
            A00();
        }
    }

    public void setStartingRangeValue(float f) {
        if (f >= this.A01 && f <= this.A02) {
            this.A03 = f;
            invalidate();
            A00();
        }
    }

    public RangeSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0I = false;
        this.A04 = 0;
        A01(context);
    }

    private int getCenterY() {
        return getMeasuredHeight() / 2;
    }

    private int getRightBound() {
        return getWidth() - this.A05;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        if (r2 < r1) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void setCurrentThumb(float r4) {
        /*
            r3 = this;
            float r0 = r3.getEndThumbXWithBuffer()
            float r0 = r0 - r4
            float r2 = java.lang.Math.abs(r0)
            float r0 = r3.A03
            float r0 = X.AbstractC65703TsZ.A01(r3, r0)
            float r0 = r0 - r4
            float r1 = java.lang.Math.abs(r0)
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 != 0) goto L31
            float r0 = r3.A03
            float r0 = X.AbstractC65703TsZ.A01(r3, r0)
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 < 0) goto L35
            float r0 = r3.A03
            float r0 = X.AbstractC65703TsZ.A01(r3, r0)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 >= 0) goto L30
        L2c:
            X.VCY r0 = X.VCY.START
        L2e:
            r3.A07 = r0
        L30:
            return
        L31:
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 >= 0) goto L2c
        L35:
            X.VCY r0 = X.VCY.END
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.rangeseekbar.RangeSeekBar.setCurrentThumb(float):void");
    }

    public final void A03(XEE xee) {
        float endThumbXWithBuffer;
        float A01;
        int dimension;
        int dimension2;
        IgTextView BU0 = xee.BU0();
        IgTextView BQ7 = xee.BQ7();
        int Bk3 = (int) xee.Bk3();
        int Bk0 = (int) xee.Bk0();
        RangeSeekBar Bk2 = xee.Bk2();
        float f = Bk3;
        float f2 = this.A09;
        if (f >= f2) {
            Bk3 = (int) f2;
        }
        MSX.A15(BU0, Bk3);
        float f3 = Bk0;
        float f4 = this.A09;
        if (f3 >= f4) {
            Bk0 = (int) f4;
        }
        MSX.A15(BQ7, Bk0);
        if (f3 >= this.A09) {
            float f5 = this.A00;
            endThumbXWithBuffer = AbstractC13600mm.A01(f5, this.A01, f5, this.A05, getWidth() - this.A05);
        } else {
            endThumbXWithBuffer = Bk2.getEndThumbXWithBuffer();
        }
        Resources resources = getResources();
        int dimension3 = ((int) endThumbXWithBuffer) - ((int) resources.getDimension(R.dimen.account_discovery_bottom_gap));
        float f6 = this.A09;
        if (f >= f6) {
            A01 = AbstractC65703TsZ.A01(this, f6);
        } else {
            A01 = AbstractC65703TsZ.A01(Bk2, Bk2.A03);
        }
        int dimension4 = ((int) A01) - ((int) resources.getDimension(R.dimen.account_discovery_bottom_gap));
        if (Bk2.getWidth() != 0 && dimension4 >= (dimension2 = dimension3 - (dimension = (int) AbstractC25228BEl.A0M(this).getDimension(R.dimen.abc_dialog_padding_top_material)))) {
            if (Bk2.A07 == VCY.START) {
                dimension4 = dimension2;
            } else {
                dimension3 = dimension4 + dimension;
            }
        }
        if (dimension3 >= Bk2.getWidth() - BQ7.getWidth()) {
            dimension3 = Bk2.getWidth() - BQ7.getWidth();
        }
        BQ7.setX(dimension3);
        float f7 = 0.0f;
        if (dimension4 > 0) {
            f7 = dimension4;
        }
        BU0.setX(f7);
    }

    @Override // X.InterfaceC1119253e
    public final boolean DC9(GestureDetectorOnGestureListenerC148016lX gestureDetectorOnGestureListenerC148016lX, float f, float f2, float f3, float f4, boolean z) {
        ViewParent parent = getParent();
        parent.getClass();
        parent.requestDisallowInterceptTouchEvent(true);
        setCurrentThumb(this.A08);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float A01;
        float endThumbXWithBuffer;
        float measuredHeight = getMeasuredHeight() / 2;
        float f = this.A03;
        float f2 = this.A09;
        if (f > f2) {
            A01 = AbstractC65703TsZ.A01(this, f2);
        } else {
            A01 = AbstractC65703TsZ.A01(this, f);
        }
        if (this.A02 > this.A09) {
            float f3 = this.A00;
            endThumbXWithBuffer = AbstractC13600mm.A01(f3, this.A01, f3, this.A05, getWidth() - this.A05);
        } else {
            endThumbXWithBuffer = getEndThumbXWithBuffer();
        }
        if (this.A0I) {
            float f4 = endThumbXWithBuffer;
            if (this.A07 == VCY.START) {
                f4 = A01;
            }
            canvas.drawCircle(f4, measuredHeight, this.A05, this.A0F);
        } else {
            this.A07 = null;
        }
        canvas.drawLine(this.A05, measuredHeight, getWidth() - this.A05, measuredHeight, this.A0E);
        canvas.drawLine(A01, measuredHeight, endThumbXWithBuffer, measuredHeight, this.A0D);
        canvas.drawCircle(A01, measuredHeight, this.A0C, this.A0G);
        canvas.drawCircle(endThumbXWithBuffer, measuredHeight, this.A0C, this.A0G);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        this.A08 = x;
        setCurrentThumb(x);
        if (this.A0B <= 0.0f) {
            this.A0B = AbstractC65703TsZ.A01(this, this.A03);
        }
        float f = this.A0A;
        if (f <= 0.0f) {
            f = AbstractC65703TsZ.A01(this, this.A02);
            this.A0A = f;
        }
        VCY vcy = this.A07;
        if (vcy == VCY.START) {
            this.A0H.A01(this.A0B, getY());
        } else if (vcy == VCY.END) {
            this.A0H.A01(f, getY());
        }
        return this.A0H.DMc(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int A05 = C0f9.A05(764571131);
        boolean Du7 = this.A0H.Du7(motionEvent);
        C0f9.A0C(-2030258390, A05);
        return Du7;
    }

    public void setBufferSize(int i) {
        this.A04 = i;
    }

    public void setRangeSeekBarChangeListener(XBP xbp) {
        this.A06 = xbp;
    }

    @Override // X.InterfaceC1119253e
    public final void DBv(GestureDetectorOnGestureListenerC148016lX gestureDetectorOnGestureListenerC148016lX, float f, float f2, float f3, boolean z) {
        setCurrentPosition(f);
    }

    public RangeSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0I = false;
        this.A04 = 0;
        A01(context);
    }

    public RangeSeekBar(Context context) {
        super(context);
        this.A0I = false;
        this.A04 = 0;
        A01(context);
    }
}
