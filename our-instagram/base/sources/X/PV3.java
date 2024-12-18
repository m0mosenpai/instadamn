package X;

import java.util.Iterator;

/* loaded from: classes9.dex */
public final class PV3 implements InterfaceC224417g, InterfaceC31170DnE {
    public final int A00;
    public final InterfaceC224417g A01;

    @Override // X.InterfaceC31170DnE
    public final InterfaceC224417g Epr(int i) {
        if (i >= this.A00) {
            return this;
        }
        return new PV3(this.A01, i);
    }

    @Override // X.InterfaceC224417g
    public final Iterator iterator() {
        return new PUD(this);
    }

    public PV3(InterfaceC224417g interfaceC224417g, int i) {
        this.A01 = interfaceC224417g;
        this.A00 = i;
    }
}
