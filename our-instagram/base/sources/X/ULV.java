package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;

/* loaded from: classes11.dex */
public final class ULV extends AbstractC66278U6y {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public Bitmap A08;
    public final float A09;

    public ULV(C70394WTw c70394WTw) {
        super(c70394WTw);
        float f = this.A0A;
        float f2 = f * 12.0f;
        this.A03 = f2;
        this.A04 = 0.4f * f;
        this.A02 = f * 16.0f;
        this.A06 = f2;
        this.A07 = 4.8f * f;
        this.A05 = 1.6f * f;
        this.A09 = f * 44.0f;
        super.A03 = 5;
        super.A02 = 1.0f;
        int ceil = (int) Math.ceil(r1 * 1.08f * 2.0f);
        Bitmap createBitmap = Bitmap.createBitmap(ceil, ceil, Bitmap.Config.ARGB_8888);
        this.A08 = createBitmap;
        Canvas canvas = new Canvas(createBitmap);
        float f3 = ceil / 2.0f;
        float f4 = this.A05;
        float f5 = f3 - f4;
        float f6 = f4 + f3;
        RectF rectF = new RectF(f5, f5, f6, f6);
        float f7 = 1.08f * this.A02;
        RadialGradient radialGradient = new RadialGradient(f3, f3, f7, new int[]{570425344, 570425344, 0}, new float[]{0.9259259f, 0.9259259f, 1.0f}, Shader.TileMode.CLAMP);
        Path path = new Path();
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setShader(radialGradient);
        canvas.drawCircle(f3, f3, f7, paint);
        paint.reset();
        paint.setFlags(1);
        paint.setStyle(style);
        paint.setColor(-2046820353);
        canvas.drawCircle(f3, f3, this.A02, paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-6118750);
        paint.setStrokeWidth(this.A04);
        canvas.drawCircle(f3, f3, this.A02, paint);
        paint.setFlags(1);
        paint.setStyle(style);
        paint.setColor(-1365724);
        path.reset();
        path.moveTo(f3 - this.A07, f3);
        path.lineTo(f3 - this.A05, f3);
        path.addArc(rectF, 180.0f, 90.0f);
        path.lineTo(f3, f3 - this.A06);
        path.lineTo(f3 - this.A07, f3);
        path.close();
        canvas.drawPath(path, paint);
        paint.setStyle(style);
        paint.setColor(-2811114);
        path.reset();
        path.moveTo(this.A07 + f3, f3);
        path.lineTo(this.A05 + f3, f3);
        path.addArc(rectF, 0.0f, -90.0f);
        path.lineTo(f3, f3 - this.A06);
        path.lineTo(this.A07 + f3, f3);
        path.close();
        canvas.drawPath(path, paint);
        paint.setStyle(style);
        paint.setColor(-4013374);
        path.reset();
        path.moveTo(f3 - this.A07, f3);
        path.lineTo(f3 - this.A05, f3);
        path.addArc(rectF, 180.0f, -90.0f);
        path.lineTo(f3, this.A06 + f3);
        path.lineTo(f3 - this.A07, f3);
        path.close();
        canvas.drawPath(path, paint);
        paint.setStyle(style);
        paint.setColor(-2434342);
        path.reset();
        path.moveTo(this.A07 + f3, f3);
        path.lineTo(this.A05 + f3, f3);
        path.addArc(rectF, 0.0f, 90.0f);
        path.lineTo(f3, this.A06 + f3);
        path.lineTo(this.A07 + f3, f3);
        path.close();
        canvas.drawPath(path, paint);
    }

    @Override // X.AbstractC66278U6y
    public final void A0D(Canvas canvas) {
        canvas.save();
        float f = super.A07.A0J.A00.A0I.A0B;
        if (f < 0.0f) {
            f += 360.0f;
        }
        canvas.rotate(f, this.A00, this.A01);
        Bitmap bitmap = this.A08;
        float f2 = this.A00;
        float f3 = this.A02;
        canvas.drawBitmap(bitmap, f2 - f3, this.A01 - f3, (Paint) null);
        canvas.restore();
    }
}
