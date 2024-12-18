package X;

import java.util.List;

/* renamed from: X.Biu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26230Biu extends C0T6 implements InterfaceC31151Dmv {
    public final C51759Mti A00;
    public final C51759Mti A01;
    public final InterfaceC58303Psv A02;
    public final String A03;
    public final String A04;
    public final List A05;
    public final boolean A06;
    public final C38688GzT A07;
    public final List A08;
    public final boolean A09;

    public C26230Biu(C51759Mti c51759Mti, C51759Mti c51759Mti2, C38688GzT c38688GzT, InterfaceC58303Psv interfaceC58303Psv, String str, String str2, List list, List list2, boolean z) {
        AbstractC25233BEq.A0x(1, interfaceC58303Psv, str, list);
        AbstractC25233BEq.A0y(7, c51759Mti, list2, c51759Mti2);
        C14360o3.A0B(str2, 10);
        this.A02 = interfaceC58303Psv;
        this.A09 = true;
        this.A06 = z;
        this.A04 = str;
        this.A08 = list;
        this.A07 = c38688GzT;
        this.A00 = c51759Mti;
        this.A05 = list2;
        this.A01 = c51759Mti2;
        this.A03 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26230Biu) {
                C26230Biu c26230Biu = (C26230Biu) obj;
                if (!C14360o3.A0K(this.A02, c26230Biu.A02) || this.A09 != c26230Biu.A09 || this.A06 != c26230Biu.A06 || !C14360o3.A0K(this.A04, c26230Biu.A04) || !C14360o3.A0K(this.A08, c26230Biu.A08) || !C14360o3.A0K(this.A07, c26230Biu.A07) || !C14360o3.A0K(this.A00, c26230Biu.A00) || !C14360o3.A0K(this.A05, c26230Biu.A05) || !C14360o3.A0K(this.A01, c26230Biu.A01) || !C14360o3.A0K(this.A03, c26230Biu.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A03, AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0J(this.A05, AbstractC166997dE.A0J(this.A00, (AbstractC166997dE.A0J(this.A08, AbstractC166997dE.A0K(this.A04, AbstractC167007dF.A0D(this.A06, AbstractC167007dF.A0D(this.A09, AbstractC166987dD.A0G(this.A02))))) + AbstractC167017dG.A0M(this.A07)) * 31))));
    }

    @Override // X.InterfaceC31151Dmv
    public final C38688GzT AfK() {
        return this.A07;
    }

    @Override // X.InterfaceC31151Dmv
    public final /* bridge */ /* synthetic */ InterfaceC57989PnZ BF6() {
        return this.A02;
    }

    @Override // X.InterfaceC30954DjB
    public final boolean CGh() {
        return this.A09;
    }
}
