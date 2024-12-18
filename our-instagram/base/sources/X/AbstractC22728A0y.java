package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;

/* renamed from: X.A0y, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC22728A0y {
    public static final BitmapDrawable A00(Context context, int i, int i2, int i3) {
        ColorFilter colorFilter;
        Resources resources = context.getResources();
        Drawable drawable = context.getDrawable(i);
        C14360o3.A0C(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
        BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
        bitmapDrawable.setGravity(51);
        if (i3 != 0) {
            colorFilter = C3DY.A00(i3);
        } else {
            colorFilter = null;
        }
        bitmapDrawable.setColorFilter(colorFilter);
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        RectF rectF = AbstractC13880nE.A01;
        bitmapDrawable.setBounds(0, 0, (int) TypedValue.applyDimension(1, i2, displayMetrics), bitmapDrawable.getIntrinsicHeight());
        return bitmapDrawable;
    }
}
