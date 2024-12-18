package X;

import android.opengl.GLES20;

/* renamed from: X.VMm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68326VMm {
    public static final int A00(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        if (glCreateShader != 0) {
            GLES20.glShaderSource(glCreateShader, str);
            GLES20.glCompileShader(glCreateShader);
            int[] iArr = {0};
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            if (iArr[0] == 1) {
                AbstractC68327VMn.A00("compileShader");
                return glCreateShader;
            }
            C0K8.A0C("GlShaderES30", AnonymousClass001.A0u("Compile error ", GLES20.glGetShaderInfoLog(glCreateShader), " in shader:\n", str));
            throw new RuntimeException(GLES20.glGetShaderInfoLog(glCreateShader));
        }
        throw new RuntimeException(AnonymousClass001.A0O("glCreateShader() failed. GLES30 error: ", GLES20.glGetError()));
    }
}
