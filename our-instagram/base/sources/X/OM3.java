package X;

/* loaded from: classes9.dex */
public final class OM3 {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OM3) {
                OM3 om3 = (OM3) obj;
                if (!C14360o3.A0K(this.A03, om3.A03) || !C14360o3.A0K(this.A01, om3.A01) || !C14360o3.A0K(this.A05, om3.A05) || !C14360o3.A0K(this.A02, om3.A02) || !C14360o3.A0K(this.A06, om3.A06) || !C14360o3.A0K(this.A00, om3.A00) || !C14360o3.A0K(this.A04, om3.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0K(this.A00, (AbstractC166997dE.A0K(this.A02, AbstractC166997dE.A0K(this.A05, AbstractC166997dE.A0K(this.A01, AbstractC166987dD.A0J(this.A03)))) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC25227BEk.A07(this.A04);
    }

    public OM3(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.A03 = str;
        this.A01 = str2;
        this.A05 = str3;
        this.A02 = str4;
        this.A06 = str5;
        this.A00 = str6;
        this.A04 = str7;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("WriteWithAIResponse(result=");
        A1C.append(this.A03);
        A1C.append(", requestId=");
        A1C.append(this.A01);
        A1C.append(", metagenRequestId=");
        A1C.append(this.A05);
        A1C.append(", responseId=");
        A1C.append(this.A02);
        A1C.append(", trackingToken=");
        A1C.append(this.A06);
        A1C.append(", bottomsheetSessionId=");
        A1C.append(this.A00);
        A1C.append(", suggestionId=");
        return AbstractC25236BEt.A0Y(this.A04, A1C);
    }
}
