package X;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;

/* loaded from: classes4.dex */
public abstract class AHO {
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ee, code lost:
    
        if ((r5 % 2) == 0) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(android.graphics.Bitmap r34, int r35) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AHO.A01(android.graphics.Bitmap, int):void");
    }

    public static final int A00(Bitmap bitmap) {
        if (bitmap.getConfig() == Bitmap.Config.ARGB_8888) {
            return 4;
        }
        if (bitmap.getConfig() == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("unsupported bitmap config ");
        throw AbstractC166987dD.A14(AbstractC166997dE.A0v(bitmap.getConfig(), A1C));
    }

    public static final void A02(String str) {
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError != 0) {
                C0K8.A0O("TextureWithAlignmentUploadUtil", "GL error 0x%x after %s: %s", Integer.valueOf(glGetError), str, GLUtils.getEGLErrorString(glGetError));
            } else {
                return;
            }
        }
    }
}
