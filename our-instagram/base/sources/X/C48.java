package X;

/* loaded from: classes5.dex */
public final class C48 extends AbstractC27457C9z {
    public final String A00;
    public final String A01;
    public final boolean A02;
    public final C28275CdK A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C48) {
                C48 c48 = (C48) obj;
                if (!C14360o3.A0K(this.A01, c48.A01) || !C14360o3.A0K(this.A00, c48.A00) || this.A02 != c48.A02 || !C14360o3.A0K(this.A03, c48.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A02, ((AbstractC167017dG.A0O(this.A01) * 31) + AbstractC167017dG.A0O(this.A00)) * 31) + AbstractC166997dE.A0I(this.A03);
    }

    public C48(C28275CdK c28275CdK, String str, String str2, boolean z) {
        this.A01 = str;
        this.A00 = str2;
        this.A02 = z;
        this.A03 = c28275CdK;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("MEmuOnboarding(prompt=");
        A1C.append(this.A01);
        A1C.append(", displayPrompt=");
        A1C.append(this.A00);
        A1C.append(", isStartingWithMemuOnboarding=");
        A1C.append(this.A02);
        A1C.append(", suggestionsPromptMetadata=");
        return AbstractC167017dG.A0o(this.A03, A1C);
    }
}
