package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: X.Nx0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54164Nx0 {
    public static final BitmapDrawable A00(Context context, int i) {
        Drawable drawable = context.getResources().getDrawable(i, null);
        Canvas canvas = new Canvas();
        Bitmap A0F = AbstractC167007dF.A0F(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        canvas.setBitmap(A0F);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        drawable.draw(canvas);
        return AbstractC43593JPy.A0A(context, A0F);
    }
}
