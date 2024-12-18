package androidx.paging;

import X.AbstractC167017dG;
import X.C00O;
import X.C12W;
import X.C19L;
import X.InterfaceC16660sJ;
import X.InterfaceC23621Ds;
import X.InterfaceC24741Ir;
import X.InterfaceC58316Pt8;

/* loaded from: classes9.dex */
public final class SimpleProducerScopeImpl implements InterfaceC24741Ir, C19L, InterfaceC58316Pt8 {
    public final InterfaceC24741Ir A00;
    public final /* synthetic */ C19L A01;

    @Override // X.InterfaceC24741Ir
    public final boolean AID(Throwable th) {
        return this.A00.AID(th);
    }

    @Override // X.C19L
    public final C12W Arv() {
        return this.A01.Arv();
    }

    @Override // X.InterfaceC24741Ir
    public final void CPC(InterfaceC16660sJ interfaceC16660sJ) {
        this.A00.CPC(interfaceC16660sJ);
    }

    @Override // X.InterfaceC24741Ir
    public final boolean CRR() {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC24741Ir
    public final Object EMz(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        return this.A00.EMz(obj, interfaceC23621Ds);
    }

    @Override // X.InterfaceC24741Ir
    public final Object F8s(Object obj) {
        return this.A00.F8s(obj);
    }

    public SimpleProducerScopeImpl(C19L c19l, InterfaceC24741Ir interfaceC24741Ir) {
        AbstractC167017dG.A1P(c19l, interfaceC24741Ir);
        this.A00 = interfaceC24741Ir;
        this.A01 = c19l;
    }
}
