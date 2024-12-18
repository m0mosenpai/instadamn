package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.2kL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C57462kL {
    public final UserSession A00;

    public final EnumC86893u2 A03(C38321qM c38321qM, String str) {
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(str, 1);
        if ("feed_timeline".equals(str) && !c38321qM.A5E()) {
            EnumC86893u2 enumC86893u2 = (EnumC86893u2) EnumC86893u2.A01.get(C18U.A04(C06090Tz.A05, this.A00, 36879471127232787L));
            if (enumC86893u2 != null) {
                return enumC86893u2;
            }
        }
        return EnumC86893u2.A05;
    }

    public final boolean A05(C38321qM c38321qM) {
        boolean z;
        C14360o3.A0B(c38321qM, 0);
        if (c38321qM.CdW() && !c38321qM.A5v() && c38321qM.A6I()) {
            UserSession userSession = this.A00;
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36316521174274537L) || C18U.A06(c06090Tz, userSession, 36329715312706042L)) {
                z = true;
                return !z || (c38321qM.A5P() && (c38321qM.A6I() || c38321qM.A6b(this.A00)));
            }
        }
        z = false;
        if (z) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001e, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r7.A00, 36320442478633472L) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A06(X.C38321qM r8, java.lang.String r9) {
        /*
            r7 = this;
            r0 = 0
            X.C14360o3.A0B(r8, r0)
            r0 = 1
            X.C14360o3.A0B(r9, r0)
            java.lang.String r0 = "feed_timeline"
            boolean r0 = r0.equals(r9)
            r6 = 0
            if (r0 != 0) goto L21
            com.instagram.common.session.UserSession r3 = r7.A00
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36320442478633472(0x81094000062200, double:3.032532301946217E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 != 0) goto L21
        L20:
            return r6
        L21:
            boolean r0 = r8.A5M()
            if (r0 != 0) goto L20
            boolean r0 = r8.CdW()
            if (r0 != 0) goto L20
            boolean r0 = r8.Cff()
            if (r0 == 0) goto L20
            com.instagram.common.session.UserSession r5 = r7.A00
            X.0Tz r2 = X.C06090Tz.A06
            r0 = 36601917455208843(0x8209400004118b, double:3.2105382105412384E-306)
            long r3 = X.C18U.A01(r2, r5, r0)
            double r1 = r8.A0l()
            int r0 = (int) r1
            long r1 = (long) r0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L20
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36320442478240254(0x810940000021fe, double:3.0325323016975444E-306)
            boolean r0 = X.C18U.A06(r2, r5, r0)
            if (r0 == 0) goto L20
            r6 = 1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57462kL.A06(X.1qM, java.lang.String):boolean");
    }

    public final boolean A07(String str) {
        UserSession userSession;
        C06090Tz c06090Tz;
        long j;
        C14360o3.A0B(str, 0);
        boolean equals = "feed_timeline".equals(str);
        boolean equals2 = "feed_contextual_chain".equals(str);
        if (equals) {
            userSession = this.A00;
            c06090Tz = C06090Tz.A05;
            j = 36319317196807338L;
        } else if (!"feed_timeline_older".equals(str) && !"feed_timeline_favorites_older".equals(str) && !"feed_timeline_following".equals(str) && !"feed_timeline_favorites".equals(str) && !"feed_timeline_ifr_only".equals(str) && !"feed_timeline_fan_club".equals(str)) {
            if (!"feed_contextual_self_profile".equals(str) && !"feed_contextual_profile".equals(str) && !"feed_contextual_hashtag".equals(str) && !"feed_contextual_map".equals(str) && !"feed_contextual_keyword".equals(str) && !"feed_short_url".equals(str)) {
                if (equals2) {
                    userSession = this.A00;
                    c06090Tz = C06090Tz.A05;
                    j = 36319317197069485L;
                } else {
                    return false;
                }
            } else {
                userSession = this.A00;
                c06090Tz = C06090Tz.A05;
                j = 36319317197003948L;
            }
        } else {
            userSession = this.A00;
            c06090Tz = C06090Tz.A05;
            j = 36319317196938411L;
        }
        return C18U.A06(c06090Tz, userSession, j);
    }

    public static final EnumC79653hG A00(UserSession userSession) {
        C06090Tz c06090Tz = C06090Tz.A06;
        if (C18U.A06(c06090Tz, userSession, 36329238571663576L)) {
            return EnumC79653hG.A06;
        }
        if (C18U.A06(c06090Tz, userSession, 36329238571598039L)) {
            return EnumC79653hG.A04;
        }
        if (C18U.A06(c06090Tz, userSession, 36329238571532502L)) {
            return EnumC79653hG.A05;
        }
        return EnumC79653hG.A07;
    }

    public static final boolean A01(UserSession userSession) {
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, userSession, 36329238571532502L) && !C18U.A06(c06090Tz, userSession, 36329238571598039L) && !C18U.A06(c06090Tz, userSession, 36329238571663576L)) {
            return false;
        }
        return true;
    }

    public static final boolean A02(C38321qM c38321qM, C57462kL c57462kL, String str) {
        InterfaceC39541sb injected;
        InterfaceC88193wT BFe;
        UserSession userSession = c57462kL.A00;
        C06090Tz c06090Tz = C06090Tz.A05;
        if ((C18U.A06(c06090Tz, userSession, 36329238571991258L) && !"feed_timeline".equals(str)) || !c38321qM.A5E() || c38321qM.A5M() || c38321qM.A5m() || c38321qM.A5v() || c38321qM.A0C.BNT() == null || (injected = c38321qM.A0C.getInjected()) == null || (BFe = injected.BFe()) == null || BFe.BFM() == null || c38321qM.A0l() < C18U.A00(c06090Tz, userSession, 37173663502041699L)) {
            return false;
        }
        return true;
    }

    public final boolean A04() {
        UserSession userSession = this.A00;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, userSession, 36316521173225949L) && !C18U.A06(c06090Tz, userSession, 36329715312968189L)) {
            return false;
        }
        return true;
    }

    public C57462kL(UserSession userSession) {
        this.A00 = userSession;
    }
}
