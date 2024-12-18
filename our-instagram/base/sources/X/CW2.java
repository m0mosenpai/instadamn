package X;

/* loaded from: classes5.dex */
public final class CW2 {
    public final String A00;
    public final boolean A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CW2) {
                CW2 cw2 = (CW2) obj;
                if (!C14360o3.A0K(this.A02, cw2.A02) || !C14360o3.A0K(this.A00, cw2.A00) || !C14360o3.A0K(this.A03, cw2.A03) || this.A01 != cw2.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A01, (AbstractC166997dE.A0K(this.A00, AbstractC166987dD.A0J(this.A02)) + AbstractC167017dG.A0O(this.A03)) * 31);
    }

    public CW2(String str, String str2, String str3, boolean z) {
        this.A02 = str;
        this.A00 = str2;
        this.A03 = str3;
        this.A01 = z;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("CreatorAttribution(id=");
        A1C.append(this.A02);
        A1C.append(", name=");
        A1C.append(this.A00);
        A1C.append(", profilePicUri=");
        A1C.append(this.A03);
        A1C.append(", isVerified=");
        return AbstractC25236BEt.A0a(A1C, this.A01);
    }
}
