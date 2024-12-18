package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class HRo extends C17T implements JKR {
    @Override // X.JKR
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (Bev() != null) {
            A1I.put("post_friction_reason", Bev());
        }
        Bva();
        return AbstractC25234BEr.A0P(this, AbstractC37301Gc2.A0r("should_show_post_friction", Boolean.valueOf(Bva()), A1I));
    }

    @Override // X.JKR
    public final String Bev() {
        return A0h(1121241482);
    }

    @Override // X.JKR
    public final boolean Bva() {
        return getBooleanValueByHashCode(-237307901);
    }

    @Override // X.JKR
    public final H4Z Ey5() {
        return new H4Z(A0h(1121241482), getBooleanValueByHashCode(-237307901));
    }
}
