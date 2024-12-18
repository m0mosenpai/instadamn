package X;

import android.graphics.RectF;
import android.util.Size;

/* renamed from: X.Ntv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53984Ntv {
    public static final RectF A00(Size size, Size size2, boolean z) {
        float width = (size2.getWidth() - size.getWidth()) / 2.0f;
        float width2 = size.getWidth() + width;
        float height = size2.getHeight() - size.getHeight();
        if (!z) {
            height /= 2.0f;
        }
        return new RectF(width, height, width2, size.getHeight() + height);
    }
}
