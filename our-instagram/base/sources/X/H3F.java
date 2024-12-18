package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.FBTagType;
import java.util.List;

/* loaded from: classes7.dex */
public final class H3F extends C0T6 implements InterfaceC43556JLq {
    public final FBTagType A00;
    public final JM7 A01;
    public final Boolean A02;
    public final String A03;
    public final List A04;

    public H3F(FBTagType fBTagType, JM7 jm7, Boolean bool, String str, List list) {
        AbstractC167007dF.A1G(list, 4, str);
        this.A02 = bool;
        this.A00 = fBTagType;
        this.A01 = jm7;
        this.A04 = list;
        this.A03 = str;
    }

    @Override // X.InterfaceC43556JLq
    public final H3F EtN() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H3F) {
                H3F h3f = (H3F) obj;
                if (!C14360o3.A0K(this.A02, h3f.A02) || this.A00 != h3f.A00 || !C14360o3.A0K(this.A01, h3f.A01) || !C14360o3.A0K(this.A04, h3f.A04) || !C14360o3.A0K(this.A03, h3f.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC43556JLq
    public final Boolean AbJ() {
        return this.A02;
    }

    @Override // X.InterfaceC43556JLq
    public final FBTagType B52() {
        return this.A00;
    }

    @Override // X.InterfaceC43556JLq
    public final JM7 B56() {
        return this.A01;
    }

    @Override // X.InterfaceC43556JLq
    public final List Bec() {
        return this.A04;
    }

    @Override // X.InterfaceC43556JLq
    public final String C4z() {
        return this.A03;
    }

    @Override // X.InterfaceC43556JLq
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTFBUserTagInfoDict", AbstractC39915Hn3.A00(this));
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A03, AbstractC166997dE.A0J(this.A04, ((((AbstractC167017dG.A0M(this.A02) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC166997dE.A0I(this.A01)) * 31));
    }
}
