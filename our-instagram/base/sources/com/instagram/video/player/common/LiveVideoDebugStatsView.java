package com.instagram.video.player.common;

import X.C69311VlJ;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import java.util.Timer;

/* loaded from: classes11.dex */
public final class LiveVideoDebugStatsView extends View {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public Timer A07;
    public float A08;
    public final long A09;
    public final C69311VlJ[] A0A;
    public final Paint A0B;

    public final long getPreferredTimePeriod() {
        return this.A09;
    }

    public LiveVideoDebugStatsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A09 = 100L;
        setWillNotDraw(false);
        this.A0A = new C69311VlJ[100];
        this.A01 = 0;
        this.A00 = 0;
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        Paint paint = new Paint();
        paint.setColor(-65536);
        paint.setStrokeWidth(TypedValue.applyDimension(1, 2.0f, displayMetrics));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.A0B = paint;
        this.A08 = TypedValue.applyDimension(1, 16.0f, displayMetrics);
    }

    private final void A00(Canvas canvas, float f, float f2, float f3, float f4, int i, int i2) {
        float height = getHeight();
        float f5 = this.A08;
        float f6 = height - (2.0f * f5);
        Paint paint = this.A0B;
        paint.setColor(i2);
        paint.setAlpha(i);
        canvas.drawLine(f, (getHeight() - f5) - (f2 * f6), f3, (getHeight() - f5) - (f6 * f4), paint);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0089, code lost:
    
        if (r0 <= 0) goto L31;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r43) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.player.common.LiveVideoDebugStatsView.draw(android.graphics.Canvas):void");
    }

    public LiveVideoDebugStatsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A09 = 100L;
        setWillNotDraw(false);
        this.A0A = new C69311VlJ[100];
        this.A01 = 0;
        this.A00 = 0;
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        Paint paint = new Paint();
        paint.setColor(-65536);
        paint.setStrokeWidth(TypedValue.applyDimension(1, 2.0f, displayMetrics));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.A0B = paint;
        this.A08 = TypedValue.applyDimension(1, 16.0f, displayMetrics);
    }

    public LiveVideoDebugStatsView(Context context) {
        super(context);
        this.A09 = 100L;
        setWillNotDraw(false);
        this.A0A = new C69311VlJ[100];
        this.A01 = 0;
        this.A00 = 0;
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        Paint paint = new Paint();
        paint.setColor(-65536);
        paint.setStrokeWidth(TypedValue.applyDimension(1, 2.0f, displayMetrics));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.A0B = paint;
        this.A08 = TypedValue.applyDimension(1, 16.0f, displayMetrics);
    }
}
