package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.Ekj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33196Ekj extends AbstractC33235ElU implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "PromoPaymentsFragment";
    public UserSession A00;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "settings_promo_payments_options";
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        interfaceC56362iU.Efu(2131969410);
        interfaceC56362iU.EkS(true);
        if (getContext() != null) {
            interfaceC56362iU.Ehg(new C114795Gm(null, AbstractC31174DnI.A09(getContext(), AbstractC31174DnI.A05(this)), null, null, null, null, C05F.A00, -2, -2, -2, -2, -2, -2, -2, true));
        }
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A00;
    }

    @Override // X.AbstractC33235ElU, X.AbstractC60672pq, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1818280668);
        super.onCreate(bundle);
        this.A00 = AbstractC31176DnK.A0S(this);
        C0f9.A09(-2051486250, A02);
    }

    @Override // X.AbstractC60672pq, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-260362329);
        super.onResume();
        ArrayList A1E = AbstractC166987dD.A1E();
        AbstractC25235BEs.A1C(requireContext(), ViewOnClickListenerC35689FpO.A00(this, 16), A1E, 2131953858);
        setItems(A1E);
        setItems(A1E);
        C0f9.A09(1713873437, A02);
    }
}
