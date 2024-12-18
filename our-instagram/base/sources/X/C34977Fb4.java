package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Fb4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34977Fb4 {
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0069, code lost:
    
        if (r15 != X.C05F.A01) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
    
        if (r13.getBooleanQueryParameter("sharing_with_user", false) != true) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.instagram.friendmap.configs.FriendMapLaunchConfig A01(android.net.Uri r13, com.instagram.common.session.UserSession r14, java.lang.Integer r15, boolean r16) {
        /*
            r12 = this;
            r2 = 0
            X.C14360o3.A0B(r14, r2)
            r3 = 0
            if (r13 == 0) goto L7b
            java.lang.String r0 = "location_sharing_user_id"
            java.lang.String r7 = r13.getQueryParameter(r0)
            java.lang.String r0 = "location_sharing_user_ids"
            java.lang.String r0 = r13.getQueryParameter(r0)
        L13:
            java.util.List r8 = A00(r0)
            r1 = 1
            if (r13 == 0) goto L23
            java.lang.String r0 = "sharing_with_user"
            boolean r0 = r13.getBooleanQueryParameter(r0, r2)
            r9 = 1
            if (r0 == r1) goto L24
        L23:
            r9 = 0
        L24:
            if (r7 == 0) goto L79
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36321722382952221(0x810a6a0044271d, double:3.033341718591155E-306)
            boolean r0 = X.C18U.A06(r2, r14, r0)
            if (r0 == 0) goto L79
            java.util.List r8 = X.AbstractC166987dD.A1J(r7)
            r1 = r9 ^ 1
            r7 = r3
        L3a:
            if (r13 == 0) goto L76
            java.lang.String r0 = "note_id"
            java.lang.String r5 = r13.getQueryParameter(r0)
            java.lang.String r0 = "note_ids"
            java.lang.String r6 = r13.getQueryParameter(r0)
        L48:
            if (r8 == 0) goto L63
            if (r13 == 0) goto L74
            java.lang.String r0 = "others_count"
            java.lang.String r0 = r13.getQueryParameter(r0)
            if (r0 == 0) goto L74
            java.lang.Integer r0 = X.AbstractC003100w.A0i(r0)
            if (r0 == 0) goto L74
            int r0 = r0.intValue()
        L5e:
            com.instagram.friendmap.configs.AggregatedBannerConfig r3 = new com.instagram.friendmap.configs.AggregatedBannerConfig
            r3.<init>(r0, r1, r8)
        L63:
            r4 = r15
            if (r7 == 0) goto L6b
            java.lang.Integer r0 = X.C05F.A01
            r10 = 1
            if (r15 == r0) goto L6c
        L6b:
            r10 = 0
        L6c:
            com.instagram.friendmap.configs.FriendMapLaunchConfig r2 = new com.instagram.friendmap.configs.FriendMapLaunchConfig
            r11 = r16
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r2
        L74:
            r0 = 0
            goto L5e
        L76:
            r5 = r3
            r6 = r3
            goto L48
        L79:
            r1 = 1
            goto L3a
        L7b:
            r7 = r3
            r0 = r3
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C34977Fb4.A01(android.net.Uri, com.instagram.common.session.UserSession, java.lang.Integer, boolean):com.instagram.friendmap.configs.FriendMapLaunchConfig");
    }

    public static final List A00(String str) {
        List A0m;
        if (str != null && (A0m = AbstractC167007dF.A0m(str, InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, 0)) != null) {
            ArrayList A0q = AbstractC167017dG.A0q(A0m);
            Iterator it = A0m.iterator();
            while (it.hasNext()) {
                A0q.add(new C11L("[\\[\\](){} ]").A00(AbstractC166987dD.A1B(it), ""));
            }
            return A0q;
        }
        return null;
    }
}
