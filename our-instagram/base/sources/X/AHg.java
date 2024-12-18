package X;

import android.content.res.Resources;
import android.opengl.GLES20;

/* loaded from: classes4.dex */
public abstract class AHg {
    public static final XO3 A01(C22978ABc c22978ABc, int i, int i2) {
        C14360o3.A0B(c22978ABc, 0);
        Resources resources = c22978ABc.A00.getResources();
        C14360o3.A0A(resources);
        return A02(AbstractC54307NzR.A00(resources, i), AbstractC54307NzR.A00(resources, i2));
    }

    public static final int A00(int i, String str) {
        C209089Mq.A05("before creating shader");
        int glCreateShader = GLES20.glCreateShader(i);
        C209089Mq.A05("before setting shader source");
        GLES20.glShaderSource(glCreateShader, str);
        C209089Mq.A05("before compiling");
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        String glGetShaderInfoLog = GLES20.glGetShaderInfoLog(glCreateShader);
        C0K8.A0C("ShaderUtil", glGetShaderInfoLog);
        throw AbstractC166987dD.A18(AnonymousClass001.A0R("shader compile failed:", glGetShaderInfoLog));
    }

    public static final XO3 A02(String str, String str2) {
        int A00 = A00(35633, str);
        int A002 = A00(35632, str2);
        int glCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(glCreateProgram, A00);
        GLES20.glAttachShader(glCreateProgram, A002);
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 0) {
            return new XO3(glCreateProgram);
        }
        String glGetProgramInfoLog = GLES20.glGetProgramInfoLog(glCreateProgram);
        C0K8.A0C("ShaderUtil", glGetProgramInfoLog);
        throw AbstractC166987dD.A18(AnonymousClass001.A0R("program link failed:", glGetProgramInfoLog));
    }
}
