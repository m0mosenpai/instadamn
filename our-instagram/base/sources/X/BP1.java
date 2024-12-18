package X;

/* loaded from: classes5.dex */
public final class BP1 extends C0T6 implements InterfaceC30880Dht {
    public final int A00;
    public final InterfaceC30879Dhs A01;

    public BP1(InterfaceC30879Dhs interfaceC30879Dhs, int i) {
        C14360o3.A0B(interfaceC30879Dhs, 1);
        this.A01 = interfaceC30879Dhs;
        this.A00 = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BP1) {
                BP1 bp1 = (BP1) obj;
                if (!C14360o3.A0K(this.A01, bp1.A01) || this.A00 != bp1.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0G(this.A01) + this.A00;
    }
}
