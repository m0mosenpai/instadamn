package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;

/* loaded from: classes10.dex */
public final class Q4N extends View {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public Path A05;
    public RectF A06;
    public float[] A07;
    public int[] A08;
    public Rect A09;
    public final Paint A0A;

    public Q4N(Context context) {
        super(context);
        this.A00 = Float.NaN;
        this.A0A = AbstractC166987dD.A0R();
        this.A08 = new int[]{0, 0};
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = this.A0A;
        paint.setShader(new LinearGradient(getWidth() * this.A03, getHeight() * this.A04, getWidth() * this.A01, getHeight() * this.A02, this.A08, this.A07, Shader.TileMode.CLAMP));
        if (C3e2.A00(this.A00)) {
            Rect rect = this.A09;
            if (rect == null) {
                rect = AbstractC166987dD.A0U();
                this.A09 = rect;
            }
            getDrawingRect(rect);
            canvas.clipRect(this.A09);
            canvas.drawPaint(paint);
            return;
        }
        if (this.A05 == null) {
            this.A05 = AbstractC166987dD.A0T();
        }
        if (this.A06 == null) {
            this.A06 = AbstractC166987dD.A0X();
        }
        this.A05.reset();
        this.A06.set(0.0f, 0.0f, getWidth(), getHeight());
        Path path = this.A05;
        RectF rectF = this.A06;
        float[] fArr = new float[8];
        float f = this.A00;
        fArr[0] = f;
        AbstractC43594JPz.A1U(fArr, f, 1);
        AbstractC167017dG.A1X(fArr, f);
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.drawPath(this.A05, paint);
    }
}
