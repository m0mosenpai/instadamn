package X;

import java.util.List;

/* renamed from: X.CdI, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28273CdI {
    public final C28261Cd6 A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final List A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C28273CdI) {
                C28273CdI c28273CdI = (C28273CdI) obj;
                if (!C14360o3.A0K(this.A05, c28273CdI.A05) || !C14360o3.A0K(this.A00, c28273CdI.A00) || !C14360o3.A0K(this.A02, c28273CdI.A02) || !C14360o3.A0K(this.A03, c28273CdI.A03) || !C14360o3.A0K(this.A04, c28273CdI.A04) || !C14360o3.A0K(this.A01, c28273CdI.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((AbstractC166997dE.A0J(this.A00, AbstractC166987dD.A0G(this.A05)) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC25227BEk.A07(this.A01);
    }

    public C28273CdI(C28261Cd6 c28261Cd6, String str, String str2, String str3, String str4, List list) {
        this.A05 = list;
        this.A00 = c28261Cd6;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A01 = str4;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("WriteWithAIGenerateSuggestionsResponse(result=");
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

    public C28273CdI() {
        this(new C28261Cd6(null, true), null, null, null, null, C16930sl.A00);
    }
}
