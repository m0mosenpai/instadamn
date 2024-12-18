package com.google.android.material.timepicker;

import X.C65N;
import X.X88;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import com.facebook.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public class ClockHandView extends View {
    public double A00;
    public float A01;
    public int A02;
    public boolean A03;
    public final float A04;
    public final int A05;
    public final int A06;
    public final Paint A07;
    public final RectF A08;
    public final List A09;

    public static void A00(ClockHandView clockHandView, float f) {
        float f2 = f % 360.0f;
        clockHandView.A01 = f2;
        clockHandView.A00 = Math.toRadians(f2 - 90.0f);
        int height = clockHandView.getHeight() / 2;
        float width = clockHandView.getWidth() / 2;
        float f3 = clockHandView.A02;
        double d = clockHandView.A00;
        float cos = width + (((float) Math.cos(d)) * f3);
        float sin = height + (f3 * ((float) Math.sin(d)));
        RectF rectF = clockHandView.A08;
        float f4 = clockHandView.A05;
        rectF.set(cos - f4, sin - f4, cos + f4, sin + f4);
        Iterator it = clockHandView.A09.iterator();
        while (it.hasNext()) {
            ClockFaceView clockFaceView = (ClockFaceView) ((X88) it.next());
            if (Math.abs(clockFaceView.A00 - f2) > 0.001f) {
                clockFaceView.A00 = f2;
                ClockFaceView.A00(clockFaceView);
            }
        }
        clockHandView.invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        float width = getWidth() / 2;
        float f = this.A02;
        double d = this.A00;
        float cos = (f * ((float) Math.cos(d))) + width;
        float f2 = height;
        float sin = (f * ((float) Math.sin(d))) + f2;
        Paint paint = this.A07;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle(cos, sin, this.A05, paint);
        double d2 = this.A00;
        double sin2 = Math.sin(d2);
        double cos2 = Math.cos(d2);
        paint.setStrokeWidth(this.A06);
        canvas.drawLine(width, f2, r4 + ((int) (cos2 * r0)), height + ((int) (r0 * sin2)), paint);
        canvas.drawCircle(width, f2, this.A04, paint);
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A09 = new ArrayList();
        Paint paint = new Paint();
        this.A07 = paint;
        this.A08 = new RectF();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C65N.A0A, i, R.style.Widget_MaterialComponents_TimePicker_Clock);
        this.A02 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.A05 = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.A06 = getResources().getDimensionPixelSize(R.dimen.abc_control_corner_material);
        this.A04 = r1.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
        int color = obtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        A00(this, 0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        setImportantForAccessibility(2);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        A00(this, this.A01);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004c, code lost:
    
        if (r1 != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
    
        if (r1 == false) goto L19;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            r10 = this;
            r0 = -1320727385(0xffffffffb1474ca7, float:-2.9001883E-9)
            int r7 = X.C0f9.A05(r0)
            int r1 = r11.getActionMasked()
            float r4 = r11.getX()
            float r9 = r11.getY()
            r0 = 0
            r6 = 1
            if (r1 == 0) goto L66
            if (r1 == r6) goto L63
            r0 = 2
            if (r1 == r0) goto L63
            r0 = 0
        L1d:
            r8 = 0
        L1e:
            boolean r5 = r10.A03
            int r1 = r10.getWidth()
            int r3 = r1 / 2
            int r1 = r10.getHeight()
            int r2 = r1 / 2
            float r1 = (float) r3
            float r4 = r4 - r1
            double r3 = (double) r4
            float r1 = (float) r2
            float r9 = r9 - r1
            double r1 = (double) r9
            double r1 = java.lang.Math.atan2(r1, r3)
            double r1 = java.lang.Math.toDegrees(r1)
            int r3 = (int) r1
            int r2 = r3 + 90
            if (r2 >= 0) goto L41
            int r2 = r2 + 360
        L41:
            float r1 = r10.A01
            float r2 = (float) r2
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            boolean r1 = X.AbstractC167007dF.A1M(r1)
            if (r8 == 0) goto L59
            if (r1 == 0) goto L5b
        L4e:
            r0 = 1
        L4f:
            r0 = r0 | r5
            r10.A03 = r0
            r0 = -2025445541(0xffffffff8746275b, float:-1.490743E-34)
            X.C0f9.A0C(r0, r7)
            return r6
        L59:
            if (r1 != 0) goto L5f
        L5b:
            if (r0 != 0) goto L5f
            r0 = 0
            goto L4f
        L5f:
            A00(r10, r2)
            goto L4e
        L63:
            boolean r0 = r10.A03
            goto L1d
        L66:
            r10.A03 = r0
            r8 = 1
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.timepicker.ClockHandView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialClockStyle);
    }

    public ClockHandView(Context context) {
        this(context, null);
    }
}
