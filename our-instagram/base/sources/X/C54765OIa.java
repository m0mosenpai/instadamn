package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.OIa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54765OIa {
    public long A00;
    public final C1QT A01;
    public final UserSession A02;

    public C54765OIa(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = C1QS.A00(userSession);
    }

    public final void A00(String str, boolean z) {
        C1QT c1qt = this.A01;
        long flowStartForMarker = c1qt.flowStartForMarker(18946361, "story_text_area_tap", false);
        this.A00 = flowStartForMarker;
        c1qt.flowAnnotate(flowStartForMarker, AbstractC111324zv.A00(1295), str);
        c1qt.flowAnnotate(this.A00, "e2ee_enabled", z);
    }
}
