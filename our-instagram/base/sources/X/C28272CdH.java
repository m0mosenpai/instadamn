package X;

/* renamed from: X.CdH, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28272CdH {
    public final String A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C28272CdH) {
                C28272CdH c28272CdH = (C28272CdH) obj;
                if (this.A03 != c28272CdH.A03 || !C14360o3.A0K(this.A01, c28272CdH.A01) || !C14360o3.A0K(this.A00, c28272CdH.A00) || this.A04 != c28272CdH.A04 || this.A02 != c28272CdH.A02 || this.A05 != c28272CdH.A05) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A05, AbstractC167007dF.A0D(this.A02, AbstractC167007dF.A0D(this.A04, (((AbstractC25225BEi.A08(this.A03) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC25227BEk.A07(this.A00)) * 31)));
    }

    public C28272CdH(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A03 = z;
        this.A01 = str;
        this.A00 = str2;
        this.A04 = z2;
        this.A02 = z3;
        this.A05 = z4;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ImagineFooterUiState(isDisabled=");
        A1C.append(this.A03);
        A1C.append(", prompt=");
        A1C.append(this.A01);
        A1C.append(", displayPrompt=");
        A1C.append(this.A00);
        A1C.append(", isTypedText=");
        A1C.append(this.A04);
        A1C.append(", alwaysShowAddOn=");
        A1C.append(this.A02);
        A1C.append(", shouldAutoFocusTextInput=");
        return AbstractC25236BEt.A0a(A1C, this.A05);
    }

    public C28272CdH() {
        this(null, null, false, false, false, true);
    }
}
