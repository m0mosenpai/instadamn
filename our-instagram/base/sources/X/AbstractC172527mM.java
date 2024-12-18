package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: X.7mM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC172527mM {
    public static final BitmapDrawable A00(Context context, Drawable drawable, int i, int i2) {
        C14360o3.A0B(drawable, 1);
        Bitmap createBitmap = Bitmap.createBitmap((int) AbstractC13880nE.A04(context, i), (int) AbstractC13880nE.A04(context, i2), Bitmap.Config.ARGB_8888);
        C14360o3.A07(createBitmap);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return new BitmapDrawable(context.getResources(), createBitmap);
    }
}
