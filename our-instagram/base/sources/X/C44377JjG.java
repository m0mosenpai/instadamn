package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.shapes.Shape;

/* renamed from: X.JjG, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44377JjG extends Shape {
    public float A00;
    public final RectF A01;
    public final RectF A02;

    @Override // android.graphics.drawable.shapes.Shape
    public final void draw(Canvas canvas, Paint paint) {
        AbstractC167007dF.A1K(canvas, paint);
        RectF rectF = this.A02;
        rectF.set(this.A01);
        JQ0.A0v(rectF, paint);
        canvas.drawArc(rectF, -90.0f, this.A00 * 360.0f, false, paint);
    }

    @Override // android.graphics.drawable.shapes.Shape
    public final Shape clone() {
        return new C44377JjG(this.A00);
    }

    public C44377JjG(float f) {
        this.A00 = f;
        this.A01 = AbstractC166987dD.A0X();
        this.A02 = AbstractC166987dD.A0X();
    }

    @Override // android.graphics.drawable.shapes.Shape
    public final void onResize(float f, float f2) {
        super.onResize(f, f2);
        this.A01.set(0.0f, 0.0f, f, f2);
    }

    public C44377JjG() {
        this(0.0f);
    }

    @Override // android.graphics.drawable.shapes.Shape
    public final /* bridge */ /* synthetic */ Object clone() {
        return new C44377JjG(this.A00);
    }
}
