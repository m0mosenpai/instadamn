package X;

import java.util.List;

/* loaded from: classes10.dex */
public final class SPK {
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SPK) {
                SPK spk = (SPK) obj;
                if (!C14360o3.A0K(this.A05, spk.A05) || !C14360o3.A0K(this.A03, spk.A03) || !C14360o3.A0K(this.A02, spk.A02) || !C14360o3.A0K(this.A04, spk.A04) || !C14360o3.A0K(this.A06, spk.A06) || this.A00 != spk.A00 || !C14360o3.A0K(this.A01, spk.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC166997dE.A0J(this.A06, AbstractC166997dE.A0K(this.A04, AbstractC166997dE.A0K(this.A02, AbstractC166997dE.A0K(this.A03, AbstractC166987dD.A0J(this.A05))))) + this.A00) * 31) + AbstractC167017dG.A0O(this.A01);
    }

    public SPK(String str, String str2, String str3, String str4, List list, int i, String str5) {
        AbstractC167017dG.A1R(str2, str3);
        this.A05 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A04 = str4;
        this.A06 = list;
        this.A00 = i;
        this.A01 = str5;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("AuthTicketFromServer(id=");
        A1C.append(this.A05);
        A1C.append(", authenticationTicketStatus=");
        A1C.append(this.A03);
        A1C.append(", authTicketType=");
        A1C.append(this.A02);
        A1C.append(", fingerPrint=");
        A1C.append(this.A04);
        A1C.append(", authTicketCapabilities=");
        A1C.append(this.A06);
        A1C.append(", ttl=");
        A1C.append(this.A00);
        A1C.append(", associatedCredentialId=");
        return AbstractC25236BEt.A0Y(this.A01, A1C);
    }
}
