package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.XMa, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72058XMa extends AtomicReference implements InterfaceC42071wx, InterfaceC41801wU {
    public final C72091XNl A00;
    public final InterfaceC42071wx A01;
    public final AtomicReference A03 = new AtomicReference();
    public final AtomicReference A02 = new AtomicReference();

    @Override // X.InterfaceC42071wx
    public final void Dpc(InterfaceC41801wU interfaceC41801wU) {
        C6KP.A03(interfaceC41801wU, this.A03);
    }

    @Override // X.InterfaceC41801wU
    public final void dispose() {
        C6KP.A01(this.A03);
        C6KP.A01(this.A02);
    }

    @Override // X.InterfaceC42071wx
    public final void onComplete() {
        C6KP.A01(this.A02);
        this.A01.onComplete();
    }

    @Override // X.InterfaceC42071wx
    public final void onError(Throwable th) {
        C6KP.A01(this.A02);
        this.A01.onError(th);
    }

    public C72058XMa(C72091XNl c72091XNl, InterfaceC42071wx interfaceC42071wx) {
        this.A01 = interfaceC42071wx;
        this.A00 = c72091XNl;
    }

    @Override // X.InterfaceC42071wx
    public final void DVo(Object obj) {
        Object obj2 = get();
        if (obj2 != null) {
            try {
                Object apply = this.A00.A00.apply(obj, obj2);
                AbstractC42141x4.A01(apply, "The combiner returned a null value");
                this.A01.DVo(apply);
            } catch (Throwable th) {
                AbstractC62281S5a.A00(th);
                dispose();
                this.A01.onError(th);
            }
        }
    }
}
