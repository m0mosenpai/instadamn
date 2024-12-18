package org.webrtc;

import X.AbstractC65702TsY;
import X.AnonymousClass001;
import android.opengl.GLES20;
import java.nio.FloatBuffer;

/* loaded from: classes11.dex */
public class GlUtil {
    public static FloatBuffer createFloatBuffer(float[] fArr) {
        FloatBuffer A0k = AbstractC65702TsY.A0k(fArr, fArr.length * 4);
        A0k.position(0);
        return A0k;
    }

    public static int generateTexture(int i) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i2 = iArr[0];
        GLES20.glBindTexture(i, i2);
        GLES20.glTexParameterf(i, 10241, 9729.0f);
        GLES20.glTexParameterf(i, 10240, 9729.0f);
        GLES20.glTexParameterf(i, 10242, 33071.0f);
        GLES20.glTexParameterf(i, 10243, 33071.0f);
        checkNoGLES2Error("generateTexture");
        return i2;
    }

    /* loaded from: classes11.dex */
    public class GlOutOfMemoryException extends RuntimeException {
        public GlOutOfMemoryException(String str) {
            super(str);
        }
    }

    public static void checkNoGLES2Error(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            if (glGetError == 1285) {
                throw new RuntimeException(str);
            }
            throw new RuntimeException(AnonymousClass001.A0b(str, ": GLES20 error: ", glGetError));
        }
    }
}
