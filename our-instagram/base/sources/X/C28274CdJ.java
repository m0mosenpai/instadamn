package X;

/* renamed from: X.CdJ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28274CdJ {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C28274CdJ) {
                C28274CdJ c28274CdJ = (C28274CdJ) obj;
                if (!C14360o3.A0K(this.A01, c28274CdJ.A01) || !C14360o3.A0K(this.A02, c28274CdJ.A02) || !C14360o3.A0K(this.A03, c28274CdJ.A03) || !C14360o3.A0K(this.A05, c28274CdJ.A05) || !C14360o3.A0K(this.A04, c28274CdJ.A04) || !C14360o3.A0K(this.A06, c28274CdJ.A06) || !C14360o3.A0K(this.A00, c28274CdJ.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A00, AbstractC166997dE.A0K(this.A06, AbstractC166997dE.A0K(this.A04, AbstractC166997dE.A0K(this.A05, AbstractC166997dE.A0K(this.A03, AbstractC166997dE.A0K(this.A02, AbstractC166987dD.A0J(this.A01)))))));
    }

    public C28274CdJ(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A05 = str4;
        this.A04 = str5;
        this.A06 = str6;
        this.A00 = str7;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("MetaAiLinks(aiDisclosuresLink=");
        A1C.append(this.A01);
        A1C.append(", aiTermsLink=");
        A1C.append(this.A02);
        A1C.append(", privacyCenterLink=");
        A1C.append(this.A03);
        A1C.append(", appLevelPrivacyCenterLink=");
        A1C.append(this.A05);
        A1C.append(", privacyPolicyLink=");
        A1C.append(this.A04);
        A1C.append(", learnMoreLink=");
        A1C.append(this.A06);
        A1C.append(", aiAtMetaLink=");
        return AbstractC25236BEt.A0Y(this.A00, A1C);
    }

    public C28274CdJ() {
        this("", "", "", "", "", "", "");
    }
}
