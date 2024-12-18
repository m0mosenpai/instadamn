package X;

/* renamed from: X.CdK, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28275CdK {
    public final Long A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C28275CdK) {
                C28275CdK c28275CdK = (C28275CdK) obj;
                if (!C14360o3.A0K(this.A04, c28275CdK.A04) || !C14360o3.A0K(this.A00, c28275CdK.A00) || !C14360o3.A0K(this.A02, c28275CdK.A02) || !C14360o3.A0K(this.A05, c28275CdK.A05) || !C14360o3.A0K(this.A01, c28275CdK.A01) || this.A06 != c28275CdK.A06 || !C14360o3.A0K(this.A03, c28275CdK.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A06, ((((((((AbstractC167017dG.A0O(this.A04) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC25227BEk.A07(this.A03);
    }

    public C28275CdK(Long l, String str, String str2, String str3, String str4, String str5, boolean z) {
        this.A04 = str;
        this.A00 = l;
        this.A02 = str2;
        this.A05 = str3;
        this.A01 = str4;
        this.A06 = z;
        this.A03 = str5;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("SuggestionsPromptMetadata(id=");
        A1C.append(this.A04);
        A1C.append(", participantCount=");
        A1C.append(this.A00);
        A1C.append(", attributionUserId=");
        A1C.append(this.A02);
        A1C.append(", suggestionPromptSummary=");
        A1C.append(this.A05);
        A1C.append(", attributionPromptSummaryText=");
        A1C.append(this.A01);
        A1C.append(", attributionUserIsVerified=");
        A1C.append(this.A06);
        A1C.append(", attributionUserProfilePicUri=");
        return AbstractC25236BEt.A0Y(this.A03, A1C);
    }

    public C28275CdK() {
        this(AbstractC167007dF.A0d(), null, null, null, null, null, false);
    }
}
