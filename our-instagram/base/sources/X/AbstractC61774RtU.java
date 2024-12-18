package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;

/* renamed from: X.RtU, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61774RtU {
    public static Bitmap A00(Bitmap bitmap, int i) {
        if (i <= 0) {
            return bitmap;
        }
        try {
            Matrix A0Q = AbstractC166987dD.A0Q();
            A0Q.postRotate(i);
            Bitmap A0K = AbstractC58321PtD.A0K(bitmap, A0Q);
            if (bitmap != A0K) {
                bitmap.recycle();
            }
            return A0K;
        } catch (Throwable th) {
            if (bitmap != null) {
                bitmap.recycle();
            }
            throw th;
        }
    }
}
