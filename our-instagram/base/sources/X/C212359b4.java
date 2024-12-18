package X;

import android.graphics.SurfaceTexture;
import android.view.SurfaceView;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.9b4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C212359b4 extends AbstractC178657wd implements InterfaceC178737wl, InterfaceC25224BDz {
    public InterfaceC176297sm A00;
    public CountDownLatch A01;
    public final InterfaceC178677wf A02;
    public final InterfaceC175497rP A03;
    public final Object A04;
    public volatile SurfaceTexture A05;
    public volatile SurfaceView A06;

    @Override // X.AbstractC178227vw
    public final void A09() {
        this.A01 = new CountDownLatch(1);
        C178087vh c178087vh = InterfaceC179867yc.A00;
        if (((AbstractC178657wd) this).A00.CRY(c178087vh)) {
            ((InterfaceC179867yc) A0A(c178087vh)).A9y(this.A02);
        }
    }

    @Override // X.InterfaceC178737wl
    public final void A9p(C176507t8 c176507t8) {
    }

    @Override // X.InterfaceC178737wl
    public final void AAS(InterfaceC175477rN interfaceC175477rN) {
    }

    @Override // X.InterfaceC178737wl
    public final void AQb(Runnable runnable) {
    }

    @Override // X.InterfaceC178737wl
    public final boolean CLt() {
        return false;
    }

    @Override // X.InterfaceC178737wl
    public final boolean ECL() {
        return true;
    }

    @Override // X.InterfaceC178737wl
    public final void EG3(C176507t8 c176507t8) {
    }

    @Override // X.InterfaceC178737wl
    public final void EGM(InterfaceC175477rN interfaceC175477rN) {
    }

    @Override // X.InterfaceC178737wl
    public final /* synthetic */ void EaB(C176377su c176377su, Object obj) {
    }

    @Override // X.InterfaceC178737wl
    public final void EbN(boolean z) {
    }

    @Override // X.InterfaceC178737wl
    public final /* synthetic */ void EbX(C176307sn c176307sn) {
    }

    @Override // X.InterfaceC178737wl
    public final void Egy(InterfaceC176297sm interfaceC176297sm) {
        C14360o3.A0B(interfaceC176297sm, 0);
        this.A00 = interfaceC176297sm;
    }

    @Override // X.InterfaceC178067vf
    public final C178087vh BKV() {
        C178087vh c178087vh = InterfaceC178737wl.A00;
        C14360o3.A08(c178087vh);
        return c178087vh;
    }

    @Override // X.InterfaceC178737wl
    public final InterfaceC175497rP C4Q() {
        return this.A03;
    }

    public C212359b4(InterfaceC178207vu interfaceC178207vu) {
        super(interfaceC178207vu);
        this.A03 = new C23461AaY(this);
        this.A04 = new Object();
        this.A02 = new AZZ(this, 2);
    }
}
