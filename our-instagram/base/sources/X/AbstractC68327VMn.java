package X;

import android.opengl.GLES20;
import android.opengl.GLException;

/* renamed from: X.VMn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68327VMn {
    public static final void A00(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            if (glGetError == 1285) {
                throw new RuntimeException(str);
            }
            throw new GLException(glGetError, AnonymousClass001.A0b(str, ": GLES30 error: ", glGetError));
        }
    }
}
