package X;

import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class H7Y extends C0T6 implements JLF {
    public final H6T A00;
    public final String A01;
    public final String A02;

    @Override // X.JLF
    public final H7Y F5J() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H7Y) {
                H7Y h7y = (H7Y) obj;
                if (!C14360o3.A0K(this.A01, h7y.A01) || !C14360o3.A0K(this.A00, h7y.A00) || !C14360o3.A0K(this.A02, h7y.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JLF
    public final String Agr() {
        return this.A01;
    }

    @Override // X.JLF
    public final /* bridge */ /* synthetic */ InterfaceC43515JKb Ajn() {
        return this.A00;
    }

    @Override // X.JLF
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTLearnMore", I2X.A00(this));
    }

    @Override // X.JLF
    public final String getTitle() {
        return this.A02;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A02, (AbstractC166987dD.A0J(this.A01) + AbstractC167017dG.A0M(this.A00)) * 31);
    }

    public H7Y(H6T h6t, String str, String str2) {
        AbstractC167017dG.A1Q(str, str2);
        this.A01 = str;
        this.A00 = h6t;
        this.A02 = str2;
    }
}
