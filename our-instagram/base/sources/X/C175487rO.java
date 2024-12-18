package X;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;
import android.view.WindowManager;

/* renamed from: X.7rO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C175487rO implements InterfaceC175497rP {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public C176507t8 A05;
    public boolean A06;
    public final C175507rQ A07 = new C175507rQ();
    public final /* synthetic */ C178727wk A08;

    @Override // X.InterfaceC175497rP
    public final void Die(SurfaceTexture surfaceTexture) {
        this.A05 = null;
        C178727wk.A04(this.A08, null);
    }

    @Override // X.InterfaceC175497rP
    public final void Dif(Surface surface) {
        this.A05 = null;
        C178727wk.A04(this.A08, null);
    }

    @Override // X.InterfaceC175497rP
    public final boolean FE6() {
        return true;
    }

    public C175487rO(C178727wk c178727wk) {
        this.A08 = c178727wk;
    }

    public static void A00(C175487rO c175487rO) {
        if (c175487rO.A07.getSurfaceTexture() != null) {
            final C178727wk c178727wk = c175487rO.A08;
            final int i = c175487rO.A03;
            final int i2 = c175487rO.A01;
            final int i3 = c175487rO.A02;
            final int i4 = c175487rO.A04;
            final int i5 = c175487rO.A00;
            final boolean z = c175487rO.A06;
            c178727wk.A0L.post(new Runnable() { // from class: X.7u5
                @Override // java.lang.Runnable
                public final void run() {
                    C178727wk c178727wk2 = C178727wk.this;
                    int i6 = i;
                    int i7 = i2;
                    int i8 = i3;
                    int i9 = i4;
                    int i10 = i5;
                    boolean z2 = z;
                    boolean z3 = c178727wk2.A0I;
                    int i11 = c178727wk2.A00;
                    c178727wk2.A03 = i6;
                    c178727wk2.A02 = i7;
                    c178727wk2.A06 = i8;
                    c178727wk2.A07 = i9;
                    c178727wk2.A01 = i10;
                    c178727wk2.A0J = z2;
                    c178727wk2.A0I = z3;
                    c178727wk2.A00 = i11;
                    C178727wk.A03(c178727wk2);
                }
            });
        }
    }

    @Override // X.InterfaceC175497rP
    public final Object BZG(C176377su c176377su) {
        if (c176377su == InterfaceC176367st.A00) {
            return this.A07.A01;
        }
        if (c176377su == InterfaceC175547rU.A00) {
            return this.A08.A0P;
        }
        return null;
    }

    @Override // X.InterfaceC175497rP
    public final InterfaceC177027ty Bcs() {
        return null;
    }

    @Override // X.InterfaceC175497rP
    public final InterfaceC177027ty BkW() {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
    
        if (r1 == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006d, code lost:
    
        if (r7.A07.A02 != false) goto L30;
     */
    @Override // X.InterfaceC175497rP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.SurfaceTexture C4L(int r8, int r9, int r10, int r11, int r12, int r13, int r14, int r15) {
        /*
            r7 = this;
            r7.A03 = r8
            r7.A01 = r9
            r7.A02 = r13
            r7.A04 = r11
            r7.A00 = r12
            r2 = 1
            r0 = 0
            if (r14 != r2) goto Lf
            r0 = 1
        Lf:
            r7.A06 = r0
            r1 = 7
            if (r15 == r1) goto L15
            r1 = 0
        L15:
            X.7wk r6 = r7.A08
            int r0 = r6.A00
            if (r1 == r0) goto L2f
            r6.A00 = r1
            r0 = 7
            if (r1 == r0) goto L21
            r2 = 0
        L21:
            r6.A0T = r2
            X.7t8 r0 = r7.A05
            if (r0 == 0) goto L2f
            r6.EG3(r0)
            X.7t8 r0 = r7.A05
            X.C178727wk.A04(r6, r0)
        L2f:
            r0 = 1
            java.util.concurrent.CountDownLatch r3 = new java.util.concurrent.CountDownLatch
            r3.<init>(r0)
            boolean r5 = r6.A0Q
            if (r5 == 0) goto L5d
            X.7rQ r4 = r7.A07
            r4.A00()
            X.7st r0 = r4.A01
            r2 = 0
            if (r0 == 0) goto L4a
            boolean r1 = r0.isARCoreEnabled()
            r0 = 1
            if (r1 != 0) goto L4b
        L4a:
            r0 = 0
        L4b:
            r4.A02 = r0
            if (r0 != 0) goto L5d
            java.lang.String r1 = "ar-session"
            java.lang.String r0 = "regular surface used - async"
            X.C0K8.A0C(r1, r0)
            android.graphics.SurfaceTexture r0 = new android.graphics.SurfaceTexture
            r0.<init>(r2)
            r4.A05 = r0
        L5d:
            android.os.Handler r1 = r6.A0L
            X.7u4 r0 = new X.7u4
            r0.<init>()
            r1.post(r0)
            if (r5 == 0) goto L6f
            X.7rQ r0 = r7.A07     // Catch: java.lang.InterruptedException -> L77
            boolean r0 = r0.A02     // Catch: java.lang.InterruptedException -> L77
            if (r0 == 0) goto L87
        L6f:
            r1 = 5
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.InterruptedException -> L77
            r3.await(r1, r0)     // Catch: java.lang.InterruptedException -> L77
            goto L87
        L77:
            r3 = move-exception
            java.lang.String r2 = X.C178727wk.A0V
            java.lang.String r0 = r3.getMessage()
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "Timeout when creating SurfaceNode: %s"
            X.C0K8.A0L(r2, r0, r3, r1)
        L87:
            A00(r7)
            X.7rQ r0 = r7.A07
            android.graphics.SurfaceTexture r0 = r0.getSurfaceTexture()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C175487rO.C4L(int, int, int, int, int, int, int, int):android.graphics.SurfaceTexture");
    }

    @Override // X.InterfaceC175497rP
    public final /* synthetic */ Surface C4M() {
        return null;
    }

    @Override // X.InterfaceC175497rP
    public final /* synthetic */ SurfaceTexture C4N() {
        return null;
    }

    @Override // X.InterfaceC175497rP
    public final InterfaceC176297sm CFN() {
        return this.A08.A0H;
    }

    @Override // X.InterfaceC175497rP
    public final /* synthetic */ InterfaceC177027ty CIg() {
        return null;
    }

    @Override // X.InterfaceC175497rP
    public final void D1a(int i) {
        if (this.A02 != i) {
            this.A02 = i;
            A00(this);
        }
    }

    @Override // X.InterfaceC175497rP
    public final void DA4(final int i) {
        Handler handler = this.A08.A0K;
        if (handler != null) {
            handler.post(new Runnable() { // from class: X.AuH
                @Override // java.lang.Runnable
                public final void run() {
                    C175487rO c175487rO = C175487rO.this;
                    int i2 = i;
                    int i3 = c175487rO.A00;
                    if (i2 != -1) {
                        i3 = ((((i2 + 45) + 360) / 90) % 4) * 90;
                    }
                    int i4 = 0;
                    try {
                        WindowManager windowManager = (WindowManager) ((AbstractC178657wd) c175487rO.A08).A00.getContext().getSystemService("window");
                        if (windowManager != null) {
                            int rotation = windowManager.getDefaultDisplay().getRotation();
                            if (rotation != 1) {
                                if (rotation != 2) {
                                    if (rotation == 3) {
                                        i4 = 270;
                                    }
                                } else {
                                    i4 = 180;
                                }
                            } else {
                                i4 = 90;
                            }
                        }
                    } catch (RuntimeException unused) {
                    }
                    if (c175487rO.A00 != i3 || c175487rO.A02 != i4) {
                        c175487rO.A00 = i3;
                        c175487rO.A02 = i4;
                        C175487rO.A00(c175487rO);
                    }
                }
            });
        }
    }

    @Override // X.InterfaceC175497rP
    public final void Dib(int i, int i2) {
        final C178727wk c178727wk = this.A08;
        c178727wk.A05 = i;
        c178727wk.A04 = i2;
        c178727wk.A0L.post(new Runnable() { // from class: X.7tK
            @Override // java.lang.Runnable
            public final void run() {
                C178727wk.A03(C178727wk.this);
            }
        });
    }

    @Override // X.InterfaceC175497rP
    public final void Dic(SurfaceTexture surfaceTexture, int i, int i2) {
        C176507t8 c176507t8 = this.A05;
        if (c176507t8 == null || (surfaceTexture != null && c176507t8.A0B != surfaceTexture)) {
            C176507t8 c176507t82 = new C176507t8(surfaceTexture, false);
            this.A05 = c176507t82;
            C178727wk.A04(this.A08, c176507t82);
        }
        final C178727wk c178727wk = this.A08;
        c178727wk.A05 = i;
        c178727wk.A04 = i2;
        c178727wk.A0L.post(new Runnable() { // from class: X.7uR
            @Override // java.lang.Runnable
            public final void run() {
                C178727wk.A03(C178727wk.this);
            }
        });
    }

    @Override // X.InterfaceC175497rP
    public final void Did(Surface surface, int i, int i2) {
        if (surface != null) {
            C176507t8 c176507t8 = this.A05;
            if (c176507t8 == null || c176507t8.A00() != surface) {
                C176507t8 c176507t82 = new C176507t8(surface, false);
                this.A05 = c176507t82;
                C178727wk.A04(this.A08, c176507t82);
            }
            final C178727wk c178727wk = this.A08;
            c178727wk.A05 = i;
            c178727wk.A04 = i2;
            c178727wk.A0L.post(new Runnable() { // from class: X.7tC
                @Override // java.lang.Runnable
                public final void run() {
                    C178727wk.A03(C178727wk.this);
                }
            });
        }
    }

    @Override // X.InterfaceC175497rP
    public final void EES(SurfaceTexture surfaceTexture) {
        this.A07.A00();
        A00(this);
    }

    @Override // X.InterfaceC175497rP
    public final void EbO(boolean z) {
        C176507t8 c176507t8 = this.A05;
        if (c176507t8 != null) {
            c176507t8.A0D = z;
        }
    }
}
