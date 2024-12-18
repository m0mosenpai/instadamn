package X;

import java.util.List;

/* renamed from: X.Bit, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26229Bit extends C0T6 implements InterfaceC31151Dmv {
    public final C51759Mti A00;
    public final C51759Mti A01;
    public final InterfaceC58303Psv A02;
    public final String A03;
    public final List A04;
    public final List A05;
    public final boolean A06;
    public final C38688GzT A07;
    public final boolean A08;

    public C26229Bit(C51759Mti c51759Mti, C51759Mti c51759Mti2, C38688GzT c38688GzT, InterfaceC58303Psv interfaceC58303Psv, String str, List list, List list2, boolean z) {
        AbstractC25233BEq.A0x(1, interfaceC58303Psv, str, list);
        AbstractC167007dF.A1I(list2, 7, c51759Mti);
        this.A02 = interfaceC58303Psv;
        this.A08 = true;
        this.A06 = z;
        this.A03 = str;
        this.A04 = list;
        this.A07 = c38688GzT;
        this.A05 = list2;
        this.A01 = c51759Mti;
        this.A00 = c51759Mti2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26229Bit) {
                C26229Bit c26229Bit = (C26229Bit) obj;
                if (!C14360o3.A0K(this.A02, c26229Bit.A02) || this.A08 != c26229Bit.A08 || this.A06 != c26229Bit.A06 || !C14360o3.A0K(this.A03, c26229Bit.A03) || !C14360o3.A0K(this.A04, c26229Bit.A04) || !C14360o3.A0K(this.A07, c26229Bit.A07) || !C14360o3.A0K(this.A05, c26229Bit.A05) || !C14360o3.A0K(this.A01, c26229Bit.A01) || !C14360o3.A0K(this.A00, c26229Bit.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0J(this.A05, (AbstractC166997dE.A0J(this.A04, AbstractC166997dE.A0K(this.A03, AbstractC167007dF.A0D(this.A06, AbstractC167007dF.A0D(this.A08, AbstractC166987dD.A0G(this.A02))))) + AbstractC167017dG.A0M(this.A07)) * 31)) + AbstractC166997dE.A0I(this.A00);
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
        return this.A08;
    }
}
