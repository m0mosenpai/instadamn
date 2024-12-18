package X;

import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class H3W extends C0T6 implements InterfaceC1816483t {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;

    @Override // X.InterfaceC1816483t
    public final H3W Eu5() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H3W) {
                H3W h3w = (H3W) obj;
                if (!C14360o3.A0K(this.A02, h3w.A02) || this.A00 != h3w.A00 || !C14360o3.A0K(this.A03, h3w.A03) || this.A01 != h3w.A01 || !C14360o3.A0K(this.A04, h3w.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1816483t
    public final int B7R() {
        return this.A00;
    }

    @Override // X.InterfaceC1816483t
    public final String BAt() {
        return this.A03;
    }

    @Override // X.InterfaceC1816483t
    public final int BSB() {
        return this.A01;
    }

    @Override // X.InterfaceC1816483t
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTHallpass", AbstractC39961Hnq.A00(this));
    }

    @Override // X.InterfaceC1816483t
    public final String getColor() {
        return this.A02;
    }

    @Override // X.InterfaceC1816483t
    public final String getName() {
        return this.A04;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A04, (AbstractC166997dE.A0K(this.A03, (AbstractC166987dD.A0J(this.A02) + this.A00) * 31) + this.A01) * 31);
    }

    public H3W(String str, int i, String str2, int i2, String str3) {
        AbstractC167017dG.A1Q(str, str2);
        C14360o3.A0B(str3, 5);
        this.A02 = str;
        this.A00 = i;
        this.A03 = str2;
        this.A01 = i2;
        this.A04 = str3;
    }
}
