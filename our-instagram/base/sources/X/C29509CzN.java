package X;

/* renamed from: X.CzN, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29509CzN implements InterfaceC30845DhK {
    public final CW2 A00;
    public final C7G A01;
    public final C28275CdK A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public C29509CzN(CW2 cw2, C7G c7g, C28275CdK c28275CdK, String str, String str2, String str3, String str4, String str5) {
        C14360o3.A0B(c7g, 4);
        this.A05 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A01 = c7g;
        this.A06 = str4;
        this.A07 = str5;
        this.A00 = cw2;
        this.A02 = c28275CdK;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C29509CzN) {
                C29509CzN c29509CzN = (C29509CzN) obj;
                if (!C14360o3.A0K(this.A05, c29509CzN.A05) || !C14360o3.A0K(this.A03, c29509CzN.A03) || !C14360o3.A0K(this.A04, c29509CzN.A04) || this.A01 != c29509CzN.A01 || !C14360o3.A0K(this.A06, c29509CzN.A06) || !C14360o3.A0K(this.A07, c29509CzN.A07) || !C14360o3.A0K(this.A00, c29509CzN.A00) || !C14360o3.A0K(this.A02, c29509CzN.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0K(this.A04, AbstractC166997dE.A0K(this.A03, AbstractC166987dD.A0J(this.A05)))) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC166997dE.A0I(this.A02);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ImagineSuggestion(prompt=");
        A1C.append(this.A05);
        A1C.append(", displayPrompt=");
        A1C.append(this.A03);
        A1C.append(", imageUri=");
        A1C.append(this.A04);
        A1C.append(", intent=");
        A1C.append(this.A01);
        A1C.append(", requestId=");
        A1C.append(this.A06);
        A1C.append(", responseId=");
        A1C.append(this.A07);
        A1C.append(", creatorAttribution=");
        A1C.append(this.A00);
        A1C.append(", suggestionsPromptMetadata=");
        return AbstractC167017dG.A0o(this.A02, A1C);
    }
}
