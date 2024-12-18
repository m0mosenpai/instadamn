package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.4d9, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4d9 extends C0T6 implements InterfaceC99394dA {
    public final Boolean A00;
    public final Boolean A01;
    public final Boolean A02;
    public final Boolean A03;
    public final Boolean A04;
    public final Boolean A05;
    public final Boolean A06;
    public final Boolean A07;
    public final String A08;
    public final String A09;

    @Override // X.InterfaceC99394dA
    public final C4d9 F39() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C4d9) {
                C4d9 c4d9 = (C4d9) obj;
                if (!C14360o3.A0K(this.A00, c4d9.A00) || !C14360o3.A0K(this.A01, c4d9.A01) || !C14360o3.A0K(this.A02, c4d9.A02) || !C14360o3.A0K(this.A03, c4d9.A03) || !C14360o3.A0K(this.A04, c4d9.A04) || !C14360o3.A0K(this.A05, c4d9.A05) || !C14360o3.A0K(this.A06, c4d9.A06) || !C14360o3.A0K(this.A07, c4d9.A07) || !C14360o3.A0K(this.A08, c4d9.A08) || !C14360o3.A0K(this.A09, c4d9.A09)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean bool = this.A00;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.A01;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.A02;
        int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.A03;
        int hashCode4 = (hashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.A04;
        int hashCode5 = (hashCode4 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.A05;
        int hashCode6 = (hashCode5 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.A06;
        int hashCode7 = (hashCode6 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.A07;
        int hashCode8 = (hashCode7 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        String str = this.A08;
        int hashCode9 = (hashCode8 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.A09;
        return hashCode9 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // X.InterfaceC99394dA
    public final Boolean AlE() {
        return this.A00;
    }

    @Override // X.InterfaceC99394dA
    public final Boolean AlF() {
        return this.A01;
    }

    @Override // X.InterfaceC99394dA
    public final Boolean AlN() {
        return this.A02;
    }

    @Override // X.InterfaceC99394dA
    public final Boolean AlO() {
        return this.A03;
    }

    @Override // X.InterfaceC99394dA
    public final Boolean BC5() {
        return this.A04;
    }

    @Override // X.InterfaceC99394dA
    public final Boolean BbO() {
        return this.A07;
    }

    @Override // X.InterfaceC99394dA
    public final String BbP() {
        return this.A08;
    }

    @Override // X.InterfaceC99394dA
    public final String BbQ() {
        return this.A09;
    }

    @Override // X.InterfaceC99394dA
    public final Boolean CaP() {
        return this.A05;
    }

    @Override // X.InterfaceC99394dA
    public final Boolean CaQ() {
        return this.A06;
    }

    @Override // X.InterfaceC99394dA
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTTextPostAppPinnedPostInfo", VPF.A00(this));
    }

    public C4d9(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, String str, String str2) {
        this.A00 = bool;
        this.A01 = bool2;
        this.A02 = bool3;
        this.A03 = bool4;
        this.A04 = bool5;
        this.A05 = bool6;
        this.A06 = bool7;
        this.A07 = bool8;
        this.A08 = str;
        this.A09 = str2;
    }
}
