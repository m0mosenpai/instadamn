package X;

import android.os.Handler;
import com.facebook.msys.mci.TraceLogger;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes8.dex */
public final class L8o {
    public final UserSession A00;
    public final Handler A01;
    public final C120005by A02;

    public final void A01(String str, boolean z) {
        final D8R d8r = new D8R(this, str, 3, z);
        if (C18U.A06(C06090Tz.A05, this.A00, 36323131129670688L)) {
            this.A01.postDelayed(new Runnable() { // from class: X.M1d
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    InterfaceC16820sZ.this.invoke();
                }
            }, 3000L);
        } else {
            d8r.invoke();
        }
    }

    public final void A00(String str, List list, int i, int i2) {
        String traceIdForAliasId;
        if (str != null && (traceIdForAliasId = TraceLogger.getTraceIdForAliasId(14, str)) != null) {
            C120005by.A03(traceIdForAliasId, list, 0, i, i2);
        }
    }

    public L8o(UserSession userSession) {
        this.A00 = userSession;
        C120005by A00 = C120005by.A00(userSession);
        C14360o3.A07(A00);
        this.A02 = A00;
        this.A01 = new Handler(C1CG.A00());
    }
}
