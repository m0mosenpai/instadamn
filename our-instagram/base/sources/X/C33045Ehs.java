package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.Ehs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33045Ehs extends C17T implements InterfaceC37263GbG {
    @Override // X.InterfaceC37263GbG
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        CT6();
        A1I.put("is_eligible_for_creator_settings_review", Boolean.valueOf(getBooleanValueByHashCode(1875869432)));
        return AbstractC25234BEr.A0P(this, AbstractC06930Yk.A0B(A1I));
    }

    @Override // X.InterfaceC37263GbG
    public final boolean CT6() {
        return getBooleanValueByHashCode(1875869432);
    }

    @Override // X.InterfaceC37263GbG
    public final E8J F3f() {
        return new E8J(getBooleanValueByHashCode(1875869432));
    }
}
