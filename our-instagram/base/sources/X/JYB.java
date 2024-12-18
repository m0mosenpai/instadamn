package X;

import java.util.concurrent.Executor;

/* loaded from: classes8.dex */
public final class JYB extends C1W1 implements InterfaceC50418MNu {
    public final C6VI A00;

    @Override // X.InterfaceC50418MNu
    public final void DGw(Object obj) {
        A09(obj, null, true);
    }

    public JYB(C3LX c3lx, InterfaceC58742mX interfaceC58742mX, C58632mM c58632mM) {
        this.A00 = c58632mM.A01(c3lx, interfaceC58742mX, this);
    }

    @Override // X.C1W1
    public final void A06(InterfaceC58722mV interfaceC58722mV, Executor executor) {
        super.A06(interfaceC58722mV, executor);
        C6VJ.A02.execute(new JYC(this));
    }
}
