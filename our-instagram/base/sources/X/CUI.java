package X;

import android.os.Handler;
import android.util.LruCache;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* loaded from: classes5.dex */
public final class CUI {
    public final InterfaceC19630xq A02;
    public final CTq A03;
    public final UserSession A06;
    public final HashMap A05 = AbstractC166987dD.A1G();
    public final HashMap A04 = AbstractC166987dD.A1G();
    public final Handler A00 = AbstractC167007dF.A0J();
    public final LruCache A01 = new LruCache(64);

    public final boolean A00(C120985dq c120985dq) {
        if (c120985dq == null || !c120985dq.CdW()) {
            return false;
        }
        InterfaceC19630xq interfaceC19630xq = this.A02;
        return interfaceC19630xq.getInt("KEY_NUX_SHOWN_COUNT", 0) < 2 || (interfaceC19630xq.getInt("KEY_NUX_SHOWN_COUNT", 0) == 2 && this.A01.get(AbstractC25226BEj.A1E(c120985dq)) != null);
    }

    public CUI(UserSession userSession) {
        this.A06 = userSession;
        InterfaceC19630xq A03 = C1AT.A01(userSession).A03(C1AV.A0o);
        this.A02 = A03;
        this.A03 = new CTq(userSession);
        int A07 = AbstractC25225BEi.A07(C06090Tz.A06, userSession, 36598992584510832L);
        if (A07 > A03.getInt("KEY_NUX_DATA_VERSION", 0)) {
            InterfaceC19610xo ARD = A03.ARD();
            ARD.EEj("KEY_NUX_SHOWN_COUNT");
            ARD.E7D("KEY_NUX_DATA_VERSION", A07);
            ARD.apply();
        }
    }
}
