package X;

import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class H44 extends C0T6 implements InterfaceC43570JMe {
    public final Boolean A00;
    public final Boolean A01;
    public final Boolean A02;
    public final Boolean A03;
    public final Boolean A04;
    public final Boolean A05;
    public final Boolean A06;
    public final Boolean A07;
    public final Boolean A08;
    public final Integer A09;
    public final Integer A0A;

    @Override // X.InterfaceC43570JMe
    public final H44 Evr() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H44) {
                H44 h44 = (H44) obj;
                if (!C14360o3.A0K(this.A09, h44.A09) || !C14360o3.A0K(this.A00, h44.A00) || !C14360o3.A0K(this.A0A, h44.A0A) || !C14360o3.A0K(this.A01, h44.A01) || !C14360o3.A0K(this.A02, h44.A02) || !C14360o3.A0K(this.A03, h44.A03) || !C14360o3.A0K(this.A04, h44.A04) || !C14360o3.A0K(this.A05, h44.A05) || !C14360o3.A0K(this.A06, h44.A06) || !C14360o3.A0K(this.A07, h44.A07) || !C14360o3.A0K(this.A08, h44.A08)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC43570JMe
    public final Integer Aa5() {
        return this.A09;
    }

    @Override // X.InterfaceC43570JMe
    public final Boolean Axt() {
        return this.A00;
    }

    @Override // X.InterfaceC43570JMe
    public final Integer AyZ() {
        return this.A0A;
    }

    @Override // X.InterfaceC43570JMe
    public final Boolean BDw() {
        return this.A01;
    }

    @Override // X.InterfaceC43570JMe
    public final Boolean Bw1() {
        return this.A04;
    }

    @Override // X.InterfaceC43570JMe
    public final Boolean BwA() {
        return this.A05;
    }

    @Override // X.InterfaceC43570JMe
    public final Boolean BwB() {
        return this.A06;
    }

    @Override // X.InterfaceC43570JMe
    public final Boolean BwZ() {
        return this.A07;
    }

    @Override // X.InterfaceC43570JMe
    public final Boolean Bx1() {
        return this.A08;
    }

    @Override // X.InterfaceC43570JMe
    public final Boolean CSJ() {
        return this.A02;
    }

    @Override // X.InterfaceC43570JMe
    public final Boolean CWC() {
        return this.A03;
    }

    @Override // X.InterfaceC43570JMe
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTLikerConfigDict", AbstractC40041HpT.A00(this));
    }

    public final int hashCode() {
        return (((((((((((((((((((AbstractC167017dG.A0M(this.A09) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A0A)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0M(this.A06)) * 31) + AbstractC167017dG.A0M(this.A07)) * 31) + AbstractC166997dE.A0I(this.A08);
    }

    public H44(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Integer num, Integer num2) {
        this.A09 = num;
        this.A00 = bool;
        this.A0A = num2;
        this.A01 = bool2;
        this.A02 = bool3;
        this.A03 = bool4;
        this.A04 = bool5;
        this.A05 = bool6;
        this.A06 = bool7;
        this.A07 = bool8;
        this.A08 = bool9;
    }
}
