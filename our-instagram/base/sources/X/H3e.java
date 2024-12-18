package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IGPostClickEligibleExperienceTypes;
import java.util.List;

/* loaded from: classes7.dex */
public final class H3e extends C0T6 implements InterfaceC43534JKu {
    public final IGPostClickEligibleExperienceTypes A00;
    public final String A01;
    public final List A02;

    @Override // X.InterfaceC43534JKu
    public final H3e Eui() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H3e) {
                H3e h3e = (H3e) obj;
                if (!C14360o3.A0K(this.A02, h3e.A02) || !C14360o3.A0K(this.A01, h3e.A01) || this.A00 != h3e.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC43534JKu
    public final List AyC() {
        return this.A02;
    }

    @Override // X.InterfaceC43534JKu
    public final String AyE() {
        return this.A01;
    }

    @Override // X.InterfaceC43534JKu
    public final IGPostClickEligibleExperienceTypes B14() {
        return this.A00;
    }

    @Override // X.InterfaceC43534JKu
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTIGIABPostClickDataDisclaimerDict", AbstractC39978HoG.A00(this));
    }

    public final int hashCode() {
        return (((AbstractC167017dG.A0M(this.A02) * 31) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public H3e(IGPostClickEligibleExperienceTypes iGPostClickEligibleExperienceTypes, String str, List list) {
        this.A02 = list;
        this.A01 = str;
        this.A00 = iGPostClickEligibleExperienceTypes;
    }
}
