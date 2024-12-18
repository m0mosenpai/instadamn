package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.api.schemas.SocialContextType;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import com.instagram.user.recommended.FollowListData;
import java.util.List;

/* renamed from: X.32s, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C675332s {
    public static final void A00(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, InterfaceC65232xL interfaceC65232xL, String str) {
        C140966Yy A01;
        int ordinal;
        String str2;
        if (fragmentActivity == null) {
            str2 = "trying to navigate to user list fragment on null activity";
        } else if (fragmentActivity.isFinishing()) {
            str2 = "trying to navigate to user list fragment after activity finished";
        } else {
            List ByK = c38321qM.A0C.ByK();
            if (ByK != null && (!ByK.isEmpty())) {
                SocialContextType ByT = ((InterfaceC87503vI) ByK.get(0)).ByT();
                if ((!c38321qM.CdW() || ((ByT != SocialContextType.A0A && ByT != SocialContextType.A0B) || !(!C77403dQ.A00.A06(userSession, c38321qM).isEmpty()))) && ((ordinal = ByT.ordinal()) == 7 || ordinal == 8)) {
                    String[] A6p = c38321qM.A6p();
                    User ByQ = ((InterfaceC87503vI) ByK.get(0)).ByQ();
                    if ((ByQ == null || (!AbstractC009903n.A0O(ByQ.getId(), A6p) && (ByQ = c38321qM.A0C.CDj()) == null)) && (ByQ = c38321qM.A0C.CDj()) == null) {
                        return;
                    }
                    ((InterfaceC87503vI) ByK.get(0)).getSocialContextUsersCount();
                    boolean z = false;
                    if (ByT == SocialContextType.A0A) {
                        z = true;
                    }
                    FollowListData A00 = AbstractC31565Dtq.A00(EnumC31556Dtg.A04, ByQ.getId(), null, false);
                    if (C18U.A06(C06090Tz.A05, userSession, 36319274248051840L)) {
                        FYC.A01(fragmentActivity, interfaceC11380iw, userSession, null, ByQ, c38321qM.getId(), true, C18U.A06(C06090Tz.A06, userSession, 2342163859715204041L));
                        return;
                    }
                    A01 = FYE.A00(fragmentActivity, userSession, A00, z);
                    A01.A0B = str;
                    A01.A04();
                    return;
                }
            }
            if (C18U.A06(C06090Tz.A05, userSession, 36329762557477394L)) {
                Integer num = null;
                if (interfaceC65232xL != null) {
                    num = Integer.valueOf(interfaceC65232xL.BRZ(c38321qM).A03);
                }
                String string = fragmentActivity.getApplicationContext().getString(C35145Fem.A00.A01(userSession, c38321qM, true));
                C14360o3.A07(string);
                String BqK = c38321qM.BqK();
                Bundle bundle = new Bundle();
                bundle.putString(AbstractC111324zv.A00(1684), BqK);
                bundle.putInt(AbstractC111324zv.A00(653), 2131968661);
                bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.token);
                bundle.putBoolean(AbstractC111324zv.A00(85), true);
                bundle.putBoolean(AbstractC111324zv.A00(162), false);
                if (num != null) {
                    bundle.putInt(AbstractC111324zv.A00(86), num.intValue());
                }
                Fragment CsT = AbstractC31412DrH.A00().A00.CsT(bundle, userSession);
                C189448aO c189448aO = new C189448aO(userSession);
                c189448aO.A0d = string;
                c189448aO.A0D = R.style.IgdsTabView;
                c189448aO.A0a = true;
                c189448aO.A03 = 0.68f;
                c189448aO.A1O = true;
                c189448aO.A00().A02(fragmentActivity, CsT);
                return;
            }
            A01 = FYE.A01(fragmentActivity, userSession, c38321qM.BqK());
            A01.A0B = str;
            A01.A04();
            return;
        }
        C0w9.A03("MediaLinkBroadcastHandler", str2);
    }
}
