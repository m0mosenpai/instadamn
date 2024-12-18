package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.ArrayList;

/* renamed from: X.Ekk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33197Ekk extends AbstractC33235ElU implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "DataSaverNetworkOptionsFragment";
    public UserSession A00;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131957514);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "data_saver_network_options";
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        UserSession userSession = this.A00;
        if (userSession != null) {
            return userSession;
        }
        AbstractC31171DnF.A0u();
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC33235ElU, X.AbstractC60672pq, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(744448440);
        super.onCreate(bundle);
        this.A00 = AbstractC31177DnL.A0R(this);
        C0f9.A09(1415919697, A02);
    }

    @Override // X.AbstractC60672pq, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1663779351);
        super.onResume();
        ArrayList A1E = AbstractC166987dD.A1E();
        ArrayList A1E2 = AbstractC166987dD.A1E();
        C35124FeR.A00("0", getString(2131957509), A1E2);
        C35124FeR.A00(RealtimeSubscription.GRAPHQL_MQTT_VERSION, getString(2131957513), A1E2);
        C35124FeR.A00("2", getString(2131957512), A1E2);
        Fragment targetFragment = getTargetFragment();
        if (targetFragment != null) {
            C33216El4 c33216El4 = (C33216El4) targetFragment;
            C14360o3.A0A(c33216El4);
            UserSession userSession = c33216El4.A00;
            if (userSession != null) {
                A1E.add(new C34960Fak(new C35748Fqg(this, 3), String.valueOf(C1QA.A00(userSession).A00()), A1E2));
                setItems(A1E);
                C0f9.A09(1244429355, A02);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
        throw AbstractC166997dE.A0g();
    }
}
