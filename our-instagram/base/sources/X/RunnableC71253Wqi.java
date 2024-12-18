package X;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;

/* renamed from: X.Wqi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71253Wqi implements Runnable {
    public final /* synthetic */ WWm A00;

    public RunnableC71253Wqi(WWm wWm) {
        this.A00 = wWm;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WWm wWm = this.A00;
        W2J w2j = new W2J();
        wWm.A02 = w2j;
        EGLDisplay eGLDisplay = w2j.A01;
        EGLSurface eGLSurface = w2j.A02;
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, w2j.A00);
        W2J.A00("eglMakeCurrent");
        W3A w3a = new W3A(wWm.A01, wWm.A00);
        wWm.A03 = w3a;
        int glCreateShader = GLES20.glCreateShader(35633);
        W3A.A00(AnonymousClass001.A0O("glCreateShader type=", 35633));
        if (AbstractC65702TsY.A03(glCreateShader, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n   gl_Position = uMVPMatrix * aPosition;\n   vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n") == 0) {
            C0K8.A09(W3A.class, "Could not compile shader %d:", AbstractC25228BEl.A1Y(35633));
            GLES20.glDeleteShader(glCreateShader);
            glCreateShader = 0;
        }
        int i = 0;
        if (glCreateShader != 0) {
            int glCreateShader2 = GLES20.glCreateShader(35632);
            W3A.A00(AnonymousClass001.A0O("glCreateShader type=", 35632));
            if (AbstractC65702TsY.A03(glCreateShader2, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n") == 0) {
                C0K8.A09(W3A.class, "Could not compile shader %d:", AbstractC25228BEl.A1Y(35632));
                GLES20.glDeleteShader(glCreateShader2);
            } else if (glCreateShader2 != 0) {
                int glCreateProgram = GLES20.glCreateProgram();
                if (glCreateProgram == 0) {
                    C0K8.A02(W3A.class, "Could not create program");
                }
                GLES20.glAttachShader(glCreateProgram, glCreateShader);
                W3A.A00("glAttachShader");
                GLES20.glAttachShader(glCreateProgram, glCreateShader2);
                W3A.A00("glAttachShader");
                GLES20.glLinkProgram(glCreateProgram);
                int[] iArr = new int[1];
                GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
                if (iArr[0] != 1) {
                    C0K8.A02(W3A.class, "Could not link program: ");
                    C0K8.A02(W3A.class, GLES20.glGetProgramInfoLog(glCreateProgram));
                    GLES20.glDeleteProgram(glCreateProgram);
                } else {
                    i = glCreateProgram;
                }
            }
        }
        w3a.A00 = i;
        if (i != 0) {
            VMW.A00(GLES20.glGetAttribLocation(i, "aPosition"), "aPosition");
            VMW.A00(GLES20.glGetAttribLocation(w3a.A00, "aTextureCoord"), "aTextureCoord");
            VMW.A00(GLES20.glGetUniformLocation(w3a.A00, "uMVPMatrix"), "uMVPMatrix");
            VMW.A00(GLES20.glGetUniformLocation(w3a.A00, "uSTMatrix"), "uSTMatrix");
            int[] iArr2 = new int[1];
            GLES20.glGenTextures(1, iArr2, 0);
            Integer valueOf = Integer.valueOf(iArr2[0]);
            w3a.A02 = valueOf;
            C14360o3.A0A(valueOf);
            GLES20.glBindTexture(36197, valueOf.intValue());
            W3A.A00("glBindTexture mTextureID");
            AbstractC65702TsY.A0r();
            W3A.A00("glTexParameter");
            Integer num = w3a.A02;
            C14360o3.A0A(num);
            SurfaceTexture surfaceTexture = new SurfaceTexture(num.intValue());
            w3a.A01 = surfaceTexture;
            surfaceTexture.setDefaultBufferSize(w3a.A04, w3a.A03);
            return;
        }
        throw new RuntimeException("failed creating program");
    }
}
