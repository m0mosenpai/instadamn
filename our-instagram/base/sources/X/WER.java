package X;

import android.opengl.GLES20;
import android.opengl.Matrix;

/* loaded from: classes11.dex */
public final class WER {
    public static final float[] A06;
    public static final float[] A07;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;

    static {
        float[] fArr = new float[16];
        A06 = fArr;
        Matrix.setIdentityM(fArr, 0);
        float[] fArr2 = new float[16];
        A07 = fArr2;
        Matrix.setIdentityM(fArr2, 0);
        Matrix.translateM(fArr2, 0, 0.0f, 1.0f, 0.0f);
        Matrix.scaleM(fArr2, 0, 1.0f, -1.0f, 1.0f);
    }

    public static void A01(int i, String str) {
        if (i >= 0) {
        } else {
            throw new RuntimeException(AnonymousClass001.A0g("Unable to locate '", str, "' in program"));
        }
    }

    public static int A00(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        A02(AnonymousClass001.A0O("glCreateShader type=", i));
        if (AbstractC65702TsY.A03(glCreateShader, str) == 0) {
            android.util.Log.e("Texture2dProgram", AnonymousClass001.A0c(AbstractC111324zv.A00(301), ":", i));
            android.util.Log.e("Texture2dProgram", AnonymousClass001.A0R(" ", GLES20.glGetShaderInfoLog(glCreateShader)));
            GLES20.glDeleteShader(glCreateShader);
            return 0;
        }
        return glCreateShader;
    }

    public static void A02(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 1285 && glGetError != 0) {
            String A0g = AnonymousClass001.A0g(str, ": glError 0x", Integer.toHexString(glGetError));
            android.util.Log.e("Texture2dProgram", A0g);
            throw new RuntimeException(A0g);
        }
    }
}
