package X;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.os.Build;

/* loaded from: classes10.dex */
public abstract class SQQ {
    public static Bitmap A00(Bitmap bitmap) {
        if (bitmap.getConfig() == Bitmap.Config.HARDWARE) {
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            if (Build.VERSION.SDK_INT >= 31) {
                config = AbstractC61633Rqx.A00(bitmap);
            }
            return bitmap.copy(config, true);
        }
        return bitmap;
    }

    public static Bitmap A01(Bitmap bitmap, int i, int i2) {
        Bitmap.Config config = bitmap.getConfig();
        ColorSpace colorSpace = bitmap.getColorSpace();
        ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        if (bitmap.getConfig() == Bitmap.Config.HARDWARE) {
            config = Bitmap.Config.ARGB_8888;
            if (Build.VERSION.SDK_INT >= 31) {
                config = AbstractC61633Rqx.A00(bitmap);
            }
        }
        return Bitmap.createBitmap(i, i2, config, bitmap.hasAlpha(), colorSpace);
    }
}
