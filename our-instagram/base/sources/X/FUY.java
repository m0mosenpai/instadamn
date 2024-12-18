package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengeAllWinnersShareInfo;
import com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengeShareInfo;
import com.instagram.direct.groupinvites.models.InviteLinkShareInfo;
import java.util.LinkedHashMap;

/* loaded from: classes6.dex */
public abstract class FUY {
    public static final void A00(UserSession userSession, ChannelChallengeShareInfo channelChallengeShareInfo, String str) {
        C14360o3.A0B(channelChallengeShareInfo, 1);
        if (str != null) {
            C36298Fzs A00 = AbstractC34063F1q.A00(userSession);
            String C7I = channelChallengeShareInfo.C7I();
            String C7q = channelChallengeShareInfo.C7q();
            String BSw = channelChallengeShareInfo.BSw();
            String Ant = channelChallengeShareInfo.Ant();
            String Amu = channelChallengeShareInfo.Amu();
            String B2U = channelChallengeShareInfo.B2U();
            Integer Ada = channelChallengeShareInfo.Ada();
            String CE7 = channelChallengeShareInfo.CE7();
            boolean z = channelChallengeShareInfo instanceof ChannelChallengeAllWinnersShareInfo;
            C25531Mh A0E = C25531Mh.A0E(A00.A01);
            if (AbstractC25226BEj.A1Z(A0E)) {
                String A01 = C36298Fzs.A01(B2U, z);
                LinkedHashMap A1I = AbstractC166987dD.A1I();
                A1I.put("share_type", A01);
                A1I.put("share_option", str);
                A1I.put("challenge_id", Amu);
                if (CE7 != null) {
                    A1I.put("user_type", CE7);
                }
                A0E.A0g(Long.valueOf(A00.A00));
                AbstractC31174DnI.A1I(A0E, AbstractC111324zv.A00(65));
                A0E.A0o("challenge_share_sheet");
                A0E.A0p(C36298Fzs.A00(B2U));
                A0E.A0h(AbstractC31179DnN.A0Z(A0E, AbstractC147806l5.A01(Ada), C7I, C7q));
                AbstractC31176DnK.A1M(A0E, BSw, Ant);
                AbstractC31175DnJ.A1E(A0E, A00.A02, A1I);
            }
        }
    }

    public static final void A01(UserSession userSession, InviteLinkShareInfo inviteLinkShareInfo, String str) {
        String str2;
        C14360o3.A0B(inviteLinkShareInfo, 1);
        if (inviteLinkShareInfo.A02 == 29 && str != null) {
            C142846ck A00 = AbstractC147806l5.A00(userSession);
            String str3 = inviteLinkShareInfo.A07;
            String str4 = inviteLinkShareInfo.A09;
            boolean z = inviteLinkShareInfo.A0C;
            int i = inviteLinkShareInfo.A00;
            String str5 = inviteLinkShareInfo.A0A;
            C25531Mh A0I = AbstractC31172DnG.A0I(A00);
            if (AbstractC25226BEj.A1Z(A0I)) {
                AbstractC31175DnJ.A1B(A0I, A00);
                AbstractC31174DnI.A1I(A0I, AbstractC111324zv.A00(65));
                A0I.A0o("send_invite_link_sheet");
                if (z) {
                    str2 = "creator_invite_link_details";
                } else {
                    str2 = "fan_invite_link_details";
                }
                AbstractC31174DnI.A1H(A0I, A00, AbstractC31179DnN.A0a(A0I, str2, str3, str4, i));
                A0I.A0v(AbstractC25232BEp.A1F("share_option", str, AbstractC166987dD.A1L("user_type", str5), AbstractC166987dD.A1L("share_type", "invite_link")));
                A0I.Cht();
            }
        }
    }
}
