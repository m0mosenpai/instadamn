package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.instagram.common.session.UserSession;

/* renamed from: X.YBq, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73404YBq implements InterfaceC175497rP {
    public SurfaceTexture A00;
    public final InterfaceC175547rU A01;
    public final InterfaceC176367st A02;
    public final YEP A03;
    public final UserSession A04;

    @Override // X.InterfaceC175497rP
    public final synchronized SurfaceTexture C4N() {
        return this.A00;
    }

    @Override // X.InterfaceC175497rP
    public final synchronized InterfaceC176297sm CFN() {
        return null;
    }

    @Override // X.InterfaceC175497rP
    public final /* synthetic */ void D1a(int i) {
    }

    @Override // X.InterfaceC175497rP
    public final /* synthetic */ void DA4(int i) {
    }

    @Override // X.InterfaceC175497rP
    public final synchronized void Dib(int i, int i2) {
        YEP yep = this.A03;
        if (yep.A04 != i || yep.A03 != i2) {
            yep.A09 = true;
        }
        yep.A04 = i;
        yep.A03 = i2;
        YEP.A01(yep);
    }

    @Override // X.InterfaceC175497rP
    public final synchronized void Dic(SurfaceTexture surfaceTexture, int i, int i2) {
        this.A00 = surfaceTexture;
        YEP yep = this.A03;
        yep.A05 = surfaceTexture;
        yep.A04 = i;
        yep.A03 = i2;
        YEP.A01(yep);
    }

    @Override // X.InterfaceC175497rP
    public final /* synthetic */ void Did(Surface surface, int i, int i2) {
    }

    @Override // X.InterfaceC175497rP
    public final synchronized void Die(SurfaceTexture surfaceTexture) {
        this.A00 = null;
        YEP yep = this.A03;
        synchronized (yep) {
            if (yep.A05 == surfaceTexture) {
                C197938p4 c197938p4 = yep.A0E.A00;
                if (c197938p4 != null && c197938p4.A03 != null) {
                    InterfaceC197958p6 interfaceC197958p6 = c197938p4.A04;
                    if (interfaceC197958p6 != null) {
                        interfaceC197958p6.EpZ(c197938p4);
                    }
                    c197938p4.A03 = null;
                }
                yep.A05 = null;
            }
        }
    }

    @Override // X.InterfaceC175497rP
    public final /* synthetic */ void Dif(Surface surface) {
    }

    @Override // X.InterfaceC175497rP
    public final synchronized void EES(SurfaceTexture surfaceTexture) {
        if (surfaceTexture != null) {
            this.A03.A02();
        }
    }

    @Override // X.InterfaceC175497rP
    public final /* synthetic */ void EbO(boolean z) {
    }

    @Override // X.InterfaceC175497rP
    public final boolean FE6() {
        return true;
    }

    @Override // X.InterfaceC175497rP
    public final Object BZG(C176377su c176377su) {
        if (c176377su == InterfaceC176367st.A00) {
            return this.A02;
        }
        if (c176377su == InterfaceC175547rU.A00) {
            return this.A01;
        }
        return null;
    }

    public C73404YBq(InterfaceC175547rU interfaceC175547rU, InterfaceC176367st interfaceC176367st, YEP yep, UserSession userSession) {
        this.A02 = interfaceC176367st;
        this.A03 = yep;
        this.A01 = interfaceC175547rU;
        this.A04 = userSession;
    }

    @Override // X.InterfaceC175497rP
    public final /* synthetic */ InterfaceC177027ty Bcs() {
        return null;
    }

    @Override // X.InterfaceC175497rP
    public final /* synthetic */ InterfaceC177027ty BkW() {
        return null;
    }

    @Override // X.InterfaceC175497rP
    public final /* synthetic */ Surface C4M() {
        return null;
    }

    @Override // X.InterfaceC175497rP
    public final InterfaceC177027ty CIg() {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0024, code lost:
    
        if (r1.A0H == false) goto L16;
     */
    @Override // X.InterfaceC175497rP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized android.graphics.SurfaceTexture C4L(int r7, int r8, int r9, int r10, int r11, int r12, int r13, int r14) {
        /*
            r6 = this;
            monitor-enter(r6)
            X.YEP r2 = r6.A03     // Catch: java.lang.Throwable -> L8e
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L8e
            r5 = 1
            if (r7 == 0) goto L38
            if (r8 == 0) goto L38
            X.7qC r1 = r2.A0C     // Catch: java.lang.Throwable -> L8b
            boolean r0 = r1 instanceof X.C174757qB     // Catch: java.lang.Throwable -> L8b
            if (r0 == 0) goto L32
            X.7qB r1 = (X.C174757qB) r1     // Catch: java.lang.Throwable -> L8b
            X.7yZ r0 = X.C174757qB.A02(r1)     // Catch: java.lang.Throwable -> L8b
            com.facebook.onecamera.outputcontrollers.camera.basic.BasicCameraOutputController r0 = (com.facebook.onecamera.outputcontrollers.camera.basic.BasicCameraOutputController) r0     // Catch: java.lang.Throwable -> L8b
            X.7qa r1 = r0.A04     // Catch: java.lang.Throwable -> L8b
            if (r1 == 0) goto L26
            boolean r0 = r1.A0G()     // Catch: java.lang.Throwable -> L8b
            if (r0 == 0) goto L26
            boolean r1 = r1.A0H     // Catch: java.lang.Throwable -> L8b
            r0 = 1
            if (r1 != 0) goto L27
        L26:
            r0 = 0
        L27:
            if (r0 == 0) goto L32
            int r0 = r10 % 180
            if (r0 != 0) goto L32
            r2.A01 = r8     // Catch: java.lang.Throwable -> L8b
            r2.A00 = r7     // Catch: java.lang.Throwable -> L8b
            goto L36
        L32:
            r2.A01 = r7     // Catch: java.lang.Throwable -> L8b
            r2.A00 = r8     // Catch: java.lang.Throwable -> L8b
        L36:
            r3 = 1
            goto L39
        L38:
            r3 = 0
        L39:
            r0 = -1
            if (r9 == r0) goto L3d
            goto L3f
        L3d:
            r5 = 0
            goto L41
        L3f:
            r2.A02 = r9     // Catch: java.lang.Throwable -> L8b
        L41:
            X.YEP.A01(r2)     // Catch: java.lang.Throwable -> L8b
            boolean r1 = r2.A0O     // Catch: java.lang.Throwable -> L8b
            java.lang.String r0 = "SurfaceTexture must be present with non-zero size!"
            X.C18C.A0H(r1, r0)     // Catch: java.lang.Throwable -> L8b
            X.YOj r0 = r2.A0D     // Catch: java.lang.Throwable -> L8b
            r0.Edg(r10)     // Catch: java.lang.Throwable -> L8b
            r0.EQq(r13)     // Catch: java.lang.Throwable -> L8b
            if (r3 == 0) goto L71
            X.XoT r4 = r2.A0E     // Catch: java.lang.Throwable -> L8b
            int r1 = r2.A01     // Catch: java.lang.Throwable -> L8b
            int r0 = r2.A00     // Catch: java.lang.Throwable -> L8b
            X.YOj r3 = r4.A04     // Catch: java.lang.Throwable -> L8b
            r3.EQt(r1, r0)     // Catch: java.lang.Throwable -> L8b
            java.lang.ref.WeakReference r0 = r4.A05     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r1 = r0.get()     // Catch: java.lang.Throwable -> L8b
            X.Y2I r1 = (X.Y2I) r1     // Catch: java.lang.Throwable -> L8b
            if (r1 == 0) goto L71
            X.8sJ r0 = r3.CFC()     // Catch: java.lang.Throwable -> L8b
            r1.A03(r0, r3)     // Catch: java.lang.Throwable -> L8b
        L71:
            if (r5 == 0) goto L80
            X.A9l r0 = r2.A0F     // Catch: java.lang.Throwable -> L8b
            X.ABl r1 = r0.A04     // Catch: java.lang.Throwable -> L8b
            int r0 = r1.A00     // Catch: java.lang.Throwable -> L8b
            if (r9 == r0) goto L7d
            r1.A00 = r9     // Catch: java.lang.Throwable -> L8b
        L7d:
            r1.A00()     // Catch: java.lang.Throwable -> L8b
        L80:
            X.XoT r0 = r2.A0E     // Catch: java.lang.Throwable -> L8b
            X.YOj r0 = r0.A04     // Catch: java.lang.Throwable -> L8b
            android.graphics.SurfaceTexture r0 = r0.BI7()     // Catch: java.lang.Throwable -> L8b
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L8e
            monitor-exit(r6)
            return r0
        L8b:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L8e
            throw r0     // Catch: java.lang.Throwable -> L8e
        L8e:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73404YBq.C4L(int, int, int, int, int, int, int, int):android.graphics.SurfaceTexture");
    }
}
