package com.instagram.sharetofriendsstory.v2.data;

import X.C35167FfI;
import X.C4A7;
import X.C4A8;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class ShareToFriendsStoryRepository extends C4A7 {
    public final C35167FfI A00;
    public final UserSession A01;

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(X.InterfaceC23621Ds r7) {
        /*
            r6 = this;
            r3 = 47
            boolean r0 = X.PXC.A03(r7, r3)
            if (r0 == 0) goto L60
            r5 = r7
            X.PXC r5 = (X.PXC) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L60
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r1 = r5.A01
            X.1JX r4 = X.C1JX.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L37
            if (r0 != r3) goto L76
            X.AbstractC09560e7.A00(r1)
        L24:
            X.3NY r1 = (X.C3NY) r1
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto L68
            X.3NX r1 = (X.C3NX) r1
            java.lang.Object r0 = r1.A00
            X.EC5 r0 = (X.EC5) r0
            java.util.List r0 = r0.A00
            X.3NX r4 = X.AbstractC25225BEi.A0z(r0)
            return r4
        L37:
            X.AbstractC09560e7.A00(r1)
            com.instagram.common.session.UserSession r0 = r6.A01
            X.1Ms r2 = X.AbstractC31179DnN.A0D(r0)
            java.lang.String r0 = "friendships/share_to_friends_story_suggested_users/"
            r2.A0B(r0)
            java.lang.String r1 = "search_surface"
            java.lang.String r0 = "share_to_friends_story_share_sheet"
            r2.A9s(r1, r0)
            java.lang.Class<X.EC5> r1 = X.EC5.class
            java.lang.Class<X.FXZ> r0 = X.FXZ.class
            X.1ON r1 = X.AbstractC25227BEk.A0e(r2, r1, r0)
            r5.A00 = r3
            r0 = 1006961414(0x3c050306, float:0.008118397)
            java.lang.Object r1 = r1.A00(r0, r5)
            if (r1 != r4) goto L24
            return r4
        L60:
            r0 = 42
            X.PXC r5 = new X.PXC
            r5.<init>(r6, r7, r3, r0)
            goto L16
        L68:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 == 0) goto L71
            X.8jk r4 = X.AbstractC25227BEk.A0h()
            return r4
        L71:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L76:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.sharetofriendsstory.v2.data.ShareToFriendsStoryRepository.A00(X.1Ds):java.lang.Object");
    }

    public ShareToFriendsStoryRepository(UserSession userSession, C35167FfI c35167FfI) {
        super("ShareToFriendsStory", C4A8.A00(1006961414));
        this.A01 = userSession;
        this.A00 = c35167FfI;
    }
}
