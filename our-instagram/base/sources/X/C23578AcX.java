package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.WindowManager;
import com.instagram.common.session.UserSession;

/* renamed from: X.AcX, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23578AcX implements YOj, InterfaceC73604YNj, SurfaceTexture.OnFrameAvailableListener {
    public SurfaceTexture A00;
    public SurfaceTexture A01;
    public int A02;
    public int A03;
    public final C23331AWa A04;
    public final InterfaceC176367st A05;
    public final Object A06 = new Object();
    public final WindowManager A07;
    public final AbstractC224239v7 A08;
    public final C23454AaR A09;
    public final UserSession A0A;
    public final boolean A0B;
    public volatile boolean A0C;
    public volatile boolean A0D;

    public static void A00(C23578AcX c23578AcX) {
        synchronized (c23578AcX.A06) {
            C23454AaR c23454AaR = c23578AcX.A09;
            if (c23454AaR != null) {
                c23454AaR.A03 = null;
                C23454AaR.A00(c23454AaR);
            }
            SurfaceTexture surfaceTexture = c23578AcX.A01;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                c23578AcX.A01 = null;
            }
            c23578AcX.A00 = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
    
        if (r1 == 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long A01() {
        /*
            r6 = this;
            java.lang.Object r5 = r6.A06
            monitor-enter(r5)
            X.7st r1 = r6.A05     // Catch: java.lang.Throwable -> L30
            boolean r0 = r6.A0C     // Catch: java.lang.Throwable -> L30
            r3 = 0
            if (r0 == 0) goto Le
            if (r1 == 0) goto Le
            goto L11
        Le:
            r1 = 0
            goto L19
        L11:
            long r1 = r1.getFrameTimestamp()     // Catch: java.lang.Throwable -> L30
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L28
        L19:
            boolean r0 = r6.A0C     // Catch: java.lang.Throwable -> L30
            if (r0 == 0) goto L20
            android.graphics.SurfaceTexture r0 = r6.A00     // Catch: java.lang.Throwable -> L30
            goto L22
        L20:
            android.graphics.SurfaceTexture r0 = r6.A01     // Catch: java.lang.Throwable -> L30
        L22:
            if (r0 == 0) goto L28
            long r1 = r0.getTimestamp()     // Catch: java.lang.Throwable -> L30
        L28:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L30
            X.9v7 r0 = r6.A08
            long r0 = r0.A00(r1)
            return r0
        L30:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L30
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23578AcX.A01():long");
    }

    public final void A02(AnonymousClass810 anonymousClass810) {
        Object obj = this.A06;
        synchronized (obj) {
            if (this.A0B && !this.A0C) {
                SurfaceTexture surfaceTexture = this.A01;
                if (surfaceTexture != null) {
                    surfaceTexture.detachFromGLContext();
                    surfaceTexture.attachToGLContext(anonymousClass810.A00);
                    surfaceTexture.setOnFrameAvailableListener(this, this.A04.A0D);
                }
            } else {
                SurfaceTexture surfaceTexture2 = this.A01;
                if (surfaceTexture2 != null) {
                    surfaceTexture2.release();
                    this.A01 = null;
                }
                this.A00 = null;
                InterfaceC176367st interfaceC176367st = this.A05;
                if (this.A0C && interfaceC176367st != null) {
                    this.A00 = interfaceC176367st.getArSurfaceTexture(anonymousClass810.A00, this);
                } else {
                    SurfaceTexture surfaceTexture3 = new SurfaceTexture(anonymousClass810.A00);
                    this.A01 = surfaceTexture3;
                    surfaceTexture3.setOnFrameAvailableListener(this);
                    this.A0D = false;
                }
            }
            C23454AaR c23454AaR = this.A09;
            if (c23454AaR != null) {
                c23454AaR.A03 = this;
                C23454AaR.A00(c23454AaR);
            }
            obj.notifyAll();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.7oL, java.lang.Object] */
    @Override // X.YOk
    public final C173687oL BHz() {
        Integer num;
        if (this.A02 == 1) {
            num = C05F.A00;
        } else {
            num = C05F.A01;
        }
        ?? obj = new Object();
        obj.A00 = num;
        return obj;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.7oM, java.lang.Object] */
    @Override // X.YOk
    public final C173697oM BI4() {
        int rotation = this.A07.getDefaultDisplay().getRotation();
        int i = this.A03;
        ?? obj = new Object();
        obj.A00 = rotation;
        obj.A01 = i;
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
    
        if (r6.isARCoreEnabled() == false) goto L6;
     */
    @Override // X.YOj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.SurfaceTexture BI7() {
        /*
            r7 = this;
            boolean r2 = r7.A0C
            X.7st r6 = r7.A05
            r5 = 1
            r4 = 0
            if (r6 == 0) goto Lf
            boolean r1 = r6.isARCoreEnabled()
            r0 = 1
            if (r1 != 0) goto L10
        Lf:
            r0 = 0
        L10:
            if (r2 == r0) goto L1b
            A00(r7)
            X.AWa r1 = r7.A04
            r0 = 0
            r1.A00(r0)
        L1b:
            java.lang.Object r3 = r7.A06
            monitor-enter(r3)
            X.AWa r0 = r7.A04     // Catch: java.lang.Throwable -> L71
            r0.A00(r7)     // Catch: java.lang.Throwable -> L71
            android.graphics.SurfaceTexture r2 = r7.A01     // Catch: java.lang.Throwable -> L71
            if (r2 == 0) goto L2d
            boolean r0 = r7.A0D     // Catch: java.lang.Throwable -> L71
            if (r0 != 0) goto L2d
        L2b:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L71
            goto L70
        L2d:
            if (r6 == 0) goto L30
            goto L32
        L30:
            r5 = 0
            goto L38
        L32:
            boolean r0 = r6.isARCoreEnabled()     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L30
        L38:
            r7.A0C = r5     // Catch: java.lang.Throwable -> L71
            boolean r0 = r7.A0B     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L4f
            boolean r0 = r7.A0C     // Catch: java.lang.Throwable -> L71
            if (r0 != 0) goto L4f
            A00(r7)     // Catch: java.lang.Throwable -> L71
            android.graphics.SurfaceTexture r2 = new android.graphics.SurfaceTexture     // Catch: java.lang.Throwable -> L71
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L71
            r7.A01 = r2     // Catch: java.lang.Throwable -> L71
            r7.A0D = r4     // Catch: java.lang.Throwable -> L71
            goto L2b
        L4f:
            r0 = 2000(0x7d0, double:9.88E-321)
            r3.wait(r0)     // Catch: java.lang.InterruptedException -> L55 java.lang.Throwable -> L71
            goto L5d
        L55:
            r2 = move-exception
            java.lang.String r1 = "IgCameraVideoInputV2"
            java.lang.String r0 = "Wait for SurfaceTexture was interrupted"
            X.C0K8.A0F(r1, r0, r2)     // Catch: java.lang.Throwable -> L71
        L5d:
            boolean r0 = r7.A0C     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L64
            android.graphics.SurfaceTexture r2 = r7.A00     // Catch: java.lang.Throwable -> L71
            goto L66
        L64:
            android.graphics.SurfaceTexture r2 = r7.A01     // Catch: java.lang.Throwable -> L71
        L66:
            if (r2 != 0) goto L2b
            java.lang.String r1 = "IgCameraVideoInputV2"
            java.lang.String r0 = "MP: Failed SurfaceTexture creation for camera preview"
            X.AbstractC12120kG.A01(r1, r0)     // Catch: java.lang.Throwable -> L71
            goto L2b
        L70:
            return r2
        L71:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L71
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23578AcX.BI7():android.graphics.SurfaceTexture");
    }

    @Override // X.YOj
    public final InterfaceC199678sJ CFC() {
        return this.A04;
    }

    @Override // X.InterfaceC73604YNj
    public final void CxA(SurfaceTexture surfaceTexture) {
        C23331AWa c23331AWa = this.A04;
        InterfaceC197808or interfaceC197808or = c23331AWa.A0H;
        if (interfaceC197808or != null) {
            interfaceC197808or.CtB(c23331AWa);
        }
    }

    @Override // X.YOj
    public final void EQt(int i, int i2) {
        C23331AWa c23331AWa = this.A04;
        c23331AWa.A0G = new C197738ok(i2, i, i, i2, 0, 0);
        AnonymousClass810 anonymousClass810 = c23331AWa.A02;
        if (anonymousClass810 != null) {
            anonymousClass810.A00(c23331AWa.A0G.A02, c23331AWa.A0G.A01);
        }
    }

    @Override // X.YOj
    public final void onCameraClosed() {
        this.A04.A00(null);
        synchronized (this.A06) {
            this.A0D = true;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        C23331AWa c23331AWa = this.A04;
        InterfaceC197808or interfaceC197808or = c23331AWa.A0H;
        if (interfaceC197808or != null) {
            interfaceC197808or.CtB(c23331AWa);
        }
    }

    public C23578AcX(Context context, WindowManager windowManager, AbstractC224239v7 abstractC224239v7, C23454AaR c23454AaR, InterfaceC176367st interfaceC176367st, UserSession userSession, boolean z) {
        this.A05 = interfaceC176367st;
        this.A09 = c23454AaR;
        this.A07 = windowManager;
        this.A08 = abstractC224239v7;
        this.A0B = z;
        this.A0A = userSession;
        AbstractC177217uH.A02 = AbstractC167007dF.A1W(c23454AaR);
        this.A04 = new C23331AWa(context, EnumC197748ol.DISABLE, C197578oU.A01, EnumC197888oz.A02);
    }

    @Override // X.YOj
    public final void EQq(int i) {
        this.A02 = i;
    }

    @Override // X.YOj
    public final void Edg(int i) {
        this.A03 = i;
    }
}
