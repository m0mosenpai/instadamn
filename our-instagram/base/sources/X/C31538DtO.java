package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import com.instagram.user.recommended.FollowListData;

/* renamed from: X.DtO, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31538DtO {
    public boolean A00;
    public boolean A01;
    public final Bundle A02;
    public final UserSession A03;
    public final EnumC31556Dtg A04;
    public final String A05;
    public final boolean A06;
    public final FollowListData A07;

    public C31538DtO(Bundle bundle, UserSession userSession, FollowListData followListData) {
        String str;
        EnumC31556Dtg enumC31556Dtg;
        C14360o3.A0B(userSession, 2);
        this.A02 = bundle;
        this.A03 = userSession;
        this.A07 = followListData;
        if (followListData != null) {
            str = followListData.A02;
        } else {
            str = null;
        }
        this.A06 = C2TN.A07(userSession.userId, str);
        this.A05 = bundle.getString("FollowListFragment.Group");
        this.A04 = (followListData == null || (enumC31556Dtg = followListData.A00) == null) ? EnumC31556Dtg.A0L : enumC31556Dtg;
    }

    public static final boolean A00(C31538DtO c31538DtO) {
        String str = c31538DtO.A05;
        if (!"creators".equals(str) && !"businesses".equals(str)) {
            return false;
        }
        return true;
    }

    public final boolean A01() {
        if (this.A06) {
            return false;
        }
        EnumC31556Dtg enumC31556Dtg = this.A04;
        if (enumC31556Dtg != EnumC31556Dtg.A04 && enumC31556Dtg != EnumC31556Dtg.A05) {
            return false;
        }
        if (!C18U.A06(C06090Tz.A06, this.A03, 36324788985278944L)) {
            return false;
        }
        if (!this.A00 && !this.A01) {
            return false;
        }
        return true;
    }

    public final boolean A05() {
        FollowListData followListData = this.A07;
        if (followListData != null) {
            UserSession userSession = this.A03;
            User A02 = AnonymousClass189.A00(userSession).A02(followListData.A02);
            if (A02 != null && !A02.A2H() && ((A04() || A06()) && C18U.A06(C06090Tz.A06, userSession, 36315623524928964L))) {
                return true;
            }
        }
        return false;
    }

    public final boolean A06() {
        if (C14360o3.A0K(this.A05, "non_recip_followers") && this.A02.getBoolean("FollowListFragment.HideRemoveButton", false)) {
            if (C18U.A06(C06090Tz.A05, this.A03, 36315623525060038L)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A06, r5.A03, 36315623525125575L) != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A02() {
        /*
            r5 = this;
            boolean r0 = A00(r5)
            r4 = 1
            if (r0 != 0) goto L22
            boolean r0 = r5.A04()
            if (r0 != 0) goto L13
            boolean r0 = r5.A06()
            if (r0 == 0) goto L23
        L13:
            com.instagram.common.session.UserSession r3 = r5.A03
            X.0Tz r2 = X.C06090Tz.A06
            r0 = 36315623525125575(0x8104de00030dc7, double:3.029484776343455E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L23
        L22:
            return r4
        L23:
            boolean r4 = r5.A01()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31538DtO.A02():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A06, r5.A03, 36315623525191112L) != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A03() {
        /*
            r5 = this;
            boolean r0 = A00(r5)
            r4 = 1
            if (r0 != 0) goto L22
            boolean r0 = r5.A04()
            if (r0 != 0) goto L13
            boolean r0 = r5.A06()
            if (r0 == 0) goto L23
        L13:
            com.instagram.common.session.UserSession r3 = r5.A03
            X.0Tz r2 = X.C06090Tz.A06
            r0 = 36315623525191112(0x8104de00040dc8, double:3.0294847763849006E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L23
        L22:
            return r4
        L23:
            boolean r4 = r5.A01()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31538DtO.A03():boolean");
    }

    public final boolean A04() {
        if (!A00(this)) {
            if (C14360o3.A0K(this.A05, "non_recip_followers") && !this.A02.getBoolean("FollowListFragment.HideRemoveButton", false)) {
                if (!C18U.A06(C06090Tz.A05, this.A03, 36315623524994501L)) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }
}
