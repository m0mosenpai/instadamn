package X;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.Shape;

/* renamed from: X.6mA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC148406mA {
    public static final C66322U8v A00(Bitmap bitmap, ShapeDrawable shapeDrawable, Shape shape) {
        C14360o3.A0B(shape, 1);
        C66322U8v c66322U8v = new C66322U8v(bitmap);
        shapeDrawable.setShaderFactory(c66322U8v);
        Paint paint = shapeDrawable.getPaint();
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(0.0f);
        paint.setAlpha(255);
        if (shape instanceof AbstractC148416mB) {
            C162817Qs c162817Qs = (C162817Qs) ((AbstractC148416mB) shape);
            c162817Qs.A00 = 0.0f;
            c162817Qs.A03 = true;
        }
        shapeDrawable.setShape(shape);
        return c66322U8v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.9HZ] */
    public static final InterfaceC161477Li A01(Bitmap bitmap, Paint.Cap cap, Paint.Style style, ShapeDrawable shapeDrawable, Shape shape, int[] iArr, float f, float f2) {
        C14360o3.A0B(shapeDrawable, 0);
        C14360o3.A0B(shape, 1);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        C7BX c7bx = new C7BX(tileMode, shapeDrawable, iArr, f);
        if (bitmap != null) {
            shapeDrawable.setIntrinsicWidth(bitmap.getWidth());
            shapeDrawable.setIntrinsicHeight(bitmap.getHeight());
            c7bx = new C9HZ(new BitmapShader(bitmap, tileMode, tileMode), c7bx, PorterDuff.Mode.SRC_IN);
        }
        Paint paint = shapeDrawable.getPaint();
        paint.setStyle(style);
        paint.setStrokeWidth(f2);
        paint.setStrokeCap(cap);
        paint.setShader(c7bx);
        paint.setAlpha(255);
        if (shape instanceof AbstractC148416mB) {
            C162817Qs c162817Qs = (C162817Qs) ((AbstractC148416mB) shape);
            c162817Qs.A00 = 0.0f;
            c162817Qs.A03 = true;
        }
        shapeDrawable.setShaderFactory(null);
        shapeDrawable.setShape(shape);
        return c7bx;
    }

    public static final void A02(Paint.Style style, ShapeDrawable shapeDrawable, Shape shape, float f, int i) {
        C14360o3.A0B(shapeDrawable, 0);
        C14360o3.A0B(shape, 1);
        Paint paint = shapeDrawable.getPaint();
        paint.setColor(i);
        paint.setStyle(style);
        paint.setStrokeWidth(f);
        paint.setAlpha(Color.alpha(i));
        paint.setShader(null);
        if (shape instanceof AbstractC148416mB) {
            C162817Qs c162817Qs = (C162817Qs) ((AbstractC148416mB) shape);
            c162817Qs.A00 = 0.0f;
            c162817Qs.A03 = true;
        }
        shapeDrawable.setShaderFactory(null);
        shapeDrawable.setShape(shape);
    }

    public static final void A03(ShapeDrawable shapeDrawable, Shape shape, float f, int i) {
        C14360o3.A0B(shapeDrawable, 0);
        C14360o3.A0B(shape, 1);
        Paint paint = shapeDrawable.getPaint();
        paint.setColor(i);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAlpha(255);
        paint.setStrokeWidth(f);
        paint.setShader(null);
        if (shape instanceof AbstractC148416mB) {
            C162817Qs c162817Qs = (C162817Qs) ((AbstractC148416mB) shape);
            c162817Qs.A00 = f;
            c162817Qs.A03 = true;
        }
        shapeDrawable.setShaderFactory(null);
        shapeDrawable.setShape(shape);
    }
}
