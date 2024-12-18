package X;

/* renamed from: X.9yj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC226269yj {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0029. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A00(com.instagram.common.session.UserSession r6, java.lang.String r7, java.util.List r8) {
        /*
            r4 = 0
            X.C14360o3.A0B(r6, r4)
            r1 = 1
            r5 = 2
            int r0 = r8.size()
            r3 = 0
            if (r0 != r1) goto L2c
            java.lang.String r1 = X.AbstractC167007dF.A0h(r7)
            java.lang.String r0 = "new-single-sticker"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L2c
            java.lang.Object r0 = X.AbstractC001800i.A0J(r8)
            X.6lx r0 = (X.C148276lx) r0
            if (r0 == 0) goto L2c
            X.6pU r0 = r0.A00()
            int r0 = r0.ordinal()
            switch(r0) {
                case 12: goto Lc9;
                case 20: goto Lc9;
                case 21: goto Lc9;
                case 63: goto L8b;
                case 94: goto Lae;
                case 97: goto L46;
                case 110: goto L2d;
                default: goto L2c;
            }
        L2c:
            return r3
        L2d:
            X.0xq r0 = X.AbstractC166987dD.A0x(r6)
            java.lang.String r2 = "seen_whatsapp_sticker_nux_times"
            int r1 = r0.getInt(r2, r4)
            if (r1 > r5) goto L2c
            X.1Ai r0 = X.AbstractC23021Ah.A00(r6)
            int r1 = r1 + 1
            X.0xq r0 = r0.A01
            X.AbstractC167007dF.A18(r0, r2, r1)
            goto Lc9
        L46:
            X.6di r7 = X.AbstractC149676oK.A00(r6)
            X.0cb r0 = X.C17060sy.A01
            com.instagram.common.session.UserSession r6 = r7.A00
            com.instagram.user.model.User r0 = r0.A01(r6)
            X.17P r0 = r0.A03
            com.instagram.api.schemas.FanClubInfoDict r0 = r0.B4O()
            if (r0 == 0) goto L89
            java.lang.String r0 = r0.getFanClubId()
        L5e:
            if (r0 == 0) goto L2c
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36323710948355582(0x810c3900002dfe, double:3.0345992953595506E-306)
            boolean r0 = X.C18U.A06(r2, r6, r0)
            if (r0 == 0) goto L2c
            X.0xq r2 = r7.A01
            java.lang.String r0 = "uprank_story_sticker_last_seen_month"
            int r1 = r2.getInt(r0, r4)
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            int r0 = r0.get(r5)
            if (r1 != r0) goto Lc9
            java.lang.String r0 = "uprank_story_sticker_impression_for_current_month"
            int r1 = r2.getInt(r0, r4)
            r0 = 3
            if (r1 >= r0) goto L2c
            goto Lc9
        L89:
            r0 = 0
            goto L5e
        L8b:
            X.1Ai r3 = X.AbstractC23021Ah.A00(r6)
            java.lang.String r2 = "music_pick_template_new_sticker_time_stamp"
            r0 = 4
            boolean r0 = X.C23031Ai.A07(r3, r2, r0)
            if (r0 == 0) goto Lc9
            X.0ry r2 = r3.A6Z
            X.0YR[] r1 = X.C23031Ai.A8c
            r0 = 133(0x85, float:1.86E-43)
            r0 = r1[r0]
            java.lang.Object r0 = r2.CES(r3, r0)
            long r2 = X.AbstractC166987dD.A0N(r0)
            r0 = 0
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            goto Lc6
        Lae:
            X.1Ai r2 = X.AbstractC23021Ah.A00(r6)
            java.lang.String r4 = "stories_template_new_sticker_time_stamp"
            r0 = 4
            boolean r0 = X.C23031Ai.A07(r2, r4, r0)
            if (r0 == 0) goto Lc9
            X.0xq r0 = r2.A01
            r2 = 0
            long r0 = r0.getLong(r4, r2)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
        Lc6:
            r3 = 0
            if (r4 != 0) goto L2c
        Lc9:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC226269yj.A00(com.instagram.common.session.UserSession, java.lang.String, java.util.List):boolean");
    }
}
