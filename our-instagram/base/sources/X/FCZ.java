package X;

/* loaded from: classes6.dex */
public abstract class FCZ {
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b4, code lost:
    
        if (r5 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c6, code lost:
    
        if (r8 != null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C51757Mtg A00(android.os.Bundle r14, com.instagram.common.session.UserSession r15) {
        /*
            r2 = 0
            r3 = 1
            X.C14360o3.A0B(r15, r3)
            java.lang.String r0 = "LikesListFragment.MEDIA_ID"
            java.lang.String r8 = r14.getString(r0)
            java.lang.String r0 = "LikesListFragment.BROADCAST_ID"
            java.lang.String r1 = r14.getString(r0)
            java.lang.String r0 = "FollowListFragment.RequestParametersSelectedFilters"
            r10 = 0
            java.lang.String r11 = r14.getString(r0, r10)
            if (r8 == 0) goto Lb9
            int r0 = r8.length()
            if (r0 == 0) goto Lb9
            java.lang.String r0 = "LikesListFragment.TIME_ORDERED"
            boolean r13 = r14.getBoolean(r0)
            r0 = 86
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            int r12 = r14.getInt(r0, r2)
            java.lang.String r0 = "fragment_argument_ad_retrieval_key"
            java.lang.String r0 = r14.getString(r0)
            X.1qR r7 = X.AbstractC151266rU.A00(r15, r0, r8)
            if (r7 == 0) goto Lb7
            X.1qM r0 = r7.BQN()
            if (r0 == 0) goto Lb7
            X.1rF r0 = r0.A0C
            X.GbJ r5 = r0.Bar()
            if (r5 == 0) goto Lb3
            X.0Tz r4 = X.C06090Tz.A05
            r0 = 36321039478760530(0x8109cb00012452, double:3.032909847230495E-306)
            boolean r0 = X.C18U.A06(r4, r15, r0)
            if (r0 == 0) goto Lb3
            java.lang.String r9 = r5.getMediaId()
        L5b:
            X.0Tz r4 = X.C06090Tz.A05
            r0 = 36321039478760530(0x8109cb00012452, double:3.032909847230495E-306)
            boolean r0 = X.C18U.A06(r4, r15, r0)
            if (r0 == 0) goto L72
            java.lang.String r1 = ","
            java.util.List r0 = r5.Baq()
            java.lang.String r10 = X.AbstractC93184Fu.A00(r1, r0)
        L72:
            X.Enq r6 = new X.Enq
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
        L77:
            char[] r1 = new char[r3]
            r0 = 95
            r1[r2] = r0
            java.util.List r0 = X.AbstractC001900j.A0Q(r8, r1, r2)
            java.lang.Object r10 = X.AbstractC001800i.A0L(r0)
            java.lang.String r10 = (java.lang.String) r10
        L87:
            java.lang.String r0 = r15.userId
            boolean r0 = X.C2TN.A07(r0, r10)
            if (r0 == 0) goto Lb0
            java.lang.String r5 = "self_likers"
        L91:
            r0 = 162(0xa2, float:2.27E-43)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            boolean r4 = r14.getBoolean(r0, r2)
            java.lang.String r1 = "LikesListFragment.FEED_POSITION"
            r0 = -1
            int r0 = r14.getInt(r1, r0)
            long r0 = (long) r0
            X.QIv r2 = new X.QIv
            r2.<init>(r0, r3, r4)
            r1 = 30
            X.Mtg r0 = new X.Mtg
            r0.<init>(r6, r2, r5, r1)
            return r0
        Lb0:
            java.lang.String r5 = "likers"
            goto L91
        Lb3:
            r9 = r10
            if (r5 == 0) goto L72
            goto L5b
        Lb7:
            r9 = r10
            goto L72
        Lb9:
            if (r1 == 0) goto Lc9
            int r0 = r1.length()
            if (r0 == 0) goto Lc9
            X.Enp r6 = new X.Enp
            r6.<init>(r1, r11)
            if (r8 == 0) goto L87
            goto L77
        Lc9:
            java.lang.String r0 = "Either mediaId or broadcastId must be provided"
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FCZ.A00(android.os.Bundle, com.instagram.common.session.UserSession):X.Mtg");
    }
}
