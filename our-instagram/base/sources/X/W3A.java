package X;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public final class W3A {
    public int A00;
    public SurfaceTexture A01;
    public Integer A02;
    public final int A03;
    public final int A04;
    public final FloatBuffer A05;
    public final FloatBuffer A06;
    public final Map A07;
    public final float[] A08;
    public final float[] A09;
    public final float[] A0A;

    public W3A(int i, int i2) {
        this.A04 = i;
        this.A03 = i2;
        float[] fArr = {-1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f};
        this.A0A = fArr;
        float[] fArr2 = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
        this.A09 = fArr2;
        FloatBuffer asFloatBuffer = AbstractC65702TsY.A0j(48).asFloatBuffer();
        C14360o3.A07(asFloatBuffer);
        this.A06 = asFloatBuffer;
        this.A07 = new HashMap();
        float[] fArr3 = new float[16];
        this.A08 = fArr3;
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        FloatBuffer asFloatBuffer2 = AbstractC65702TsY.A0j(32).asFloatBuffer();
        this.A05 = asFloatBuffer2;
        asFloatBuffer2.put(fArr2);
        asFloatBuffer2.position(0);
        Matrix.setIdentityM(fArr3, 0);
    }

    public static final void A00(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return;
        }
        C0K8.A09(W3A.class, "%s: glError %d", AbstractC25228BEl.A1Z(str, glGetError));
        throw new RuntimeException(AnonymousClass001.A0b(str, ": glError ", glGetError));
    }
}
