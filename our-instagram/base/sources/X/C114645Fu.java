package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.5Fu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C114645Fu extends C0T6 implements InterfaceC114655Fv {
    public final Boolean A00;
    public final Boolean A01;
    public final Boolean A02;
    public final Boolean A03;
    public final Boolean A04;

    @Override // X.InterfaceC114655Fv
    public final C114645Fu F50() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C114645Fu) {
                C114645Fu c114645Fu = (C114645Fu) obj;
                if (!C14360o3.A0K(this.A00, c114645Fu.A00) || !C14360o3.A0K(this.A01, c114645Fu.A01) || !C14360o3.A0K(this.A02, c114645Fu.A02) || !C14360o3.A0K(this.A03, c114645Fu.A03) || !C14360o3.A0K(this.A04, c114645Fu.A04)) {
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
        return hashCode4 + (bool5 != null ? bool5.hashCode() : 0);
    }

    @Override // X.InterfaceC114655Fv
    public final Boolean BCb() {
        return this.A00;
    }

    @Override // X.InterfaceC114655Fv
    public final Boolean BWL() {
        return this.A04;
    }

    @Override // X.InterfaceC114655Fv
    public final Boolean CZi() {
        return this.A01;
    }

    @Override // X.InterfaceC114655Fv
    public final Boolean Ca3() {
        return this.A02;
    }

    @Override // X.InterfaceC114655Fv
    public final Boolean CbI() {
        return this.A03;
    }

    @Override // X.InterfaceC114655Fv
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTOpenCarouselMediaConfig", I0T.A00(this));
    }

    public C114645Fu(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5) {
        this.A00 = bool;
        this.A01 = bool2;
        this.A02 = bool3;
        this.A03 = bool4;
        this.A04 = bool5;
    }
}
