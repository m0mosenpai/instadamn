package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes4.dex */
public final class ABZ {
    public int A00 = 0;
    public final Context A01;
    public final UserSession A02;
    public final AGP A03;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0009. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A00() {
        /*
            r4 = this;
            X.AGP r3 = r4.A03
            java.lang.String r1 = r3.A06
            int r0 = r1.hashCode()
            r2 = 0
            switch(r0) {
                case -1941167627: goto Ld;
                case -1705349612: goto L1a;
                case -1173729015: goto L1d;
                case 299265722: goto L20;
                case 693541831: goto L23;
                case 757331891: goto L3d;
                case 822756427: goto L26;
                case 906220026: goto L29;
                case 1029649978: goto L2c;
                case 1323106837: goto L40;
                default: goto Lc;
            }
        Lc:
            return r2
        Ld:
            java.lang.String r0 = "post_cap_direct"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lc
            com.instagram.common.session.UserSession r1 = r3.A05
            X.81T r0 = X.C81T.A00
            goto L38
        L1a:
            java.lang.String r0 = "igtv_share_stories"
            goto L2e
        L1d:
            java.lang.String r0 = "shoutout_share_stories"
            goto L2e
        L20:
            java.lang.String r0 = "photo_credit_stories"
            goto L2e
        L23:
            java.lang.String r0 = "post_cap_stories"
            goto L2e
        L26:
            java.lang.String r0 = "mention_reshare_stories"
            goto L2e
        L29:
            java.lang.String r0 = "reels_reshare_stories"
            goto L2e
        L2c:
            java.lang.String r0 = "reel_memory_share_stories"
        L2e:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lc
            com.instagram.common.session.UserSession r1 = r3.A05
            X.9Kk r0 = X.C208509Kk.A00
        L38:
            boolean r2 = X.C9O6.A00(r1, r0)
            return r2
        L3d:
            java.lang.String r0 = "post_cap"
            goto L42
        L40:
            java.lang.String r0 = "post_cap_draft"
        L42:
            boolean r0 = r1.equals(r0)
            r1 = 1
            if (r0 != 0) goto L4a
            return r2
        L4a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ABZ.A00():boolean");
    }

    public ABZ(Context context, UserSession userSession, C219919nd c219919nd, C208719Lf c208719Lf, String str) {
        this.A01 = context;
        this.A02 = userSession;
        this.A03 = new AGP(userSession, c219919nd, c208719Lf, str);
    }
}
