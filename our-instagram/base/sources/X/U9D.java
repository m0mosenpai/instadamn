package X;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import android.view.TextureView;
import com.facebook.live.livestreaming.opengl.EglCore;
import com.facebook.live.livestreaming.opengl.GLUtil;
import com.facebook.live.livestreaming.opengl.Texture2dProgram;
import com.instagram.ui.widget.textureview.CircularTextureView;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* loaded from: classes11.dex */
public final class U9D extends Handler {
    public final /* synthetic */ W3I A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U9D(Looper looper, W3I w3i) {
        super(looper);
        this.A00 = w3i;
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, com.facebook.live.livestreaming.opengl.Texture2dProgram] */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        String str;
        int A00;
        FloatBuffer floatBuffer;
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    W3I w3i = this.A00;
                    W3I.A00(w3i);
                    ((HandlerThread) w3i.A06.getLooper().getThread()).quit();
                    return;
                }
                throw AbstractC25230BEn.A0n("Invalid msg what:", i);
            }
            W3I w3i2 = this.A00;
            SurfaceTexture surfaceTexture = w3i2.A01;
            if (surfaceTexture == null) {
                return;
            }
            surfaceTexture.updateTexImage();
            C69693Vto c69693Vto = w3i2.A04;
            c69693Vto.getClass();
            c69693Vto.A00();
            GLES20.glViewport(w3i2.A0A.left, w3i2.A0A.top, w3i2.A0A.width(), w3i2.A0A.height());
            SurfaceTexture surfaceTexture2 = w3i2.A01;
            float[] fArr = w3i2.A07;
            surfaceTexture2.getTransformMatrix(fArr);
            C68911VeB c68911VeB = w3i2.A03;
            c68911VeB.getClass();
            int i2 = w3i2.A00;
            boolean z = w3i2.A0C;
            Texture2dProgram texture2dProgram = c68911VeB.A00;
            float[] fArr2 = GLUtil.A00;
            C69635Vsc c69635Vsc = c68911VeB.A01;
            FloatBuffer floatBuffer2 = c69635Vsc.A06;
            int i3 = c69635Vsc.A01;
            int i4 = c69635Vsc.A02;
            if (z) {
                floatBuffer = c69635Vsc.A05;
            } else {
                floatBuffer = c69635Vsc.A04;
            }
            int i5 = c69635Vsc.A00;
            GLUtil.A02("draw start");
            GLES20.glClear(16640);
            GLES20.glUseProgram(texture2dProgram.A00);
            GLUtil.A02("glUseProgram");
            GLES20.glActiveTexture(33984);
            int i6 = texture2dProgram.A02;
            GLES20.glBindTexture(i6, i2);
            GLES20.glUniformMatrix4fv(texture2dProgram.A07, 1, false, fArr2, 0);
            GLUtil.A02("glUniformMatrix4fv");
            GLES20.glUniformMatrix4fv(texture2dProgram.A08, 1, false, fArr, 0);
            GLUtil.A02("glUniformMatrix4fv");
            int i7 = texture2dProgram.A03;
            GLES20.glEnableVertexAttribArray(i7);
            GLUtil.A02("glEnableVertexAttribArray");
            GLES20.glVertexAttribPointer(i7, 2, 5126, false, i4, (Buffer) floatBuffer2);
            GLUtil.A02("glVertexAttribPointer");
            int i8 = texture2dProgram.A04;
            GLES20.glEnableVertexAttribArray(i8);
            GLUtil.A02("glEnableVertexAttribArray");
            GLES20.glVertexAttribPointer(i8, 2, 5126, false, i5, (Buffer) floatBuffer);
            GLUtil.A02("glVertexAttribPointer");
            int i9 = texture2dProgram.A06;
            if (i9 >= 0) {
                GLES20.glUniform1fv(i9, 9, texture2dProgram.A0A, 0);
                GLES20.glUniform2fv(texture2dProgram.A09, 9, texture2dProgram.A0C, 0);
                GLES20.glUniform1f(texture2dProgram.A05, 0.0f);
            }
            int i10 = texture2dProgram.A01;
            if (i10 >= 0) {
                float[] fArr3 = texture2dProgram.A0B;
                GLES20.glUniform2f(i10, fArr3[0], fArr3[1]);
            }
            GLES20.glDrawArrays(5, 0, i3);
            GLUtil.A02("glDrawArrays");
            GLES20.glDisableVertexAttribArray(i7);
            GLES20.glDisableVertexAttribArray(i8);
            GLES20.glBindTexture(i6, 0);
            GLES20.glUseProgram(0);
            C69693Vto c69693Vto2 = w3i2.A04;
            EGL14.eglSwapBuffers(c69693Vto2.A01.A02, c69693Vto2.A00);
            return;
        }
        W3I w3i3 = this.A00;
        Surface surface = (Surface) message.obj;
        if (surface == null) {
            W3I.A00(w3i3);
            return;
        }
        if (w3i3.A04 != null) {
            GLES20.glFinish();
            w3i3.A04.A00();
            w3i3.A04.A01();
            EglCore eglCore = w3i3.A02;
            eglCore.getClass();
            EGLDisplay eGLDisplay = eglCore.A02;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT)) {
                C69693Vto c69693Vto3 = new C69693Vto(surface, w3i3.A02);
                w3i3.A04 = c69693Vto3;
                c69693Vto3.A00();
                return;
            }
            throw new RuntimeException("eglMakeCurrent failed");
        }
        EglCore eglCore2 = new EglCore();
        w3i3.A02 = eglCore2;
        C69693Vto c69693Vto4 = new C69693Vto(surface, eglCore2);
        w3i3.A04 = c69693Vto4;
        c69693Vto4.A00();
        Integer num = w3i3.A05;
        ?? obj = new Object();
        obj.A01 = -1;
        obj.A0A = new float[9];
        obj.A0B = new float[]{1.0f, 1.0f};
        int intValue = num.intValue();
        obj.A02 = 36197;
        switch (intValue) {
            case 1:
                str = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n";
                break;
            case 2:
                str = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    vec4 tc = texture2D(sTexture, vTextureCoord);\n    float color = tc.r * 0.3 + tc.g * 0.59 + tc.b * 0.11;\n    gl_FragColor = vec4(color, color, color, 1.0);\n}\n";
                break;
            case 3:
                str = "#extension GL_OES_EGL_image_external : require\n#define KERNEL_SIZE 9\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nuniform float uKernel[KERNEL_SIZE];\nuniform vec2 uTexOffset[KERNEL_SIZE];\nuniform float uColorAdjust;\nvoid main() {\n    int i = 0;\n    vec4 sum = vec4(0.0);\n    if (vTextureCoord.x < vTextureCoord.y - 0.005) {\n        for (i = 0; i < KERNEL_SIZE; i++) {\n            vec4 texc = texture2D(sTexture, vTextureCoord + uTexOffset[i]);\n            sum += texc * uKernel[i];\n        }\n    sum += uColorAdjust;\n    } else if (vTextureCoord.x > vTextureCoord.y + 0.005) {\n        sum = texture2D(sTexture, vTextureCoord);\n    } else {\n        sum.r = 1.0;\n    }\n    gl_FragColor = sum;\n}\n";
                break;
            default:
                str = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform vec2 uStretchFactor;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    vec2 scaledCoord = vTextureCoord * uStretchFactor;\n    vec2 scaledCentre = vec2(0.5 , 0.5) * uStretchFactor;\n    float alpha = 1.0 - (smoothstep(0.5, 0.5, distance(scaledCoord, scaledCentre)));\n    gl_FragColor = vec4(texture2D(sTexture, vTextureCoord).rgb * alpha, alpha);\n}\n";
                break;
        }
        int A002 = GLUtil.A00(35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uMVPMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n");
        int i11 = 0;
        if (A002 != 0 && (A00 = GLUtil.A00(35632, str)) != 0) {
            int glCreateProgram = GLES20.glCreateProgram();
            GLUtil.A02("glCreateProgram");
            if (glCreateProgram == 0) {
                C0K8.A0C("com.facebook.live.livestreaming.opengl.GLUtil", "Could not create program");
            }
            GLES20.glAttachShader(glCreateProgram, A002);
            GLUtil.A02("glAttachShader");
            GLES20.glAttachShader(glCreateProgram, A00);
            GLUtil.A02("glAttachShader");
            GLES20.glLinkProgram(glCreateProgram);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
            if (iArr[0] != 1) {
                C0K8.A0C("com.facebook.live.livestreaming.opengl.GLUtil", "Could not link program: ");
                C0K8.A0C("com.facebook.live.livestreaming.opengl.GLUtil", GLES20.glGetProgramInfoLog(glCreateProgram));
                GLES20.glDeleteProgram(glCreateProgram);
            } else {
                i11 = glCreateProgram;
            }
        }
        obj.A00 = i11;
        if (i11 != 0) {
            int glGetAttribLocation = GLES20.glGetAttribLocation(i11, "aPosition");
            obj.A03 = glGetAttribLocation;
            GLUtil.A01(glGetAttribLocation, "aPosition");
            int glGetAttribLocation2 = GLES20.glGetAttribLocation(obj.A00, "aTextureCoord");
            obj.A04 = glGetAttribLocation2;
            GLUtil.A01(glGetAttribLocation2, "aTextureCoord");
            int glGetUniformLocation = GLES20.glGetUniformLocation(obj.A00, "uMVPMatrix");
            obj.A07 = glGetUniformLocation;
            GLUtil.A01(glGetUniformLocation, "uMVPMatrix");
            int glGetUniformLocation2 = GLES20.glGetUniformLocation(obj.A00, "uTexMatrix");
            obj.A08 = glGetUniformLocation2;
            GLUtil.A01(glGetUniformLocation2, "uTexMatrix");
            int glGetUniformLocation3 = GLES20.glGetUniformLocation(obj.A00, "uKernel");
            obj.A06 = glGetUniformLocation3;
            if (glGetUniformLocation3 < 0) {
                obj.A06 = -1;
                obj.A09 = -1;
                obj.A05 = -1;
            } else {
                int glGetUniformLocation4 = GLES20.glGetUniformLocation(obj.A00, "uTexOffset");
                obj.A09 = glGetUniformLocation4;
                GLUtil.A01(glGetUniformLocation4, "uTexOffset");
                int glGetUniformLocation5 = GLES20.glGetUniformLocation(obj.A00, "uColorAdjust");
                obj.A05 = glGetUniformLocation5;
                GLUtil.A01(glGetUniformLocation5, "uColorAdjust");
                System.arraycopy(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f}, 0, obj.A0A, 0, 9);
                float f = 1.0f / 256.0f;
                float f2 = -f;
                obj.A0C = new float[]{f2, f2, 0.0f, f2, f, f2, f2, 0.0f, 0.0f, 0.0f, f, 0.0f, f2, f, 0.0f, f, f, f};
            }
            if (num == C05F.A0Y) {
                int glGetUniformLocation6 = GLES20.glGetUniformLocation(obj.A00, "uStretchFactor");
                obj.A01 = glGetUniformLocation6;
                GLUtil.A01(glGetUniformLocation6, "uStretchFactor");
            }
            C68911VeB c68911VeB2 = new C68911VeB(obj);
            w3i3.A03 = c68911VeB2;
            Texture2dProgram texture2dProgram2 = c68911VeB2.A00;
            int[] iArr2 = new int[1];
            GLES20.glGenTextures(1, iArr2, 0);
            GLUtil.A02("glGenTextures");
            int i12 = iArr2[0];
            GLES20.glBindTexture(texture2dProgram2.A02, i12);
            GLUtil.A02(AnonymousClass001.A0O("glBindTexture ", i12));
            AbstractC65702TsY.A0r();
            GLUtil.A02("glTexParameter");
            w3i3.A00 = i12;
            SurfaceTexture surfaceTexture3 = new SurfaceTexture(i12);
            w3i3.A01 = surfaceTexture3;
            surfaceTexture3.setOnFrameAvailableListener(new WIK(w3i3, 3));
            C69165Viu c69165Viu = w3i3.A0B;
            if (c69165Viu == null) {
                return;
            }
            new Surface(w3i3.A01);
            CircularTextureView circularTextureView = c69165Viu.A02;
            int i13 = c69165Viu.A00;
            int i14 = c69165Viu.A01;
            circularTextureView.A05 = true;
            TextureView.SurfaceTextureListener surfaceTextureListener = circularTextureView.A03;
            if (surfaceTextureListener == null || !circularTextureView.A01()) {
                return;
            }
            SurfaceTexture surfaceTexture4 = circularTextureView.getSurfaceTexture();
            surfaceTexture4.getClass();
            surfaceTextureListener.onSurfaceTextureAvailable(surfaceTexture4, i13, i14);
            return;
        }
        throw new RuntimeException("Unable to create program");
    }
}
