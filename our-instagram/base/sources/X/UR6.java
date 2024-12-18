package X;

import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes11.dex */
public final class UR6 extends C0T6 implements C5H8 {
    public final UR7 A00;
    public final URA A01;
    public final InterfaceC72033XFv A02;
    public final XG7 A03;
    public final Long A04;

    @Override // X.C5H8
    public final UR6 Ex5() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UR6) {
                UR6 ur6 = (UR6) obj;
                if (!C14360o3.A0K(this.A02, ur6.A02) || !C14360o3.A0K(this.A00, ur6.A00) || !C14360o3.A0K(this.A01, ur6.A01) || !C14360o3.A0K(this.A03, ur6.A03) || !C14360o3.A0K(this.A04, ur6.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.C5H8
    public final InterfaceC72033XFv BTU() {
        return this.A02;
    }

    @Override // X.C5H8
    public final /* bridge */ /* synthetic */ XGD BTV() {
        return this.A00;
    }

    @Override // X.C5H8
    public final /* bridge */ /* synthetic */ XG5 BTW() {
        return this.A01;
    }

    @Override // X.C5H8
    public final XG7 BTY() {
        return this.A03;
    }

    @Override // X.C5H8
    public final Long BZL() {
        return this.A04;
    }

    @Override // X.C5H8
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTNativeInfoCard", AbstractC68373VOh.A00(this));
    }

    public final int hashCode() {
        int i = 0;
        int A0M = ((((((AbstractC167017dG.A0M(this.A02) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31;
        Long l = this.A04;
        if (l != null) {
            i = l.hashCode();
        }
        return A0M + i;
    }

    public UR6(UR7 ur7, URA ura, InterfaceC72033XFv interfaceC72033XFv, XG7 xg7, Long l) {
        this.A02 = interfaceC72033XFv;
        this.A00 = ur7;
        this.A01 = ura;
        this.A03 = xg7;
        this.A04 = l;
    }
}
