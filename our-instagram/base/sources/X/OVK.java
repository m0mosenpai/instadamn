package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class OVK {
    public static final OVK A00 = new Object();

    public final void A00(UserSession userSession, InterfaceC58072Pox interfaceC58072Pox, List list) {
        C14360o3.A0B(list, 1);
        C40701ud A01 = AbstractC40691uc.A01(userSession);
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            OTO.A00(A0q, it);
        }
        C2JO c2jo = new C2JO();
        c2jo.A09("IG", "source_app");
        c2jo.A05("crosspost_app_surface_list", A0q);
        C0CA A02 = GraphQlCallInput.A02.A02();
        A02.A0E(c2jo.A02(), "config_request");
        C2JM A0b = AbstractC25225BEi.A0b();
        C55661Onm.A00(new MV7(interfaceC58072Pox, 14), new PandoGraphQLRequest(AbstractC25233BEq.A0H(A02, A0b, "configs_request"), "UpdateAutoCrossPostingSettingMutation", A0b.getParamsCopy(), AbstractC25225BEi.A0b().getParamsCopy(), C213849dj.class, true, null, 12, "configs_request", "xcxp_unified_crossposting_configs_mutation_root", AbstractC166987dD.A1E()), A01, interfaceC58072Pox, 11);
    }
}
