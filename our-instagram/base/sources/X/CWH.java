package X;

/* loaded from: classes5.dex */
public final class CWH {
    public final Boolean A00;
    public final Integer A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public CWH(Boolean bool, Integer num, Integer num2, String str, String str2, String str3, boolean z) {
        C14360o3.A0B(str, 1);
        this.A03 = str;
        this.A04 = str2;
        this.A06 = z;
        this.A05 = str3;
        this.A00 = bool;
        this.A02 = num;
        this.A01 = num2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CWH) {
                CWH cwh = (CWH) obj;
                if (!C14360o3.A0K(this.A03, cwh.A03) || !C14360o3.A0K(this.A04, cwh.A04) || this.A06 != cwh.A06 || !C14360o3.A0K(this.A05, cwh.A05) || !C14360o3.A0K(this.A00, cwh.A00) || !C14360o3.A0K(this.A02, cwh.A02) || !C14360o3.A0K(this.A01, cwh.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC25225BEi.A05((AbstractC167007dF.A0D(this.A06, AbstractC166997dE.A0K(this.A04, AbstractC166987dD.A0J(this.A03))) + AbstractC167017dG.A0O(this.A05)) * 31, AbstractC167017dG.A0M(this.A00)) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC166997dE.A0I(this.A01);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("MediaEditParams(imagineMediaId=");
        A1C.append(this.A03);
        A1C.append(", mediaUrl=");
        A1C.append(this.A04);
        A1C.append(", primaryActionIsSave=");
        A1C.append(this.A06);
        A1C.append(", prompt=");
        A1C.append(this.A05);
        A1C.append(", isAnimatable=");
        A1C.append(this.A00);
        AbstractC25235BEs.A1N(A1C, ", mediaEverstoreHandle=");
        A1C.append(AbstractC111324zv.A00(1435));
        A1C.append(this.A02);
        A1C.append(AbstractC111324zv.A00(1434));
        return AbstractC167017dG.A0o(this.A01, A1C);
    }
}
