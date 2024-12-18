package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.profile.fragment.UserDetailTabController;
import com.instagram.profile.intf.UserDetailEntryInfo;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class GIQ implements InterfaceC77483dY, InterfaceC37186GZx {
    public final Activity A00;
    public final Context A01;
    public final UserSession A02;
    public final C189478aR A03;
    public final UserDetailTabController A04;
    public final User A05;
    public final InterfaceC1570073e A06;
    public final InterfaceC1568872r A07;
    public final C38321qM A08;
    public final UserDetailEntryInfo A09;
    public final String A0A;
    public final String A0B;

    @Override // X.InterfaceC37186GZx
    public final void Ckc(InterfaceC11380iw interfaceC11380iw, Integer num) {
        String str;
        C14360o3.A0B(num, 0);
        UserSession userSession = this.A02;
        User user = this.A05;
        switch (num.intValue()) {
            case 1:
                str = "mute_feed_posts";
                break;
            case 2:
                str = "mute_stories";
                break;
            case 3:
                str = "mute_notes";
                break;
            case 4:
            case 5:
            case 7:
            default:
                return;
            case 6:
                str = "mute_feed_posts_and_stories";
                break;
            case 8:
                str = "unmute_feed_posts";
                break;
            case 9:
                str = "unmute_stories";
                break;
            case 10:
                str = "unmute_notes";
                break;
        }
        C1571673v.A06(interfaceC11380iw, userSession, C1571673v.A01(user.B7L()), str, user.getId(), "following_sheet");
    }

    @Override // X.InterfaceC77483dY
    public final void D3u(FollowStatus followStatus, User user) {
        C14360o3.A0B(user, 0);
        UserSession userSession = this.A02;
        AbstractC25651Mw.A00(userSession).A05(new C71G(user));
        Integer C9j = user.A03.C9j();
        if (C9j != null && C9j.intValue() > 0) {
            AbstractC23021Ah.A00(userSession).A0S();
        }
    }

    @Override // X.InterfaceC77483dY
    public final void D4B(User user) {
    }

    @Override // X.InterfaceC37186GZx
    public final void DFf() {
    }

    @Override // X.InterfaceC77483dY
    public final void DHr(User user) {
    }

    @Override // X.InterfaceC77483dY
    public final void DHs(User user) {
    }

    @Override // X.InterfaceC77483dY
    public final void DHt(ViewOnAttachStateChangeListenerC110564yT viewOnAttachStateChangeListenerC110564yT) {
    }

    @Override // X.InterfaceC77483dY
    public final void DHu(EnumC33402EpZ enumC33402EpZ, User user) {
    }

    @Override // X.InterfaceC37186GZx
    public final void onSuccess() {
    }

    public GIQ(Activity activity, Context context, UserSession userSession, C38321qM c38321qM, C189478aR c189478aR, UserDetailTabController userDetailTabController, UserDetailEntryInfo userDetailEntryInfo, User user, InterfaceC1570073e interfaceC1570073e, InterfaceC1568872r interfaceC1568872r, String str, String str2) {
        C14360o3.A0B(interfaceC1568872r, 13);
        this.A03 = c189478aR;
        this.A05 = user;
        this.A01 = context;
        this.A00 = activity;
        this.A02 = userSession;
        this.A04 = userDetailTabController;
        this.A0B = str;
        this.A09 = userDetailEntryInfo;
        this.A0A = str2;
        this.A08 = c38321qM;
        this.A06 = interfaceC1570073e;
        this.A07 = interfaceC1568872r;
    }

    public final void A00(User user, String str) {
        JSONObject A00;
        UserSession userSession = this.A02;
        FA7.A00(userSession).A02(EnumC33422Ept.A0B, null);
        FA7.A00(userSession).A03(EnumC33422Ept.A08, "follow_cancel");
        Context context = this.A01;
        String str2 = this.A0B;
        String str3 = this.A0A;
        UserDetailEntryInfo userDetailEntryInfo = this.A09;
        C38321qM c38321qM = this.A08;
        if (str == null) {
            A00 = null;
        } else {
            A00 = FAC.A00(str);
        }
        AbstractC35271Fh6.A07(context, null, new C31702Dw7(this, 18), userSession, c38321qM, null, userDetailEntryInfo, null, this, null, user, null, null, null, "user_profile_header", str2, str3, null, null, null, null, A00);
        this.A03.A0L(null);
        Activity activity = this.A00;
        if (activity != null && user.B7L() == FollowStatus.A06 && C1VN.A00 != null) {
            AbstractC31282Dp4.A00().A00(activity, userSession, "1705782836540319", AbstractC47112Ks7.A00(this.A05.getId()));
        }
    }
}
