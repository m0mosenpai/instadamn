package com.instagram.ui.widget.pageindicator;

import X.AbstractC13880nE;
import X.AbstractC53242c7;
import X.AbstractC55922hc;
import X.AbstractC63123SdR;
import X.C0K8;
import X.C0f9;
import X.C14360o3;
import X.C41L;
import X.C48003LLy;
import X.C55982hj;
import X.InterfaceC09390do;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.R;

/* loaded from: classes2.dex */
public class CirclePageIndicator extends C41L {
    public static int A0N;
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public Paint A09;
    public Paint A0A;
    public Paint A0B;
    public Paint A0C;
    public Paint A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public final int A0K;
    public final int A0L;
    public final int A0M;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CirclePageIndicator(Context context) {
        this(context, null);
        C14360o3.A0B(context, 1);
    }

    public final void A03(Canvas canvas) {
        float f = this.A03;
        float height = (canvas.getHeight() / 2.0f) - f;
        float scrollX = getScrollX();
        float f2 = scrollX + height;
        float width = (scrollX + canvas.getWidth()) - height;
        Paint paint = this.A0C;
        canvas.drawCircle(f2, canvas.getHeight() / 2.0f, height, paint);
        canvas.drawCircle(width, canvas.getHeight() / 2.0f, height, paint);
        canvas.drawRect(f2, f, width, canvas.getHeight() - f, paint);
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x025b, code lost:
    
        if (r0 != (((X.C41L) r2).A05 - 2)) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02c2 A[ADDED_TO_REGION] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r33) {
        /*
            Method dump skipped, instructions count: 1153
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.pageindicator.CirclePageIndicator.onDraw(android.graphics.Canvas):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setBackgroundScale(float f) {
        this.A01 = f;
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A04(android.graphics.Canvas r18, java.lang.Integer r19, float r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.pageindicator.CirclePageIndicator.A04(android.graphics.Canvas, java.lang.Integer, float, int, int, int):void");
    }

    @Override // X.C41L
    public int getCurrentPage() {
        return this.A06;
    }

    @Override // X.C41L
    public boolean getGestureInProgress() {
        return this.A0E;
    }

    public final int getShadowRadius() {
        return this.A08;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        String str;
        int i3 = this.A08;
        if (i3 == -1) {
            i3 = 0;
        }
        if (this.A0F) {
            i2 = View.MeasureSpec.makeMeasureSpec(((A0N + i3) * 2) + getPaddingTop() + getPaddingBottom(), AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != 1073741824) {
            int viewWidth = getViewWidth();
            if (mode == Integer.MIN_VALUE && viewWidth > size) {
                viewWidth = size;
            }
            size = viewWidth;
            int i4 = this.A07;
            if (i4 != -1 && size > i4) {
                size = i4;
            }
        }
        int i5 = this.A07;
        if (i5 != -1 && size > i5) {
            size = i5;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("pageCount ");
        sb.append(super.A05);
        sb.append(" width ");
        sb.append(size);
        sb.append(" (");
        if (mode != Integer.MIN_VALUE) {
            if (mode != 1073741824) {
                str = "UNSET";
            } else {
                str = "EXACTLY";
            }
        } else {
            str = "ATMOST";
        }
        sb.append(str);
        sb.append("), ");
        sb.append(i5);
        C0K8.A0C("CirclePageIndicator", sb.toString());
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 != 1073741824) {
            int paddingTop = ((A0N + i3) * 2) + getPaddingTop() + getPaddingBottom();
            if (mode2 == Integer.MIN_VALUE) {
                size2 = Math.min(paddingTop, size2);
            } else {
                size2 = paddingTop;
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override // X.C41L
    public void setCurrentPage(int i) {
        this.A06 = i;
        double targetScrollPosition = getTargetScrollPosition();
        InterfaceC09390do interfaceC09390do = super.A0G;
        if (targetScrollPosition != ((C55982hj) interfaceC09390do.getValue()).A01) {
            ((C55982hj) interfaceC09390do.getValue()).A06(targetScrollPosition);
        }
        invalidate();
    }

    @Override // X.C41L
    public void setGestureInProgress(boolean z) {
        if (this.A0F) {
            float f = 0.0f;
            float f2 = 1.0f;
            if (z) {
                f2 = 0.0f;
                f = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
            ofFloat.addUpdateListener(new C48003LLy(this));
            ofFloat.setDuration(100L);
            ofFloat.start();
        }
        this.A0E = z;
        invalidate();
    }

    public final void A02(int i) {
        setCurrentPage(i);
        setScrollX(0);
        ((C55982hj) super.A0G.getValue()).A08(getTargetScrollPosition(), true);
    }

    public int getTargetScrollPosition() {
        int i;
        int paddingLeft = getPaddingLeft();
        int i2 = super.A05;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i4 < i2) {
                int i5 = A0N;
                int i6 = paddingLeft + i5;
                int i7 = this.A06;
                if (i4 == i7) {
                    int i8 = i6 - i5;
                    int i9 = i5 * 2;
                    i = i9 + i8;
                    if (this.A0F) {
                        if (i7 != 0) {
                            i8 -= super.A07 + i9;
                        }
                        if (i7 != i2 - 1) {
                            i += i9 + super.A07;
                        }
                    }
                    i3 = i8;
                } else {
                    paddingLeft = i6 + i5 + super.A07;
                    i4++;
                }
            } else {
                i = 0;
                break;
            }
        }
        int paddingLeft2 = i3 - getPaddingLeft();
        int width = (i - getWidth()) + getPaddingRight();
        if (width > getScrollX()) {
            return width;
        }
        if (paddingLeft2 >= getScrollX()) {
            return getScrollX();
        }
        return paddingLeft2;
    }

    public int getViewWidth() {
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int i = super.A05;
        return paddingLeft + (i * 2 * A0N) + ((i - 1) * super.A07);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = C0f9.A06(-643988674);
        super.onSizeChanged(i, i2, i3, i4);
        setScrollX(0);
        ((C55982hj) super.A0G.getValue()).A08(getTargetScrollPosition(), true);
        C0f9.A0D(191314593, A06);
    }

    public final void setShadowRadius(int i) {
        this.A08 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CirclePageIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        Context context2 = getContext();
        this.A0K = context2.getColor(R.color.grey_5);
        this.A07 = -1;
        this.A08 = -1;
        this.A0C = new Paint(1);
        this.A09 = new Paint(1);
        this.A0D = new Paint(1);
        this.A0A = new Paint(1);
        this.A0B = new Paint(1);
        this.A05 = -1;
        this.A0L = context2.getColor(R.color.black_50_transparent);
        this.A0M = context2.getColor(R.color.black_20_transparent);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC55922hc.A0E, 0, i);
        C14360o3.A07(obtainStyledAttributes);
        try {
            int i2 = this.A0K;
            setActiveColor(obtainStyledAttributes.getColor(0, i2));
            setInactiveColor(obtainStyledAttributes.getColor(3, i2));
            int i3 = super.A0D;
            A0N = obtainStyledAttributes.getDimensionPixelSize(1, i3);
            super.A07 = obtainStyledAttributes.getDimensionPixelOffset(2, i3);
            super.A06 = obtainStyledAttributes.getInt(8, 5);
            this.A07 = obtainStyledAttributes.getDimensionPixelSize(4, -1);
            this.A08 = obtainStyledAttributes.getDimensionPixelSize(5, -1);
            this.A0F = obtainStyledAttributes.getBoolean(7, false);
            this.A0G = obtainStyledAttributes.getBoolean(9, true);
            this.A0H = obtainStyledAttributes.getBoolean(10, false);
            this.A0I = obtainStyledAttributes.getBoolean(11, false);
            this.A0J = obtainStyledAttributes.getBoolean(12, false);
            obtainStyledAttributes.recycle();
            Paint paint = this.A09;
            Paint.Style style = Paint.Style.FILL;
            paint.setStyle(style);
            paint.setColor(context.getColor(R.color.context_line_color));
            paint.setAlpha(80);
            if (this.A0F) {
                if (this.A0G) {
                    Paint paint2 = this.A0D;
                    paint2.setColor(context.getColor(R.color.black_10_transparent));
                    paint2.setMaskFilter(new BlurMaskFilter(22.0f, BlurMaskFilter.Blur.NORMAL));
                    paint2.setStrokeWidth(A0N * 2);
                }
                if (this.A0H) {
                    Paint paint3 = this.A0A;
                    paint3.setColor(context.getColor(this.A0J ? R.color.black_5_transparent : R.color.black_15_transparent));
                    paint3.setMaskFilter(new BlurMaskFilter(22.0f, BlurMaskFilter.Blur.NORMAL));
                }
                if (this.A0I) {
                    this.A0B.setColor(context.getColor(R.color.black_5_transparent));
                    this.A05 = 2;
                }
            }
            this.A00 = AbstractC13880nE.A00(context, 4.0f);
            this.A02 = AbstractC13880nE.A00(context, 20.0f);
            this.A04 = AbstractC13880nE.A04(context, 4);
            Paint paint4 = this.A0C;
            paint4.setStyle(style);
            paint4.setColor(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_highlight_background)));
            this.A03 = AbstractC13880nE.A04(context, 6);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CirclePageIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }
}
