package X;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import java.util.Stack;

/* renamed from: X.TzE, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC66077TzE {
    public static RectF A00 = new RectF(0.0f, 0.0f, 18.0f, 5.0f);

    /* JADX WARN: Type inference failed for: r9v4, types: [X.VJy, java.lang.Object] */
    public static void A00(Canvas canvas, RectF rectF, int i) {
        Stack stack = new Stack();
        stack.push(new Matrix());
        Paint paint = AbstractC68644VZc.A00;
        int argb = Color.argb(85, 0, 0, 0);
        int argb2 = Color.argb(51, 0, 0, 0);
        int argb3 = Color.argb(10, 0, 0, 0);
        int argb4 = Color.argb(25, 0, 0, 0);
        C68261VJy c68261VJy = AbstractC68644VZc.A07;
        C68261VJy c68261VJy2 = c68261VJy;
        if (c68261VJy == null) {
            ?? obj = new Object();
            obj.A01 = new int[]{argb, argb2, argb4, argb3, 0};
            obj.A00 = new float[]{0.0f, 0.25f, 0.5f, 0.76f, 1.0f};
            AbstractC68644VZc.A07 = obj;
            c68261VJy2 = obj;
        }
        canvas.save();
        RectF rectF2 = AbstractC68644VZc.A06;
        RectF rectF3 = AbstractC68644VZc.A05;
        if (!rectF3.equals(rectF) && rectF != null) {
            float min = Math.min(Math.abs(rectF.width() / rectF3.width()), Math.abs(rectF.height() / rectF3.height()));
            float abs = Math.abs(rectF3.width() * min);
            float f = abs / 2.0f;
            float abs2 = Math.abs(rectF3.height() * min) / 2.0f;
            rectF2.set(rectF.centerX() - f, rectF.centerY() - abs2, rectF.centerX() + f, rectF.centerY() + abs2);
        } else {
            rectF2.set(rectF3);
        }
        canvas.translate(rectF2.left, rectF2.top);
        float width = rectF2.width();
        RectF rectF4 = A00;
        canvas.scale(width / rectF4.width(), rectF2.height() / rectF4.height());
        canvas.save();
        canvas.translate(9.0f, 3.5f);
        Object peek = stack.peek();
        peek.getClass();
        ((Matrix) peek).postTranslate(9.0f, 3.5f);
        canvas.scale(1.25f, 0.1f);
        Object peek2 = stack.peek();
        peek2.getClass();
        ((Matrix) peek2).postScale(1.25f, 0.1f);
        RectF rectF5 = AbstractC68644VZc.A04;
        rectF5.set(-6.0f, -6.0f, 6.0f, 6.0f);
        Path path = AbstractC68644VZc.A02;
        path.reset();
        path.addOval(rectF5, Path.Direction.CW);
        paint.reset();
        paint.setFlags(1);
        paint.reset();
        paint.setFlags(1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        C69238Vk6 c69238Vk6 = AbstractC68644VZc.A08;
        if (c69238Vk6.A02 == null || c69238Vk6.A00 != 0.57f || c69238Vk6.A01 != 6.01f || !C2I7.A00(c69238Vk6.A03, c68261VJy2)) {
            c69238Vk6.A00 = 0.57f;
            c69238Vk6.A01 = 6.01f;
            c69238Vk6.A03 = c68261VJy2;
            int[] iArr = c68261VJy2.A01;
            int length = iArr.length;
            float[] fArr = new float[length];
            float f2 = 0.57f / 6.01f;
            for (int i2 = 0; i2 < length; i2++) {
                fArr[i2] = (c68261VJy2.A00[i2] * (1.0f - f2)) + f2;
            }
            c69238Vk6.A02 = new RadialGradient(0.0f, 0.0f, 6.01f, iArr, fArr, Shader.TileMode.CLAMP);
        }
        paint.setShader(c69238Vk6.A02);
        canvas.drawPath(path, paint);
        canvas.restore();
        AbstractC68644VZc.A03.set(3.0f, 0.0f, 15.0f, 3.51f);
        Path path2 = AbstractC68644VZc.A01;
        path2.reset();
        path2.moveTo(10.35f, 2.99f);
        path2.cubicTo(9.59f, 3.69f, 8.41f, 3.69f, 7.65f, 2.99f);
        path2.cubicTo(6.15f, 1.61f, 5.05f, 0.46f, 3.0f, 0.0f);
        path2.lineTo(15.0f, 0.0f);
        path2.cubicTo(13.17f, 0.31f, 11.64f, 1.78f, 10.35f, 2.99f);
        path2.close();
        paint.reset();
        paint.setFlags(1);
        paint.setStyle(style);
        paint.setColor(i);
        canvas.drawPath(path2, paint);
        canvas.restore();
    }
}
