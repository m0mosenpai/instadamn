package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;

/* renamed from: X.SSr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62819SSr {
    public static final boolean A01(int i, int i2, int i3, int i4, int[] iArr) {
        if (iArr.length == i * i2 && i3 >= 0 && i3 < i2 && i4 >= 0 && i4 < i && Color.alpha(iArr[(i3 * i) + i4]) > 0.0f) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A00(Drawable drawable, InterfaceC65293ThR interfaceC65293ThR) {
        C62659SKt c62659SKt = new C62659SKt();
        Bitmap createBitmap = Bitmap.createBitmap(100, 100, Bitmap.Config.ALPHA_8);
        C14360o3.A07(createBitmap);
        int width = createBitmap.getWidth();
        int height = createBitmap.getHeight();
        int[] iArr = new int[width * height];
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        drawable.copyBounds(AbstractC166987dD.A0U());
        Canvas canvas = new Canvas(createBitmap);
        canvas.translate(-r5.left, -r5.top);
        canvas.save();
        float min = Math.min(Math.min(100.0f / intrinsicWidth, 100.0f / intrinsicHeight), 1.0f);
        canvas.scale(min, min, r5.left, r5.top);
        if (drawable instanceof C5RS) {
            ((C5RS) drawable).AQg(canvas);
        } else {
            drawable.draw(canvas);
        }
        createBitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        canvas.restore();
        createBitmap.recycle();
        C14120nc.A00().ATO(new RcY(c62659SKt, interfaceC65293ThR, iArr, min, width, height));
    }
}
