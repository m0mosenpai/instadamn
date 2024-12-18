package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public abstract class FU2 {
    public static final void A00(UserSession userSession, EnumC33330EoP enumC33330EoP) {
        C1AV c1av;
        String str;
        InterfaceC19610xo ARD;
        String str2;
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        C1AU A01 = C1AT.A01(userSession);
        int ordinal = enumC33330EoP.ordinal();
        if (ordinal != 1) {
            if (ordinal == 0) {
                c1av = C1AV.A1F;
            } else {
                throw B4Z.A00();
            }
        } else {
            c1av = C1AV.A0a;
        }
        InterfaceC19630xq A03 = A01.A03(c1av);
        if (ordinal != 1) {
            str = "DISCOVERABLE_PUBLIC_CHANNEL_CREATION_KEY";
        } else {
            str = "BROADCAST_CHAT_CREATION_KEY";
        }
        if (A03.getBoolean(str, false)) {
            ARD = A03.ARD();
            str2 = "SUBSCRIBER_SOCIAL_CHANNEL_CREATION_KEY";
        } else {
            if (C18U.A06(C06090Tz.A05, userSession, 36315846868995720L)) {
                AbstractC167007dF.A1L(A00, A00.A2Y, C23031Ai.A8c, 392, true);
                return;
            }
            ARD = A03.ARD();
            if (ordinal != 1) {
                str2 = "DISCOVERABLE_PUBLIC_CHANNEL_CREATION_KEY";
            } else {
                str2 = "BROADCAST_CHAT_CREATION_KEY";
            }
        }
        ARD.E77(str2, true);
        ARD.apply();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
    
        if (r0.getFanClubId() == null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A01(com.instagram.common.session.UserSession r5, X.EnumC33330EoP r6) {
        /*
            r4 = 0
            X.1AU r3 = X.C1AT.A01(r5)
            int r2 = r6.ordinal()
            r1 = 1
            if (r2 == r1) goto L4a
            X.1AV r0 = X.C1AV.A1F
        Le:
            X.0xq r3 = r3.A03(r0)
            if (r2 == r1) goto L47
            java.lang.String r0 = "DISCOVERABLE_PUBLIC_CHANNEL_CREATION_KEY"
        L16:
            r2 = 0
            boolean r1 = r3.getBoolean(r0, r4)
            X.EoP r0 = X.EnumC33330EoP.A02
            if (r6 == r0) goto L4d
            if (r1 == 0) goto L4d
            X.18A r1 = X.AnonymousClass189.A00(r5)
            java.lang.String r0 = r5.userId
            com.instagram.user.model.User r0 = r1.A02(r0)
            if (r0 == 0) goto L3a
            com.instagram.api.schemas.FanClubInfoDict r0 = X.AbstractC31172DnG.A0M(r0)
            if (r0 == 0) goto L3a
            java.lang.String r0 = r0.getFanClubId()
            r1 = 0
            if (r0 != 0) goto L3b
        L3a:
            r1 = 1
        L3b:
            java.lang.String r0 = "SUBSCRIBER_SOCIAL_CHANNEL_CREATION_KEY"
            boolean r0 = r3.getBoolean(r0, r4)
            if (r1 != 0) goto L45
            if (r0 == 0) goto L46
        L45:
            r2 = 1
        L46:
            return r2
        L47:
            java.lang.String r0 = "BROADCAST_CHAT_CREATION_KEY"
            goto L16
        L4a:
            X.1AV r0 = X.C1AV.A0a
            goto Le
        L4d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FU2.A01(com.instagram.common.session.UserSession, X.EoP):boolean");
    }
}
