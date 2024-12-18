package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.HashMap;

/* renamed from: X.Ids, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41721Ids {
    public static final C41721Ids A00 = new Object();

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A01(Fragment fragment, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, Integer num, String str, String str2, String str3) {
        AbstractC167027dH.A12(fragment, userSession, interfaceC60442pS);
        if (C18U.A06(AbstractC25225BEi.A0j(c38321qM, 3), userSession, 36318995074259773L)) {
            AbstractC192798gL A05 = C192108fB.A05(userSession, "com.instagram.why_am_i_seeing_this.bottom_sheet.action", A00(userSession, c38321qM, interfaceC60442pS, num, str, str2, str3));
            A05.A00(new C32393EOu(6, fragment, interfaceC60442pS, userSession));
            ((C1GL) fragment).schedule(A05);
        } else {
            Context context = fragment.getContext();
            HashMap A002 = A00(userSession, c38321qM, interfaceC60442pS, num, str, str2, str3);
            AbstractC191798eb.A00(context, new C191778eZ(userSession), "com.instagram.why_am_i_seeing_this.bottom_sheet.action", AnonymousClass001.A0R("waist_preload_prefix_", c38321qM.getId()), A002, 0L).A9b(new C42222In8(fragment, userSession, interfaceC60442pS));
        }
    }

    public final void A02(Context context, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, Integer num, String str, String str2, String str3) {
        if (!C18U.A06(C06090Tz.A05, userSession, 36318995074259773L)) {
            HashMap A002 = A00(userSession, c38321qM, interfaceC60442pS, num, str, str2, str3);
            AbstractC191798eb.A03(context, new C191778eZ(userSession), "com.instagram.why_am_i_seeing_this.bottom_sheet.action", AnonymousClass001.A0R("waist_preload_prefix_", c38321qM.getId()), A002, 60L);
        }
    }

    public static final HashMap A00(UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, Integer num, String str, String str2, String str3) {
        String str4;
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put("media_id", c38321qM.A38());
        User A2E = c38321qM.A2E(userSession);
        if (A2E != null) {
            A1G.put("author_id", A2E.getId());
            A1G.put("inventory_source", AbstractC37300Gc1.A0S(c38321qM));
            A1G.put("waist_data", c38321qM.A0C.CHB());
            A1G.put("ranking_info_token", AbstractC25226BEj.A1G(c38321qM));
            A1G.put("container_module", interfaceC60442pS.getModuleName());
            A1G.put("client_position", str);
            A1G.put(MSV.A00(555), str2);
            A1G.put("ranking_session_id", str3);
            A1G.put("recommendation_data", c38321qM.A0C.Bl8());
            switch (num.intValue()) {
                case 0:
                    str4 = "on_impression";
                    break;
                case 1:
                    str4 = "three_dot_menu";
                    break;
                default:
                    str4 = "media_topic_header";
                    break;
            }
            A1G.put("event_source", str4);
            A1G.put("interest", c38321qM.A2n());
            return A1G;
        }
        throw AbstractC166997dE.A0g();
    }
}
