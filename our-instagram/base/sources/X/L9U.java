package X;

/* loaded from: classes8.dex */
public final class L9U {
    public final EnumC46189KcR A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof L9U) {
                L9U l9u = (L9U) obj;
                if (!C14360o3.A0K(this.A01, l9u.A01) || this.A00 != l9u.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166987dD.A0J(this.A01));
    }

    public L9U(EnumC46189KcR enumC46189KcR, String str) {
        this.A01 = str;
        this.A00 = enumC46189KcR;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("FetchHSMVirtualDeviceInfoResponse(virtualDeviceId=");
        A1C.append(this.A01);
        A1C.append(", pinNormalizationStatus=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
