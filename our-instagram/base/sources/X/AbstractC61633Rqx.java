package X;

import android.graphics.Bitmap;

/* renamed from: X.Rqx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61633Rqx {
    public static Bitmap.Config A00(Bitmap bitmap) {
        if (bitmap.getHardwareBuffer().getFormat() == 22) {
            return Bitmap.Config.RGBA_F16;
        }
        return Bitmap.Config.ARGB_8888;
    }
}
