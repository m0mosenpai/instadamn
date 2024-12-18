package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* loaded from: classes6.dex */
public final class E8J extends C0T6 implements InterfaceC37263GbG {
    public final boolean A00;

    @Override // X.InterfaceC37263GbG
    public final E8J F3f() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof E8J) && this.A00 == ((E8J) obj).A00);
    }

    @Override // X.InterfaceC37263GbG
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        A1I.put("is_eligible_for_creator_settings_review", Boolean.valueOf(this.A00));
        return new TreeUpdaterJNI("XDTUserSettingBundlesInfo", AbstractC06930Yk.A0B(A1I));
    }

    public final int hashCode() {
        if (!this.A00) {
            return 1237;
        }
        return 1231;
    }

    public E8J(boolean z) {
        this.A00 = z;
    }

    @Override // X.InterfaceC37263GbG
    public final boolean CT6() {
        return this.A00;
    }
}
