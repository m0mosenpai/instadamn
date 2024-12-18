package X;

import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class H2P extends C0T6 implements InterfaceC43552JLm {
    public final InterfaceC43501JJn A00;
    public final C914346k A01;
    public final String A02;
    public final String A03;
    public final String A04;

    @Override // X.InterfaceC43552JLm
    public final H2P ErH() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H2P) {
                H2P h2p = (H2P) obj;
                if (!C14360o3.A0K(this.A02, h2p.A02) || !C14360o3.A0K(this.A01, h2p.A01) || !C14360o3.A0K(this.A03, h2p.A03) || !C14360o3.A0K(this.A04, h2p.A04) || !C14360o3.A0K(this.A00, h2p.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC43552JLm
    public final String AcH() {
        return this.A02;
    }

    @Override // X.InterfaceC43552JLm
    public final C914346k AgU() {
        return this.A01;
    }

    @Override // X.InterfaceC43552JLm
    public final String Age() {
        return this.A03;
    }

    @Override // X.InterfaceC43552JLm
    public final InterfaceC43501JJn C0X() {
        return this.A00;
    }

    @Override // X.InterfaceC43552JLm
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTBloksStickerDataDict", AbstractC39770Hkg.A00(this));
    }

    @Override // X.InterfaceC43552JLm
    public final String getId() {
        return this.A04;
    }

    public final int hashCode() {
        return (((((((AbstractC167017dG.A0O(this.A02) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public H2P(InterfaceC43501JJn interfaceC43501JJn, C914346k c914346k, String str, String str2, String str3) {
        this.A02 = str;
        this.A01 = c914346k;
        this.A03 = str2;
        this.A04 = str3;
        this.A00 = interfaceC43501JJn;
    }
}
