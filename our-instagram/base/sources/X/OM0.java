package X;

/* loaded from: classes9.dex */
public final class OM0 {
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OM0) {
                OM0 om0 = (OM0) obj;
                if (!C14360o3.A0K(this.A03, om0.A03) || !C14360o3.A0K(this.A01, om0.A01) || this.A00 != om0.A00 || !C14360o3.A0K(this.A04, om0.A04) || this.A05 != om0.A05 || !C14360o3.A0K(this.A02, om0.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A02, AbstractC167007dF.A0D(this.A05, AbstractC166997dE.A0K(this.A04, (AbstractC166997dE.A0K(this.A01, AbstractC166987dD.A0J(this.A03)) + this.A00) * 31)));
    }

    public OM0(String str, String str2, String str3, String str4, int i, boolean z) {
        this.A03 = str;
        this.A01 = str2;
        this.A00 = i;
        this.A04 = str3;
        this.A05 = z;
        this.A02 = str4;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ZeroHeadersConfigFetchResponseData(pingUri=");
        A1C.append(this.A03);
        A1C.append(", headwindProgram=");
        A1C.append(this.A01);
        A1C.append(", carrierId=");
        A1C.append(this.A00);
        A1C.append(", usage=");
        A1C.append(this.A04);
        A1C.append(", isOptedOut=");
        A1C.append(this.A05);
        A1C.append(", headwindStorageId=");
        return AbstractC25236BEt.A0Y(this.A02, A1C);
    }
}
