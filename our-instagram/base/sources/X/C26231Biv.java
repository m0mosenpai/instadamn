package X;

import java.util.List;

/* renamed from: X.Biv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26231Biv extends C0T6 implements InterfaceC31151Dmv {
    public final long A00;
    public final long A01;
    public final C38688GzT A02;
    public final EnumC53144Nex A03;
    public final InterfaceC58302Psu A04;
    public final InterfaceC58303Psv A05;
    public final String A06;
    public final InterfaceC65696TsI A07;
    public final boolean A08;
    public final boolean A09;
    public final List A0A;
    public final boolean A0B;

    public C26231Biv(C38688GzT c38688GzT, EnumC53144Nex enumC53144Nex, InterfaceC58302Psu interfaceC58302Psu, InterfaceC58303Psv interfaceC58303Psv, String str, List list, InterfaceC65696TsI interfaceC65696TsI, long j, long j2, boolean z, boolean z2) {
        AbstractC167007dF.A1G(interfaceC58303Psv, 1, list);
        C14360o3.A0B(interfaceC58302Psu, 11);
        this.A05 = interfaceC58303Psv;
        this.A0B = true;
        this.A08 = z;
        this.A06 = str;
        this.A0A = list;
        this.A02 = c38688GzT;
        this.A09 = z2;
        this.A01 = j;
        this.A00 = j2;
        this.A07 = interfaceC65696TsI;
        this.A04 = interfaceC58302Psu;
        this.A03 = enumC53144Nex;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26231Biv) {
                C26231Biv c26231Biv = (C26231Biv) obj;
                if (!C14360o3.A0K(this.A05, c26231Biv.A05) || this.A0B != c26231Biv.A0B || this.A08 != c26231Biv.A08 || !C14360o3.A0K(this.A06, c26231Biv.A06) || !C14360o3.A0K(this.A0A, c26231Biv.A0A) || !C14360o3.A0K(this.A02, c26231Biv.A02) || this.A09 != c26231Biv.A09 || this.A01 != c26231Biv.A01 || this.A00 != c26231Biv.A00 || !C14360o3.A0K(this.A07, c26231Biv.A07) || !C14360o3.A0K(this.A04, c26231Biv.A04) || this.A03 != c26231Biv.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A03, AbstractC166997dE.A0J(this.A04, AbstractC166997dE.A0J(this.A07, AbstractC167007dF.A07(this.A00, AbstractC167007dF.A07(this.A01, AbstractC167007dF.A0D(this.A09, (AbstractC166997dE.A0J(this.A0A, AbstractC166997dE.A0K(this.A06, AbstractC167007dF.A0D(this.A08, AbstractC167007dF.A0D(this.A0B, AbstractC166987dD.A0G(this.A05))))) + AbstractC167017dG.A0M(this.A02)) * 31))))));
    }

    @Override // X.InterfaceC31151Dmv
    public final C38688GzT AfK() {
        return this.A02;
    }

    @Override // X.InterfaceC31151Dmv
    public final /* bridge */ /* synthetic */ InterfaceC57989PnZ BF6() {
        return this.A05;
    }

    @Override // X.InterfaceC30954DjB
    public final boolean CGh() {
        return this.A0B;
    }
}
