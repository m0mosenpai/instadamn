package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* renamed from: X.B4e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C25005B4e extends Thread {
    public SurfaceTexture A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public final AKA A04;
    public final /* synthetic */ AQ3 A05;

    public C25005B4e(AQ3 aq3) {
        this.A05 = aq3;
        this.A04 = new AKA(aq3.A01);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        AKA aka;
        Context context;
        String str;
        Throwable th;
        while (this.A03) {
            if (this.A02) {
                AQ3 aq3 = this.A05;
                synchronized (this) {
                    if (this.A00 == null) {
                        C0f5 A00 = C18950wb.A00("GradientBackgroundRenderer", 817892933, true);
                        A00.ABW("error: ", "RenderThread, surface texture null");
                        A00.report();
                        return;
                    }
                    C178117vk c178117vk = aq3.A02;
                    if (C14360o3.A0K(c178117vk.A02, EGL14.EGL_NO_SURFACE)) {
                        c178117vk.A02();
                        SurfaceTexture surfaceTexture = this.A00;
                        if (surfaceTexture != null) {
                            c178117vk.A02 = c178117vk.A00(surfaceTexture);
                            c178117vk.A01();
                        } else {
                            throw AbstractC166997dE.A0g();
                        }
                    }
                    try {
                        aka = this.A04;
                        context = aq3.A00;
                        str = this.A01;
                    } catch (Exception e) {
                        String A0n = AbstractC167017dG.A0n(e, "RenderThread exception: ", AbstractC166987dD.A1C());
                        C0f5 A002 = C18950wb.A00("GradientBackgroundRenderer", 817892933, true);
                        A002.ABW("error: ", A0n);
                        A002.report();
                    }
                    if (str != null) {
                        C14360o3.A0B(context, 0);
                        int[] iArr = new int[1];
                        GLES20.glGenTextures(1, iArr, 0);
                        if (iArr[0] != 0) {
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inScaled = false;
                            InputStream open = context.getAssets().open(str);
                            try {
                                Bitmap decodeStream = BitmapFactory.decodeStream(open, null, options);
                                if (open != null) {
                                    open.close();
                                }
                                AbstractC167027dH.A0Z(iArr[0]);
                                GLUtils.texImage2D(3553, 0, decodeStream, 0);
                                if (decodeStream != null) {
                                    decodeStream.recycle();
                                }
                            } catch (Throwable th2) {
                                try {
                                    throw th2;
                                    break;
                                } catch (Throwable th3) {
                                    th = th3;
                                    C20I.A00(open, th2);
                                }
                            }
                        }
                        int i = iArr[0];
                        if (i != 0) {
                            aka.A03 = i;
                            int[] iArr2 = new int[1];
                            GLES20.glGenBuffers(1, iArr2, 0);
                            int i2 = iArr2[0];
                            aka.A06 = i2;
                            GLES20.glBindBuffer(34962, i2);
                            float[] fArr = aka.A09;
                            FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
                            asFloatBuffer.put(fArr);
                            Buffer position = asFloatBuffer.position(0);
                            GLES20.glBufferData(34962, position.capacity() * 4, position, 35044);
                            GLES20.glBindBuffer(34962, 0);
                            String str2 = aq3.A04;
                            String str3 = aq3.A03;
                            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                            GLES20.glClear(16640);
                            int A003 = AKA.A00(35633, str2);
                            aka.A07 = A003;
                            int i3 = 0;
                            if (A003 != 0) {
                                int A004 = AKA.A00(35632, str3);
                                aka.A02 = A004;
                                if (A004 != 0) {
                                    int glCreateProgram = GLES20.glCreateProgram();
                                    if (glCreateProgram != 0) {
                                        GLES20.glAttachShader(glCreateProgram, aka.A07);
                                        GLES20.glAttachShader(glCreateProgram, aka.A02);
                                        GLES20.glLinkProgram(glCreateProgram);
                                        int[] iArr3 = new int[1];
                                        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr3, 0);
                                        if (iArr3[0] != 1) {
                                            String A0R = AnonymousClass001.A0R(AbstractC111324zv.A00(3552), GLES20.glGetProgramInfoLog(glCreateProgram));
                                            C0f5 A005 = C18950wb.A00("GradientBackgGLUtil", 817892933, true);
                                            A005.ABW("error: ", A0R);
                                            A005.report();
                                            GLES20.glDeleteProgram(glCreateProgram);
                                            AKA.A01("createProgram");
                                        }
                                    }
                                    i3 = glCreateProgram;
                                    AKA.A01("createProgram");
                                }
                            }
                            aka.A04 = i3;
                            GLES20.glUseProgram(i3);
                            aka.A00 = GLES20.glGetAttribLocation(aka.A04, "aPosition");
                            aka.A01 = GLES20.glGetAttribLocation(aka.A04, "aTexCoord");
                            GLES20.glActiveTexture(33984);
                            GLES20.glBindTexture(3553, aka.A03);
                            aka.A05 = GLES20.glGetUniformLocation(aka.A04, AbstractC111324zv.A00(3032));
                            GLES20.glBindFramebuffer(36160, 0);
                            GLES20.glUniform1i(aka.A05, 0);
                            float[] fArr2 = aka.A0A;
                            FloatBuffer asFloatBuffer2 = ByteBuffer.allocateDirect(80).order(ByteOrder.nativeOrder()).asFloatBuffer();
                            aka.A08 = asFloatBuffer2;
                            if (asFloatBuffer2 != null) {
                                asFloatBuffer2.put(fArr2);
                                asFloatBuffer2.position(0);
                                GLES20.glEnableVertexAttribArray(aka.A00);
                                GLES20.glEnableVertexAttribArray(aka.A01);
                                int i4 = aka.A00;
                                FloatBuffer floatBuffer = aka.A08;
                                if (floatBuffer != null) {
                                    GLES20.glVertexAttribPointer(i4, 3, 5126, false, 20, floatBuffer.position(0));
                                    int i5 = aka.A01;
                                    FloatBuffer floatBuffer2 = aka.A08;
                                    if (floatBuffer2 != null) {
                                        GLES20.glVertexAttribPointer(i5, 2, 5126, false, 20, floatBuffer2.position(3));
                                        FloatBuffer floatBuffer3 = aka.A08;
                                        if (floatBuffer3 != null) {
                                            floatBuffer3.position(0);
                                            GLES20.glDrawArrays(5, 0, 4);
                                            AKA.A01("draw");
                                            EGL14.eglSwapBuffers(c178117vk.A01, c178117vk.A02);
                                            AKA aka2 = this.A04;
                                            GLES20.glDeleteProgram(aka2.A04);
                                            GLES20.glDeleteShader(aka2.A07);
                                            GLES20.glDeleteShader(aka2.A02);
                                            aka2.A04 = 0;
                                            aka2.A07 = 0;
                                            aka2.A02 = 0;
                                            GLES20.glDeleteTextures(1, new int[]{aka2.A03}, 0);
                                            aka2.A03 = 0;
                                            GLES20.glDeleteBuffers(1, new int[]{aka2.A06}, 0);
                                            aka2.A06 = 0;
                                            FloatBuffer floatBuffer4 = aka2.A08;
                                            if (floatBuffer4 != null) {
                                                floatBuffer4.clear();
                                            }
                                            aka2.A08 = null;
                                            aka2.A00 = 0;
                                            aka2.A01 = 0;
                                            aka2.A05 = 0;
                                            this.A02 = false;
                                        } else {
                                            th = AbstractC166987dD.A14("Required value was null.");
                                        }
                                    } else {
                                        th = AbstractC166987dD.A14("Required value was null.");
                                    }
                                } else {
                                    th = AbstractC166987dD.A14("Required value was null.");
                                }
                            } else {
                                th = AbstractC166987dD.A14("Required value was null.");
                            }
                        } else {
                            th = AbstractC166987dD.A18("Error loading texture.");
                        }
                    } else {
                        th = AbstractC166997dE.A0g();
                    }
                    throw th;
                    break;
                }
            }
        }
    }
}
