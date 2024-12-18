package X;

/* loaded from: classes5.dex */
public final class C40 extends AbstractC27456C9y {
    public final C28002CVz A00;
    public final C28275CdK A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C40) {
                C40 c40 = (C40) obj;
                if (!C14360o3.A0K(this.A00, c40.A00) || this.A04 != c40.A04 || !C14360o3.A0K(this.A02, c40.A02) || !C14360o3.A0K(this.A01, c40.A01) || this.A03 != c40.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A03, (((AbstractC167007dF.A0D(this.A04, AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC166997dE.A0I(this.A01)) * 31);
    }

    public C40(C28002CVz c28002CVz, C28275CdK c28275CdK, String str, boolean z, boolean z2) {
        this.A00 = c28002CVz;
        this.A04 = z;
        this.A02 = str;
        this.A01 = c28275CdK;
        this.A03 = z2;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ResultScreen(generatedImageResponse=");
        A1C.append(this.A00);
        A1C.append(", useGridLayout=");
        A1C.append(this.A04);
        A1C.append(", displayPromptOverride=");
        A1C.append(this.A02);
        A1C.append(", suggestionsPromptMetadata=");
        A1C.append(this.A01);
        A1C.append(", actionButtonEnabled=");
        return AbstractC25236BEt.A0a(A1C, this.A03);
    }
}
