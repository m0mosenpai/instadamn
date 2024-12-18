package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.Eki, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33195Eki extends AbstractC33235ElU implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "InternalOptionsFragment";
    public UserSession A00;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "settings_internal_options";
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC33235ElU.A08(this, interfaceC56362iU, 2131964609);
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A00;
    }

    @Override // X.AbstractC33235ElU, X.AbstractC60672pq, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1696388975);
        super.onCreate(bundle);
        this.A00 = AbstractC31176DnK.A0S(this);
        C0f9.A09(-1368965558, A02);
    }

    @Override // X.AbstractC60672pq, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-2039398589);
        super.onResume();
        UserSession userSession = this.A00;
        FMN fmn = new FMN(requireContext(), this.mFragmentManager, requireActivity(), userSession);
        ArrayList A1E = AbstractC166987dD.A1E();
        UserSession userSession2 = this.A00;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (AbstractC31178DnM.A1X(c06090Tz, userSession2, 36312509673637016L)) {
            AbstractC25235BEs.A1C(fmn.A00, ViewOnClickListenerC35689FpO.A00(fmn, 3), A1E, 2131977092);
        }
        if (AbstractC31178DnM.A1X(c06090Tz, this.A00, 36313501812983859L)) {
            AbstractC25235BEs.A1C(fmn.A00, ViewOnClickListenerC35689FpO.A00(fmn, 4), A1E, 2131966609);
        }
        if (C2TN.A00(this.A00)) {
            AbstractC25235BEs.A1C(fmn.A00, ViewOnClickListenerC35689FpO.A00(fmn, 2), A1E, 2131975281);
        }
        setItems(A1E);
        C0f9.A09(833242000, A02);
    }
}
