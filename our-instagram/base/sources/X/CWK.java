package X;

/* loaded from: classes5.dex */
public final class CWK {
    public final C87 A00;
    public final C88 A01;
    public final C88 A02;
    public final CharSequence A03;
    public final Integer A04;
    public final String A05;
    public final InterfaceC16620sF A06;
    public final boolean A07;

    public CWK(C87 c87, C88 c88, C88 c882, CharSequence charSequence, Integer num, String str, InterfaceC16620sF interfaceC16620sF, boolean z) {
        AbstractC167007dF.A1H(c88, 5, c882);
        this.A04 = num;
        this.A05 = str;
        this.A00 = c87;
        this.A07 = z;
        this.A02 = c88;
        this.A03 = charSequence;
        this.A01 = c882;
        this.A06 = interfaceC16620sF;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CWK) {
                CWK cwk = (CWK) obj;
                if (this.A04 != cwk.A04 || !C14360o3.A0K(this.A05, cwk.A05) || this.A00 != cwk.A00 || this.A07 != cwk.A07 || this.A02 != cwk.A02 || !C14360o3.A0K(this.A03, cwk.A03) || this.A01 != cwk.A01 || !C14360o3.A0K(this.A06, cwk.A06)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int intValue = this.A04.intValue();
        if (intValue != 0) {
            str = "TEXT";
        } else {
            str = "ICON";
        }
        return AbstractC166987dD.A0I(this.A06, AbstractC166997dE.A0J(this.A01, (AbstractC166997dE.A0J(this.A02, AbstractC167007dF.A0D(this.A07, (AbstractC166997dE.A0K(this.A05, AbstractC25228BEl.A0F(str, intValue)) + AbstractC167017dG.A0M(this.A00)) * 31)) + AbstractC167017dG.A0M(this.A03)) * 31));
    }

    public final String toString() {
        String str;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("MetaAiActionButtonConfig(buttonType=");
        if (this.A04.intValue() != 0) {
            str = "TEXT";
        } else {
            str = "ICON";
        }
        A1C.append(str);
        A1C.append(", buttonAccessAbilityLabel=");
        A1C.append(this.A05);
        A1C.append(", buttonIconName=");
        A1C.append(this.A00);
        A1C.append(", isEnabled=");
        A1C.append(this.A07);
        A1C.append(", iconTintColor=");
        A1C.append(this.A02);
        A1C.append(", buttonText=");
        A1C.append((Object) this.A03);
        A1C.append(", buttonTextColor=");
        A1C.append(this.A01);
        A1C.append(", onClick=");
        return AbstractC167017dG.A0o(this.A06, A1C);
    }
}
