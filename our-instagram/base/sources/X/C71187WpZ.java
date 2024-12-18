package X;

import android.graphics.Bitmap;
import android.media.MediaCodec;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaMuxer;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Pair;
import android.view.Surface;
import com.facebook.proxygen.LigerSamplePolicy;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.webrtc.EglBase;
import org.webrtc.EglBase10Impl;

/* renamed from: X.WpZ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71187WpZ implements AutoCloseable {
    public int A00;
    public int A01;
    public MediaMuxer A02;
    public AbstractC71188Wpa A03;
    public boolean A04;
    public int[] A05;
    public final Handler A08;
    public final HandlerThread A09;
    public final C68874VdW A0A = new Object();
    public final AtomicBoolean A0C = new AtomicBoolean(false);
    public final List A0B = new ArrayList();
    public final int A06 = 2;
    public final int A07 = 1;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.VdW] */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.Wpa, X.UF9] */
    /* JADX WARN: Type inference failed for: r3v7, types: [X.VKB, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [X.WER, java.lang.Object] */
    public C71187WpZ(String str, int i, int i2, int i3, boolean z) {
        int A00;
        HandlerThread handlerThread = new HandlerThread("HeifEncoderThread", -2);
        AbstractC09770fa.A00(handlerThread);
        this.A09 = handlerThread;
        handlerThread.start();
        this.A08 = MSY.A09(handlerThread);
        this.A00 = 1;
        this.A02 = new MediaMuxer(str, 3);
        MediaCodecList mediaCodecList = UF9.A00;
        ?? abstractC71188Wpa = new AbstractC71188Wpa(this.A08, new W8u(this), i, i2, i3, z);
        abstractC71188Wpa.A02.setCallback(new C66323U8w(abstractC71188Wpa), abstractC71188Wpa.A0N);
        abstractC71188Wpa.A02.configure(abstractC71188Wpa.A0M, (Surface) null, (MediaCrypto) null, 1);
        Surface createInputSurface = abstractC71188Wpa.A02.createInputSurface();
        abstractC71188Wpa.A03 = createInputSurface;
        boolean z2 = abstractC71188Wpa.A0S;
        abstractC71188Wpa.A07 = new C70107W4e(abstractC71188Wpa, z2);
        if (z2) {
            ?? obj = new Object();
            obj.A01 = EGL14.EGL_NO_DISPLAY;
            obj.A00 = EGL14.EGL_NO_CONTEXT;
            obj.A02 = EGL14.EGL_NO_SURFACE;
            obj.A04 = new EGLConfig[1];
            createInputSurface.getClass();
            obj.A03 = createInputSurface;
            EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
            obj.A01 = eglGetDisplay;
            if (!C2I7.A00(eglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
                int[] iArr = new int[2];
                if (EGL14.eglInitialize(obj.A01, iArr, 0, iArr, 1)) {
                    EGLDisplay eGLDisplay = obj.A01;
                    EGLConfig[] eGLConfigArr = obj.A04;
                    if (EGL14.eglChooseConfig(eGLDisplay, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 0, 12352, 4, EglBase.EGL_RECORDABLE_ANDROID, 1, 12344}, 0, eGLConfigArr, 0, eGLConfigArr.length, new int[1], 0)) {
                        obj.A00 = EGL14.eglCreateContext(obj.A01, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{EglBase10Impl.EGL_CONTEXT_CLIENT_VERSION, 2, 12344}, 0);
                        int eglGetError = EGL14.eglGetError();
                        if (eglGetError == 12288) {
                            if (obj.A00 != null) {
                                obj.A02 = EGL14.eglCreateWindowSurface(obj.A01, obj.A04[0], obj.A03, new int[]{12344}, 0);
                                int eglGetError2 = EGL14.eglGetError();
                                if (eglGetError2 == 12288) {
                                    EGLSurface eGLSurface = obj.A02;
                                    if (eGLSurface != null) {
                                        EGL14.eglQuerySurface(obj.A01, eGLSurface, 12375, new int[1], 0);
                                        EGL14.eglQuerySurface(obj.A01, obj.A02, 12374, new int[1], 0);
                                        abstractC71188Wpa.A06 = obj;
                                        obj.A00();
                                        FloatBuffer floatBuffer = C70091W2n.A05;
                                        ?? obj2 = new Object();
                                        obj2.A01 = 3553;
                                        int A002 = WER.A00(35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uMVPMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n");
                                        int i4 = 0;
                                        if (A002 != 0 && (A00 = WER.A00(35632, "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n")) != 0) {
                                            int glCreateProgram = GLES20.glCreateProgram();
                                            WER.A02("glCreateProgram");
                                            if (glCreateProgram == 0) {
                                                android.util.Log.e("Texture2dProgram", "Could not create program");
                                            }
                                            GLES20.glAttachShader(glCreateProgram, A002);
                                            WER.A02("glAttachShader");
                                            GLES20.glAttachShader(glCreateProgram, A00);
                                            WER.A02("glAttachShader");
                                            GLES20.glLinkProgram(glCreateProgram);
                                            int[] iArr2 = new int[1];
                                            GLES20.glGetProgramiv(glCreateProgram, 35714, iArr2, 0);
                                            if (iArr2[0] != 1) {
                                                android.util.Log.e("Texture2dProgram", "Could not link program: ");
                                                android.util.Log.e("Texture2dProgram", GLES20.glGetProgramInfoLog(glCreateProgram));
                                                GLES20.glDeleteProgram(glCreateProgram);
                                            } else {
                                                i4 = glCreateProgram;
                                            }
                                        }
                                        obj2.A00 = i4;
                                        if (i4 != 0) {
                                            int glGetAttribLocation = GLES20.glGetAttribLocation(i4, "aPosition");
                                            obj2.A02 = glGetAttribLocation;
                                            WER.A01(glGetAttribLocation, "aPosition");
                                            int glGetAttribLocation2 = GLES20.glGetAttribLocation(obj2.A00, "aTextureCoord");
                                            obj2.A03 = glGetAttribLocation2;
                                            WER.A01(glGetAttribLocation2, "aTextureCoord");
                                            int glGetUniformLocation = GLES20.glGetUniformLocation(obj2.A00, "uMVPMatrix");
                                            obj2.A04 = glGetUniformLocation;
                                            WER.A01(glGetUniformLocation, "uMVPMatrix");
                                            int glGetUniformLocation2 = GLES20.glGetUniformLocation(obj2.A00, "uTexMatrix");
                                            obj2.A05 = glGetUniformLocation2;
                                            WER.A01(glGetUniformLocation2, "uTexMatrix");
                                            C70091W2n c70091W2n = new C70091W2n(obj2, abstractC71188Wpa.A0L, abstractC71188Wpa.A0I);
                                            abstractC71188Wpa.A05 = c70091W2n;
                                            WER wer = c70091W2n.A00;
                                            int[] iArr3 = new int[1];
                                            GLES20.glGenTextures(1, iArr3, 0);
                                            WER.A02("glGenTextures");
                                            int i5 = iArr3[0];
                                            int i6 = wer.A01;
                                            GLES20.glBindTexture(i6, i5);
                                            WER.A02(AnonymousClass001.A0O("glBindTexture ", i5));
                                            GLES20.glTexParameterf(i6, 10241, 9728.0f);
                                            GLES20.glTexParameterf(i6, 10240, i6 != 3553 ? 9729.0f : 9728.0f);
                                            GLES20.glTexParameteri(i6, 10242, 33071);
                                            GLES20.glTexParameteri(i6, 10243, 33071);
                                            WER.A02("glTexParameter");
                                            abstractC71188Wpa.A01 = i5;
                                            abstractC71188Wpa.A06.A01();
                                        } else {
                                            throw new RuntimeException("Unable to create program");
                                        }
                                    } else {
                                        throw new RuntimeException("surface was null");
                                    }
                                } else {
                                    throw AbstractC65702TsY.A0U("eglCreateWindowSurface", eglGetError2);
                                }
                            } else {
                                throw new RuntimeException("null context");
                            }
                        } else {
                            throw AbstractC65702TsY.A0U("eglCreateContext", eglGetError);
                        }
                    } else {
                        throw new RuntimeException(AbstractC111324zv.A00(138));
                    }
                } else {
                    throw new RuntimeException("unable to initialize EGL14");
                }
            } else {
                throw new RuntimeException("unable to get EGL14 display");
            }
        } else {
            abstractC71188Wpa.A04 = createInputSurface;
        }
        this.A03 = abstractC71188Wpa;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:39:0x0024
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    public final void A00() {
        /*
            r2 = this;
            r1 = 0
            android.media.MediaMuxer r0 = r2.A02     // Catch: java.lang.Exception -> Ld java.lang.Throwable -> L2f
            if (r0 == 0) goto Ld
            r0.stop()     // Catch: java.lang.Exception -> Ld java.lang.Throwable -> L2f
            android.media.MediaMuxer r0 = r2.A02     // Catch: java.lang.Exception -> Ld java.lang.Throwable -> L2f
            r0.release()     // Catch: java.lang.Exception -> Ld java.lang.Throwable -> L2f
        Ld:
            r2.A02 = r1
            X.Wpa r0 = r2.A03     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L27
            if (r0 == 0) goto L16
            r0.close()     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L27
        L16:
            monitor-enter(r2)
            r2.A03 = r1     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1b
            return
        L1b:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1b
            throw r0
        L1e:
            r0 = move-exception
            monitor-enter(r2)
            r2.A03 = r1     // Catch: java.lang.Throwable -> L24
        L22:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L24
            goto L26
        L24:
            r0 = move-exception
            goto L22
        L26:
            throw r0
        L27:
            monitor-enter(r2)
            r2.A03 = r1     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2c
            return
        L2c:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2c
            throw r0
        L2f:
            r0 = move-exception
            r2.A02 = r1
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71187WpZ.A00():void");
    }

    public final void A02() {
        ByteBuffer byteBuffer;
        if (this.A04) {
            synchronized (this) {
                AbstractC71188Wpa abstractC71188Wpa = this.A03;
                if (abstractC71188Wpa != null) {
                    int i = abstractC71188Wpa.A0J;
                    if (i == 2) {
                        C70107W4e c70107W4e = abstractC71188Wpa.A07;
                        synchronized (c70107W4e) {
                            try {
                                if (c70107W4e.A06) {
                                    if (c70107W4e.A01 < 0) {
                                        c70107W4e.A01 = 0L;
                                    }
                                } else if (c70107W4e.A00 < 0) {
                                    c70107W4e.A00 = 0L;
                                }
                                C70107W4e.A00(c70107W4e);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    } else if (i == 0) {
                        ArrayList arrayList = abstractC71188Wpa.A0Q;
                        synchronized (arrayList) {
                            while (true) {
                                try {
                                    if (!abstractC71188Wpa.A09) {
                                        if (arrayList.isEmpty()) {
                                            try {
                                                arrayList.wait();
                                            } catch (InterruptedException unused) {
                                            }
                                        } else {
                                            byteBuffer = (ByteBuffer) arrayList.remove(0);
                                            break;
                                        }
                                    } else {
                                        byteBuffer = null;
                                        break;
                                    }
                                } finally {
                                }
                            }
                        }
                        if (byteBuffer != null) {
                            byteBuffer.clear();
                            byteBuffer.flip();
                            ArrayList arrayList2 = abstractC71188Wpa.A0R;
                            synchronized (arrayList2) {
                                try {
                                    arrayList2.add(byteBuffer);
                                } finally {
                                }
                            }
                            abstractC71188Wpa.A0N.post(new RunnableC71220WqB(abstractC71188Wpa));
                        }
                    }
                }
            }
            C68874VdW c68874VdW = this.A0A;
            long j = LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT;
            synchronized (c68874VdW) {
                long currentTimeMillis = System.currentTimeMillis();
                while (true) {
                    if (!c68874VdW.A01) {
                        if (j > 0) {
                            try {
                                c68874VdW.wait(j);
                            } catch (InterruptedException unused2) {
                            }
                            j -= System.currentTimeMillis() - currentTimeMillis;
                        } else {
                            c68874VdW.A01 = true;
                            c68874VdW.A00 = new TimeoutException("timed out waiting for result");
                            break;
                        }
                    } else {
                        break;
                    }
                }
                Exception exc = c68874VdW.A00;
                if (exc != null) {
                    throw exc;
                }
            }
            A01();
            A00();
            return;
        }
        throw new IllegalStateException(MSV.A00(143));
    }

    public final void A03(Bitmap bitmap) {
        if (this.A04) {
            synchronized (this) {
                AbstractC71188Wpa abstractC71188Wpa = this.A03;
                if (abstractC71188Wpa != null) {
                    if (abstractC71188Wpa.A0J == 2) {
                        C70107W4e c70107W4e = abstractC71188Wpa.A07;
                        int i = abstractC71188Wpa.A00;
                        long j = abstractC71188Wpa.A0K;
                        if (c70107W4e.A01((((i * 1000000) / j) + 132) * 1000, ((((i + r9) - 1) * 1000000) / j) + 132)) {
                            synchronized (abstractC71188Wpa) {
                                try {
                                    VKB vkb = abstractC71188Wpa.A06;
                                    if (vkb != null) {
                                        vkb.A00();
                                        C70091W2n c70091W2n = abstractC71188Wpa.A05;
                                        int i2 = abstractC71188Wpa.A01;
                                        int i3 = c70091W2n.A00.A01;
                                        GLES20.glBindTexture(i3, i2);
                                        GLUtils.texImage2D(i3, 0, bitmap, 0);
                                        AbstractC71188Wpa.A00(abstractC71188Wpa);
                                        abstractC71188Wpa.A06.A01();
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                    } else {
                        throw new IllegalStateException("addBitmap is only allowed in bitmap input mode");
                    }
                }
            }
            return;
        }
        throw new IllegalStateException(MSV.A00(143));
    }

    public final void A01() {
        Pair pair;
        if (!this.A0C.get()) {
            return;
        }
        while (true) {
            List list = this.A0B;
            synchronized (list) {
                if (!list.isEmpty()) {
                    pair = (Pair) list.remove(0);
                } else {
                    return;
                }
            }
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            bufferInfo.set(((Buffer) pair.second).position(), ((Buffer) pair.second).remaining(), 0L, 16);
            this.A02.writeSampleData(this.A05[((Number) pair.first).intValue()], (ByteBuffer) pair.second, bufferInfo);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.A08.postAtFrontOfQueue(new RunnableC71223WqE(this));
    }
}
