package X;

/* loaded from: classes11.dex */
public final class UPK extends C0T6 {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UPK) {
                UPK upk = (UPK) obj;
                if (!C14360o3.A0K(this.A02, upk.A02) || this.A06 != upk.A06 || this.A05 != upk.A05 || this.A04 != upk.A04 || !C14360o3.A0K(this.A03, upk.A03) || !C14360o3.A0K(this.A01, upk.A01) || !C14360o3.A0K(this.A00, upk.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0K(this.A01, AbstractC166997dE.A0K(this.A03, AbstractC167007dF.A0D(this.A04, AbstractC167007dF.A0D(this.A05, AbstractC167007dF.A0D(this.A06, this.A02.hashCode() * 31))))) + this.A00.hashCode();
    }

    public UPK(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3) {
        this.A02 = str;
        this.A06 = z;
        this.A05 = z2;
        this.A04 = z3;
        this.A03 = str2;
        this.A01 = str3;
        this.A00 = str4;
    }
}
