package X;

/* loaded from: classes9.dex */
public final class NVE extends AbstractC55145Od4 {
    public final Integer A00;
    public final InterfaceC16510rw A01;

    @Override // X.AbstractC55145Od4
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NVE) {
                NVE nve = (NVE) obj;
                if (this.A00 != nve.A00 || !C14360o3.A0K(this.A01, nve.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.AbstractC55145Od4
    public final int hashCode() {
        Integer num = this.A00;
        return (AbstractC25230BEn.A0C(num, AbstractC54197Nxb.A00(num)) * 31) + this.A01.hashCode();
    }

    public NVE(Integer num, InterfaceC16510rw interfaceC16510rw) {
        this.A00 = num;
        this.A01 = interfaceC16510rw;
    }

    @Override // X.AbstractC55145Od4
    public final String toString() {
        String str;
        String abstractC55145Od4 = super.toString();
        Integer num = this.A00;
        if (num != null) {
            str = AbstractC54197Nxb.A00(num);
        } else {
            str = "null";
        }
        return AnonymousClass001.A0u(abstractC55145Od4, ": { ", str, " }");
    }
}
