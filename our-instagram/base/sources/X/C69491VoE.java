package X;

import android.opengl.Matrix;
import com.facebook.common.math.matrix.Matrix4;
import java.nio.FloatBuffer;

/* renamed from: X.VoE, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69491VoE {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public int A0J;
    public int A0K;
    public int A0L;
    public int A0M;
    public int A0N;
    public int A0O;
    public FloatBuffer A0P;
    public final Matrix4 A0S;
    public final float[] A0T;
    public final float[] A0U;
    public boolean A0Q = false;
    public boolean A0R = false;
    public int A0E = -1;
    public int A0D = -1;

    public C69491VoE() {
        float[] fArr = {-1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        this.A0U = fArr;
        Matrix4 matrix4 = new Matrix4();
        this.A0S = matrix4;
        float[] fArr2 = new float[16];
        this.A0T = fArr2;
        this.A0H = 12345;
        this.A00 = 1.0f;
        this.A07 = 0.0f;
        this.A08 = 0.0f;
        this.A01 = 0.0f;
        this.A02 = 0.0f;
        FloatBuffer asFloatBuffer = AbstractC65702TsY.A0j(80).asFloatBuffer();
        this.A0P = asFloatBuffer;
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        Matrix.setIdentityM(fArr2, 0);
        Matrix.setIdentityM(matrix4.A01, 0);
    }
}
