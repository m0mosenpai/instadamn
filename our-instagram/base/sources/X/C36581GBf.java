package X;

import com.instagram.common.session.UserSession;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.user.model.User;

/* renamed from: X.GBf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36581GBf implements C53V {
    public final UserSession A00;
    public final UserDetailFragment A01;
    public final MUB A02;
    public final String A03;
    public final String A04;

    @Override // X.C53V
    public final void Cm2(String str, String str2, String str3, String str4, String str5, String str6) {
        UserSession userSession = this.A00;
        UserDetailFragment userDetailFragment = this.A01;
        MUB mub = this.A02;
        EnumC1571773w A00 = C1571673v.A00(userSession, mub.A03);
        String A02 = mub.A02();
        String str7 = this.A03;
        String str8 = this.A04;
        User user = mub.A03;
        String str9 = userSession.userId;
        C14360o3.A0B(str9, 1);
        String str10 = null;
        if (user != null) {
            if (C14360o3.A0K(user.getId(), str9)) {
                str10 = "self";
            } else {
                C17Q c17q = user.A02;
                if (c17q == C17Q.A06) {
                    str10 = "subscribed";
                } else if (c17q == C17Q.A03) {
                    str10 = "not_subscribed";
                }
            }
        }
        C14360o3.A0B(A00, 3);
        C1571673v.A04(userDetailFragment, userSession, A00, null, str, A02, str2, str7, str8, str10);
    }

    public C36581GBf(UserSession userSession, UserDetailFragment userDetailFragment, MUB mub, String str, String str2) {
        this.A00 = userSession;
        this.A01 = userDetailFragment;
        this.A02 = mub;
        this.A03 = str;
        this.A04 = str2;
    }
}
