package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class H3A extends C0T6 implements JKG {
    public final String A00;
    public final String A01;

    @Override // X.JKG
    public final H3A EtD() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H3A) {
                H3A h3a = (H3A) obj;
                if (!C14360o3.A0K(this.A00, h3a.A00) || !C14360o3.A0K(this.A01, h3a.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JKG
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (getId() != null) {
            AbstractC37300Gc1.A12(getId(), A1I);
        }
        if (getText() != null) {
            AbstractC37300Gc1.A15(getText(), A1I);
        }
        return AbstractC37300Gc1.A05("XDTEventBadge", AbstractC06930Yk.A0B(A1I));
    }

    @Override // X.JKG
    public final String getId() {
        return this.A00;
    }

    @Override // X.JKG
    public final String getText() {
        return this.A01;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A01, AbstractC166987dD.A0J(this.A00));
    }

    public H3A(String str, String str2) {
        AbstractC167017dG.A1P(str, str2);
        this.A00 = str;
        this.A01 = str2;
    }
}
