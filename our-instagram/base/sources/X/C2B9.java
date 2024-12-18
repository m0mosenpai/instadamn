package X;

import com.instagram.common.session.UserSession;
import com.instagram.share.facebook.cxpnotice.noticestate.internal.CXPNoticeStateRepository;
import java.util.Map;

/* renamed from: X.2B9, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2B9 {
    public final UserSession A00;
    public final CXPNoticeStateRepository A01;
    public final C46552Bt A02;
    public final Map A03;
    public final C12N A04;

    public C2B9(C12N c12n, UserSession userSession, CXPNoticeStateRepository cXPNoticeStateRepository, C46552Bt c46552Bt, Map map) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(c46552Bt, 3);
        C14360o3.A0B(c12n, 4);
        this.A00 = userSession;
        this.A01 = cXPNoticeStateRepository;
        this.A02 = c46552Bt;
        this.A04 = c12n;
        this.A03 = map;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r5.A00, 36315838274211433L) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C9B9 A00(X.C2B9 r5, X.EnumC46582Bw r6) {
        /*
            X.2Bw r4 = X.EnumC46582Bw.A0a
            if (r6 != r4) goto L2c
            com.instagram.common.session.UserSession r3 = r5.A00
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36315838274211433(0x810510000e0e69, double:3.0296205845300765E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 != 0) goto L2c
        L13:
            X.2Bt r4 = r5.A02
            X.0xq r3 = r4.A04
            java.lang.String r2 = "PREFERENCE_REELS_RECOMMEND_ON_FACEBOOK_COMMENT_DISCLOSURE_VERSION"
            r0 = 0
            long r0 = r3.getLong(r2, r0)
            int r3 = (int) r0
            int r1 = r4.A00()
            r0 = 8
            X.9B9 r2 = new X.9B9
            r2.<init>(r3, r1, r0)
        L2b:
            return r2
        L2c:
            com.instagram.share.facebook.cxpnotice.noticestate.internal.CXPNoticeStateRepository r0 = r5.A01
            r3 = 0
            X.C14360o3.A0B(r6, r3)
            X.2BI r0 = r0.A02
            X.9B9 r2 = r0.A00(r6)
            if (r2 != 0) goto L2b
            if (r6 == r4) goto L13
            r1 = 1
            r0 = 8
            X.9B9 r2 = new X.9B9
            r2.<init>(r1, r3, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2B9.A00(X.2B9, X.2Bw):X.9B9");
    }

    public final void onUserSessionStart() {
        if (C18U.A06(C06090Tz.A05, this.A00, 36318698721515942L)) {
            C19K A02 = AnonymousClass194.A02(this.A04.AOT(1158112076, 3));
            C206649Cv c206649Cv = new C206649Cv(this, null, 7);
            AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c206649Cv, A02);
        }
    }
}
