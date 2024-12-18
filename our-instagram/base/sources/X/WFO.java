package X;

import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.FloatBuffer;

/* loaded from: classes11.dex */
public final class WFO {
    public static final float[] A01;
    public static final FloatBuffer A02;
    public static final FloatBuffer A03;
    public static final float[] A04;
    public static final float[] A05;
    public C69375VmL A00 = new C69375VmL();

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00cc, code lost:
    
        r7 = r1 / r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ca, code lost:
    
        if (r1 > r4) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0024, code lost:
    
        if (r1 > r4) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        r4 = r4 / r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03(float[] r21, int r22, int r23, int r24, int r25, int r26, int r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WFO.A03(float[], int, int, int, int, int, int, boolean):void");
    }

    static {
        float[] fArr = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        A04 = fArr;
        float[] fArr2 = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
        A05 = fArr2;
        float[] fArr3 = new float[16];
        A01 = fArr3;
        Matrix.setIdentityM(fArr3, 0);
        FloatBuffer A0k = AbstractC65702TsY.A0k(fArr, 32);
        A0k.position(0);
        A02 = A0k;
        FloatBuffer A0k2 = AbstractC65702TsY.A0k(fArr2, 32);
        A0k2.position(0);
        A03 = A0k2;
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
            android.util.Log.e("CopyRenderer", AnonymousClass001.A0c(AbstractC111324zv.A00(301), ":", i));
            android.util.Log.e("CopyRenderer", AnonymousClass001.A0R(" ", GLES20.glGetShaderInfoLog(glCreateShader)));
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
        android.util.Log.e("CopyRenderer", A0g);
        throw new RuntimeException(A0g);
    }
}
