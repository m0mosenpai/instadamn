package com.instagram.newsfeed.data;

import X.C129885ts;
import X.C4A7;
import X.C4A8;
import X.C57582kX;
import X.InterfaceC168017ew;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class ActivityFeedRecommendedUserRepository extends C4A7 {
    public final UserSession A00;
    public final C57582kX A01;
    public final C129885ts A02;
    public final InterfaceC168017ew A03;

    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(com.instagram.user.model.FollowStatus r8, X.EnumC33402EpZ r9, com.instagram.user.model.User r10, X.InterfaceC23621Ds r11) {
        /*
            r7 = this;
            r3 = 12
            boolean r0 = X.PX7.A02(r11, r3)
            if (r0 == 0) goto L9a
            r6 = r11
            X.PX7 r6 = (X.PX7) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L9a
            int r2 = r2 - r1
            r6.A00 = r2
        L16:
            java.lang.Object r1 = r6.A06
            X.1JX r5 = X.C1JX.A02
            int r0 = r6.A00
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L6a
            if (r0 != r4) goto La1
            java.lang.Object r3 = r6.A05
            X.4mO r3 = (X.C104024mO) r3
            java.lang.Object r9 = r6.A04
            X.EpZ r9 = (X.EnumC33402EpZ) r9
            java.lang.Object r8 = r6.A03
            com.instagram.user.model.FollowStatus r8 = (com.instagram.user.model.FollowStatus) r8
            java.lang.Object r10 = r6.A02
            com.instagram.user.model.User r10 = (com.instagram.user.model.User) r10
            java.lang.Object r2 = r6.A01
            com.instagram.newsfeed.data.ActivityFeedRecommendedUserRepository r2 = (com.instagram.newsfeed.data.ActivityFeedRecommendedUserRepository) r2
            X.AbstractC09560e7.A00(r1)
        L39:
            X.3NY r1 = (X.C3NY) r1
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto L61
            X.3NX r1 = (X.C3NX) r1
            java.lang.Object r1 = r1.A00
            X.7ew r0 = r2.A03
            X.ETP r0 = r0.AMF(r3, r9, r10)
            r0.onSuccess(r1)
        L4c:
            com.instagram.common.session.UserSession r0 = r2.A00
            X.1My r2 = X.AbstractC25651Mw.A00(r0)
            java.lang.String r1 = r10.getId()
            X.3MC r0 = new X.3MC
            r0.<init>(r8, r1)
            r2.E4s(r0)
            X.0eB r0 = X.C0eB.A00
            return r0
        L61:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 != 0) goto L4c
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L6a:
            X.AbstractC09560e7.A00(r1)
            X.5ts r2 = r7.A02
            r2.A0D(r8, r10, r4)
            boolean r0 = X.AbstractC129875tr.A02(r9)
            if (r0 == 0) goto L83
            X.2kX r1 = r7.A01
            java.lang.String r0 = new java.lang.String
            r0.<init>()
            X.4mO r3 = r1.A0L(r9, r10, r0)
        L83:
            X.1ON r1 = r2.A05(r9, r10)
            X.PX7.A00(r7, r10, r8, r9, r6)
            r6.A05 = r3
            r6.A00 = r4
            r0 = 1201781838(0x47a1bc4e, float:82808.61)
            java.lang.Object r1 = r1.A00(r0, r6)
            if (r1 != r5) goto L98
            return r5
        L98:
            r2 = r7
            goto L39
        L9a:
            X.PX7 r6 = new X.PX7
            r6.<init>(r7, r11, r3)
            goto L16
        La1:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.newsfeed.data.ActivityFeedRecommendedUserRepository.A00(com.instagram.user.model.FollowStatus, X.EpZ, com.instagram.user.model.User, X.1Ds):java.lang.Object");
    }

    public ActivityFeedRecommendedUserRepository(UserSession userSession, C57582kX c57582kX, C129885ts c129885ts, InterfaceC168017ew interfaceC168017ew) {
        super("Activity", C4A8.A00(1396732746));
        this.A00 = userSession;
        this.A03 = interfaceC168017ew;
        this.A02 = c129885ts;
        this.A01 = c57582kX;
    }
}
