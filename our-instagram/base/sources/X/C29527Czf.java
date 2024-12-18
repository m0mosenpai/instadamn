package X;

/* renamed from: X.Czf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29527Czf implements InterfaceC30962DjJ {
    public final int A00;
    public final String A01;
    public final InterfaceC16820sZ A02;
    public final InterfaceC16820sZ A03;
    public final InterfaceC16660sJ A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C29527Czf) {
                C29527Czf c29527Czf = (C29527Czf) obj;
                if (this.A00 != c29527Czf.A00 || !C14360o3.A0K(this.A01, c29527Czf.A01) || !C14360o3.A0K(this.A03, c29527Czf.A03) || !C14360o3.A0K(this.A02, c29527Czf.A02) || !C14360o3.A0K(this.A04, c29527Czf.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC30962DjJ
    public final AbstractC50812Vc EqC(C2Z1 c2z1) {
        int i = this.A00;
        String str = this.A01;
        InterfaceC16820sZ interfaceC16820sZ = this.A03;
        InterfaceC16820sZ interfaceC16820sZ2 = this.A02;
        InterfaceC16660sJ interfaceC16660sJ = this.A04;
        return new C26475Bmw(C51722Yv.A02, EnumC77683ds.FLEX_START, str, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16660sJ, i);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A04, AbstractC166997dE.A0J(this.A02, AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A0K(this.A01, this.A00 * 31))));
    }

    public C29527Czf(String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16660sJ interfaceC16660sJ, int i) {
        this.A00 = i;
        this.A01 = str;
        this.A03 = interfaceC16820sZ;
        this.A02 = interfaceC16820sZ2;
        this.A04 = interfaceC16660sJ;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("TextSuggestion(id=");
        A1C.append(this.A00);
        A1C.append(", text=");
        A1C.append(this.A01);
        A1C.append(", resultOnVisible=");
        A1C.append(this.A03);
        A1C.append(", resultOnClick=");
        A1C.append(this.A02);
        A1C.append(", feedbackOnClick=");
        return AbstractC167017dG.A0o(this.A04, A1C);
    }
}
