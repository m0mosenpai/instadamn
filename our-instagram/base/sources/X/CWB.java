package X;

/* loaded from: classes5.dex */
public final class CWB {
    public final long A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CWB) {
                CWB cwb = (CWB) obj;
                if (!C14360o3.A0K(this.A03, cwb.A03) || this.A00 != cwb.A00 || !C14360o3.A0K(this.A01, cwb.A01) || !C14360o3.A0K(this.A04, cwb.A04) || this.A05 != cwb.A05 || !C14360o3.A0K(this.A02, cwb.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A05, (AbstractC166997dE.A0K(this.A01, AbstractC25236BEt.A01(this.A00, AbstractC166987dD.A0J(this.A03))) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC25227BEk.A07(this.A02);
    }

    public CWB(String str, String str2, String str3, String str4, long j, boolean z) {
        this.A03 = str;
        this.A00 = j;
        this.A01 = str2;
        this.A04 = str3;
        this.A05 = z;
        this.A02 = str4;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("StoryPromptMetadata(id=");
        A1C.append(this.A03);
        A1C.append(", participantCount=");
        A1C.append(this.A00);
        A1C.append(", attributionUserId=");
        A1C.append(this.A01);
        A1C.append(", promptSummaryText=");
        A1C.append(this.A04);
        A1C.append(", attributionUserIsVerified=");
        A1C.append(this.A05);
        A1C.append(", attributionUserProfilePicUri=");
        return AbstractC25236BEt.A0Y(this.A02, A1C);
    }
}
