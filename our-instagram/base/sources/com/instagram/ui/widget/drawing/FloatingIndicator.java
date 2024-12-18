package com.instagram.ui.widget.drawing;

import X.AbstractC09440dt;
import X.AbstractC55922hc;
import X.C130695vH;
import X.C55982hj;
import X.InterfaceC09390do;
import X.InterfaceC16820sZ;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.instagram.ui.widget.drawing.FloatingIndicator;

/* loaded from: classes3.dex */
public class FloatingIndicator extends View {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public InterfaceC09390do A04;
    public boolean A05;
    public boolean A06;
    public int A07;
    public final Paint A08;
    public final Paint A09;
    public final Path A0A;
    public final RectF A0B;
    public final C130695vH A0C;
    public final Runnable A0D;

    public FloatingIndicator(Context context) {
        this(context, null);
    }

    public final void A00() {
        removeCallbacks(this.A0D);
        this.A05 = false;
        this.A06 = false;
        C55982hj c55982hj = (C55982hj) this.A04.getValue();
        c55982hj.A01();
        c55982hj.A06(0.0d);
    }

    public final void A01(float f, float f2, float f3, float f4, float f5, int i, int i2, long j, boolean z) {
        C130695vH c130695vH = this.A0C;
        c130695vH.A00 = f;
        c130695vH.A01 = f2;
        c130695vH.A02 = f3;
        c130695vH.A03 = f4;
        this.A07 = i2;
        if (!this.A06) {
            if (!this.A05) {
                postDelayed(this.A0D, j);
                this.A05 = true;
            }
        } else {
            if (z) {
                f3 = Math.min(Math.max(f3, 0.0f), getWidth());
            }
            this.A02 = f3;
            if (z) {
                f4 = Math.min(Math.max(f4, 0.0f), getHeight());
            }
            this.A03 = f4;
            this.A00 = f5 / 2.0f;
        }
        this.A08.setColor(i);
        this.A01 = f5;
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.A07 == 0) {
            canvas.drawCircle(this.A02, this.A03, this.A00, this.A08);
            canvas.drawCircle(this.A02, this.A03, this.A00, this.A09);
            return;
        }
        Path path = this.A0A;
        path.rewind();
        RectF rectF = this.A0B;
        float f = this.A02;
        float f2 = this.A00;
        float f3 = this.A03;
        rectF.set(f - f2, f3 - f2, f + f2, f3 + f2);
        path.addArc(rectF, 130.0f, 280.0f);
        path.lineTo(this.A02, this.A03 + (this.A00 * 1.3f));
        path.close();
        canvas.drawPath(path, this.A08);
        canvas.drawPath(path, this.A09);
    }

    public FloatingIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A06 = false;
        this.A05 = false;
        this.A07 = 0;
        this.A0D = new Runnable() { // from class: X.5vG
            @Override // java.lang.Runnable
            public final void run() {
                FloatingIndicator floatingIndicator = FloatingIndicator.this;
                C55982hj c55982hj = (C55982hj) floatingIndicator.A04.getValue();
                c55982hj.A01();
                c55982hj.A03();
                floatingIndicator.A06 = true;
                floatingIndicator.A05 = false;
            }
        };
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC55922hc.A0o);
        try {
            float dimension = obtainStyledAttributes.getDimension(0, 5.0f);
            obtainStyledAttributes.recycle();
            Paint paint = new Paint();
            this.A08 = paint;
            paint.setStyle(Paint.Style.FILL);
            Paint paint2 = new Paint(1);
            this.A09 = paint2;
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setColor(-1);
            paint2.setStrokeWidth(dimension);
            paint2.setStrokeJoin(Paint.Join.ROUND);
            this.A0C = new C130695vH(this);
            this.A0A = new Path();
            this.A0B = new RectF();
            this.A04 = AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.5vI
                @Override // X.InterfaceC16820sZ
                public final /* bridge */ /* synthetic */ Object invoke() {
                    C55982hj A02 = AbstractC13560mi.A00().A02();
                    A02.A0A(FloatingIndicator.this.A0C);
                    return A02;
                }
            });
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public FloatingIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
