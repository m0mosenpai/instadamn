package X;

import java.util.List;

/* renamed from: X.Bis, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26228Bis extends C0T6 implements InterfaceC31151Dmv {
    public final C51759Mti A00;
    public final C51759Mti A01;
    public final C38688GzT A02;
    public final InterfaceC58302Psu A03;
    public final List A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public C26228Bis(C51759Mti c51759Mti, C51759Mti c51759Mti2, C38688GzT c38688GzT, InterfaceC58302Psu interfaceC58302Psu, List list, boolean z, boolean z2, boolean z3) {
        AbstractC167007dF.A1G(interfaceC58302Psu, 1, list);
        C14360o3.A0B(c51759Mti, 7);
        this.A03 = interfaceC58302Psu;
        this.A07 = z;
        this.A05 = z2;
        this.A06 = z3;
        this.A04 = list;
        this.A02 = c38688GzT;
        this.A01 = c51759Mti;
        this.A00 = c51759Mti2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26228Bis) {
                C26228Bis c26228Bis = (C26228Bis) obj;
                if (!C14360o3.A0K(this.A03, c26228Bis.A03) || this.A07 != c26228Bis.A07 || this.A05 != c26228Bis.A05 || this.A06 != c26228Bis.A06 || !C14360o3.A0K(this.A04, c26228Bis.A04) || !C14360o3.A0K(this.A02, c26228Bis.A02) || !C14360o3.A0K(this.A01, c26228Bis.A01) || !C14360o3.A0K(this.A00, c26228Bis.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A01, (AbstractC166997dE.A0J(this.A04, AbstractC167007dF.A0D(this.A06, AbstractC167007dF.A0D(this.A05, AbstractC167007dF.A0D(this.A07, AbstractC166987dD.A0G(this.A03))))) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    @Override // X.InterfaceC31151Dmv
    public final C38688GzT AfK() {
        return this.A02;
    }

    @Override // X.InterfaceC31151Dmv
    public final /* bridge */ /* synthetic */ InterfaceC57989PnZ BF6() {
        return this.A03;
    }

    @Override // X.InterfaceC30954DjB
    public final boolean CGh() {
        return this.A07;
    }
}
