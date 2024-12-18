package X;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* renamed from: X.KmI, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46761KmI {
    public static Drawable A00(Context context, int[] iArr, int i, int i2) {
        int length = iArr.length;
        if (length == 0) {
            return C3LQ.A05(context, i2, i);
        }
        if (length == 1) {
            return C3LQ.A05(context, i2, iArr[0]);
        }
        return C3LQ.A00(context, new LinearGradient(0.0f, 0.0f, 0.0f, r1.getIntrinsicHeight(), iArr, (float[]) null, Shader.TileMode.CLAMP), context.getDrawable(i2));
    }
}
