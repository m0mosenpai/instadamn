package X;

import com.facebook.msys.mci.ExecutionLogger;
import com.instagram.common.session.UserSession;

/* renamed from: X.8vx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C201678vx implements C9AS {
    public final /* synthetic */ UserSession A00;

    public C201678vx(UserSession userSession) {
        this.A00 = userSession;
    }

    @Override // X.C9AS
    public final void CuN(boolean z) {
        C9AH.A00(this.A00).deactivateUserInstance(false, new Runnable() { // from class: X.8w1
            @Override // java.lang.Runnable
            public final void run() {
                ExecutionLogger.activeFlowMarkerStart(755177991);
            }
        });
    }
}
