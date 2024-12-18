package X;

import android.opengl.GLES20;

/* renamed from: X.TyG, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC66018TyG {
    public static final void A01(String str) {
        C14360o3.A0B(str, 0);
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return;
        }
        C0K8.A0O("GLProgramUtil", "%s: glError %d", str, Integer.valueOf(glGetError));
        throw new RuntimeException(AnonymousClass001.A0b(str, ": glError ", glGetError));
    }

    public static final int A00(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        A01(AnonymousClass001.A0O("glCreateShader type=", i));
        if (AbstractC65702TsY.A03(glCreateShader, str) == 0) {
            C0K8.A0O("GLProgramUtil", "Could not compile shader %d:", AbstractC25228BEl.A1Y(i));
            C0K8.A0O("GLProgramUtil", " %s", GLES20.glGetShaderInfoLog(glCreateShader));
            GLES20.glDeleteShader(glCreateShader);
            return 0;
        }
        return glCreateShader;
    }
}
