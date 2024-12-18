package X;

import android.graphics.SurfaceTexture;
import android.opengl.Matrix;
import android.view.Surface;

/* renamed from: X.7t8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C176507t8 {
    public final boolean A00;
    public final boolean A01;
    public volatile float A02;
    public volatile int A03;
    public volatile int A04;
    public volatile int A05;
    public volatile int A06;
    public volatile int A07;
    public volatile int A08;
    public volatile int A09;
    public volatile int A0A;
    public volatile SurfaceTexture A0B;
    public volatile Integer A0C;
    public volatile boolean A0D;
    public volatile boolean A0E;
    public volatile boolean A0F;
    public volatile int A0G;
    public volatile Surface A0H;

    public C176507t8(SurfaceTexture surfaceTexture, boolean z) {
        Integer num;
        this.A07 = 0;
        this.A0B = surfaceTexture;
        this.A01 = z;
        this.A00 = true;
        this.A0D = true;
        this.A0E = false;
        this.A0F = false;
        if (surfaceTexture != null) {
            num = Integer.valueOf(surfaceTexture.hashCode());
        } else {
            num = null;
        }
        this.A0C = num;
    }

    public final synchronized Surface A00() {
        SurfaceTexture surfaceTexture = this.A0B;
        if (this.A0H == null && surfaceTexture != null) {
            this.A0H = new Surface(surfaceTexture);
        }
        return this.A0H;
    }

    public final synchronized void A01() {
        Surface surface = this.A0H;
        if (surface != null && this.A00) {
            surface.release();
            this.A0H = null;
        }
        SurfaceTexture surfaceTexture = this.A0B;
        if (surfaceTexture != null && this.A01) {
            surfaceTexture.release();
            this.A0B = null;
        }
        this.A0C = null;
        this.A04 = 0;
        this.A03 = 0;
        this.A0A = 0;
        this.A05 = 0;
        this.A0F = false;
    }

    public final synchronized void A02(int i, int i2, int i3, boolean z) {
        SurfaceTexture surfaceTexture = this.A0B;
        if (surfaceTexture != null && (this.A04 != i || this.A03 != i2 || this.A0G != i3)) {
            surfaceTexture.setDefaultBufferSize(i, i2);
            this.A04 = i;
            this.A03 = i2;
            this.A0G = i3;
            boolean z2 = false;
            int i4 = i;
            if (i3 % 180 != 0) {
                z2 = true;
                i4 = i2;
            }
            this.A0A = i4;
            if (!z2) {
                i = i2;
            }
            this.A05 = i;
            this.A0F = z;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000b, code lost:
    
        if (r1.A0B != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean A04() {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.A0D     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto Lf
            android.view.Surface r0 = r1.A0H     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto Ld
            android.graphics.SurfaceTexture r0 = r1.A0B     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto Lf
        Ld:
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            monitor-exit(r1)
            return r0
        L12:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C176507t8.A04():boolean");
    }

    public final void A03(float[] fArr) {
        if (this.A02 != 0.0f) {
            Matrix.translateM(fArr, 0, 0.5f, 0.5f, 0.0f);
            Matrix.rotateM(fArr, 0, this.A02, 0.0f, 0.0f, -1.0f);
            Matrix.translateM(fArr, 0, -0.5f, -0.5f, 0.0f);
        }
    }

    public C176507t8(Surface surface, boolean z) {
        this.A07 = 0;
        this.A0H = surface;
        this.A01 = false;
        this.A00 = z;
        this.A0D = true;
        this.A0E = false;
        this.A0F = false;
        this.A0C = Integer.valueOf(surface.hashCode());
    }
}
