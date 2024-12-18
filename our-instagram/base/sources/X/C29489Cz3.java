package X;

/* renamed from: X.Cz3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29489Cz3 implements InterfaceC30840DhF {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final InterfaceC16660sJ A04;
    public final InterfaceC16660sJ A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C29489Cz3) {
                C29489Cz3 c29489Cz3 = (C29489Cz3) obj;
                if (!C14360o3.A0K(this.A01, c29489Cz3.A01) || !C14360o3.A0K(this.A02, c29489Cz3.A02) || !C14360o3.A0K(this.A00, c29489Cz3.A00) || !C14360o3.A0K(this.A03, c29489Cz3.A03) || this.A06 != c29489Cz3.A06 || !C14360o3.A0K(this.A05, c29489Cz3.A05) || !C14360o3.A0K(this.A04, c29489Cz3.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A04, AbstractC166997dE.A0J(this.A05, AbstractC167007dF.A0D(this.A06, (AbstractC166997dE.A0K(this.A00, AbstractC166997dE.A0K(this.A02, AbstractC166987dD.A0J(this.A01))) + AbstractC167017dG.A0O(this.A03)) * 31)));
    }

    public C29489Cz3(String str, String str2, String str3, String str4, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, boolean z) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = str3;
        this.A03 = str4;
        this.A06 = z;
        this.A05 = interfaceC16660sJ;
        this.A04 = interfaceC16660sJ2;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("MetaAISearchLinkUIState(searchEngineIconUrl=");
        A1C.append(this.A01);
        A1C.append(AbstractC43591JPw.A00(232));
        A1C.append(this.A02);
        A1C.append(", attributionUri=");
        A1C.append(this.A00);
        A1C.append(", sourcesUrl=");
        A1C.append(this.A03);
        A1C.append(", isSourceVisible=");
        A1C.append(this.A06);
        A1C.append(", onSourcesFooterTextClicked=");
        A1C.append(this.A05);
        A1C.append(", onSearchInfoCardClicked=");
        return AbstractC167017dG.A0o(this.A04, A1C);
    }
}
