package X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* renamed from: X.Ekm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33199Ekm extends AbstractC33235ElU implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "LanguagesSettingsFragment";
    public EPV A00;
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131964821);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "languages_settings";
    }

    @Override // X.AbstractC33235ElU, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ViewGroup A0G = AbstractC31174DnI.A0G(this);
        C14360o3.A07(A0G);
        AbstractC31172DnG.A1B(requireContext(), A0G, AbstractC53242c7.A0D(getContext()));
        ArrayList A1E = AbstractC166987dD.A1E();
        AbstractC25235BEs.A1C(requireContext(), ViewOnClickListenerC35689FpO.A00(this, 66), A1E, 2131952987);
        AbstractC25235BEs.A1C(requireContext(), ViewOnClickListenerC35689FpO.A00(this, 67), A1E, 2131956696);
        EPV epv = this.A00;
        if (epv != null) {
            epv.setItems(A1E);
            C3FQ scrollingViewProxy = getScrollingViewProxy();
            EPV epv2 = this.A00;
            if (epv2 != null) {
                scrollingViewProxy.EPJ(epv2);
                return;
            }
        }
        C14360o3.A0F("adapter");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    @Override // X.AbstractC33235ElU, X.AbstractC60672pq, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1259096493);
        super.onCreate(bundle);
        this.A00 = new EPV(requireContext(), AbstractC166987dD.A0o(this.A01), this);
        C0f9.A09(1966581046, A02);
    }
}
