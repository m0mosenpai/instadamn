package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: X.MUd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC50572MUd {
    public static final Bitmap A00(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Bitmap A0F = AbstractC167007dF.A0F(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        Canvas canvas = new Canvas();
        canvas.setBitmap(A0F);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return A0F;
    }
}
