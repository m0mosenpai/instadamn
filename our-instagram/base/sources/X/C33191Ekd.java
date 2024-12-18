package X;

import android.os.Bundle;
import java.util.ArrayList;

/* renamed from: X.Ekd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33191Ekd extends AbstractC33235ElU implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "ColorFilterOptionsFragment";
    public final InterfaceC09390do A00 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131973572);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "color_filter_options";
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    @Override // X.AbstractC33235ElU, X.AbstractC60672pq, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-47617979);
        super.onCreate(bundle);
        ArrayList A1E = AbstractC166987dD.A1E();
        ArrayList A1E2 = AbstractC166987dD.A1E();
        A1E2.add(new C35124FeR("off", AbstractC31173DnH.A07(this, new C35124FeR("off", AbstractC31173DnH.A07(this, new C35124FeR("off", AbstractC31173DnH.A07(this, new C35124FeR("on", requireContext().getString(2131956374), requireContext().getString(2131956369)), A1E2).getString(2131956370), requireContext().getString(2131956366)), A1E2).getString(2131956373), requireContext().getString(2131956368)), A1E2).getString(2131956372), requireContext().getString(2131956367)));
        A1E.add(new C34960Fak(null, "on", A1E2));
        C35246Fgf.A02(A1E, 2131956371);
        setItems(A1E);
        C0f9.A09(-1336838053, A02);
    }
}
