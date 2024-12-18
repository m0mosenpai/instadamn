package X;

import com.instagram.model.mediasize.GifUrlImpl;

/* renamed from: X.Kkq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46673Kkq {
    public static float A00(GifUrlImpl gifUrlImpl) {
        float floatValue = gifUrlImpl.A03.floatValue() / gifUrlImpl.A02.floatValue();
        if (Float.isNaN(floatValue)) {
            return 1.0f;
        }
        return floatValue;
    }
}
