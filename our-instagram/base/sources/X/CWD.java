package X;

import java.util.List;

/* loaded from: classes5.dex */
public final class CWD {
    public final C28261Cd6 A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final List A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CWD) {
                CWD cwd = (CWD) obj;
                if (!C14360o3.A0K(this.A05, cwd.A05) || !C14360o3.A0K(this.A00, cwd.A00) || !C14360o3.A0K(this.A02, cwd.A02) || !C14360o3.A0K(this.A03, cwd.A03) || !C14360o3.A0K(this.A04, cwd.A04) || !C14360o3.A0K(this.A01, cwd.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((AbstractC166997dE.A0J(this.A00, AbstractC166987dD.A0G(this.A05)) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC25227BEk.A07(this.A01);
    }

    public CWD(C28261Cd6 c28261Cd6, String str, String str2, String str3, String str4, List list) {
        this.A05 = list;
        this.A00 = c28261Cd6;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A01 = str4;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("WriteWithAISuggestionStreamResponse(result=");
        A1C.append(this.A05);
        A1C.append(", errorInfo=");
        A1C.append(this.A00);
        A1C.append(", metagenRequestId=");
        A1C.append(this.A02);
        A1C.append(", metagenResponseId=");
        A1C.append(this.A03);
        A1C.append(", trackingToken=");
        A1C.append(this.A04);
        A1C.append(", everstoreId=");
        return AbstractC25236BEt.A0Y(this.A01, A1C);
    }
}
