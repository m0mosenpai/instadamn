package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.1s4, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1s4 extends C0T6 implements InterfaceC39271s5 {
    public final InterfaceC106394qt A00;
    public final InterfaceC106394qt A01;
    public final C5FS A02;
    public final C5FT A03;
    public final C5FU A04;
    public final Boolean A05;
    public final Boolean A06;
    public final Boolean A07;
    public final String A08;

    @Override // X.InterfaceC39271s5
    public final C1s4 Eqj() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1s4) {
                C1s4 c1s4 = (C1s4) obj;
                if (!C14360o3.A0K(this.A08, c1s4.A08) || !C14360o3.A0K(this.A00, c1s4.A00) || !C14360o3.A0K(this.A01, c1s4.A01) || !C14360o3.A0K(this.A02, c1s4.A02) || !C14360o3.A0K(this.A03, c1s4.A03) || !C14360o3.A0K(this.A05, c1s4.A05) || !C14360o3.A0K(this.A06, c1s4.A06) || !C14360o3.A0K(this.A07, c1s4.A07) || !C14360o3.A0K(this.A04, c1s4.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A08;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        InterfaceC106394qt interfaceC106394qt = this.A00;
        int hashCode2 = (hashCode + (interfaceC106394qt == null ? 0 : interfaceC106394qt.hashCode())) * 31;
        InterfaceC106394qt interfaceC106394qt2 = this.A01;
        int hashCode3 = (hashCode2 + (interfaceC106394qt2 == null ? 0 : interfaceC106394qt2.hashCode())) * 31;
        C5FS c5fs = this.A02;
        int hashCode4 = (hashCode3 + (c5fs == null ? 0 : c5fs.hashCode())) * 31;
        C5FT c5ft = this.A03;
        int hashCode5 = (hashCode4 + (c5ft == null ? 0 : c5ft.hashCode())) * 31;
        Boolean bool = this.A05;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.A06;
        int hashCode7 = (hashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.A07;
        int hashCode8 = (hashCode7 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        C5FU c5fu = this.A04;
        return hashCode8 + (c5fu != null ? c5fu.hashCode() : 0);
    }

    @Override // X.InterfaceC39271s5
    public final String AaI() {
        return this.A08;
    }

    @Override // X.InterfaceC39271s5
    public final InterfaceC106394qt B5h() {
        return this.A00;
    }

    @Override // X.InterfaceC39271s5
    public final InterfaceC106394qt B5r() {
        return this.A01;
    }

    @Override // X.InterfaceC39271s5
    public final C5FS B5x() {
        return this.A02;
    }

    @Override // X.InterfaceC39271s5
    public final C5FT BJ2() {
        return this.A03;
    }

    @Override // X.InterfaceC39271s5
    public final C5FU C1P() {
        return this.A04;
    }

    @Override // X.InterfaceC39271s5
    public final Boolean CUf() {
        return this.A05;
    }

    @Override // X.InterfaceC39271s5
    public final Boolean CUi() {
        return this.A06;
    }

    @Override // X.InterfaceC39271s5
    public final Boolean Cbh() {
        return this.A07;
    }

    @Override // X.InterfaceC39271s5
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTAfiInfoDict", AbstractC37398Gde.A00(this));
    }

    public C1s4(InterfaceC106394qt interfaceC106394qt, InterfaceC106394qt interfaceC106394qt2, C5FS c5fs, C5FT c5ft, C5FU c5fu, Boolean bool, Boolean bool2, Boolean bool3, String str) {
        this.A08 = str;
        this.A00 = interfaceC106394qt;
        this.A01 = interfaceC106394qt2;
        this.A02 = c5fs;
        this.A03 = c5ft;
        this.A05 = bool;
        this.A06 = bool2;
        this.A07 = bool3;
        this.A04 = c5fu;
    }
}
