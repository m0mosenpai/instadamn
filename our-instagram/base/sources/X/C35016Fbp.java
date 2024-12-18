package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Fbp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35016Fbp {
    public final C006802i A00;
    public final UserSession A01;

    public C35016Fbp(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = C006802i.A0p;
    }

    public static void A00(C35016Fbp c35016Fbp) {
        c35016Fbp.A00.markerEnd(857809457, (short) 3);
    }

    public final void A01(int i, String str) {
        C006802i c006802i = this.A00;
        c006802i.markerStart(i);
        c006802i.markerAnnotate(i, "node_identifier", str);
    }

    public final void A02(String str, String str2) {
        String A00 = AbstractC43591JPw.A00(427);
        C006802i c006802i = this.A00;
        c006802i.markerStart(857809457);
        c006802i.markerAnnotate(857809457, "node_identifier", str);
        c006802i.markerAnnotate(857809457, A00, str2);
    }
}
