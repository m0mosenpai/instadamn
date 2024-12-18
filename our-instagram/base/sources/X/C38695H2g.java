package X;

/* renamed from: X.H2g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38695H2g extends C0T6 implements InterfaceC43554JLo {
    public final H4O A00;
    public final JKT A01;
    public final InterfaceC43584JMs A02;
    public final C38321qM A03;
    public final Integer A04;

    @Override // X.InterfaceC43554JLo
    public final C38695H2g Ery(C1DY c1dy) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38695H2g) {
                C38695H2g c38695H2g = (C38695H2g) obj;
                if (!C14360o3.A0K(this.A02, c38695H2g.A02) || !C14360o3.A0K(this.A01, c38695H2g.A01) || !C14360o3.A0K(this.A03, c38695H2g.A03) || !C14360o3.A0K(this.A00, c38695H2g.A00) || !C14360o3.A0K(this.A04, c38695H2g.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC43554JLo
    public final InterfaceC43584JMs AZH() {
        return this.A02;
    }

    @Override // X.InterfaceC43554JLo
    public final JKT AgI() {
        return this.A01;
    }

    @Override // X.InterfaceC43554JLo
    public final C38321qM BQN() {
        return this.A03;
    }

    @Override // X.InterfaceC43554JLo
    public final /* bridge */ /* synthetic */ InterfaceC43576JMk BWY() {
        return this.A00;
    }

    @Override // X.InterfaceC43554JLo
    public final Integer CBl() {
        return this.A04;
    }

    public final int hashCode() {
        return (((((((AbstractC167017dG.A0M(this.A02) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC166997dE.A0I(this.A04);
    }

    public C38695H2g(InterfaceC43584JMs interfaceC43584JMs, H4O h4o, JKT jkt, C38321qM c38321qM, Integer num) {
        this.A02 = interfaceC43584JMs;
        this.A01 = jkt;
        this.A03 = c38321qM;
        this.A00 = h4o;
        this.A04 = num;
    }

    @Override // X.InterfaceC43554JLo
    public final InterfaceC43554JLo E8q(C1DY c1dy) {
        return this;
    }
}
