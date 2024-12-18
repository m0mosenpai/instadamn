package X;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Shader;

/* renamed from: X.3Os, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC72923Os {
    public static final BitmapShader A00(int i) {
        Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        C14360o3.A07(createBitmap);
        new Canvas(createBitmap).drawColor(i);
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        return new BitmapShader(createBitmap, tileMode, tileMode);
    }
}
