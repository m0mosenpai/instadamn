package com.facebook.xapp.messaging.audio.waveforms;

import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC25227BEk;
import X.AbstractC31172DnG;
import X.AbstractC43592JPx;
import X.AbstractC43593JPy;
import X.AbstractC55922hc;
import X.C09530e4;
import X.C0f9;
import X.C14360o3;
import X.C1H4;
import X.JQ0;
import X.LMA;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public class VoiceVisualizer extends View {
    public static final List A0M;
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public int A04;
    public int A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final float A0B;
    public final Paint A0C;
    public final List A0D;
    public final List A0E;
    public final List A0F;
    public final float A0G;
    public final Paint A0H;
    public final Paint A0I;
    public final Paint A0J;
    public final RectF A0K;
    public final AttributeSet A0L;

    private final boolean A01(Canvas canvas, Paint paint, float f, float f2, float f3, float f4, float f5, int i) {
        float f6 = f4 - f3;
        float max = Math.max(0.01f, f2) * f6 * f;
        float f7 = f5 - (this.A01 * i);
        float f8 = f3 + ((f6 - max) / 2.0f);
        float paddingLeft = getPaddingLeft();
        float f9 = this.A02;
        if (f7 < paddingLeft - f9) {
            return false;
        }
        paint.setStrokeWidth(f9 * f);
        canvas.drawLine(f7, f8, f7, f8 + max, paint);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0159, code lost:
    
        if (r9.size() == r18.A04) goto L49;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r19) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.xapp.messaging.audio.waveforms.VoiceVisualizer.onDraw(android.graphics.Canvas):void");
    }

    static {
        Float valueOf = Float.valueOf(0.5f);
        Float valueOf2 = Float.valueOf(0.1875f);
        Float valueOf3 = Float.valueOf(0.375f);
        Float valueOf4 = Float.valueOf(0.75f);
        Float A0m = AbstractC25227BEk.A0m();
        Float valueOf5 = Float.valueOf(0.25f);
        ImmutableList of = ImmutableList.of(valueOf, valueOf2, valueOf3, valueOf4, valueOf, A0m, A0m, valueOf4, valueOf5, valueOf3, valueOf4, A0m, A0m, valueOf, valueOf4, A0m, valueOf4, valueOf4, valueOf, valueOf5, valueOf5, valueOf3, valueOf, A0m, valueOf4, valueOf, valueOf, valueOf4, valueOf5, valueOf, valueOf4, A0m, valueOf, valueOf5, valueOf4);
        C14360o3.A07(of);
        A0M = of;
    }

    private final void A00(Canvas canvas, Paint paint, float f, int i) {
        float f2 = this.A0G;
        float f3 = f2 + (this.A02 / 2.0f);
        float A08 = (AbstractC166987dD.A08(this) - f2) - (this.A02 / 2.0f);
        int i2 = i - 1;
        float paddingLeft = getPaddingLeft() + (i2 * this.A01) + (this.A02 / 2.0f);
        int width = getWidth() - getPaddingRight();
        List list = this.A0E;
        boolean A1b = AbstractC166987dD.A1b(list);
        float f4 = width;
        float f5 = this.A02 / 2.0f;
        if (A1b) {
            f4 += f5;
            f5 = this.A01 * f;
        }
        float min = Math.min(paddingLeft, f4 - f5);
        int i3 = 0;
        if (AbstractC166987dD.A1b(this.A0F)) {
            while (-1 < i2) {
                A01(canvas, paint, 1.0f, ((Number) this.A0D.get(i2)).floatValue(), f3, A08, min, i3);
                i3++;
                i2--;
            }
            return;
        }
        while (-1 < i2) {
            Object animatedValue = ((ValueAnimator) ((C09530e4) list.get(i2)).A01).getAnimatedValue();
            C14360o3.A0C(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            if (A01(canvas, paint, ((Number) animatedValue).floatValue(), ((Number) ((C09530e4) list.get(i2)).A00).floatValue(), f3, A08, min, i3)) {
                i3++;
                i2--;
            } else {
                return;
            }
        }
    }

    private final float getSegmentSpacingPx() {
        return this.A01 - this.A02;
    }

    public final void A02(float f) {
        if (this.A0F.isEmpty()) {
            float[] A1b = AbstractC43592JPx.A1b();
            // fill-array-data instruction
            A1b[0] = 0.0f;
            A1b[1] = 1.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(A1b);
            AbstractC43593JPy.A18(ofFloat);
            ofFloat.setDuration(this.A05);
            LMA.A01(ofFloat, this, 4);
            this.A0E.add(AbstractC166987dD.A1L(Float.valueOf(f), ofFloat));
            ofFloat.start();
            return;
        }
        throw AbstractC31172DnG.A0u();
    }

    public final void A03(float f, float f2) {
        RectF rectF = this.A0K;
        rectF.left = f + getPaddingLeft();
        rectF.right = f2 - getPaddingRight();
        postInvalidateOnAnimation();
    }

    public final void A04(List list, float f) {
        if (this.A0E.isEmpty()) {
            List list2 = this.A0F;
            list2.clear();
            this.A0D.clear();
            this.A06 = true;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                list2.add(Float.valueOf(((Number) it.next()).floatValue()));
            }
            setPlaybackPercentage(f);
            requestLayout();
            return;
        }
        throw AbstractC31172DnG.A0u();
    }

    public final float getSegmentStridePx() {
        return this.A01;
    }

    public final float getSegmentWidthPx() {
        return this.A02;
    }

    public final int getTimerIntervalMs() {
        return this.A05;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        List list = this.A0F;
        if (!list.isEmpty()) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            int i3 = this.A03;
            if (i3 <= 0) {
                if (mode != Integer.MIN_VALUE) {
                    if (mode != 0 && mode == 1073741824) {
                        float paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
                        float f = this.A01;
                        int floor = (int) Math.floor((paddingLeft + (f - this.A02)) / f);
                        if (!this.A07) {
                            floor = Math.min(list.size(), floor);
                        }
                        this.A04 = floor;
                        setMeasuredDimension(size, View.MeasureSpec.getSize(i2));
                        return;
                    }
                    i3 = list.size();
                } else {
                    float paddingLeft2 = (size - getPaddingLeft()) - getPaddingRight();
                    float f2 = this.A01;
                    i3 = Math.min(list.size(), (int) Math.floor((paddingLeft2 + (f2 - this.A02)) / f2));
                }
            }
            this.A04 = i3;
            float f3 = this.A01;
            size = C1H4.A01((i3 * f3) - (f3 - this.A02)) + getPaddingLeft() + getPaddingRight();
            setMeasuredDimension(size, View.MeasureSpec.getSize(i2));
            return;
        }
        super.onMeasure(i, i2);
    }

    public final void setActiveWindowEnabled(boolean z) {
        this.A0A = z;
        postInvalidateOnAnimation();
    }

    public final void setAllowAddingSegmentsToFitView(boolean z) {
        this.A07 = z;
    }

    public final void setFixedSegmentCount(int i) {
        this.A03 = i;
    }

    public final void setPlaybackPercentage(float f) {
        this.A00 = f;
        postInvalidateOnAnimation();
    }

    public final void setSegmentColor(int i) {
        Paint paint = this.A0J;
        paint.setColor(i);
        paint.setAlpha(77);
        this.A0I.setColor(i);
        this.A0C.setColor(-1);
        invalidate();
    }

    public final void setShouldAlwaysUseProgressPaint(boolean z) {
        this.A08 = z;
    }

    public final void setShowScrubbingHandle(boolean z) {
        this.A09 = z;
    }

    public final void setTimerIntervalMs(int i) {
        this.A05 = i;
    }

    public /* synthetic */ VoiceVisualizer(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i));
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(1740579540);
        super.onDetachedFromWindow();
        Iterator it = this.A0E.iterator();
        while (it.hasNext()) {
            ((Animator) ((C09530e4) it.next()).A01).end();
        }
        C0f9.A0D(-1418895160, A06);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        RectF rectF = this.A0K;
        if (rectF.isEmpty()) {
            rectF.set(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    public final void setSegmentStridePx(float f) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(this.A0L, AbstractC55922hc.A2S, 0, 0);
        C14360o3.A07(obtainStyledAttributes);
        try {
            this.A01 = obtainStyledAttributes.getDimensionPixelOffset(4, (int) TypedValue.applyDimension(1, f, AbstractC167007dF.A0K(r4)));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final void setSegmentWidthPx(float f) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(this.A0L, AbstractC55922hc.A2S, 0, 0);
        C14360o3.A07(obtainStyledAttributes);
        try {
            this.A02 = obtainStyledAttributes.getDimensionPixelOffset(5, (int) TypedValue.applyDimension(1, f, AbstractC167007dF.A0K(r4)));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceVisualizer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A0L = attributeSet;
        this.A05 = 100;
        this.A0E = AbstractC166987dD.A1E();
        this.A0F = AbstractC166987dD.A1E();
        this.A0D = AbstractC166987dD.A1E();
        Paint A0S = AbstractC166987dD.A0S(5);
        this.A0I = A0S;
        Paint A0S2 = AbstractC166987dD.A0S(5);
        this.A0J = A0S2;
        Paint A0S3 = AbstractC166987dD.A0S(5);
        this.A0C = A0S3;
        Paint A0S4 = AbstractC166987dD.A0S(5);
        this.A0H = A0S4;
        this.A0K = AbstractC166987dD.A0X();
        Paint.Cap cap = Paint.Cap.ROUND;
        A0S.setStrokeCap(cap);
        A0S2.setStrokeCap(cap);
        A0S3.setStrokeCap(cap);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC55922hc.A2S, 0, 0);
        C14360o3.A07(obtainStyledAttributes);
        try {
            setSegmentColor(obtainStyledAttributes.getInt(2, -1));
            setSegmentStridePx(6.0f);
            setSegmentWidthPx(3.0f);
            this.A0G = obtainStyledAttributes.getDimensionPixelOffset(3, (int) TypedValue.applyDimension(1, 2.0f, AbstractC167007dF.A0K(context)));
            this.A0B = obtainStyledAttributes.getDimensionPixelOffset(1, (int) TypedValue.applyDimension(1, 4.0f, AbstractC167007dF.A0K(context)));
            A0S4.setColor(obtainStyledAttributes.getInt(0, -1));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VoiceVisualizer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VoiceVisualizer(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }
}
