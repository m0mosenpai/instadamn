package X;

/* renamed from: X.BQq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25528BQq extends C0T6 implements InterfaceC30807Dgi {
    public final InterfaceC30808Dgj A00;
    public final InterfaceC30808Dgj A01;

    public C25528BQq(InterfaceC30808Dgj interfaceC30808Dgj, InterfaceC30808Dgj interfaceC30808Dgj2) {
        C14360o3.A0B(interfaceC30808Dgj, 1);
        this.A01 = interfaceC30808Dgj;
        this.A00 = interfaceC30808Dgj2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25528BQq) {
                C25528BQq c25528BQq = (C25528BQq) obj;
                if (!C14360o3.A0K(this.A01, c25528BQq.A01) || !C14360o3.A0K(this.A00, c25528BQq.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166987dD.A0G(this.A01));
    }
}
