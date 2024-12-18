package X;

import android.graphics.Bitmap;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.view.Surface;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;

/* loaded from: classes11.dex */
public final class U7Z implements InterfaceC72002XEq {
    public EGLContext A00;
    public EGLDisplay A01;
    public EGLSurface A02;
    public C178927x4 A03;
    public final Surface A04;
    public final C179877yd A05;
    public final U7W A06;
    public final /* synthetic */ C68923VeN A07;

    @Override // X.InterfaceC72002XEq
    public final void A8L(MediaEffect mediaEffect, int i) {
        InterfaceC72007XEv interfaceC72007XEv = this.A07.A00;
        interfaceC72007XEv.getClass();
        interfaceC72007XEv.A8L(mediaEffect, i);
    }

    @Override // X.InterfaceC72002XEq
    public final void AAf(int i) {
        InterfaceC72007XEv interfaceC72007XEv = this.A07.A00;
        interfaceC72007XEv.getClass();
        interfaceC72007XEv.AAf(i);
    }

    @Override // X.InterfaceC72002XEq
    public final void APt(long j) {
        AbstractC1808580n.A03("TranscodeOutputSurfaceForJBMMR2.displayFrame()");
        InterfaceC72007XEv interfaceC72007XEv = this.A07.A00;
        interfaceC72007XEv.getClass();
        interfaceC72007XEv.APs(0, j);
        AbstractC1808580n.A01();
    }

    @Override // X.InterfaceC72002XEq
    public final void AQh(long j) {
        InterfaceC72007XEv interfaceC72007XEv = this.A07.A00;
        interfaceC72007XEv.getClass();
        interfaceC72007XEv.AQh(j);
    }

    @Override // X.InterfaceC72002XEq
    public final void EFF(MediaEffect mediaEffect, int i) {
        InterfaceC72007XEv interfaceC72007XEv = this.A07.A00;
        if (interfaceC72007XEv != null) {
            interfaceC72007XEv.EFF(mediaEffect, i);
        }
    }

    @Override // X.InterfaceC72002XEq
    public final Bitmap ELb() {
        InterfaceC72007XEv interfaceC72007XEv = this.A07.A00;
        interfaceC72007XEv.getClass();
        return interfaceC72007XEv.ELi(0);
    }

    @Override // X.InterfaceC72002XEq
    public final void EOF(InterfaceC179247xa interfaceC179247xa) {
        InterfaceC72007XEv interfaceC72007XEv = this.A07.A00;
        if (interfaceC72007XEv instanceof InterfaceC179117xN) {
            ((InterfaceC179117xN) interfaceC72007XEv).E6H(interfaceC179247xa);
        }
    }

    @Override // X.InterfaceC72002XEq
    public final void EOG(InterfaceC179247xa interfaceC179247xa, InterfaceC179577y7 interfaceC179577y7) {
        InterfaceC72007XEv interfaceC72007XEv = this.A07.A00;
        if (interfaceC72007XEv instanceof InterfaceC179117xN) {
            ((InterfaceC179117xN) interfaceC72007XEv).E6I(interfaceC179247xa, interfaceC179577y7);
        }
    }

    @Override // X.InterfaceC72002XEq
    public final void EZt(InterfaceC25162BBi interfaceC25162BBi) {
        InterfaceC72007XEv interfaceC72007XEv = this.A07.A00;
        if (interfaceC72007XEv != null) {
            interfaceC72007XEv.EZt(interfaceC25162BBi);
        }
    }

    @Override // X.InterfaceC72002XEq
    public final void FAu(Surface surface) {
        InterfaceC72007XEv interfaceC72007XEv = this.A07.A00;
        interfaceC72007XEv.getClass();
        interfaceC72007XEv.EaP(surface, null, 0);
    }

    @Override // X.InterfaceC72002XEq
    public final void FDx() {
        this.A07.A00.getClass();
    }

    @Override // X.InterfaceC72002XEq
    public final void cancel() {
        InterfaceC72007XEv interfaceC72007XEv = this.A07.A00;
        if (interfaceC72007XEv != null) {
            interfaceC72007XEv.cancel();
        }
    }

    @Override // X.InterfaceC72002XEq
    public final void flush() {
        InterfaceC72007XEv interfaceC72007XEv = this.A07.A00;
        interfaceC72007XEv.getClass();
        interfaceC72007XEv.flush();
    }

    @Override // X.InterfaceC72002XEq
    public final void release() {
        EGLSurface eGLSurface;
        C68923VeN c68923VeN = this.A07;
        C178927x4 c178927x4 = this.A03;
        if (c178927x4 != null) {
            c178927x4.release();
        }
        if (this.A00 != null) {
            if (EGL14.eglGetCurrentContext().equals(this.A00)) {
                EGLDisplay eGLDisplay = this.A01;
                EGLSurface eGLSurface2 = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface2, eGLSurface2, EGL14.EGL_NO_CONTEXT);
            }
            EGL14.eglDestroyContext(this.A01, this.A00);
        }
        EGLDisplay eGLDisplay2 = this.A01;
        if (eGLDisplay2 != null && (eGLSurface = this.A02) != null) {
            EGL14.eglDestroySurface(eGLDisplay2, eGLSurface);
        }
        InterfaceC72007XEv interfaceC72007XEv = c68923VeN.A00;
        if (interfaceC72007XEv != null) {
            interfaceC72007XEv.release();
        }
        this.A01 = null;
        this.A03 = null;
        this.A00 = null;
        this.A02 = null;
        c68923VeN.A00 = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0064, code lost:
    
        if (r39.A06.A1N() == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public U7Z(android.content.Context r40, android.view.Surface r41, X.MYB r42, X.WDI r43, com.facebook.videolite.transcoder.base.composition.MediaComposition r44, X.XD9 r45, X.C68923VeN r46, X.ACM r47, X.VN4 r48, X.U7W r49) {
        /*
            Method dump skipped, instructions count: 616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U7Z.<init>(android.content.Context, android.view.Surface, X.MYB, X.WDI, com.facebook.videolite.transcoder.base.composition.MediaComposition, X.XD9, X.VeN, X.ACM, X.VN4, X.U7W):void");
    }
}
