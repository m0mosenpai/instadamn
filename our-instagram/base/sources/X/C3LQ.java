package X;

import android.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;

/* renamed from: X.3LQ, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3LQ {
    public static final Paint A00;

    static {
        Paint paint = new Paint(3);
        A00 = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    public static final BitmapDrawable A00(Context context, Shader shader, Drawable drawable) {
        Rect bounds = drawable.getBounds();
        C14360o3.A07(bounds);
        int width = bounds.width();
        int height = bounds.height();
        if (width <= 0 || height <= 0) {
            width = drawable.getIntrinsicWidth();
            height = drawable.getIntrinsicHeight();
        }
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        C14360o3.A07(createBitmap);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        Paint paint = A00;
        paint.setShader(shader);
        canvas.drawRect(0.0f, 0.0f, width, height, paint);
        return new BitmapDrawable(context.getResources(), createBitmap);
    }

    public static final BitmapDrawable A01(Context context, Drawable drawable, int i) {
        C14360o3.A0B(drawable, 1);
        Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        C14360o3.A07(createBitmap);
        new Canvas(createBitmap).drawColor(i);
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        BitmapDrawable A002 = A00(context, new BitmapShader(createBitmap, tileMode, tileMode), drawable);
        createBitmap.recycle();
        return A002;
    }

    public static final BitmapDrawable A03(Context context, Drawable drawable, int i, int i2) {
        C14360o3.A0B(drawable, 1);
        Rect bounds = drawable.getBounds();
        C14360o3.A07(bounds);
        int height = bounds.height();
        if (height <= 0) {
            height = drawable.getIntrinsicHeight();
        }
        return A00(context, new LinearGradient(0.0f, 0.0f, 0.0f, height, i2, i, Shader.TileMode.REPEAT), drawable);
    }

    public static final Drawable A05(Context context, int i, int i2) {
        C14360o3.A0B(context, 0);
        Drawable drawable = context.getDrawable(i);
        if (drawable != null) {
            return A01(context, drawable, i2);
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final Drawable A06(Context context, int i, int i2) {
        C14360o3.A0B(context, 0);
        return A05(context, i, context.getColor(i2));
    }

    public static final StateListDrawable A08(Context context, int i, int i2, int i3, int i4) {
        return A09(context, new int[]{i3, i}, new int[]{i4, i2}, new int[][]{new int[]{R.attr.state_pressed}, new int[0]});
    }

    public static final void A0A(Matrix matrix, Rect rect, Rect rect2) {
        float f;
        float f2;
        C14360o3.A0B(matrix, 2);
        int width = rect2.width();
        int height = rect2.height();
        int width2 = rect.width();
        int height2 = rect.height();
        float f3 = 0.0f;
        if (width2 * height > width * height2) {
            f = height / height2;
            f3 = (width - (width2 * f)) * 0.5f;
            f2 = 0.0f;
        } else {
            f = width / width2;
            f2 = (height - (height2 * f)) * 0.5f;
        }
        matrix.reset();
        matrix.setScale(f, f);
        matrix.postTranslate(Math.round(f3), Math.round(f2));
    }

    public static final StateListDrawable A09(Context context, int[] iArr, int[] iArr2, int[][] iArr3) {
        Drawable A05;
        StateListDrawable stateListDrawable = new StateListDrawable();
        int i = 0;
        do {
            int i2 = iArr[i];
            int i3 = iArr2[i];
            int[] iArr4 = iArr3[i];
            if (i3 == -1) {
                A05 = context.getDrawable(i2);
            } else {
                A05 = A05(context, i2, context.getColor(i3));
            }
            stateListDrawable.addState(iArr4, A05);
            i++;
        } while (i < 2);
        return stateListDrawable;
    }

    public static final BitmapDrawable A02(Context context, Drawable drawable, int i, int i2) {
        Rect bounds = drawable.getBounds();
        C14360o3.A07(bounds);
        int width = bounds.width();
        int height = bounds.height();
        if (width <= 0 || height <= 0) {
            width = drawable.getIntrinsicWidth();
            height = drawable.getIntrinsicWidth();
        }
        return A00(context, new LinearGradient(0.0f, height, width, 0.0f, i, i2, Shader.TileMode.REPEAT), drawable);
    }

    public static final BitmapDrawable A04(Context context, int[] iArr, int i) {
        Drawable drawable = context.getDrawable(i);
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            C14360o3.A07(bounds);
            int width = bounds.width();
            int height = bounds.height();
            if (width <= 0 || height <= 0) {
                width = drawable.getIntrinsicWidth();
                height = drawable.getIntrinsicWidth();
            }
            return A00(context, new LinearGradient(0.0f, height, width, 0.0f, iArr, (float[]) null, Shader.TileMode.REPEAT), drawable);
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final StateListDrawable A07(Context context, int i) {
        C14360o3.A0B(context, 0);
        return A09(context, new int[]{com.facebook.R.drawable.instagram_circle_check_pano_filled_24, com.facebook.R.drawable.checkbox}, new int[]{i, -1}, new int[][]{new int[]{R.attr.state_checked}, new int[0]});
    }
}
