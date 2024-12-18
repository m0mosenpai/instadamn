package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.3vn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C87793vn extends C0T6 implements InterfaceC87803vo {
    public final C107104sG A00;
    public final C107104sG A01;
    public final C107104sG A02;
    public final C107104sG A03;
    public final C107104sG A04;
    public final C107104sG A05;
    public final C107104sG A06;
    public final C107104sG A07;
    public final C107104sG A08;

    @Override // X.InterfaceC87803vo
    public final C87793vn Ewr() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C87793vn) {
                C87793vn c87793vn = (C87793vn) obj;
                if (!C14360o3.A0K(this.A00, c87793vn.A00) || !C14360o3.A0K(this.A01, c87793vn.A01) || !C14360o3.A0K(this.A02, c87793vn.A02) || !C14360o3.A0K(this.A03, c87793vn.A03) || !C14360o3.A0K(this.A04, c87793vn.A04) || !C14360o3.A0K(this.A05, c87793vn.A05) || !C14360o3.A0K(this.A06, c87793vn.A06) || !C14360o3.A0K(this.A07, c87793vn.A07) || !C14360o3.A0K(this.A08, c87793vn.A08)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        C107104sG c107104sG = this.A00;
        int hashCode = (c107104sG == null ? 0 : c107104sG.hashCode()) * 31;
        C107104sG c107104sG2 = this.A01;
        int hashCode2 = (hashCode + (c107104sG2 == null ? 0 : c107104sG2.hashCode())) * 31;
        C107104sG c107104sG3 = this.A02;
        int hashCode3 = (hashCode2 + (c107104sG3 == null ? 0 : c107104sG3.hashCode())) * 31;
        C107104sG c107104sG4 = this.A03;
        int hashCode4 = (hashCode3 + (c107104sG4 == null ? 0 : c107104sG4.hashCode())) * 31;
        C107104sG c107104sG5 = this.A04;
        int hashCode5 = (hashCode4 + (c107104sG5 == null ? 0 : c107104sG5.hashCode())) * 31;
        C107104sG c107104sG6 = this.A05;
        int hashCode6 = (hashCode5 + (c107104sG6 == null ? 0 : c107104sG6.hashCode())) * 31;
        C107104sG c107104sG7 = this.A06;
        int hashCode7 = (hashCode6 + (c107104sG7 == null ? 0 : c107104sG7.hashCode())) * 31;
        C107104sG c107104sG8 = this.A07;
        int hashCode8 = (hashCode7 + (c107104sG8 == null ? 0 : c107104sG8.hashCode())) * 31;
        C107104sG c107104sG9 = this.A08;
        return hashCode8 + (c107104sG9 != null ? c107104sG9.hashCode() : 0);
    }

    @Override // X.InterfaceC87803vo
    public final /* bridge */ /* synthetic */ InterfaceC107114sH AtW() {
        return this.A00;
    }

    @Override // X.InterfaceC87803vo
    public final /* bridge */ /* synthetic */ InterfaceC107114sH B20() {
        return this.A01;
    }

    @Override // X.InterfaceC87803vo
    public final /* bridge */ /* synthetic */ InterfaceC107114sH B7j() {
        return this.A02;
    }

    @Override // X.InterfaceC87803vo
    public final /* bridge */ /* synthetic */ InterfaceC107114sH BA0() {
        return this.A03;
    }

    @Override // X.InterfaceC87803vo
    public final /* bridge */ /* synthetic */ InterfaceC107114sH BDB() {
        return this.A04;
    }

    @Override // X.InterfaceC87803vo
    public final /* bridge */ /* synthetic */ InterfaceC107114sH BEW() {
        return this.A05;
    }

    @Override // X.InterfaceC87803vo
    public final /* bridge */ /* synthetic */ InterfaceC107114sH BTf() {
        return this.A06;
    }

    @Override // X.InterfaceC87803vo
    public final /* bridge */ /* synthetic */ InterfaceC107114sH BhY() {
        return this.A07;
    }

    @Override // X.InterfaceC87803vo
    public final /* bridge */ /* synthetic */ InterfaceC107114sH C9F() {
        return this.A08;
    }

    @Override // X.InterfaceC87803vo
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTMoreInfo", BFW.A00(this));
    }

    public C87793vn(C107104sG c107104sG, C107104sG c107104sG2, C107104sG c107104sG3, C107104sG c107104sG4, C107104sG c107104sG5, C107104sG c107104sG6, C107104sG c107104sG7, C107104sG c107104sG8, C107104sG c107104sG9) {
        this.A00 = c107104sG;
        this.A01 = c107104sG2;
        this.A02 = c107104sG3;
        this.A03 = c107104sG4;
        this.A04 = c107104sG5;
        this.A05 = c107104sG6;
        this.A06 = c107104sG7;
        this.A07 = c107104sG8;
        this.A08 = c107104sG9;
    }
}
