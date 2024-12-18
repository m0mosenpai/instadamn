package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* loaded from: classes7.dex */
public final class H4X extends C0T6 implements JL1 {
    public final String A00;
    public final String A01;
    public final List A02;

    @Override // X.JL1
    public final H4X Ey2() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H4X) {
                H4X h4x = (H4X) obj;
                if (!C14360o3.A0K(this.A00, h4x.A00) || !C14360o3.A0K(this.A02, h4x.A02) || !C14360o3.A0K(this.A01, h4x.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JL1
    public final List C5D() {
        return this.A02;
    }

    @Override // X.JL1
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTPollCreateModeSticker", AbstractC40147HrG.A00(this));
    }

    @Override // X.JL1
    public final String getId() {
        return this.A00;
    }

    @Override // X.JL1
    public final String getText() {
        return this.A01;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A02, AbstractC166987dD.A0J(this.A00)) + AbstractC167017dG.A0O(this.A01);
    }

    public H4X(String str, String str2, List list) {
        AbstractC167017dG.A1P(str, list);
        this.A00 = str;
        this.A02 = list;
        this.A01 = str2;
    }
}
