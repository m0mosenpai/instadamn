package com.google.android.exoplayer2.video;

import X.U9I;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;

/* loaded from: classes11.dex */
public final class DummySurface extends Surface {
    public static int A02;
    public static boolean A03;
    public boolean A00;
    public final U9I A01;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0008, code lost:
    
        if (A01() != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.exoplayer2.video.DummySurface A00(boolean r5) {
        /*
            r4 = 0
            if (r5 == 0) goto La
            boolean r1 = A01()
            r0 = 0
            if (r1 == 0) goto Lb
        La:
            r0 = 1
        Lb:
            X.C4B8.A04(r0)
            X.U9I r3 = new X.U9I
            r3.<init>()
            if (r5 == 0) goto L17
            int r4 = com.google.android.exoplayer2.video.DummySurface.A02
        L17:
            r3.start()
            android.os.Looper r0 = r3.getLooper()
            android.os.Handler r1 = new android.os.Handler
            r1.<init>(r0, r3)
            r3.A00 = r1
            X.Wxr r0 = new X.Wxr
            r0.<init>(r1)
            r3.A01 = r0
            monitor-enter(r3)
            android.os.Handler r2 = r3.A00     // Catch: java.lang.Throwable -> L5e
            r0 = 1
            r1 = 0
            android.os.Message r0 = r2.obtainMessage(r0, r4, r1)     // Catch: java.lang.Throwable -> L5e
            r0.sendToTarget()     // Catch: java.lang.Throwable -> L5e
        L38:
            com.google.android.exoplayer2.video.DummySurface r0 = r3.A02     // Catch: java.lang.Throwable -> L5e
            if (r0 != 0) goto L4a
            java.lang.RuntimeException r0 = r3.A04     // Catch: java.lang.Throwable -> L5e
            if (r0 != 0) goto L4a
            java.lang.Error r0 = r3.A03     // Catch: java.lang.Throwable -> L5e
            if (r0 != 0) goto L4a
            r3.wait()     // Catch: java.lang.InterruptedException -> L48 java.lang.Throwable -> L5e
            goto L38
        L48:
            r1 = 1
            goto L38
        L4a:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L5e
            if (r1 == 0) goto L50
            X.AbstractC58318PtA.A18()
        L50:
            java.lang.RuntimeException r0 = r3.A04
            if (r0 != 0) goto L60
            java.lang.Error r0 = r3.A03
            if (r0 != 0) goto L60
            com.google.android.exoplayer2.video.DummySurface r0 = r3.A02
            r0.getClass()
            return r0
        L5e:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L5e
        L60:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.video.DummySurface.A00(boolean):com.google.android.exoplayer2.video.DummySurface");
    }

    public static synchronized boolean A01() {
        boolean z;
        synchronized (DummySurface.class) {
            z = true;
            if (!A03) {
                int i = 0;
                String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                if (eglQueryString != null && eglQueryString.contains("EGL_EXT_protected_content")) {
                    i = 2;
                    if (eglQueryString.contains("EGL_KHR_surfaceless_context")) {
                        i = 1;
                    }
                }
                A02 = i;
                A03 = true;
            }
            if (A02 == 0) {
                z = false;
            }
        }
        return z;
    }

    public DummySurface(SurfaceTexture surfaceTexture, U9I u9i) {
        super(surfaceTexture);
        this.A01 = u9i;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        U9I u9i = this.A01;
        synchronized (u9i) {
            if (!this.A00) {
                u9i.A00.getClass();
                u9i.A00.sendEmptyMessage(2);
                this.A00 = true;
            }
        }
    }
}
