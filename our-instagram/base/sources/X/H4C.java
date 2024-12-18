package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* loaded from: classes7.dex */
public final class H4C extends C0T6 implements InterfaceC31134DmH {
    public final int A00;
    public final String A01;
    public final String A02;
    public final List A03;

    @Override // X.InterfaceC31134DmH
    public final H4C EwR(C1DY c1dy) {
        return this;
    }

    @Override // X.InterfaceC31134DmH
    public final H4C EwS(C1DV c1dv) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H4C) {
                H4C h4c = (H4C) obj;
                if (!C14360o3.A0K(this.A03, h4c.A03) || this.A00 != h4c.A00 || !C14360o3.A0K(this.A01, h4c.A01) || !C14360o3.A0K(this.A02, h4c.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC31134DmH
    public final List B48() {
        return this.A03;
    }

    @Override // X.InterfaceC31134DmH
    public final int BbW() {
        return this.A00;
    }

    @Override // X.InterfaceC31134DmH
    public final String Big() {
        return this.A01;
    }

    @Override // X.InterfaceC31134DmH
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTMediaPromptData", AbstractC40067Hpt.A00(this));
    }

    @Override // X.InterfaceC31134DmH
    public final String getText() {
        return this.A02;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A02, AbstractC166997dE.A0K(this.A01, ((AbstractC167017dG.A0M(this.A03) * 31) + this.A00) * 31));
    }

    public H4C(int i, String str, String str2, List list) {
        AbstractC37302Gc3.A1U(str, str2);
        this.A03 = list;
        this.A00 = i;
        this.A01 = str;
        this.A02 = str2;
    }

    @Override // X.InterfaceC31134DmH
    public final InterfaceC31134DmH E9E(C1DY c1dy) {
        return this;
    }
}
