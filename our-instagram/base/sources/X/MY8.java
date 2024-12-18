package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class MY8 {
    public static final MY8 A00 = new Object();

    public static final void A00(C2JO c2jo, UserSession userSession, InterfaceC58074Poz interfaceC58074Poz) {
        C40701ud A01 = AbstractC40691uc.A01(userSession);
        C2JM A0b = AbstractC25225BEi.A0b();
        C2JM A0b2 = AbstractC25225BEi.A0b();
        A0b.A00(c2jo, "configs_request");
        C55661Onm.A00(new MV7(interfaceC58074Poz, 15), new PandoGraphQLRequest(AbstractC25225BEi.A0c(), "IgBplAutoXpostingQuery", A0b.getParamsCopy(), A0b2.getParamsCopy(), C9MA.class, false, null, 0, null, "xcxp_bpl_auto_crosspost_settings_root", AbstractC166987dD.A1E()).setFreshCacheAgeMs(0L).setMaxToleratedCacheAgeMs(0L), A01, interfaceC58074Poz, 12);
    }

    public final void A01(UserSession userSession, InterfaceC58073Poy interfaceC58073Poy, List list) {
        C14360o3.A0B(list, 1);
        C40701ud A01 = AbstractC40691uc.A01(userSession);
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            OTO.A00(A0q, it);
        }
        C2JO c2jo = new C2JO();
        c2jo.A09("IG", "source_app");
        c2jo.A05("crosspost_setting_list", A0q);
        C0CA A02 = GraphQlCallInput.A02.A02();
        A02.A0E(c2jo.A02(), "config_request");
        C2JM A0b = AbstractC25225BEi.A0b();
        C55661Onm.A00(new MV7(interfaceC58073Poy, 16), new PandoGraphQLRequest(AbstractC25233BEq.A0H(A02, A0b, "configs_request"), "IGBplAutoXPostMutation", A0b.getParamsCopy(), AbstractC25225BEi.A0b().getParamsCopy(), C213789dd.class, true, null, 12, "configs_request", "xcxp_bpl_auto_crosspost_settings_mutation_root", AbstractC166987dD.A1E()), A01, interfaceC58073Poy, 13);
    }
}
