package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class BPQ extends C0T6 implements InterfaceC30979Dja {
    public final int A00;
    public final int A01;
    public final C120985dq A02;
    public final C5QE A03;
    public final C38321qM A04;
    public final BPP A05;
    public final InterfaceC30862Dhb A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final int A0B;
    public final UserSession A0C;
    public final C75113Zb A0D;
    public final EnumC25465BOe A0E;

    public BPQ(C120985dq c120985dq, C5QE c5qe, UserSession userSession, C38321qM c38321qM, C75113Zb c75113Zb, EnumC25465BOe enumC25465BOe, BPP bpp, InterfaceC30862Dhb interfaceC30862Dhb, String str, int i, int i2, int i3, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(str, 4);
        C14360o3.A0B(interfaceC30862Dhb, 7);
        this.A0C = userSession;
        this.A00 = i;
        this.A01 = i2;
        this.A07 = str;
        this.A03 = c5qe;
        this.A0E = enumC25465BOe;
        this.A06 = interfaceC30862Dhb;
        this.A09 = z;
        this.A0A = z2;
        this.A08 = z3;
        this.A0B = i3;
        this.A05 = bpp;
        this.A02 = c120985dq;
        this.A04 = c38321qM;
        this.A0D = c75113Zb;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BPQ) {
                BPQ bpq = (BPQ) obj;
                if (!C14360o3.A0K(this.A0C, bpq.A0C) || this.A00 != bpq.A00 || this.A01 != bpq.A01 || !C14360o3.A0K(this.A07, bpq.A07) || !C14360o3.A0K(this.A03, bpq.A03) || this.A0E != bpq.A0E || !C14360o3.A0K(this.A06, bpq.A06) || this.A09 != bpq.A09 || this.A0A != bpq.A0A || this.A08 != bpq.A08 || this.A0B != bpq.A0B || !C14360o3.A0K(this.A05, bpq.A05) || !C14360o3.A0K(this.A02, bpq.A02) || !C14360o3.A0K(this.A04, bpq.A04) || !C14360o3.A0K(this.A0D, bpq.A0D)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A0D, AbstractC166997dE.A0J(this.A04, AbstractC166997dE.A0J(this.A02, AbstractC166997dE.A0J(this.A05, (AbstractC167007dF.A0D(this.A08, AbstractC167007dF.A0D(this.A0A, AbstractC167007dF.A0D(this.A09, AbstractC166997dE.A0J(this.A06, AbstractC166997dE.A0J(this.A0E, AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A0K(this.A07, (((AbstractC166987dD.A0G(this.A0C) + this.A00) * 31) + this.A01) * 31))))))) + this.A0B) * 31))));
    }

    @Override // X.InterfaceC30979Dja
    public final int BXx() {
        return this.A0B;
    }
}
