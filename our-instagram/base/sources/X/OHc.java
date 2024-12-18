package X;

import com.facebook.common.dextricks.DexOptimization;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class OHc {
    public final C18920wW A00;

    public OHc(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = AbstractC12220kQ.A02(userSession);
    }

    public final void A00(long j, String str) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "ig_smb_sensitive_event");
        A0f.A9K("ig_userid", Long.valueOf(j));
        A0f.AAP("product", "network_call");
        AbstractC31171DnF.A1A(A0f, "diversity_info_gql_success");
        AbstractC31171DnF.A1C(A0f, "success");
        A0f.AAP("event_source", DexOptimization.OPT_KEY_CLIENT);
        AbstractC31175DnJ.A17(A0f, str);
    }
}
