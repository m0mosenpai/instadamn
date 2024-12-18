package X;

import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.FloatBuffer;

/* loaded from: classes11.dex */
public final class WFK {
    public static final FloatBuffer A0B;
    public static final FloatBuffer A0C;
    public static final float[] A0D;
    public static final float[] A0E;
    public static final float[] A0F;
    public C69326VlY A00 = new C69326VlY();
    public final float[] A01;
    public volatile float A02;
    public volatile float A03;
    public volatile float A04;
    public volatile float A05;
    public volatile int A06;
    public volatile int A07;
    public volatile int A08;
    public volatile int A09;
    public volatile boolean A0A;

    static {
        float[] fArr = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        A0E = fArr;
        float[] fArr2 = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
        A0F = fArr2;
        float[] fArr3 = new float[16];
        A0D = fArr3;
        Matrix.setIdentityM(fArr3, 0);
        FloatBuffer A0k = AbstractC65702TsY.A0k(fArr, 32);
        A0k.position(0);
        A0B = A0k;
        FloatBuffer A0k2 = AbstractC65702TsY.A0k(fArr2, 32);
        A0k2.position(0);
        A0C = A0k2;
    }

    public static void A01(int i, String str) {
        if (i >= 0) {
        } else {
            throw new RuntimeException(AnonymousClass001.A0g("Unable to locate '", str, "' in program"));
        }
    }

    public WFK() {
        float[] fArr = new float[16];
        this.A01 = fArr;
        Matrix.setIdentityM(fArr, 0);
    }

    public static int A00(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        A02(AnonymousClass001.A0O("glCreateShader type=", i));
        if (AbstractC65702TsY.A03(glCreateShader, str) == 0) {
            android.util.Log.e("LayoutRenderer", AnonymousClass001.A0c(AbstractC111324zv.A00(301), ":", i));
            android.util.Log.e("LayoutRenderer", AnonymousClass001.A0R(" ", GLES20.glGetShaderInfoLog(glCreateShader)));
            GLES20.glDeleteShader(glCreateShader);
            return 0;
        }
        return glCreateShader;
    }

    public static void A02(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return;
        }
        String A0g = AnonymousClass001.A0g(str, ": glError 0x", Integer.toHexString(glGetError));
        android.util.Log.e("LayoutRenderer", A0g);
        throw new RuntimeException(A0g);
    }
}
