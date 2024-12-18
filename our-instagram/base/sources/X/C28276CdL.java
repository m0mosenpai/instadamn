package X;

/* renamed from: X.CdL, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28276CdL {
    public final C87 A00;
    public final C87 A01;
    public final C88 A02;
    public final CharSequence A03;
    public final Integer A04;
    public final String A05;
    public final InterfaceC16660sJ A06;

    public C28276CdL(C87 c87, C87 c872, C88 c88, CharSequence charSequence, Integer num, String str, InterfaceC16660sJ interfaceC16660sJ) {
        AbstractC167027dH.A0a(1, str, c87, c88, num);
        this.A05 = str;
        this.A00 = c87;
        this.A02 = c88;
        this.A04 = num;
        this.A03 = charSequence;
        this.A06 = interfaceC16660sJ;
        this.A01 = c872;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C28276CdL) {
                C28276CdL c28276CdL = (C28276CdL) obj;
                if (!C14360o3.A0K(this.A05, c28276CdL.A05) || this.A00 != c28276CdL.A00 || this.A04 != c28276CdL.A04 || !C14360o3.A0K(this.A03, c28276CdL.A03) || !C14360o3.A0K(this.A06, c28276CdL.A06) || this.A01 != c28276CdL.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A0J = AbstractC166997dE.A0J(this.A02, AbstractC166997dE.A0J(this.A00, AbstractC166987dD.A0J(this.A05)));
        int intValue = this.A04.intValue();
        if (intValue != 0) {
            str = "TEXT";
        } else {
            str = "ICON";
        }
        return AbstractC166997dE.A0J(this.A06, (AbstractC25231BEo.A0H(str, intValue, A0J) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC166997dE.A0I(this.A01);
    }

    public final String toString() {
        String str;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("MetaAiNavigationButtonConfig(buttonAccessAbilityLabel=");
        A1C.append(this.A05);
        A1C.append(", buttonIconName=");
        A1C.append(this.A00);
        A1C.append(", iconTintColor=");
        A1C.append(this.A02);
        A1C.append(", buttonType=");
        if (this.A04.intValue() != 0) {
            str = "TEXT";
        } else {
            str = "ICON";
        }
        A1C.append(str);
        A1C.append(", buttonText=");
        A1C.append((Object) this.A03);
        A1C.append(", onClick=");
        A1C.append(this.A06);
        A1C.append(", rtlButtonIconName=");
        return AbstractC167017dG.A0o(this.A01, A1C);
    }

    public C28276CdL() {
        this(C87.A0G, null, C88.A0X, null, C05F.A00, "Close Bottom Sheet", C30152DQi.A00);
    }
}
