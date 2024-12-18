package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.77B, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C77B {
    public static final C9BD A04 = new C9BD(true, 0, false, false, false);
    public C9BD A00;
    public final UserSession A01;
    public final C77C A02;
    public final C21C A03;

    public /* synthetic */ C77B(UserSession userSession) {
        C9BD c9bd;
        C77C c77c = new C77C(userSession, AbstractC40691uc.A01(userSession));
        C21C A00 = C21B.A00(userSession);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(A00, 3);
        this.A01 = userSession;
        this.A02 = c77c;
        this.A03 = A00;
        if (A00.A00.getBoolean("key_has_seen_avatar_social_stickers_disclaimer", false)) {
            c9bd = A04;
        } else {
            c9bd = null;
        }
        this.A00 = c9bd;
    }
}
