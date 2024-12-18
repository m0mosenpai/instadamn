package X;

/* renamed from: X.CdF, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28270CdF {
    public final String A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C28270CdF) {
                C28270CdF c28270CdF = (C28270CdF) obj;
                if (!C14360o3.A0K(this.A01, c28270CdF.A01) || this.A03 != c28270CdF.A03 || this.A02 != c28270CdF.A02 || !C14360o3.A0K(this.A00, c28270CdF.A00) || this.A04 != c28270CdF.A04) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A04, (AbstractC167007dF.A0D(this.A02, AbstractC167007dF.A0D(this.A03, AbstractC167017dG.A0O(this.A01) * 31)) + AbstractC25227BEk.A07(this.A00)) * 31);
    }

    public C28270CdF(String str, String str2, boolean z, boolean z2, boolean z3) {
        this.A01 = str;
        this.A03 = z;
        this.A02 = z2;
        this.A00 = str2;
        this.A04 = z3;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("PromptParams(inputPrompt=");
        A1C.append(this.A01);
        A1C.append(", isTextInputDisabled=");
        A1C.append(this.A03);
        A1C.append(", alwaysShowAddOn=");
        A1C.append(this.A02);
        A1C.append(", displayPrompt=");
        A1C.append(this.A00);
        A1C.append(", shouldAutoFocusTextInput=");
        return AbstractC25236BEt.A0a(A1C, this.A04);
    }

    public C28270CdF() {
        this(null, null, false, false, true);
    }
}
