package X;

/* renamed from: X.BXz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25714BXz extends C0T6 implements InterfaceC30954DjB {
    public final C51759Mti A00;
    public final C51759Mti A01;
    public final C51759Mti A02;
    public final C51759Mti A03;
    public final EnumC27350C5f A04;
    public final C6N A05;
    public final AbstractC55145Od4 A06;
    public final EnumC72393Xcf A07;
    public final Integer A08;
    public final boolean A09;
    public final boolean A0A;

    public C25714BXz(C51759Mti c51759Mti, C51759Mti c51759Mti2, C51759Mti c51759Mti3, C51759Mti c51759Mti4, EnumC27350C5f enumC27350C5f, C6N c6n, AbstractC55145Od4 abstractC55145Od4, EnumC72393Xcf enumC72393Xcf, Integer num, boolean z) {
        AbstractC167017dG.A1R(enumC72393Xcf, c51759Mti);
        C14360o3.A0B(abstractC55145Od4, 8);
        this.A0A = true;
        this.A07 = enumC72393Xcf;
        this.A02 = c51759Mti;
        this.A00 = c51759Mti2;
        this.A03 = c51759Mti3;
        this.A08 = num;
        this.A05 = c6n;
        this.A06 = abstractC55145Od4;
        this.A01 = c51759Mti4;
        this.A09 = z;
        this.A04 = enumC27350C5f;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25714BXz) {
                C25714BXz c25714BXz = (C25714BXz) obj;
                if (this.A0A != c25714BXz.A0A || this.A07 != c25714BXz.A07 || !C14360o3.A0K(this.A02, c25714BXz.A02) || !C14360o3.A0K(this.A00, c25714BXz.A00) || !C14360o3.A0K(this.A03, c25714BXz.A03) || !C14360o3.A0K(this.A08, c25714BXz.A08) || this.A05 != c25714BXz.A05 || !C14360o3.A0K(this.A06, c25714BXz.A06) || !C14360o3.A0K(this.A01, c25714BXz.A01) || this.A09 != c25714BXz.A09 || this.A04 != c25714BXz.A04) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A09, (AbstractC166997dE.A0J(this.A06, (((((((AbstractC166997dE.A0J(this.A02, AbstractC166997dE.A0J(this.A07, AbstractC25225BEi.A08(this.A0A))) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A08)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC166997dE.A0I(this.A04);
    }

    @Override // X.InterfaceC30954DjB
    public final boolean CGh() {
        return this.A0A;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("NavigationRowUiState(visible=");
        A1C.append(this.A0A);
        A1C.append(", id=");
        A1C.append(this.A07);
        A1C.append(AbstractC111324zv.A00(1428));
        A1C.append(this.A02);
        A1C.append(MSV.A00(66));
        A1C.append(this.A00);
        A1C.append(MSV.A00(135));
        A1C.append(this.A03);
        A1C.append(", iconRes=");
        A1C.append(this.A08);
        A1C.append(", cellType=");
        A1C.append(this.A05);
        A1C.append(", abstractDestination=");
        A1C.append(this.A06);
        A1C.append(MSV.A00(623));
        A1C.append(this.A01);
        A1C.append(", disableNavigationRowClick=");
        A1C.append(this.A09);
        A1C.append(", badgeStyle=");
        return AbstractC167017dG.A0o(this.A04, A1C);
    }
}
