package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.recommended.FollowListData;

/* loaded from: classes6.dex */
public abstract class FY4 {
    public static final void A00(UserSession userSession, FollowListData followListData, Integer num, String str, String str2, String str3, int i) {
        C35993Fur c35993Fur;
        String str4;
        String str5;
        C14360o3.A0B(userSession, 0);
        Long l = null;
        if (str3 != null) {
            c35993Fur = new C35993Fur(str3);
        } else {
            c35993Fur = null;
        }
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(c35993Fur, userSession), "follow_list_impression");
        if (A0f.isSampled()) {
            if (followListData != null) {
                str4 = followListData.A00.A00;
            } else {
                str4 = null;
            }
            A0f.AAP("list_type", str4);
            if (followListData != null) {
                str5 = followListData.A02;
            } else {
                str5 = null;
            }
            A0f.AAP("uid_based_on", str5);
            A0f.AAP("social_context", str2);
            if (num != null) {
                l = AbstractC25229BEm.A0n(num);
            }
            A0f.A9K(AbstractC111324zv.A00(5003), l);
            A0f.AAP("target_user_id", str);
            AbstractC31175DnJ.A0z(A0f, i);
            AbstractC31175DnJ.A17(A0f, str3);
        }
    }

    public static final void A01(UserSession userSession, FollowListData followListData, String str, String str2, String str3, String str4, int i) {
        C35992Fuq c35992Fuq;
        AbstractC167017dG.A1N(userSession, followListData);
        C14360o3.A0B(str3, 5);
        if (str4 != null) {
            c35992Fuq = new C35992Fuq(str4);
        } else {
            c35992Fuq = null;
        }
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(c35992Fuq, userSession), "follow_list_action");
        if (A0f.isSampled()) {
            A0f.AAP("list_type", followListData.A00.name());
            AbstractC31171DnF.A1C(A0f, str2);
            A0f.AAP("target_user_id", str);
            AbstractC31175DnJ.A0z(A0f, i);
            A0f.AAP("uid_based_on", str3);
            A0f.Cht();
        }
    }
}
