package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: X.KjG, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46577KjG {
    public static final XDA A00(Resources resources, Drawable drawable, int i) {
        XDA lw0;
        AbstractC167017dG.A1N(resources, drawable);
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            C14360o3.A07(bitmap);
            lw0 = new LW1(resources, bitmap, i);
        } else {
            lw0 = new LW0(drawable, i);
        }
        return lw0;
    }
}
