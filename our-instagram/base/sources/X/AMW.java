package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes4.dex */
public abstract class AMW {
    public static final void A03(InterfaceC11380iw interfaceC11380iw, UserSession userSession, Integer num) {
        InterfaceC111194zh Bxy;
        String str;
        Long l;
        String str2;
        String AcH;
        C14360o3.A0B(userSession, 0);
        User A10 = AbstractC166987dD.A10(userSession);
        if (num == C05F.A01) {
            Bxy = A10.A03.Bxv();
        } else {
            Bxy = A10.A03.Bxy();
        }
        InterfaceC02590Ai A02 = A02(interfaceC11380iw, userSession);
        A02.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, "story_sticker_tray");
        AbstractC167027dH.A0t(A02, "view");
        AbstractC167007dF.A12(A02, AbstractC167007dF.A1W(Bxy));
        if (Bxy != null) {
            str = Bxy.Bba();
        } else {
            str = null;
        }
        A02.AAP("partner_name", str);
        if (Bxy != null && (AcH = Bxy.AcH()) != null) {
            l = AbstractC166997dE.A0j(AcH);
        } else {
            l = null;
        }
        A02.A9K("partner_id", l);
        if (Bxy != null) {
            str2 = Bxy.getUrl();
        } else {
            str2 = null;
        }
        A02.AAP("url", str2);
        A02.AAP("service_type", AbstractC40773I5b.A00(num));
        A02.Cht();
    }

    public static final void A04(InterfaceC11380iw interfaceC11380iw, UserSession userSession, Integer num, String str, String str2, String str3, String str4, String str5) {
        String str6;
        C14360o3.A0B(userSession, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), AbstractC111324zv.A00(223));
        A0f.A9K("igid", Long.valueOf(A00(userSession)));
        A0f.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, AbstractC111324zv.A00(5021));
        AbstractC167027dH.A0t(A0f, "open");
        boolean z = true;
        if (str3 == null || !C2TN.A05(userSession, str3)) {
            z = false;
        }
        A0f.A7v("is_profile_owner", Boolean.valueOf(z));
        A0f.A9K(AbstractC111324zv.A00(1191), Long.valueOf(A01(str3)));
        A0f.AAP("partner_name", str4);
        A0f.AAP("url", str5);
        if (num != null) {
            str6 = AbstractC40773I5b.A00(num);
        } else {
            str6 = null;
        }
        A0f.AAP("service_type", str6);
        A0f.AAP("sticker_id", str2);
        A0f.AAP(AbstractC111324zv.A00(2971), str);
        A0f.Cht();
    }

    public static final boolean A05(UserSession userSession) {
        InterfaceC111194zh Bxy;
        for (Integer num : C05F.A00(3)) {
            User A10 = AbstractC166987dD.A10(userSession);
            if (num == C05F.A01) {
                Bxy = A10.A03.Bxv();
            } else {
                Bxy = A10.A03.Bxy();
            }
            if (Bxy != null) {
                return true;
            }
        }
        return false;
    }

    public static final long A00(UserSession userSession) {
        String str = userSession.userId;
        C14360o3.A0B(str, 0);
        return AbstractC167027dH.A03(str);
    }

    public static final long A01(String str) {
        Long A0j;
        if (str != null && (A0j = AbstractC166997dE.A0j(str)) != null) {
            return A0j.longValue();
        }
        return 0L;
    }

    public static InterfaceC02590Ai A02(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        InterfaceC02590Ai A00 = A01.A00(A01.A00, "instagram_smb_partner_flow_producer");
        A00.A9K("igid", Long.valueOf(A00(userSession)));
        return A00;
    }
}
