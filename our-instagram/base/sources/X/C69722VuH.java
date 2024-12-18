package X;

import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* renamed from: X.VuH, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69722VuH {
    public FloatBuffer A00;
    public FloatBuffer A01;
    public ShortBuffer A02;
    public float[] A03;
    public float[] A04;
    public int A06;
    public final float[] A08;
    public final float[] A09;
    public final float[] A0A;
    public final int[] A07 = new int[1];
    public short[] A05 = {0, 1, 2, 0, 2, 3};

    public C69722VuH(int i, int i2) {
        float[] fArr = new float[16];
        this.A08 = fArr;
        float[] fArr2 = new float[16];
        this.A0A = fArr2;
        float[] fArr3 = new float[16];
        this.A09 = fArr3;
        float f = i2;
        float f2 = i;
        this.A04 = new float[]{0.0f, f, 0.0f, 0.0f, 0.0f, 0.0f, f2, 0.0f, 0.0f, f2, f, 0.0f};
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(48);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        this.A01 = asFloatBuffer;
        asFloatBuffer.put(this.A04);
        this.A01.position(0);
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(12);
        allocateDirect2.order(ByteOrder.nativeOrder());
        ShortBuffer asShortBuffer = allocateDirect2.asShortBuffer();
        this.A02 = asShortBuffer;
        asShortBuffer.put(this.A05);
        this.A02.position(0);
        this.A03 = new float[]{0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f};
        ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(32);
        allocateDirect3.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer2 = allocateDirect3.asFloatBuffer();
        this.A00 = asFloatBuffer2;
        asFloatBuffer2.put(this.A03);
        this.A00.position(0);
        int[] iArr = this.A07;
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        int A00 = AbstractC66018TyG.A00(35633, "uniform mat4 uMVPMatrix;attribute vec4 vPosition;attribute vec2 a_texCoord;varying vec2 v_texCoord;void main() {  gl_Position = uMVPMatrix * vPosition;  v_texCoord = a_texCoord;}");
        int A002 = AbstractC66018TyG.A00(35632, "precision mediump float;varying vec2 v_texCoord;uniform sampler2D s_texture;void main() {  gl_FragColor = texture2D( s_texture, v_texCoord );}");
        int glCreateProgram = GLES20.glCreateProgram();
        this.A06 = glCreateProgram;
        GLES20.glAttachShader(glCreateProgram, A00);
        GLES20.glAttachShader(this.A06, A002);
        GLES20.glLinkProgram(this.A06);
        GLES20.glUseProgram(this.A06);
        GLES20.glViewport(0, 0, i, i2);
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(fArr2, 0.0f);
        Arrays.fill(fArr3, 0.0f);
        Matrix.orthoM(fArr, 0, 0.0f, f2, 0.0f, f, 0.0f, 50.0f);
        Matrix.setLookAtM(fArr2, 0, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        Matrix.multiplyMM(fArr3, 0, fArr, 0, fArr2, 0);
    }

    public final void A00() {
        GLES20.glDeleteTextures(1, this.A07, 0);
        int i = this.A06;
        if (i != 0) {
            GLES20.glDeleteShader(i);
            this.A06 = 0;
        }
    }

    public final void A01() {
        GLES20.glClear(16640);
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.A06, "vPosition");
        GLES20.glEnableVertexAttribArray(glGetAttribLocation);
        GLES20.glVertexAttribPointer(glGetAttribLocation, 3, 5126, false, 0, (Buffer) this.A01);
        int glGetAttribLocation2 = GLES20.glGetAttribLocation(this.A06, "a_texCoord");
        GLES20.glEnableVertexAttribArray(glGetAttribLocation2);
        GLES20.glVertexAttribPointer(glGetAttribLocation2, 2, 5126, false, 0, (Buffer) this.A00);
        GLES20.glUniformMatrix4fv(GLES20.glGetUniformLocation(this.A06, "uMVPMatrix"), 1, false, this.A09, 0);
        GLES20.glUniform1i(GLES20.glGetUniformLocation(this.A06, AbstractC111324zv.A00(3032)), 0);
        GLES20.glDrawElements(4, 6, 5123, this.A02);
        GLES20.glDisableVertexAttribArray(glGetAttribLocation);
        GLES20.glDisableVertexAttribArray(glGetAttribLocation2);
    }
}
