package X;

import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Fzs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36298Fzs implements InterfaceC13000lm {
    public final long A00;
    public final C18920wW A01;
    public final String A02 = AbstractC167017dG.A0j();
    public final UserSession A03;

    public static final String A00(String str) {
        String str2;
        if (str != null) {
            switch (str.hashCode()) {
                case -76391525:
                    str2 = "challenge_winner";
                    break;
                case -41826452:
                    str2 = "challenge_winner_cta";
                    break;
                case 1307151563:
                    if (str.equals("challenge_submissions")) {
                        return "challenge_submissions_sheet";
                    }
                default:
                    return "thread_view";
            }
            if (str.equals(str2)) {
                return "challenge_winners_chosen_sheet";
            }
        }
        return "thread_view";
    }

    public static final String A01(String str, boolean z) {
        String str2;
        if (str != null) {
            switch (str.hashCode()) {
                case -76391525:
                    str2 = "challenge_winner";
                    break;
                case -41826452:
                    str2 = "challenge_winner_cta";
                    break;
                case 319260840:
                    if (str.equals("challenge_submission")) {
                        return AbstractC111324zv.A00(5316);
                    }
                default:
                    return "share_challenge";
            }
            if (str.equals(str2)) {
                if (z) {
                    return "share_winners";
                }
                return "share_winning_submission";
            }
        }
        return "share_challenge";
    }

    public static final LinkedHashMap A02(String str, String str2, String str3, String str4) {
        LinkedHashMap A07 = AbstractC06930Yk.A07(AbstractC167007dF.A1b("challenge_id", str, AbstractC166987dD.A1L("user_type", str2), AbstractC166987dD.A1L("share_reason", str4)));
        if (str3 != null) {
            A07.put("challenge_status", str3);
        }
        return A07;
    }

    public static final void A03(EnumC33508Erh enumC33508Erh, C36298Fzs c36298Fzs, Integer num, String str, String str2, String str3, String str4, String str5, String str6, Map map) {
        C25531Mh A0E = C25531Mh.A0E(c36298Fzs.A01);
        if (AbstractC25226BEj.A1Z(A0E)) {
            AbstractC31180DnO.A1M(A0E, str3, str4, c36298Fzs.A00);
            A0E.A0o(str5);
            A0E.A0p(str6);
            A0E.A0h(AbstractC31179DnN.A0Z(A0E, AbstractC147806l5.A01(num), str, str2));
            A0E.A0u(c36298Fzs.A02);
            A0E.A0M(enumC33508Erh, "entrypoint");
            A0E.A0v(map);
            A0E.Cht();
        }
    }

    public final void A04(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z) {
        C25531Mh A0E = C25531Mh.A0E(this.A01);
        if (AbstractC25226BEj.A1Z(A0E)) {
            String A01 = A01(str6, z);
            LinkedHashMap A1I = AbstractC166987dD.A1I();
            A1I.put("share_type", A01);
            if (str5 != null) {
                A1I.put("challenge_id", str5);
            }
            if (str7 != null) {
                A1I.put("user_type", str7);
            }
            A0E.A0g(Long.valueOf(this.A00));
            AbstractC31174DnI.A1I(A0E, "story_viewer_rendered");
            A0E.A0o("share_to_story_message_button");
            A0E.A0p(A00(str6));
            A0E.A0h(AbstractC31179DnN.A0Z(A0E, AbstractC147806l5.A01(num), str, str2));
            AbstractC31176DnK.A1M(A0E, str3, str4);
            AbstractC31175DnJ.A1E(A0E, this.A02, A1I);
        }
    }

    public final void A05(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z) {
        EnumC33508Erh enumC33508Erh;
        C25531Mh A0E = C25531Mh.A0E(this.A01);
        if (AbstractC25226BEj.A1Z(A0E)) {
            LinkedHashMap A1I = AbstractC166987dD.A1I();
            A1I.put("share_type", A01(str6, z));
            if (str3 != null) {
                A1I.put("challenge_id", str3);
            }
            if (str7 != null) {
                A1I.put("user_type", str7);
            }
            A0E.A0g(Long.valueOf(this.A00));
            AbstractC31174DnI.A1I(A0E, AbstractC111324zv.A00(1198));
            A0E.A0o("create_button");
            A0E.A0p("story");
            A0E.A0h(AbstractC31179DnN.A0Z(A0E, AbstractC147806l5.A01(num), str, str2));
            AbstractC31176DnK.A1M(A0E, str4, str5);
            if (C14360o3.A0K(str6, "challenge_winner_cta")) {
                enumC33508Erh = EnumC33508Erh.WINNER_CHOSEN_CTA_BUTTON;
            } else {
                enumC33508Erh = EnumC33508Erh.CHALLENGE_SHARE_SHEET;
            }
            A0E.A0M(enumC33508Erh, "entrypoint");
            AbstractC31175DnJ.A1E(A0E, this.A02, A1I);
        }
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A03.A03(C36298Fzs.class);
    }

    public C36298Fzs(UserSession userSession) {
        this.A03 = userSession;
        this.A00 = AbstractC31178DnM.A03(AbstractC25231BEo.A0j(0, userSession.userId));
        C12210kP c12210kP = new C12210kP(userSession);
        c12210kP.A01 = "creator_broadcast_chat";
        this.A01 = c12210kP.A00();
    }
}
