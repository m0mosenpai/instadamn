package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.3tK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C86473tK {
    public final UserSession A00;

    public C86473tK(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final C9BD A00(C38321qM c38321qM, String str) {
        boolean z;
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(str, 1);
        boolean Cff = c38321qM.Cff();
        UserSession userSession = this.A00;
        boolean A0T = AbstractC41071vF.A0T(userSession, c38321qM);
        if (C57462kL.A02(c38321qM, AbstractC65512xn.A00(userSession), str) && (C18U.A06(C06090Tz.A05, userSession, 36329238571860185L) || C57462kL.A00(userSession) == EnumC79653hG.A06)) {
            z = true;
        } else {
            z = false;
        }
        return new C9BD(Cff, 1, A0T, z, c38321qM.A5n());
    }
}
