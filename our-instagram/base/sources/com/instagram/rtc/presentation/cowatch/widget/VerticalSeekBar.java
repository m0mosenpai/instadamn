package com.instagram.rtc.presentation.cowatch.widget;

import X.AbstractC166987dD;
import X.C0f9;
import X.C14360o3;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* loaded from: classes5.dex */
public final class VerticalSeekBar extends SeekBar {
    public SeekBar.OnSeekBarChangeListener A00;

    public VerticalSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        canvas.rotate(-90.0f);
        canvas.translate(-AbstractC166987dD.A08(this), 0.0f);
        super.onDraw(canvas);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i2, i);
        setMeasuredDimension(getMeasuredHeight(), getMeasuredWidth());
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i) {
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener;
        boolean z = false;
        if (i != getProgress()) {
            z = true;
        }
        super.setProgress(i);
        onSizeChanged(getWidth(), getHeight(), 0, 0);
        if (z && (onSeekBarChangeListener = this.A00) != null) {
            onSeekBarChangeListener.onProgressChanged(this, getProgress(), false);
        }
    }

    public final SeekBar.OnSeekBarChangeListener getOnSeekBarChangeListener() {
        return this.A00;
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = C0f9.A06(645228563);
        super.onSizeChanged(i2, i, i4, i3);
        C0f9.A0D(-1619226293, A06);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        if (r1 != 3) goto L13;
     */
    @Override // android.widget.AbsSeekBar, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            r0 = 473427052(0x1c37ec6c, float:6.085519E-22)
            int r4 = X.C0f9.A05(r0)
            r5 = 0
            X.C14360o3.A0B(r8, r5)
            boolean r0 = r7.isEnabled()
            if (r0 != 0) goto L18
            r0 = -1086984234(0xffffffffbf35efd6, float:-0.71069086)
            X.C0f9.A0C(r0, r4)
            return r5
        L18:
            int r1 = r8.getAction()
            r3 = 1
            if (r1 == 0) goto L7e
            if (r1 == r3) goto L73
            r0 = 2
            if (r1 == r0) goto L2e
            r0 = 3
            if (r1 == r0) goto L73
        L27:
            r0 = 944410509(0x384a8f8d, float:4.8294245E-5)
            X.C0f9.A0C(r0, r4)
            return r3
        L2e:
            android.view.ViewParent r0 = r7.getParent()
            if (r0 == 0) goto L37
            r0.requestDisallowInterceptTouchEvent(r3)
        L37:
            int r6 = r7.getMax()
            int r0 = r7.getMax()
            float r1 = (float) r0
            float r0 = r8.getY()
            float r1 = r1 * r0
            float r0 = X.AbstractC166987dD.A08(r7)
            float r1 = r1 / r0
            int r0 = (int) r1
            int r6 = r6 - r0
            r2 = r7
            monitor-enter(r2)
            int r1 = r7.getProgress()     // Catch: java.lang.Throwable -> L89
            super.setProgress(r6)     // Catch: java.lang.Throwable -> L89
            int r0 = r7.getProgress()     // Catch: java.lang.Throwable -> L89
            if (r1 == r0) goto L66
            int r1 = r7.getWidth()     // Catch: java.lang.Throwable -> L89
            int r0 = r7.getHeight()     // Catch: java.lang.Throwable -> L89
            r7.onSizeChanged(r1, r0, r5, r5)     // Catch: java.lang.Throwable -> L89
        L66:
            monitor-exit(r2)
            android.widget.SeekBar$OnSeekBarChangeListener r1 = r7.A00
            if (r1 == 0) goto L27
            int r0 = r7.getProgress()
            r1.onProgressChanged(r7, r0, r3)
            goto L27
        L73:
            android.widget.SeekBar$OnSeekBarChangeListener r0 = r7.A00
            if (r0 == 0) goto L7a
            r0.onStopTrackingTouch(r7)
        L7a:
            r7.setPressed(r5)
            goto L27
        L7e:
            r7.setPressed(r3)
            android.widget.SeekBar$OnSeekBarChangeListener r0 = r7.A00
            if (r0 == 0) goto L27
            r0.onStartTrackingTouch(r7)
            goto L27
        L89:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.rtc.presentation.cowatch.widget.VerticalSeekBar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.SeekBar
    public void setOnSeekBarChangeListener(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        this.A00 = onSeekBarChangeListener;
    }

    public VerticalSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public VerticalSeekBar(Context context) {
        this(context, null, 0);
    }
}
