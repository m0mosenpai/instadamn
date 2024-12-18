package X;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.facebook.R;
import java.util.Stack;

/* renamed from: X.KYb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46013KYb extends AbstractC44340Jif {
    public float A00;
    public float A01;
    public float A02;
    public long A03;
    public long A04;
    public Integer A05;
    public float A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final Context A0B;
    public final RectF A0C;

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A07;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A08;
    }

    public C46013KYb(Context context) {
        super(context);
        this.A00 = 1.0f;
        this.A02 = 1.0f;
        this.A05 = C05F.A01;
        this.A0B = context;
        this.A0C = AbstractC166987dD.A0X();
        this.A09 = context.getResources().getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_icon_badge));
        this.A0A = context.getResources().getColor(R.color.design_dark_default_color_on_background);
        this.A08 = Math.round(AbstractC13880nE.A00(context, 45.0f));
        this.A07 = Math.round(AbstractC13880nE.A00(context, 52.0f));
        this.A06 = AbstractC43592JPx.A01(context, 12);
    }

    public static void A00(Stack stack) {
        stack.push(new Matrix((Matrix) stack.peek()));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        long currentTimeMillis = System.currentTimeMillis() - this.A04;
        float f = this.A02;
        if (f != this.A00) {
            long j = this.A03;
            if (j == 0) {
                this.A00 = f;
            } else {
                this.A00 = AbstractC13600mm.A02((float) currentTimeMillis, 0.0f, (float) j, this.A01, f);
            }
        }
        RectF rectF = this.A0C;
        rectF.set(getBounds());
        rectF.offset(0.0f, -this.A06);
        int i = this.A09;
        int i2 = this.A0A;
        float f2 = this.A00;
        Stack stack = new Stack();
        stack.push(AbstractC166987dD.A0Q());
        Paint paint = AbstractC47209Kti.A00;
        L30 l30 = AbstractC47209Kti.A08;
        l30.A02 = Color.argb(26, 255, 255, 255);
        l30.A00 = 1.0f;
        if (l30.A01 != 2.0f) {
            l30.A03 = null;
            l30.A01 = 2.0f;
        }
        float f3 = 2.0f / f2;
        canvas.save();
        A00(stack);
        RectF rectF2 = AbstractC47209Kti.A07;
        RectF rectF3 = AbstractC47209Kti.A05;
        if (!rectF3.equals(rectF)) {
            float min = Math.min(Math.abs(rectF.width() / rectF3.width()), Math.abs(rectF.height() / rectF3.height()));
            float abs = Math.abs(rectF3.width() * min);
            float f4 = abs / 2.0f;
            float abs2 = Math.abs(rectF3.height() * min) / 2.0f;
            rectF2.set(rectF.centerX() - f4, rectF.centerY() - abs2, rectF.centerX() + f4, rectF.centerY() + abs2);
        } else {
            rectF2.set(rectF3);
        }
        canvas.translate(rectF2.left, rectF2.top);
        canvas.scale(rectF2.width() / 45.0f, rectF2.height() / 52.0f);
        canvas.save();
        A00(stack);
        canvas.translate(23.0f, 51.0f);
        Object peek = stack.peek();
        peek.getClass();
        ((Matrix) peek).postTranslate(23.0f, 51.0f);
        canvas.scale(f2, f2);
        ((Matrix) stack.peek()).postScale(f2, f2);
        AbstractC47209Kti.A04.set(-15.0f, -38.18f, 15.0f, 0.0f);
        Path path = AbstractC47209Kti.A02;
        path.reset();
        path.moveTo(0.0f, -38.18f);
        path.cubicTo(8.28f, -38.18f, 15.0f, -31.45f, 15.0f, -23.16f);
        path.cubicTo(15.0f, -10.57f, 0.81f, 0.4f, 0.0f, -0.01f);
        path.cubicTo(-0.81f, 0.4f, -15.0f, -10.57f, -15.0f, -22.75f);
        path.cubicTo(-15.0f, -31.05f, -8.28f, -38.18f, 0.0f, -38.18f);
        path.close();
        paint.reset();
        paint.setFlags(1);
        canvas.saveLayerAlpha(null, 255, 31);
        A00(stack);
        Matrix A0Q = AbstractC166987dD.A0Q();
        ((Matrix) stack.peek()).invert(A0Q);
        canvas.concat(A0Q);
        canvas.translate(0.0f, l30.A00);
        canvas.concat((Matrix) stack.peek());
        Paint paint2 = AbstractC47209Kti.A01;
        paint2.set(paint);
        float f5 = l30.A01;
        if (f5 > 0.0f) {
            BlurMaskFilter blurMaskFilter = l30.A03;
            if (blurMaskFilter == null) {
                blurMaskFilter = new BlurMaskFilter(f5, BlurMaskFilter.Blur.NORMAL);
                l30.A03 = blurMaskFilter;
            }
            paint2.setMaskFilter(blurMaskFilter);
        }
        canvas.drawPath(path, paint2);
        paint2.setXfermode(AbstractC47181KtG.A00);
        canvas.saveLayer(null, paint2, 31);
        A00(stack);
        canvas.drawColor(l30.A02);
        stack.pop();
        canvas.restore();
        stack.pop();
        canvas.restore();
        AbstractC166987dD.A1R(paint);
        paint.setColor(i);
        canvas.drawPath(path, paint);
        paint.reset();
        paint.setFlags(1);
        paint.setStrokeWidth(f3);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        canvas.save();
        A00(stack);
        AbstractC43592JPx.A1E(paint);
        paint.setColor(i2);
        canvas.drawPath(path, paint);
        stack.pop();
        canvas.restore();
        RectF rectF4 = AbstractC47209Kti.A06;
        rectF4.set(-4.14f, -27.32f, 4.14f, -19.04f);
        Path path2 = AbstractC47209Kti.A03;
        path2.reset();
        path2.addOval(rectF4, Path.Direction.CW);
        paint.reset();
        paint.setFlags(1);
        AbstractC166987dD.A1R(paint);
        paint.setColor(i2);
        canvas.drawPath(path2, paint);
        stack.pop();
        canvas.restore();
        stack.pop();
        canvas.restore();
        if (this.A00 != this.A02) {
            invalidateSelf();
        }
    }
}
