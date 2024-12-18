package X;

/* loaded from: classes4.dex */
public final class ACI {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final String A04;
    public final String A05;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ACI)) {
            return false;
        }
        ACI aci = (ACI) obj;
        if (this.A02 == aci.A02 && this.A01 == aci.A01 && this.A03 == aci.A03 && this.A00 == aci.A00 && C14360o3.A0K(this.A05, aci.A05)) {
            String str = this.A04;
            String str2 = aci.A04;
            if (str != null) {
                if (str.equals(str2)) {
                    return true;
                }
            } else if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((this.A02 * 31) + this.A01) * 31;
        String str = this.A05;
        if (str != null) {
            int A0K = ((AbstractC166997dE.A0K(str, i) + this.A03) * 31) + this.A00;
            String str2 = this.A04;
            if (str2 != null) {
                return (A0K * 31) + str2.hashCode();
            }
            return A0K;
        }
        throw AbstractC166997dE.A0g();
    }

    public ACI(String str, String str2, int i, int i2, int i3, int i4) {
        this.A02 = i;
        this.A01 = i2;
        this.A05 = str;
        this.A04 = str2;
        this.A03 = i3;
        this.A00 = i4;
    }
}
