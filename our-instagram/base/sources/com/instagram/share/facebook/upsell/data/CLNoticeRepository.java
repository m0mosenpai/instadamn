package com.instagram.share.facebook.upsell.data;

import X.AbstractC166987dD;
import X.C008002u;
import X.C05A;
import X.C05F;
import X.C0UO;
import X.C10E;
import X.C14360o3;
import X.C200028t6;
import X.C4A7;
import X.C4A8;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.share.facebook.cxpnotice.noticestate.internal.CXPNoticeStateRepository;

/* loaded from: classes4.dex */
public final class CLNoticeRepository extends C4A7 {
    public final Context A00;
    public final UserSession A01;
    public final CXPNoticeStateRepository A02;
    public final C200028t6 A03;
    public final String A04;
    public final C05A A05;
    public final C0UO A06;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(X.InterfaceC23621Ds r19) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.share.facebook.upsell.data.CLNoticeRepository.A00(X.1Ds):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CLNoticeRepository(Context context, UserSession userSession, String str) {
        super("CXPNotices", C4A8.A00(664689487));
        C200028t6 c200028t6 = new C200028t6(userSession, 479857365);
        CXPNoticeStateRepository cXPNoticeStateRepository = new CXPNoticeStateRepository(userSession, C05F.A00);
        C14360o3.A0B(userSession, 2);
        this.A01 = userSession;
        this.A04 = str;
        this.A03 = c200028t6;
        this.A02 = cXPNoticeStateRepository;
        this.A00 = AbstractC166987dD.A0O(context);
        C008002u A00 = C10E.A00(null);
        this.A05 = A00;
        this.A06 = A00;
    }
}
