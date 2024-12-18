package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import com.facebook.R;

/* loaded from: classes5.dex */
public final class BVR extends View implements InterfaceC55932he {
    public float A00;
    public int A01;
    public int A02;
    public C38688GzT A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final float A08;
    public final float A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final Paint A0H;
    public final InterfaceC09390do A0I;
    public final boolean A0J;
    public final int A0K;

    public BVR(Context context) {
        super(context, null, 0);
        this.A0J = AbstractC13620mo.A02(getContext());
        this.A0E = 5;
        this.A0H = AbstractC166987dD.A0S(1);
        this.A03 = new C38688GzT(24, (Object) null, (Object) null, (Object) null, (Object) null);
        this.A0I = AbstractC09440dt.A01(C44243Jgn.A00);
        Resources resources = getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        RectF rectF = AbstractC13880nE.A01;
        int applyDimension = (int) TypedValue.applyDimension(1, 3.0f, displayMetrics);
        this.A0D = applyDimension;
        this.A08 = TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics());
        this.A09 = TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics());
        this.A0F = applyDimension * 2;
        this.A0K = (int) TypedValue.applyDimension(1, 80.0f, resources.getDisplayMetrics());
        this.A0C = (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics());
        this.A0G = (int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics());
        this.A0A = context.getColor(R.color.design_dark_default_color_on_background);
        this.A0B = context.getColor(R.color.bright_foreground_disabled_material_dark);
    }

    public final void A00() {
        setCurrentIndex(0);
        setIndicatorCount(0);
        this.A06 = false;
        this.A07 = false;
        setCarouselIndicatorViewBoxConfig(new C38688GzT(24, (Object) null, (Object) null, (Object) null, (Object) null));
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
        if (this.A02 > this.A0E) {
            if (this.A0J) {
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

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a5, code lost:
    
        if (r6 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0176, code lost:
    
        if (r12 == r0) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x018a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x00a5 -> B:7:0x0034). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0191 -> B:8:0x0036). Please report as a decompilation issue!!! */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r26) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BVR.onDraw(android.graphics.Canvas):void");
    }

    public void setCarouselIndicatorViewBoxConfig(C38688GzT c38688GzT) {
        C14360o3.A0B(c38688GzT, 0);
        this.A03 = c38688GzT;
        invalidate();
    }

    public final void setCarouselViewBoxConfig(C38688GzT c38688GzT) {
        C14360o3.A0B(c38688GzT, 0);
        this.A03 = c38688GzT;
    }

    public final void setIndicatorCount(int i) {
        this.A02 = i;
        invalidate();
    }

    private final int getTargetScrollPosition() {
        int paddingLeft = getPaddingLeft();
        int i = this.A0D * 2;
        int i2 = i + this.A0F;
        int i3 = this.A01;
        int i4 = paddingLeft + (i2 * i3);
        if (!this.A04 && this.A06 && !this.A07) {
            i = this.A0C;
        }
        int i5 = i + i4;
        int i6 = this.A02;
        if (i6 > this.A0E) {
            if (i3 > 0) {
                i4 -= i2;
                if (i3 > 1) {
                    i4 -= i2;
                }
            }
            if (i3 < i6 - 1) {
                i5 += i2;
                if (i3 < i6 - 2) {
                    i5 += i2;
                }
            }
        }
        int paddingLeft2 = i4 - getPaddingLeft();
        int width = (i5 - getWidth()) + getPaddingRight();
        if (width > getScrollX()) {
            return width;
        }
        if (paddingLeft2 >= getScrollX()) {
            return getScrollX();
        }
        return paddingLeft2;
    }

    public final C38688GzT getCarouselViewBoxConfig() {
        return this.A03;
    }

    public int getCurrentIndex() {
        return this.A01;
    }

    public final boolean getHasInterruptedAutoAdvanceByUser() {
        return this.A04;
    }

    public final int getIndicatorCount() {
        return this.A02;
    }

    public final Paint getPaint() {
        return this.A0H;
    }

    public final InterfaceC09390do getScrollSpring() {
        return this.A0I;
    }

    public final int getScrollingItemCountThreshold() {
        return this.A0E;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(2074825991);
        super.onAttachedToWindow();
        InterfaceC09390do interfaceC09390do = this.A0I;
        setScrollX(C1H4.A00(((C55982hj) interfaceC09390do.getValue()).A01));
        ((C55982hj) interfaceC09390do.getValue()).A0A(this);
        C0f9.A0D(1887324801, A06);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(-607200954);
        super.onDetachedFromWindow();
        C55982hj c55982hj = (C55982hj) this.A0I.getValue();
        c55982hj.A01();
        c55982hj.A0B(this);
        C0f9.A0D(-889329517, A06);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int i4 = this.A02;
        int i5 = this.A0E;
        if (i4 > i5) {
            i4 = i5;
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int i6 = i4 - 1;
        int i7 = this.A0D;
        int i8 = paddingLeft + (i6 * 2 * i7) + (i6 * this.A0F);
        boolean z = this.A04;
        if (!z && this.A06 && !this.A07) {
            i3 = this.A0C;
        } else if (!z && this.A06 && this.A07) {
            i3 = this.A0G;
        } else {
            i3 = i7 * 2;
        }
        int i9 = i8 + i3;
        if ((mode == Integer.MIN_VALUE || mode == 1073741824) && i9 > size) {
            i9 = size;
        }
        int i10 = this.A0K;
        if (i9 > i10) {
            i9 = i10;
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 != 1073741824) {
            int paddingTop = (i7 * 2) + getPaddingTop() + getPaddingBottom();
            if (mode2 == Integer.MIN_VALUE && paddingTop > size2) {
                paddingTop = size2;
            }
            size2 = paddingTop;
        }
        setMeasuredDimension(i9, size2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = C0f9.A06(2070961006);
        super.onSizeChanged(i, i2, i3, i4);
        setScrollX(0);
        ((C55982hj) this.A0I.getValue()).A05(getTargetScrollPosition());
        C0f9.A0D(-114790172, A06);
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        super.setAlpha(f);
        this.A0H.setAlpha((int) (f * 255.0f));
        invalidate();
    }

    public void setCurrentIndex(int i) {
        this.A01 = AbstractC25230BEn.A06(i, i);
        double targetScrollPosition = getTargetScrollPosition();
        InterfaceC09390do interfaceC09390do = this.A0I;
        if (targetScrollPosition != ((C55982hj) interfaceC09390do.getValue()).A01) {
            ((C55982hj) interfaceC09390do.getValue()).A06(targetScrollPosition);
        }
        invalidate();
    }

    public final void setCarouselDPAGrid(boolean z) {
        this.A05 = z;
    }

    public final void setCarouselProgressDotsStyle(boolean z) {
        this.A06 = z;
    }

    public final void setCarouselVideoScrubberEnabledForCurrentMedia(boolean z) {
        this.A07 = z;
    }

    public final void setHasInterruptedAutoAdvanceByUser(boolean z) {
        this.A04 = z;
    }
}
