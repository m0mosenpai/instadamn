package X;

import com.facebook.common.dextricks.DexOptimization;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class MWD {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final String A02;
    public final String A03;

    public static final C25531Mh A00(MWD mwd, Long l, String str, String str2, String str3) {
        long j;
        Long A0j;
        UserSession userSession = mwd.A01;
        C25531Mh A0A = AbstractC31171DnF.A0A(AbstractC166987dD.A0f(AbstractC12220kQ.A01(mwd.A00, userSession), "ig_lead_gen_ads_preclick_consumer"), 226);
        String str4 = mwd.A03;
        if (str4 != null && (A0j = AbstractC166997dE.A0j(str4)) != null) {
            j = A0j.longValue();
        } else {
            j = 0;
        }
        A0A.A0Q("lead_form_id", Long.valueOf(j));
        A0A.A0R("event_type", DexOptimization.OPT_KEY_CLIENT);
        A0A.A0R("event_name", str3);
        A0A.A0R("flow_step", str2);
        A0A.A0R("flow_name", str);
        A0A.A0Q("user_igid", Long.valueOf(AbstractC50522MSa.A0C(AbstractC50522MSa.A0k(userSession))));
        A0A.A0R("ad_id", mwd.A02);
        A0A.A0Q("dwell_time", l);
        return A0A;
    }

    public static final String A01(EnumC41021v9 enumC41021v9) {
        if (enumC41021v9 != null) {
            CJC cjc = CJC.$redex_init_class;
            int ordinal = enumC41021v9.ordinal();
            if (ordinal != 4) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        return "lead_ads_reels_first_question_short_answer";
                    }
                    return null;
                }
                return "lead_ads_reels_first_question";
            }
            return "lead_ads_reels_offsite_generic_question";
        }
        return null;
    }

    public static void A02(MWD mwd, String str, String str2) {
        A00(mwd, null, str, str2, "click").Cht();
    }

    public MWD(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2) {
        AbstractC167017dG.A1P(userSession, interfaceC11380iw);
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
        this.A03 = str;
        this.A02 = str2;
    }
}
