package X;

import java.util.Map;

/* loaded from: classes9.dex */
public final class OM1 {
    public final long A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final Map A04;
    public final String A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OM1) {
                OM1 om1 = (OM1) obj;
                if (!C14360o3.A0K(this.A03, om1.A03) || !C14360o3.A0K(this.A05, om1.A05) || this.A00 != om1.A00 || !C14360o3.A0K(this.A04, om1.A04) || !C14360o3.A0K(this.A01, om1.A01) || !C14360o3.A0K(this.A02, om1.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A02, AbstractC166997dE.A0K(this.A01, AbstractC166997dE.A0J(this.A04, AbstractC25236BEt.A01(this.A00, AbstractC166997dE.A0K(this.A05, AbstractC166987dD.A0J(this.A03))))));
    }

    public OM1(String str, String str2, String str3, String str4, Map map, long j) {
        AbstractC167017dG.A1P(str, str2);
        this.A03 = str;
        this.A05 = str2;
        this.A00 = j;
        this.A04 = map;
        this.A01 = str3;
        this.A02 = str4;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ZeroHeadersHttpParams(url=");
        A1C.append(this.A03);
        A1C.append(", flowId=");
        A1C.append(this.A05);
        A1C.append(", timeoutDurationInMillis=");
        A1C.append(this.A00);
        A1C.append(AbstractC43591JPw.A00(229));
        A1C.append(this.A04);
        A1C.append(", body=");
        A1C.append(this.A01);
        A1C.append(", method=");
        return AbstractC25236BEt.A0Y(this.A02, A1C);
    }
}
