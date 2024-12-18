package X;

import android.opengl.GLES20;
import android.view.Surface;

/* renamed from: X.AWc, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23333AWc implements InterfaceC185788Ly, InterfaceC197918p2 {
    public C22893A7n A00;
    public final C23332AWb A01;
    public final Object A02;

    @Override // X.InterfaceC185788Ly
    public final String BOj() {
        return "IgFrameBufferOutput";
    }

    @Override // X.InterfaceC185788Ly
    public final void CNg(InterfaceC197958p6 interfaceC197958p6, InterfaceC197978p8 interfaceC197978p8) {
        C14360o3.A0B(interfaceC197958p6, 0);
        interfaceC197958p6.AWg(this);
    }

    @Override // X.InterfaceC185788Ly
    public final boolean AFZ() {
        return AbstractC167007dF.A1M(this.A01.AFZ() ? 1 : 0);
    }

    @Override // X.InterfaceC185788Ly
    public final EnumC197888oz BI3() {
        return null;
    }

    @Override // X.InterfaceC197918p2
    public final int BqV() {
        return 0;
    }

    @Override // X.InterfaceC185788Ly
    public final EnumC185798Lz CFJ() {
        EnumC185798Lz enumC185798Lz = EnumC185798Lz.PREVIEW;
        C14360o3.A07(enumC185798Lz);
        return enumC185798Lz;
    }

    @Override // X.InterfaceC185788Ly
    public final void CNx(Surface surface, InterfaceC178897x1 interfaceC178897x1) {
        C23332AWb c23332AWb = this.A01;
        C14360o3.A0A(interfaceC178897x1);
        c23332AWb.CNx(surface, interfaceC178897x1);
    }

    @Override // X.InterfaceC185788Ly
    public final /* synthetic */ boolean Cem() {
        return false;
    }

    @Override // X.InterfaceC185788Ly
    public final boolean Cmi() {
        boolean Cmi;
        Object obj = this.A02;
        C14360o3.A0A(obj);
        synchronized (obj) {
            Cmi = this.A01.Cmi();
        }
        return Cmi;
    }

    @Override // X.InterfaceC185788Ly
    public final void DrC() {
        AnonymousClass810 anonymousClass810;
        C200688uB c200688uB = this.A01.A02;
        if (c200688uB != null) {
            anonymousClass810 = c200688uB.A03;
        } else {
            anonymousClass810 = null;
        }
        C22893A7n c22893A7n = this.A00;
        if (c22893A7n != null && anonymousClass810 != null) {
            AAY aay = c22893A7n.A01;
            if (aay.A09.getAndSet(false)) {
                GLES20.glFinish();
                if (c22893A7n.A00 == null) {
                    c22893A7n.A00 = new C1814983c(aay.A05.A07, aay.A06);
                }
            }
            Object obj = aay.A08;
            synchronized (obj) {
                if (aay.A03) {
                    C0w9.A03("IG-CameraCoreRenderer", "Skipped a frame");
                }
                AjM ajM = aay.A07;
                if (ajM.getTexture() != anonymousClass810 || ajM.A01 != anonymousClass810.A00) {
                    C197738ok c197738ok = aay.A00;
                    C14360o3.A0A(c197738ok);
                    int i = c197738ok.A02;
                    C197738ok c197738ok2 = aay.A00;
                    C14360o3.A0A(c197738ok2);
                    int i2 = c197738ok2.A01;
                    ajM.A03 = anonymousClass810;
                    ajM.A01 = anonymousClass810.A00;
                    ajM.A02 = i;
                    ajM.A00 = i2;
                }
                aay.A03 = true;
                obj.notifyAll();
            }
        }
    }

    @Override // X.InterfaceC185788Ly
    public final void destroy() {
        this.A01.release();
    }

    @Override // X.InterfaceC185788Ly
    public final int getHeight() {
        return this.A01.A00;
    }

    @Override // X.InterfaceC185788Ly
    public final int getWidth() {
        return this.A01.A01;
    }

    @Override // X.InterfaceC185788Ly
    public final void release() {
        this.A01.release();
    }

    @Override // X.InterfaceC185788Ly
    public final void setEnabled(boolean z) {
        this.A01.A06 = z;
    }

    @Override // X.InterfaceC185788Ly
    public final void swapBuffers() {
        this.A01.swapBuffers();
        GLES20.glFlush();
    }

    public C23333AWc(C197738ok c197738ok, Object obj) {
        this.A01 = new C23332AWb(c197738ok.A02, c197738ok.A01);
        this.A02 = obj;
    }
}
