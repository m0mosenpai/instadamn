package X;

import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.opengl.EGL14;
import android.opengl.EGLExt;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Wpa, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC71188Wpa implements AutoCloseable, SurfaceTexture.OnFrameAvailableListener {
    public int A00;
    public int A01;
    public MediaCodec A02;
    public Surface A03;
    public Surface A04;
    public C70091W2n A05;
    public VKB A06;
    public C70107W4e A07;
    public ByteBuffer A08;
    public boolean A09;
    public double A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final int A0J;
    public final int A0K;
    public final int A0L;
    public final MediaFormat A0M;
    public final Handler A0N;
    public final W8u A0O;
    public final boolean A0S;
    public final boolean A0T;
    public final Rect A0U;
    public final Rect A0V;
    public final HandlerThread A0W;
    public final ArrayList A0Q = new ArrayList();
    public final ArrayList A0R = new ArrayList();
    public final ArrayList A0P = new ArrayList();
    public final float[] A0Y = new float[16];
    public final AtomicBoolean A0X = new AtomicBoolean(false);

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        synchronized (this) {
            VKB vkb = this.A06;
            if (vkb != null) {
                vkb.A00();
                surfaceTexture.updateTexImage();
                surfaceTexture.getTransformMatrix(this.A0Y);
                long timestamp = surfaceTexture.getTimestamp();
                C70107W4e c70107W4e = this.A07;
                int i = this.A00;
                if (c70107W4e.A01(timestamp, ((((i + r6) - 1) * 1000000) / this.A0K) + 132)) {
                    A00(this);
                }
                surfaceTexture.releaseTexImage();
                this.A06.A01();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00b6, code lost:
    
        if (r21 > r17.A0C) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractC71188Wpa(android.os.Handler r18, X.W8u r19, int r20, int r21, int r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 515
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC71188Wpa.<init>(android.os.Handler, X.W8u, int, int, int, boolean):void");
    }

    public static void A00(AbstractC71188Wpa abstractC71188Wpa) {
        int i = abstractC71188Wpa.A0H;
        int i2 = abstractC71188Wpa.A0F;
        GLES20.glViewport(0, 0, i, i2);
        for (int i3 = 0; i3 < abstractC71188Wpa.A0G; i3++) {
            for (int i4 = 0; i4 < abstractC71188Wpa.A0E; i4++) {
                int i5 = i4 * i;
                int i6 = i3 * i2;
                Rect rect = abstractC71188Wpa.A0V;
                rect.set(i5, i6, i + i5, i2 + i6);
                try {
                    C70091W2n c70091W2n = abstractC71188Wpa.A05;
                    int i7 = abstractC71188Wpa.A01;
                    float[] fArr = WER.A07;
                    float[] fArr2 = c70091W2n.A04;
                    float f = rect.left;
                    float f2 = c70091W2n.A02;
                    float f3 = f / f2;
                    fArr2[0] = f3;
                    float f4 = rect.bottom;
                    float f5 = c70091W2n.A01;
                    float f6 = 1.0f - (f4 / f5);
                    fArr2[1] = f6;
                    float f7 = rect.right / f2;
                    fArr2[2] = f7;
                    fArr2[3] = f6;
                    fArr2[4] = f3;
                    float f8 = 1.0f - (rect.top / f5);
                    fArr2[5] = f8;
                    fArr2[6] = f7;
                    fArr2[7] = f8;
                    FloatBuffer floatBuffer = c70091W2n.A03;
                    floatBuffer.put(fArr2);
                    floatBuffer.position(0);
                    WER wer = c70091W2n.A00;
                    float[] fArr3 = WER.A06;
                    FloatBuffer floatBuffer2 = C70091W2n.A05;
                    WER.A02("draw start");
                    GLES20.glUseProgram(wer.A00);
                    WER.A02("glUseProgram");
                    GLES20.glActiveTexture(33984);
                    int i8 = wer.A01;
                    GLES20.glBindTexture(i8, i7);
                    GLES20.glUniformMatrix4fv(wer.A04, 1, false, fArr3, 0);
                    WER.A02("glUniformMatrix4fv");
                    GLES20.glUniformMatrix4fv(wer.A05, 1, false, fArr, 0);
                    WER.A02("glUniformMatrix4fv");
                    int i9 = wer.A02;
                    GLES20.glEnableVertexAttribArray(i9);
                    WER.A02("glEnableVertexAttribArray");
                    GLES20.glVertexAttribPointer(i9, 2, 5126, false, 8, (Buffer) floatBuffer2);
                    WER.A02("glVertexAttribPointer");
                    int i10 = wer.A03;
                    GLES20.glEnableVertexAttribArray(i10);
                    WER.A02("glEnableVertexAttribArray");
                    GLES20.glVertexAttribPointer(i10, 2, 5126, false, 8, (Buffer) floatBuffer);
                    WER.A02("glVertexAttribPointer");
                    GLES20.glDrawArrays(5, 0, 4);
                    WER.A02("glDrawArrays");
                    GLES20.glDisableVertexAttribArray(i9);
                    GLES20.glDisableVertexAttribArray(i10);
                    GLES20.glBindTexture(i8, 0);
                    GLES20.glUseProgram(0);
                    VKB vkb = abstractC71188Wpa.A06;
                    int i11 = abstractC71188Wpa.A00;
                    abstractC71188Wpa.A00 = i11 + 1;
                    EGLExt.eglPresentationTimeANDROID(vkb.A01, vkb.A02, (((i11 * 1000000) / abstractC71188Wpa.A0K) + 132) * 1000);
                    VKB vkb2 = abstractC71188Wpa.A06;
                    EGL14.eglSwapBuffers(vkb2.A01, vkb2.A02);
                } catch (RuntimeException e) {
                    if (!abstractC71188Wpa.A0X.get()) {
                        throw e;
                    }
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x01a0, code lost:
    
        throw new java.lang.IllegalArgumentException("src or dst are not aligned!");
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004e, code lost:
    
        if (r12.remaining() != 0) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01() {
        /*
            Method dump skipped, instructions count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC71188Wpa.A01():void");
    }

    public final void A02() {
        this.A0X.set(true);
        try {
            MediaCodec mediaCodec = this.A02;
            if (mediaCodec != null) {
                mediaCodec.stop();
                this.A02.release();
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            this.A02 = null;
            throw th;
        }
        this.A02 = null;
        ArrayList arrayList = this.A0Q;
        synchronized (arrayList) {
            this.A09 = true;
            arrayList.notifyAll();
        }
        synchronized (this) {
            try {
                C70091W2n c70091W2n = this.A05;
                if (c70091W2n != null && c70091W2n.A00 != null) {
                    c70091W2n.A00 = null;
                }
            } catch (Exception unused2) {
            } catch (Throwable th2) {
                this.A05 = null;
                throw th2;
            }
            this.A05 = null;
            try {
                VKB vkb = this.A06;
                if (vkb != null) {
                    if (!C2I7.A00(vkb.A01, EGL14.EGL_NO_DISPLAY)) {
                        EGL14.eglDestroySurface(vkb.A01, vkb.A02);
                        EGL14.eglDestroyContext(vkb.A01, vkb.A00);
                        EGL14.eglReleaseThread();
                        EGL14.eglTerminate(vkb.A01);
                    }
                    vkb.A03.release();
                    vkb.A01 = EGL14.EGL_NO_DISPLAY;
                    vkb.A00 = EGL14.EGL_NO_CONTEXT;
                    vkb.A02 = EGL14.EGL_NO_SURFACE;
                    vkb.A03 = null;
                }
            } catch (Exception unused3) {
            } catch (Throwable th3) {
                this.A06 = null;
                throw th3;
            }
            this.A06 = null;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        ArrayList arrayList = this.A0Q;
        synchronized (arrayList) {
            this.A09 = true;
            arrayList.notifyAll();
        }
        this.A0N.postAtFrontOfQueue(new RunnableC71221WqC(this));
    }
}
