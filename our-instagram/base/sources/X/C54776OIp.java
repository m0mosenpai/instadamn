package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.OIp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54776OIp {
    public final Context A00;
    public final UserSession A01;
    public final InterfaceC09390do A02 = AbstractC09440dt.A00(EnumC09460dv.A02, C57305PcR.A00);
    public final InterfaceC09390do A03 = C57549PgN.A01(this, 7);

    public final boolean A00() {
        UserSession userSession = this.A01;
        if (!(!AbstractC167007dF.A1W(MWJ.A00(this.A00, userSession).A09.A0Z.A0G.A00))) {
            return false;
        }
        long A01 = C18U.A01(C06090Tz.A05, userSession, 36608690618504981L);
        if (Long.valueOf(A01) != null && A01 == 1) {
            return true;
        }
        return false;
    }

    public C54776OIp(UserSession userSession, Context context) {
        this.A01 = userSession;
        this.A00 = context;
    }
}
