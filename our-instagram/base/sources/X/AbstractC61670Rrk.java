package X;

import android.graphics.Matrix;
import android.graphics.RectF;

/* renamed from: X.Rrk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61670Rrk {
    public static void A00(Matrix matrix, RectF rectF, float f, float f2) {
        matrix.postScale(f, f2, rectF.width() / 2.0f, rectF.height() / 2.0f);
    }
}
