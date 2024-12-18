package X;

/* renamed from: X.Cnl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28815Cnl implements InterfaceC30911DiO {
    public final CT1 A00;
    public final InterfaceC16660sJ A01;
    public final Object A02;

    public final boolean equals(Object obj) {
        if (obj instanceof C28815Cnl) {
            C28815Cnl c28815Cnl = (C28815Cnl) obj;
            if (C14360o3.A0K(this.A00.A04, c28815Cnl.A00.A04) && C14360o3.A0K(this.A01, c28815Cnl.A01)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166987dD.A0G(this.A00.A04));
    }

    public C28815Cnl(CT1 ct1, InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = ct1;
        this.A01 = interfaceC16660sJ;
        this.A02 = ct1.A04;
    }

    @Override // X.InterfaceC30911DiO
    public final Object BMT() {
        return this.A02;
    }
}
