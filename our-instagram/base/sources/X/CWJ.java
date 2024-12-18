package X;

/* loaded from: classes5.dex */
public final class CWJ {
    public final C28260Cd5 A00;
    public final CAU A01;
    public final C28267CdC A02;
    public final C28261Cd6 A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CWJ) {
                CWJ cwj = (CWJ) obj;
                if (!C14360o3.A0K(this.A06, cwj.A06) || !C14360o3.A0K(this.A05, cwj.A05) || !C14360o3.A0K(this.A04, cwj.A04) || !C14360o3.A0K(this.A01, cwj.A01) || !C14360o3.A0K(this.A02, cwj.A02) || !C14360o3.A0K(this.A00, cwj.A00) || !C14360o3.A0K(this.A03, cwj.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A03, AbstractC166997dE.A0J(this.A00, AbstractC166997dE.A0J(this.A02, AbstractC166997dE.A0J(this.A01, ((((AbstractC167017dG.A0O(this.A06) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC25227BEk.A07(this.A04)) * 31))));
    }

    public CWJ(C28260Cd5 c28260Cd5, CAU cau, C28267CdC c28267CdC, C28261Cd6 c28261Cd6, String str, String str2, String str3) {
        this.A06 = str;
        this.A05 = str2;
        this.A04 = str3;
        this.A01 = cau;
        this.A02 = c28267CdC;
        this.A00 = c28260Cd5;
        this.A03 = c28261Cd6;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("UIState(prompt=");
        A1C.append(this.A06);
        A1C.append(", initialContent=");
        A1C.append(this.A05);
        A1C.append(", everstoreId=");
        A1C.append(this.A04);
        A1C.append(", suggestionState=");
        A1C.append(this.A01);
        A1C.append(", writeTonesState=");
        A1C.append(this.A02);
        A1C.append(", inputComposerState=");
        A1C.append(this.A00);
        A1C.append(", errorInfo=");
        return AbstractC167017dG.A0o(this.A03, A1C);
    }
}
