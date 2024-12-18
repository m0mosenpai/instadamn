package X;

import android.opengl.GLES20;

/* renamed from: X.VlY, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69326VlY {
    public int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final C69626VsT A04;
    public final C69626VsT A05;

    public C69326VlY() {
        int A00;
        int A002 = WFK.A00(35633, "uniform mat4 uContentTransformMatrix0;\nuniform mat4 uContentTransformMatrix1;\nuniform mat4 uTextureTransformMatrix0;\nuniform mat4 uTextureTransformMatrix1;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord0;\nvarying vec2 vTextureCoord1;\nvarying vec2 vPosition;\nvoid main() {\n    vPosition = aPosition.xy;\n    gl_Position = uContentTransformMatrix0 * aPosition;\n    vTextureCoord0 = (uTextureTransformMatrix0 * aTextureCoord).xy;\n    vTextureCoord1 = (uTextureTransformMatrix1 * uContentTransformMatrix1 * aTextureCoord).xy;\n}\n");
        int i = 0;
        if (A002 != 0 && (A00 = WFK.A00(35632, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord0;\nvarying vec2 vTextureCoord1;\nvarying vec2 vPosition;\nuniform samplerExternalOES uTexture0;\nuniform samplerExternalOES uTexture1;\nuniform vec2 uTextureSize;\nuniform vec2 uTextureSize0;\nuniform vec2 uTextureSize1;\nuniform float uCornerRadius0;\nuniform float uCornerRadius1;\nuniform float uTextureEnabled0;\nuniform float uTextureEnabled1;\nfloat udRoundBox(vec2 p, vec2 b, float r) {\n    return length(max(abs(p)-b+r,0.0))-(r-0.5);\n}\nvoid main() {\n    gl_FragColor = vec4(0.0);\n    vec2 halfRes = 0.5 * uTextureSize;\n    if (uTextureEnabled0 > 0.0) {\n        vec4 color0 = texture2D(uTexture0, vTextureCoord0);\n        if (uCornerRadius0 > 0.0) {\n            vec2 halfRes0 = 0.5 * uTextureSize0;\n            float b0 = udRoundBox(vPosition * halfRes, halfRes0, uCornerRadius0);\n            gl_FragColor = mix(color0, gl_FragColor, smoothstep(0.0, 1.0, b0));\n        } else {\n            gl_FragColor = color0;\n        }\n    }\n    if (uTextureEnabled1 > 0.0) {\n        vec4 color1 = texture2D(uTexture1, vTextureCoord1);\n        vec2 halfRes1 = 0.5 * uTextureSize1;\n        float b1 = udRoundBox((vTextureCoord1 - 0.5) * uTextureSize1, halfRes1, uCornerRadius1);\n        gl_FragColor = mix(color1, gl_FragColor, smoothstep(0.0, 1.0, b1));\n    }\n}\n")) != 0) {
            int glCreateProgram = GLES20.glCreateProgram();
            WFK.A02("glCreateProgram");
            if (glCreateProgram == 0) {
                android.util.Log.e("LayoutRenderer", "Could not create program");
            }
            GLES20.glAttachShader(glCreateProgram, A002);
            WFK.A02("glAttachShader");
            GLES20.glAttachShader(glCreateProgram, A00);
            WFK.A02("glAttachShader");
            GLES20.glLinkProgram(glCreateProgram);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
            if (iArr[0] != 1) {
                android.util.Log.e("LayoutRenderer", "Could not link program: ");
                android.util.Log.e("LayoutRenderer", GLES20.glGetProgramInfoLog(glCreateProgram));
                GLES20.glDeleteProgram(glCreateProgram);
            } else {
                i = glCreateProgram;
            }
        }
        this.A00 = i;
        if (i != 0) {
            int glGetAttribLocation = GLES20.glGetAttribLocation(i, "aPosition");
            this.A01 = glGetAttribLocation;
            WFK.A01(glGetAttribLocation, "aPosition");
            int glGetAttribLocation2 = GLES20.glGetAttribLocation(this.A00, "aTextureCoord");
            this.A02 = glGetAttribLocation2;
            WFK.A01(glGetAttribLocation2, "aTextureCoord");
            int glGetUniformLocation = GLES20.glGetUniformLocation(this.A00, "uTextureSize");
            this.A03 = glGetUniformLocation;
            WFK.A01(glGetUniformLocation, "uTextureSize");
            this.A05 = new C69626VsT(0, this.A00);
            this.A04 = new C69626VsT(1, this.A00);
            return;
        }
        throw new RuntimeException("Unable to create program");
    }
}
