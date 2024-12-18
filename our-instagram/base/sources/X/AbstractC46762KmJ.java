package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.KmJ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46762KmJ {
    public static final void A00(UserSession userSession, Integer num, Integer num2, String str, String str2) {
        String str3;
        String str4;
        AbstractC167017dG.A1O(userSession, num);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "direct_change_nickname");
        if (!A0f.isSampled()) {
            return;
        }
        switch (num2.intValue()) {
            case 0:
                str3 = "impression";
                break;
            case 1:
                str3 = "tap";
                break;
            case 2:
                str3 = "submit";
                break;
            default:
                str3 = "exit";
                break;
        }
        AbstractC31171DnF.A1C(A0f, str3);
        if (num.intValue() != 0) {
            str4 = "admin_text";
        } else {
            str4 = "thread_details";
        }
        AbstractC31171DnF.A1G(A0f, str4);
        A0f.A9K("target_user_id", AbstractC25233BEq.A0n(str2));
        AbstractC31171DnF.A1H(A0f, str);
        A0f.Cht();
    }
}
