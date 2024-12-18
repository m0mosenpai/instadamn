package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.EGL14;
import android.view.Surface;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;

/* loaded from: classes11.dex */
public final class WZE implements InterfaceC72002XEq {
    public final U7W A00;
    public final /* synthetic */ C68923VeN A01;

    public WZE(Context context, Surface surface, MYB myb, WDI wdi, MediaComposition mediaComposition, XD9 xd9, C68923VeN c68923VeN, ACM acm, VN4 vn4, U7W u7w) {
        this.A01 = c68923VeN;
        this.A00 = u7w;
        if (c68923VeN.A00 == null) {
            InterfaceC72007XEv ALV = xd9.ALV(context, EGL14.EGL_NO_CONTEXT, EGL14.EGL_NO_DISPLAY, EGL14.EGL_NO_SURFACE, null, null, myb, wdi, mediaComposition, u7w, C05F.A00);
            c68923VeN.A00 = ALV;
            if (acm != null) {
                C14360o3.A0B(ALV, 0);
                synchronized (acm.A02) {
                    acm.A00 = ALV;
                }
            }
            c68923VeN.A00.CNZ();
        }
        InterfaceC72007XEv interfaceC72007XEv = c68923VeN.A00;
        interfaceC72007XEv.getClass();
        interfaceC72007XEv.EaP(surface, vn4, 0);
    }

    @Override // X.InterfaceC72002XEq
    public final void A8L(MediaEffect mediaEffect, int i) {
        InterfaceC72007XEv interfaceC72007XEv = this.A01.A00;
        interfaceC72007XEv.getClass();
        interfaceC72007XEv.A8L(mediaEffect, i);
    }

    @Override // X.InterfaceC72002XEq
    public final void AAf(int i) {
        InterfaceC72007XEv interfaceC72007XEv = this.A01.A00;
        interfaceC72007XEv.getClass();
        interfaceC72007XEv.AAf(i);
    }

    @Override // X.InterfaceC72002XEq
    public final void APt(long j) {
        AbstractC1808580n.A03("TranscodeOutputSurfaceForJBMMR2.displayFrame()");
        InterfaceC72007XEv interfaceC72007XEv = this.A01.A00;
        interfaceC72007XEv.getClass();
        interfaceC72007XEv.APs(0, j);
        AbstractC1808580n.A01();
    }

    @Override // X.InterfaceC72002XEq
    public final void AQh(long j) {
        InterfaceC72007XEv interfaceC72007XEv = this.A01.A00;
        interfaceC72007XEv.getClass();
        interfaceC72007XEv.AQh(j);
    }

    @Override // X.InterfaceC72002XEq
    public final void EFF(MediaEffect mediaEffect, int i) {
        InterfaceC72007XEv interfaceC72007XEv = this.A01.A00;
        if (interfaceC72007XEv != null) {
            interfaceC72007XEv.EFF(mediaEffect, i);
        }
    }

    @Override // X.InterfaceC72002XEq
    public final Bitmap ELb() {
        InterfaceC72007XEv interfaceC72007XEv = this.A01.A00;
        interfaceC72007XEv.getClass();
        return interfaceC72007XEv.ELi(0);
    }

    @Override // X.InterfaceC72002XEq
    public final void EOF(InterfaceC179247xa interfaceC179247xa) {
        InterfaceC72007XEv interfaceC72007XEv = this.A01.A00;
        if (interfaceC72007XEv instanceof InterfaceC179117xN) {
            ((InterfaceC179117xN) interfaceC72007XEv).E6H(interfaceC179247xa);
        }
    }

    @Override // X.InterfaceC72002XEq
    public final void EOG(InterfaceC179247xa interfaceC179247xa, InterfaceC179577y7 interfaceC179577y7) {
        InterfaceC72007XEv interfaceC72007XEv = this.A01.A00;
        if (interfaceC72007XEv instanceof InterfaceC179117xN) {
            ((InterfaceC179117xN) interfaceC72007XEv).E6I(interfaceC179247xa, interfaceC179577y7);
        }
    }

    @Override // X.InterfaceC72002XEq
    public final void EZt(InterfaceC25162BBi interfaceC25162BBi) {
        InterfaceC72007XEv interfaceC72007XEv = this.A01.A00;
        if (interfaceC72007XEv != null) {
            interfaceC72007XEv.EZt(interfaceC25162BBi);
        }
    }

    @Override // X.InterfaceC72002XEq
    public final void FAu(Surface surface) {
        InterfaceC72007XEv interfaceC72007XEv = this.A01.A00;
        interfaceC72007XEv.getClass();
        interfaceC72007XEv.EaP(surface, null, 0);
    }

    @Override // X.InterfaceC72002XEq
    public final void FDx() {
        this.A01.A00.getClass();
    }

    @Override // X.InterfaceC72002XEq
    public final void cancel() {
        InterfaceC72007XEv interfaceC72007XEv = this.A01.A00;
        if (interfaceC72007XEv != null) {
            interfaceC72007XEv.cancel();
        }
    }

    @Override // X.InterfaceC72002XEq
    public final void flush() {
        InterfaceC72007XEv interfaceC72007XEv = this.A01.A00;
        interfaceC72007XEv.getClass();
        interfaceC72007XEv.flush();
    }

    @Override // X.InterfaceC72002XEq
    public final void release() {
        C68923VeN c68923VeN = this.A01;
        InterfaceC72007XEv interfaceC72007XEv = c68923VeN.A00;
        if (interfaceC72007XEv != null) {
            interfaceC72007XEv.release();
        }
        c68923VeN.A00 = null;
    }
}
