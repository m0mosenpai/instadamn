package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class H4Z extends C0T6 implements JKR {
    public final String A00;
    public final boolean A01;

    public H4Z(String str, boolean z) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
        this.A01 = z;
    }

    @Override // X.JKR
    public final H4Z Ey5() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H4Z) {
                H4Z h4z = (H4Z) obj;
                if (!C14360o3.A0K(this.A00, h4z.A00) || this.A01 != h4z.A01) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JKR
    public final String Bev() {
        return this.A00;
    }

    @Override // X.JKR
    public final boolean Bva() {
        return this.A01;
    }

    @Override // X.JKR
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (Bev() != null) {
            A1I.put("post_friction_reason", Bev());
        }
        Bva();
        return AbstractC37300Gc1.A05("XDTPostFrictionInfo", AbstractC37301Gc2.A0r("should_show_post_friction", Boolean.valueOf(Bva()), A1I));
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A01, AbstractC166987dD.A0J(this.A00));
    }
}
