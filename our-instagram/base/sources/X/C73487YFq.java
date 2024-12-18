package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.YFq, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73487YFq implements InterfaceC42071wx {
    public final InterfaceC42061ww A01;
    public final InterfaceC42071wx A02;
    public boolean A00 = true;
    public final C73553YKg A03 = new AtomicReference();

    @Override // X.InterfaceC42071wx
    public final void DVo(Object obj) {
        if (this.A00) {
            this.A00 = false;
        }
        this.A02.DVo(obj);
    }

    @Override // X.InterfaceC42071wx
    public final void Dpc(InterfaceC41801wU interfaceC41801wU) {
        InterfaceC41801wU interfaceC41801wU2;
        C73553YKg c73553YKg = this.A03;
        do {
            interfaceC41801wU2 = (InterfaceC41801wU) c73553YKg.get();
            if (interfaceC41801wU2 == C6KP.A01) {
                if (interfaceC41801wU != null) {
                    interfaceC41801wU.dispose();
                    return;
                }
                return;
            }
        } while (!C1EM.A00(interfaceC41801wU2, interfaceC41801wU, c73553YKg));
        if (interfaceC41801wU2 == null) {
            return;
        }
        interfaceC41801wU2.dispose();
    }

    @Override // X.InterfaceC42071wx
    public final void onComplete() {
        if (this.A00) {
            this.A00 = false;
            this.A01.EpF(this);
        } else {
            this.A02.onComplete();
        }
    }

    @Override // X.InterfaceC42071wx
    public final void onError(Throwable th) {
        this.A02.onError(th);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.YKg, java.util.concurrent.atomic.AtomicReference] */
    public C73487YFq(InterfaceC42061ww interfaceC42061ww, InterfaceC42071wx interfaceC42071wx) {
        this.A02 = interfaceC42071wx;
        this.A01 = interfaceC42061ww;
    }
}
