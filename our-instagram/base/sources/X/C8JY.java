package X;

import com.instagram.api.schemas.ACRType;
import com.instagram.common.session.UserSession;

/* renamed from: X.8JY, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8JY {
    public long A00;
    public long A01;
    public final C1QT A02;

    public C8JY(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A02 = C1QS.A00(userSession);
    }

    public final void A01(String str) {
        C14360o3.A0B(str, 0);
        long j = this.A00;
        if (j != 0) {
            this.A02.flowEndFail(j, str, null);
        }
        this.A00 = 0L;
    }

    public final void A00(C22P c22p, ACRType aCRType) {
        C1QT c1qt = this.A02;
        long flowStartForMarker = c1qt.flowStartForMarker(246614672, MSV.A00(970), false);
        this.A01 = flowStartForMarker;
        if (c22p != null) {
            c1qt.flowAnnotate(flowStartForMarker, "camera_entry_point", c22p.A00);
        }
        if (aCRType != null) {
            c1qt.flowAnnotate(this.A01, "acr_type", aCRType.A00);
        }
    }

    public final void A02(String str) {
        this.A02.flowEndFail(this.A01, str, null);
        this.A01 = 0L;
    }
}
