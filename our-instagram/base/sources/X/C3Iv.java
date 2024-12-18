package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.3Iv, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3Iv extends AbstractC23681Dy implements InterfaceC24731Iq {
    public final InterfaceC24731Iq A00;

    public C3Iv(C12W c12w, InterfaceC24731Iq interfaceC24731Iq, boolean z) {
        super(c12w, z, true);
        this.A00 = interfaceC24731Iq;
    }

    @Override // X.AnonymousClass198
    public final void A0M(Throwable th) {
        CancellationException A0H = A0H(null, th);
        this.A00.AGH(A0H);
        A0T(A0H);
    }

    @Override // X.InterfaceC24741Ir
    public final boolean AID(Throwable th) {
        return this.A00.AID(th);
    }

    @Override // X.InterfaceC24751Is
    public final C3EL BYn() {
        return this.A00.BYn();
    }

    @Override // X.InterfaceC24751Is
    public final C3EL BYo() {
        return this.A00.BYo();
    }

    @Override // X.InterfaceC24741Ir
    public final void CPC(InterfaceC16660sJ interfaceC16660sJ) {
        this.A00.CPC(interfaceC16660sJ);
    }

    @Override // X.InterfaceC24751Is
    public final boolean CRQ() {
        return this.A00.CRQ();
    }

    @Override // X.InterfaceC24741Ir
    public final boolean CRR() {
        return this.A00.CRR();
    }

    @Override // X.InterfaceC24751Is
    public final C24861Jl CgS() {
        return this.A00.CgS();
    }

    @Override // X.InterfaceC24751Is
    public final Object E8a(InterfaceC23621Ds interfaceC23621Ds) {
        return this.A00.E8a(interfaceC23621Ds);
    }

    @Override // X.InterfaceC24751Is
    public final Object E8b(InterfaceC23621Ds interfaceC23621Ds) {
        return this.A00.E8b(interfaceC23621Ds);
    }

    @Override // X.InterfaceC24741Ir
    public final Object EMz(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        return this.A00.EMz(obj, interfaceC23621Ds);
    }

    @Override // X.InterfaceC24751Is
    public final Object F8q() {
        return this.A00.F8q();
    }

    @Override // X.InterfaceC24741Ir
    public final Object F8s(Object obj) {
        return this.A00.F8s(obj);
    }

    @Override // X.AnonymousClass198, X.AnonymousClass195
    public final void AGH(CancellationException cancellationException) {
        if (!isCancelled()) {
            if (cancellationException == null) {
                cancellationException = new C107154sL(A0F(), null, this);
            }
            A0M(cancellationException);
        }
    }
}
