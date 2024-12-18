package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.5vs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C131045vs extends C0T6 implements InterfaceC131055vt {
    public final Boolean A00;
    public final Boolean A01;
    public final Boolean A02;
    public final Boolean A03;
    public final Float A04;
    public final Float A05;

    @Override // X.InterfaceC131055vt
    public final C131045vs Ey7() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C131045vs) {
                C131045vs c131045vs = (C131045vs) obj;
                if (!C14360o3.A0K(this.A04, c131045vs.A04) || !C14360o3.A0K(this.A05, c131045vs.A05) || !C14360o3.A0K(this.A00, c131045vs.A00) || !C14360o3.A0K(this.A01, c131045vs.A01) || !C14360o3.A0K(this.A02, c131045vs.A02) || !C14360o3.A0K(this.A03, c131045vs.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Float f = this.A04;
        int hashCode = (f == null ? 0 : f.hashCode()) * 31;
        Float f2 = this.A05;
        int hashCode2 = (hashCode + (f2 == null ? 0 : f2.hashCode())) * 31;
        Boolean bool = this.A00;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.A01;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.A02;
        int hashCode5 = (hashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.A03;
        return hashCode5 + (bool4 != null ? bool4.hashCode() : 0);
    }

    @Override // X.InterfaceC131055vt
    public final Float Ban() {
        return this.A04;
    }

    @Override // X.InterfaceC131055vt
    public final Float Bao() {
        return this.A05;
    }

    @Override // X.InterfaceC131055vt
    public final Boolean Bv3() {
        return this.A00;
    }

    @Override // X.InterfaceC131055vt
    public final Boolean BvG() {
        return this.A01;
    }

    @Override // X.InterfaceC131055vt
    public final Boolean BvI() {
        return this.A02;
    }

    @Override // X.InterfaceC131055vt
    public final Boolean BvK() {
        return this.A03;
    }

    @Override // X.InterfaceC131055vt
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTPrefetchInstructions", AbstractC37877GlX.A00(this));
    }

    public C131045vs(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Float f, Float f2) {
        this.A04 = f;
        this.A05 = f2;
        this.A00 = bool;
        this.A01 = bool2;
        this.A02 = bool3;
        this.A03 = bool4;
    }
}
