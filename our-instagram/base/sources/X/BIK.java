package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* loaded from: classes5.dex */
public abstract class BIK {
    public static final C25303BHy A00(UserSession userSession, C47P c47p) {
        String str;
        User user;
        User user2;
        C14360o3.A0B(c47p, 0);
        C14360o3.A0B(userSession, 1);
        User CDj = c47p.CDj();
        String url = CDj.Bhu().getUrl();
        C14360o3.A07(url);
        String username = CDj.getUsername();
        String fullName = CDj.getFullName();
        if (fullName == null) {
            fullName = "";
        }
        String ByJ = c47p.ByJ();
        ImmutableList socialContextFacepileUsers = c47p.getSocialContextFacepileUsers();
        boolean z = false;
        String str2 = null;
        if (socialContextFacepileUsers != null && (user2 = (User) AbstractC001800i.A0O(socialContextFacepileUsers, 0)) != null) {
            str = user2.Bhu().getUrl();
        } else {
            str = null;
        }
        ImmutableList socialContextFacepileUsers2 = c47p.getSocialContextFacepileUsers();
        if (socialContextFacepileUsers2 != null && (user = (User) AbstractC001800i.A0O(socialContextFacepileUsers2, 1)) != null) {
            str2 = user.Bhu().getUrl();
        }
        boolean A02 = C6XI.A02(CDj);
        boolean isVerified = CDj.isVerified();
        FollowStatus B7L = CDj.B7L();
        if (C18U.A06(C06090Tz.A05, userSession, 36329543513948561L) && CDj.A27()) {
            z = true;
        }
        return new C25303BHy(BH8.A00(B7L, Boolean.valueOf(z)), c47p, url, username, fullName, ByJ, str, str2, A02, isVerified);
    }
}
