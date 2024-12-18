package X;

/* loaded from: classes11.dex */
public final class WDT {
    public InterfaceC72013XFb A00;
    public InterfaceC72013XFb A01;
    public Integer A02;
    public Integer A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;

    public WDT(InterfaceC72013XFb interfaceC72013XFb, InterfaceC72013XFb interfaceC72013XFb2, Integer num, boolean z, boolean z2, boolean z3) {
        this.A02 = num;
        this.A04 = z;
        this.A01 = interfaceC72013XFb;
        this.A00 = interfaceC72013XFb2;
        this.A06 = z2;
        this.A05 = z3;
        this.A03 = null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WDT) {
                WDT wdt = (WDT) obj;
                if (this.A02 != wdt.A02 || this.A04 != wdt.A04 || !C14360o3.A0K(this.A01, wdt.A01) || !C14360o3.A0K(this.A00, wdt.A00) || this.A06 != wdt.A06 || this.A05 != wdt.A05 || !C14360o3.A0K(this.A03, wdt.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public static void A00(WDT wdt, Object[] objArr, int i) {
        wdt.A01 = new Waa(objArr, i);
    }

    public final int hashCode() {
        Integer num = this.A02;
        int i = 0;
        int A0D = AbstractC167007dF.A0D(this.A05, AbstractC167007dF.A0D(this.A06, (((AbstractC167007dF.A0D(this.A04, AbstractC25230BEn.A0C(num, AbstractC58462m5.A01(num)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31));
        Integer num2 = this.A03;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return A0D + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Builder(role=");
        sb.append(AbstractC58462m5.A01(this.A02));
        sb.append(", isClickable=");
        sb.append(this.A04);
        sb.append(MSV.A00(129));
        sb.append(this.A01);
        sb.append(", clickDescription=");
        sb.append(this.A00);
        sb.append(MSV.A00(22));
        sb.append(this.A06);
        sb.append(", isHeading=");
        sb.append(this.A05);
        sb.append(", traversalAfterId=");
        return AbstractC167017dG.A0o(this.A03, sb);
    }

    public WDT() {
        this(null, null, C05F.A00, false, false, false);
    }
}
