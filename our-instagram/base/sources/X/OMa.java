package X;

import com.facebook.quicklog.reliability.CancelReason;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class OMa {
    public long A00;
    public final C1QT A01;
    public final UserSession A02;

    public OMa(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = C1QS.A00(userSession);
    }

    public final void A02(String str) {
        this.A00 = this.A01.flowStartForMarker(18947232, str, false);
    }

    public final void A03(String str, String str2) {
        C14360o3.A0B(str2, 1);
        this.A01.flowAnnotate(this.A00, str, str2);
    }

    public final void A00() {
        this.A01.flowEndCancel(this.A00, CancelReason.USER_CANCELLED);
    }

    public final void A01() {
        this.A01.flowMarkPoint(this.A00, "story_deletion_did_begin", "");
    }

    public final void A04(String str, String str2) {
        this.A01.flowEndFail(this.A00, str, str2);
    }
}
