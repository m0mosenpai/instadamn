package X;

/* loaded from: classes5.dex */
public final class CWC {
    public final CW2 A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CWC) {
                CWC cwc = (CWC) obj;
                if (!C14360o3.A0K(this.A05, cwc.A05) || this.A01 != cwc.A01 || !C14360o3.A0K(this.A03, cwc.A03) || !C14360o3.A0K(this.A04, cwc.A04) || !C14360o3.A0K(this.A00, cwc.A00) || !C14360o3.A0K(this.A02, cwc.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A0J = AbstractC166987dD.A0J(this.A05);
        int intValue = this.A01.intValue();
        if (intValue != 0) {
            str = "VIDEO";
        } else {
            str = "IMAGE";
        }
        return AbstractC25226BEj.A03(this.A02, AbstractC25225BEi.A05(AbstractC166997dE.A0K(this.A04, AbstractC166997dE.A0K(this.A03, AbstractC25231BEo.A0H(str, intValue, A0J))), AbstractC167017dG.A0M(this.A00)) * 31);
    }

    public /* synthetic */ CWC(CW2 cw2, Integer num, String str, String str2, String str3) {
        String A0o = AbstractC166997dE.A0o();
        AbstractC167007dF.A1I(num, 2, A0o);
        this.A05 = str;
        this.A01 = num;
        this.A03 = str2;
        this.A04 = str3;
        this.A00 = cw2;
        this.A02 = A0o;
    }

    public final String toString() {
        String str;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("SpotlightMedia(uri=");
        A1C.append(this.A05);
        A1C.append(", mediaType=");
        if (this.A01.intValue() != 0) {
            str = "VIDEO";
        } else {
            str = "IMAGE";
        }
        A1C.append(str);
        A1C.append(", prompt=");
        A1C.append(this.A03);
        A1C.append(", shortPrompt=");
        A1C.append(this.A04);
        A1C.append(", creatorAttribution=");
        A1C.append(this.A00);
        AbstractC25235BEs.A1N(A1C, ", requestId=");
        AbstractC25235BEs.A1N(A1C, ", responseId=");
        A1C.append(", id=");
        return AbstractC25236BEt.A0Y(this.A02, A1C);
    }
}
