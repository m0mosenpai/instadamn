package X;

import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class H2X extends C0T6 implements InterfaceC43527JKn {
    public final String A00;
    public final String A01;
    public final String A02;

    @Override // X.InterfaceC43527JKn
    public final H2X Erd() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H2X) {
                H2X h2x = (H2X) obj;
                if (!C14360o3.A0K(this.A00, h2x.A00) || !C14360o3.A0K(this.A01, h2x.A01) || !C14360o3.A0K(this.A02, h2x.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC43527JKn
    public final String Af8() {
        return this.A00;
    }

    @Override // X.InterfaceC43527JKn
    public final String CBn() {
        return this.A02;
    }

    @Override // X.InterfaceC43527JKn
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTCardsCreateModeCard", AbstractC39797Hl7.A00(this));
    }

    @Override // X.InterfaceC43527JKn
    public final String getText() {
        return this.A01;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A02, AbstractC166997dE.A0K(this.A01, AbstractC167017dG.A0O(this.A00) * 31));
    }

    public H2X(String str, String str2, String str3) {
        AbstractC167017dG.A1R(str2, str3);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }
}
