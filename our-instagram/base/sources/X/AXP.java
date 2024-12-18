package X;

import android.opengl.EGLContext;
import android.view.Surface;

/* loaded from: classes4.dex */
public final class AXP implements InterfaceC178897x1 {
    public EGLContext A00;
    public final C178927x4 A01;

    public AXP(EGLContext eGLContext, Object obj) {
        this.A01 = new C178927x4(obj, 3);
        this.A00 = eGLContext;
    }

    @Override // X.InterfaceC178897x1
    public final AbstractC180277zH AMj(Surface surface, int i) {
        return this.A01.AMj(surface, 5);
    }

    @Override // X.InterfaceC178897x1
    public final AbstractC180277zH AMg(int i, int i2) {
        return this.A01.AMg(i, i2);
    }

    @Override // X.InterfaceC178897x1
    public final AbstractC180277zH AMi(Surface surface) {
        return this.A01.AMi(surface);
    }

    @Override // X.InterfaceC178897x1
    public final int AqC() {
        return this.A01.A00;
    }

    @Override // X.InterfaceC178897x1
    public final /* bridge */ /* synthetic */ EGLContext B08() {
        return this.A00;
    }

    @Override // X.InterfaceC178897x1
    public final int BZA() {
        return this.A01.A01;
    }

    @Override // X.InterfaceC178897x1
    public final C178937x5 C6u() {
        return this.A01.A05;
    }

    @Override // X.InterfaceC178897x1
    public final boolean CS8() {
        return this.A01.CS8();
    }

    @Override // X.InterfaceC178897x1
    public final void Cml() {
        this.A01.Cml();
    }

    @Override // X.InterfaceC178897x1
    public final C178927x4 EhY(int i) {
        EGLContext eGLContext = this.A00;
        C178927x4 c178927x4 = this.A01;
        c178927x4.A09(eGLContext, i);
        return c178927x4;
    }

    @Override // X.InterfaceC178897x1
    public final InterfaceC178897x1 EhZ(InterfaceC178897x1 interfaceC178897x1, int i) {
        C178927x4 c178927x4 = this.A01;
        c178927x4.A0A(interfaceC178897x1, i);
        return c178927x4;
    }

    @Override // X.InterfaceC178897x1
    public final void release() {
        this.A01.release();
    }
}
