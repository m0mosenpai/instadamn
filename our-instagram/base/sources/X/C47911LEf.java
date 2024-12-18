package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.LEf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47911LEf {
    public final UserSession A00;
    public final C47743L6k A01;
    public final C2DS A02;
    public final L8o A03;

    public static final void A00(C83403nh c83403nh, String str, String str2, String str3) {
        if (c83403nh != null) {
            if (c83403nh.A0h() == null) {
                C0K8.A0C("ArmadilloExpressMessageFetcherV2", AnonymousClass001.A13("Message id is null! To help debug T189852491, message otid is ", str, ", thread jid is ", str2, ", possible error is ", str3));
                return;
            }
            return;
        }
        JQ0.A1Q(str2, str, str3);
    }

    public C47911LEf(UserSession userSession, L8o l8o) {
        this.A00 = userSession;
        this.A03 = l8o;
        this.A01 = (C47743L6k) userSession.A01(C47743L6k.class, MHS.A00(userSession, 15));
        this.A02 = C2JD.A00(userSession);
    }
}
