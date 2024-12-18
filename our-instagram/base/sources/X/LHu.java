package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import com.instagram.direct.request.graphql.IGDirectStoreStickerSendMutationResponseImpl;
import java.util.List;

/* loaded from: classes8.dex */
public final class LHu {
    public final UserSession A00;

    public static final C2JO A00(L1W l1w, AnonymousClass442 anonymousClass442, String str, String str2, String str3, List list) {
        Integer num;
        Integer num2;
        String str4;
        Long l;
        Long l2;
        C2JO c2jo = new C2JO();
        c2jo.A05("recipient_igids", list);
        c2jo.A09(str, "sticker_id");
        c2jo.A09(str2, "ig_thread_igid");
        c2jo.A09(str3, "offline_threading_id");
        String str5 = null;
        if (l1w != null && (l2 = l1w.A01) != null) {
            num = Integer.valueOf((int) l2.longValue());
        } else {
            num = null;
        }
        c2jo.A07(num, "ephemeral_duration_sec");
        if (l1w != null && (l = l1w.A02) != null) {
            num2 = Integer.valueOf((int) l.longValue());
        } else {
            num2 = null;
        }
        c2jo.A07(num2, "ephemeral_view_duration_sec");
        if (anonymousClass442 != null) {
            str4 = anonymousClass442.A0R;
        } else {
            str4 = null;
        }
        c2jo.A09(str4, "replied_to_client_context");
        if (anonymousClass442 != null) {
            str5 = anonymousClass442.A0T;
        }
        c2jo.A09(str5, "replied_to_item_id");
        return c2jo;
    }

    public LHu(UserSession userSession) {
        this.A00 = userSession;
    }

    public static final void A01(C2JO c2jo, UserSession userSession, InterfaceC37261GbE interfaceC37261GbE) {
        C2JM A0b = AbstractC25225BEi.A0b();
        C2JM A0b2 = AbstractC25225BEi.A0b();
        A0b.A00(c2jo, "data");
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC25225BEi.A0c(), "IGDirectStoreStickerSendMutation", A0b.getParamsCopy(), A0b2.getParamsCopy(), IGDirectStoreStickerSendMutationResponseImpl.class, true, null, 0, null, "xig_direct_store_sticker_send", AbstractC166987dD.A1E());
        C40701ud A01 = AbstractC40691uc.A01(userSession);
        KYA kya = new KYA(userSession, interfaceC37261GbE);
        A01.ATV(new C48138LSn(5, kya, userSession), new LTC(11, kya, userSession), pandoGraphQLRequest);
    }
}
