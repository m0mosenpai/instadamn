package X;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.os.HandlerThread;
import android.view.Surface;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* loaded from: classes11.dex */
public final class UMG extends W53 implements InterfaceC58163PqS, SurfaceTexture.OnFrameAvailableListener {
    public SurfaceTexture A00;
    public HandlerThread A01;
    public C69491VoE A02;
    public boolean A03;
    public final Object A04 = new Object();

    @Override // X.InterfaceC58163PqS
    public final void AQj(long j) {
        int i;
        int i2;
        int i3;
        C69491VoE c69491VoE = this.A02;
        c69491VoE.getClass();
        SurfaceTexture surfaceTexture = this.A00;
        surfaceTexture.getClass();
        AbstractC66018TyG.A01("onDrawFrame start");
        float[] fArr = c69491VoE.A0T;
        surfaceTexture.getTransformMatrix(fArr);
        GLES20.glUseProgram(c69491VoE.A0G);
        AbstractC66018TyG.A01("glUseProgram");
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, c69491VoE.A0H);
        FloatBuffer floatBuffer = c69491VoE.A0P;
        floatBuffer.position(0);
        GLES20.glVertexAttribPointer(c69491VoE.A0K, 3, 5126, false, 20, (Buffer) floatBuffer);
        AbstractC66018TyG.A01("glVertexAttribPointer maPosition");
        GLES20.glEnableVertexAttribArray(c69491VoE.A0K);
        AbstractC66018TyG.A01("glEnableVertexAttribArray maPositionHandle");
        floatBuffer.position(3);
        GLES20.glVertexAttribPointer(c69491VoE.A0L, 2, 5126, false, 20, (Buffer) floatBuffer);
        AbstractC66018TyG.A01("glVertexAttribPointer maTextureHandle");
        GLES20.glEnableVertexAttribArray(c69491VoE.A0L);
        AbstractC66018TyG.A01("glEnableVertexAttribArray maTextureHandle");
        GLES20.glUniformMatrix4fv(c69491VoE.A0N, 1, false, c69491VoE.A0S.A00);
        GLES20.glUniform1f(c69491VoE.A09, c69491VoE.A00);
        GLES20.glUniform1f(c69491VoE.A0I, c69491VoE.A07);
        GLES20.glUniform1f(c69491VoE.A0J, c69491VoE.A08);
        GLES20.glUniform1f(c69491VoE.A0A, c69491VoE.A01);
        GLES20.glUniform1f(c69491VoE.A0B, c69491VoE.A02);
        GLES20.glUniform2f(c69491VoE.A0M, c69491VoE.A06, c69491VoE.A05);
        GLES20.glUniform2f(c69491VoE.A0F, c69491VoE.A03, c69491VoE.A04);
        GLES20.glUniform1i(c69491VoE.A0C, 0);
        if (c69491VoE.A0Q || c69491VoE.A0R) {
            GLES20.glEnable(3089);
            if (c69491VoE.A0E == -1) {
                int[] iArr = new int[4];
                GLES20.glGetIntegerv(3088, iArr, 0);
                c69491VoE.A0E = iArr[2];
                c69491VoE.A0D = iArr[3];
            }
        }
        if (c69491VoE.A0Q) {
            i = c69491VoE.A0D;
            i2 = i / 4;
            i3 = c69491VoE.A0E / 2;
        } else {
            if (c69491VoE.A0R) {
                i = c69491VoE.A0D;
                i2 = i / 2;
                i3 = c69491VoE.A0E;
            }
            GLES20.glUniformMatrix4fv(c69491VoE.A0O, 1, false, fArr, 0);
            GLES20.glDrawArrays(5, 0, 4);
            AbstractC66018TyG.A01("glDrawArrays");
            if (!c69491VoE.A0Q || c69491VoE.A0R) {
                GLES20.glDisable(3089);
            }
            GLES20.glFinish();
        }
        GLES20.glScissor(0, i2, i3, i / 2);
        GLES20.glUniformMatrix4fv(c69491VoE.A0O, 1, false, fArr, 0);
        GLES20.glDrawArrays(5, 0, 4);
        AbstractC66018TyG.A01("glDrawArrays");
        if (!c69491VoE.A0Q) {
        }
        GLES20.glDisable(3089);
        GLES20.glFinish();
    }

    @Override // X.InterfaceC58163PqS
    public final void Eel(boolean z) {
        C69491VoE c69491VoE = this.A02;
        c69491VoE.getClass();
        float f = 1.0f;
        if (z) {
            f = 0.0f;
        }
        c69491VoE.A00 = f;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        Object obj = this.A04;
        synchronized (obj) {
            if (this.A03) {
                C0w9.A03("VideoOverlayDecoderOutputSurface", AbstractC111324zv.A00(232));
            }
            this.A03 = true;
            obj.notifyAll();
        }
    }

    public UMG() {
        int A00;
        C69491VoE c69491VoE = new C69491VoE();
        this.A02 = c69491VoE;
        int A002 = AbstractC66018TyG.A00(35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nuniform vec2 uInputSize;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvarying highp vec2 vFragCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n  vFragCoord = ((aPosition.xy / (2.0, 2.0) + 0.5) * uInputSize);\n}\n");
        int i = 0;
        if (A002 != 0 && (A00 = AbstractC66018TyG.A00(35632, "#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nvarying highp vec2 vFragCoord;\nuniform highp vec2 uInputCenterPoint;   // The center point of the node's size in points\nuniform highp float uTopLeftRadius; // The corner radius in points\nuniform highp float uTopRightRadius; // The corner radius in points\nuniform highp float uBottomLeftRadius; // The corner radius in points\nuniform highp float uBottomRightRadius; // The corner radius in points\nuniform samplerExternalOES sTexture;\nuniform float alpha;\nuniform int convertYuv2Rgb;\n// @brief   Calculates the alpha of a point in a rounded rect.\n//\n// @param   point           A point in the rectangle to check. Ranges from (0,0) to (2a, 2b).\n// @param   fadeDistance    The distance over which to fade the alpha from 1.0 to 0.0.\n//\n// @return  The alpha value for a point in a rounded rect.\n//          > 0.0 if the point lies within the rounded rect\n//          0.0 if the point lies outside the rounded rect\n// Reference to the math https://benice-equation.blogspot.com/2016/10/equation-of-rounded-rectangle.html\nfloat alphaForPointInRoundedRect(highp vec2 point, highp float fadeDistance) {\n    vec2 topRightCenter = 2.0 * uInputCenterPoint - uTopRightRadius;\n    vec2 topRightDelta = point - topRightCenter;\n    float topRightFactor = mix(1.0,\n                              1.0 - smoothstep(uTopRightRadius, uTopRightRadius + fadeDistance + 1.0e-30, length(topRightDelta)),\n                              float(topRightDelta.x >= 0.0 && topRightDelta.y >= 0.0));\n\n    vec2 topLeftCenter = vec2(uTopLeftRadius, 2.0 * uInputCenterPoint.y - uTopLeftRadius);\n    vec2 topLeftDelta = point - topLeftCenter;\n    float topLeftFactor = mix(1.0,\n                             1.0 - smoothstep(uTopLeftRadius, uTopLeftRadius + fadeDistance + 1.0e-30, length(topLeftDelta)),\n                             float(topLeftDelta.x <= 0.0 && topLeftDelta.y >= 0.0));\n\n    vec2 bottomRightCenter = vec2(2.0 * uInputCenterPoint.x - uBottomRightRadius, uBottomRightRadius);\n    vec2 bottomRightDelta = point - bottomRightCenter;\n    float bottomRightFactor = mix(1.0,\n                                 1.0 - smoothstep(uBottomRightRadius, uBottomRightRadius + fadeDistance + 1.0e-30, length(bottomRightDelta)),\n                                 float(bottomRightDelta.x >= 0.0 && bottomRightDelta.y <= 0.0));\n\n    vec2 bottomLeftCenter = vec2(uBottomLeftRadius, uBottomLeftRadius);\n    vec2 bottomLeftDelta = point - bottomLeftCenter;\n    float bottomLeftFactor = mix(1.0,\n                                1.0 - smoothstep(uBottomLeftRadius, uBottomLeftRadius + fadeDistance + 1.0e-30, length(bottomLeftDelta)),\n                                float(bottomLeftDelta.x <= 0.0 && bottomLeftDelta.y <= 0.0));\n\n    return topRightFactor * topLeftFactor * bottomRightFactor * bottomLeftFactor;\n}\nvoid main() {\n  vec4 fgColor = texture2D(sTexture, vTextureCoord);\n  if (convertYuv2Rgb != 0) {    mat4 yuvMatrix = mat4(\n        1.00000, 1.00000, 1.00000, 0.00000,\n        0.00000,-0.21482, 2.12798, 0.00000,\n        1.28033,-0.38059, 0.00000, 0.00000,\n       -0.64017, 0.29771,-1.06399, 1.00000\n    );\n    fgColor = yuvMatrix * fgColor;\n  }\n  if (uTopLeftRadius > 0.0 || uTopRightRadius > 0.0 || uBottomLeftRadius > 0.0 || uBottomRightRadius > 0.0) {    highp float corner_alpha = alphaForPointInRoundedRect(vFragCoord, 0.0);\n    if (corner_alpha == 0.0) discard;\n  }  vec4 bgColor = vec4(0.0,0.0,0.0,1.0);\n  gl_FragColor = mix(bgColor, fgColor, alpha);\n}\n")) != 0) {
            int glCreateProgram = GLES20.glCreateProgram();
            AbstractC66018TyG.A01("glCreateProgram");
            if (glCreateProgram == 0) {
                C0K8.A0C("GLProgramUtil", "Could not create program");
            }
            GLES20.glAttachShader(glCreateProgram, A002);
            AbstractC66018TyG.A01("glAttachShader");
            GLES20.glAttachShader(glCreateProgram, A00);
            AbstractC66018TyG.A01("glAttachShader");
            GLES20.glLinkProgram(glCreateProgram);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
            if (iArr[0] != 1) {
                C0K8.A0C("GLProgramUtil", "Could not link program: ");
                C0K8.A0C("GLProgramUtil", GLES20.glGetProgramInfoLog(glCreateProgram));
                GLES20.glDeleteProgram(glCreateProgram);
            } else {
                i = glCreateProgram;
            }
        }
        c69491VoE.A0G = i;
        if (i != 0) {
            c69491VoE.A0K = GLES20.glGetAttribLocation(i, "aPosition");
            AbstractC66018TyG.A01("glGetAttribLocation aPosition");
            if (c69491VoE.A0K != -1) {
                c69491VoE.A0L = GLES20.glGetAttribLocation(c69491VoE.A0G, "aTextureCoord");
                AbstractC66018TyG.A01("glGetAttribLocation aTextureCoord");
                if (c69491VoE.A0L != -1) {
                    c69491VoE.A0N = GLES20.glGetUniformLocation(c69491VoE.A0G, "uMVPMatrix");
                    AbstractC66018TyG.A01("glGetUniformLocation uMVPMatrix");
                    if (c69491VoE.A0N != -1) {
                        c69491VoE.A0O = GLES20.glGetUniformLocation(c69491VoE.A0G, "uSTMatrix");
                        AbstractC66018TyG.A01("glGetUniformLocation uSTMatrix");
                        if (c69491VoE.A0O != -1) {
                            c69491VoE.A0M = GLES20.glGetUniformLocation(c69491VoE.A0G, "uInputSize");
                            AbstractC66018TyG.A01("glGetUniformLocation uInputSize");
                            if (c69491VoE.A0M != -1) {
                                c69491VoE.A09 = GLES20.glGetUniformLocation(c69491VoE.A0G, "alpha");
                                AbstractC66018TyG.A01("glGetUniformLocation alpha");
                                if (c69491VoE.A09 != -1) {
                                    c69491VoE.A0F = GLES20.glGetUniformLocation(c69491VoE.A0G, "uInputCenterPoint");
                                    AbstractC66018TyG.A01("glGetUniformLocation uInputCenterPoint");
                                    if (c69491VoE.A0F != -1) {
                                        c69491VoE.A0I = GLES20.glGetUniformLocation(c69491VoE.A0G, "uTopLeftRadius");
                                        AbstractC66018TyG.A01("glGetUniformLocation uTopLeftRadius");
                                        if (c69491VoE.A0I != -1) {
                                            c69491VoE.A0J = GLES20.glGetUniformLocation(c69491VoE.A0G, "uTopRightRadius");
                                            AbstractC66018TyG.A01("glGetUniformLocation uTopRightRadius");
                                            if (c69491VoE.A0J != -1) {
                                                c69491VoE.A0A = GLES20.glGetUniformLocation(c69491VoE.A0G, "uBottomLeftRadius");
                                                AbstractC66018TyG.A01("glGetUniformLocation uBottomLeftRadius");
                                                if (c69491VoE.A0A != -1) {
                                                    c69491VoE.A0B = GLES20.glGetUniformLocation(c69491VoE.A0G, "uBottomRightRadius");
                                                    AbstractC66018TyG.A01("glGetUniformLocation uBottomRightRadius");
                                                    if (c69491VoE.A0B != -1) {
                                                        c69491VoE.A0C = GLES20.glGetUniformLocation(c69491VoE.A0G, "convertYuv2Rgb");
                                                        AbstractC66018TyG.A01("glGetUniformLocation convertYuv2Rgb");
                                                        if (c69491VoE.A0C != -1) {
                                                            int[] iArr2 = new int[1];
                                                            GLES20.glGenTextures(1, iArr2, 0);
                                                            int i2 = iArr2[0];
                                                            c69491VoE.A0H = i2;
                                                            GLES20.glBindTexture(36197, i2);
                                                            AbstractC66018TyG.A01("glBindTexture mTextureID");
                                                            AbstractC65702TsY.A0r();
                                                            AbstractC66018TyG.A01("glTexParameter");
                                                            W53.A00("before createSurfaceTexture");
                                                            this.A00 = new SurfaceTexture(this.A02.A0H);
                                                            if (EGL14.eglGetError() != 12288) {
                                                                C0w9.A03("VideoOverlayDecoderOutputSurface", "EGL Error after creating a SurfaceTexture");
                                                            }
                                                            HandlerThread A0A = MSY.A0A("output-surface-cb-runner");
                                                            this.A01 = A0A;
                                                            A0A.start();
                                                            SurfaceTexture surfaceTexture = this.A00;
                                                            surfaceTexture.getClass();
                                                            AbstractC65702TsY.A0y(this, surfaceTexture, this.A01);
                                                            super.A03 = new Surface(this.A00);
                                                            return;
                                                        }
                                                        throw new RuntimeException("Could not get attrib location for convertYuv2Rgb");
                                                    }
                                                    throw new RuntimeException("Could not get attrib location for uBottomRightRadius");
                                                }
                                                throw new RuntimeException("Could not get attrib location for uBottomLeftRadius");
                                            }
                                            throw new RuntimeException("Could not get attrib location for uTopRightRadius");
                                        }
                                        throw new RuntimeException("Could not get attrib location for uTopLeftRadius");
                                    }
                                    throw new RuntimeException("Could not get attrib location for uInputCenterPoint");
                                }
                                throw new RuntimeException("Could not get attrib location for alpha");
                            }
                            throw new RuntimeException("Could not get attrib location for uInputSize");
                        }
                        throw new RuntimeException("Could not get attrib location for uSTMatrix");
                    }
                    throw new RuntimeException("Could not get attrib location for uMVPMatrix");
                }
                throw new RuntimeException("Could not get attrib location for aTextureCoord");
            }
            throw new RuntimeException("Could not get attrib location for aPosition");
        }
        throw new RuntimeException("failed creating program");
    }

    @Override // X.InterfaceC58163PqS
    public final void AD7() {
        long currentTimeMillis = System.currentTimeMillis() + 1000;
        Object obj = this.A04;
        synchronized (obj) {
            while (!this.A03) {
                try {
                    obj.wait(1000L);
                    if (!this.A03 && System.currentTimeMillis() >= currentTimeMillis) {
                        break;
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            this.A03 = false;
        }
        W53.A00("before updateTexImage");
        SurfaceTexture surfaceTexture = this.A00;
        surfaceTexture.getClass();
        surfaceTexture.updateTexImage();
    }

    @Override // X.W53, X.InterfaceC58163PqS
    public final void release() {
        super.release();
        C69491VoE c69491VoE = this.A02;
        c69491VoE.getClass();
        GLES20.glDeleteProgram(c69491VoE.A0G);
        c69491VoE.A0G = -1;
        c69491VoE.A0H = 0;
        this.A02 = null;
        this.A00 = null;
        HandlerThread handlerThread = this.A01;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.A01 = null;
        }
    }
}
