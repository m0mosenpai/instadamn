package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class LEO {
    public final UserSession A00;
    public final C7TG A01;

    public LEO(UserSession userSession) {
        this.A00 = userSession;
        this.A01 = AbstractC165967bO.A00(userSession);
    }

    public static final C42221xC A00(C2EC c2ec, LEO leo, String str) {
        C83693oE c83693oE = new C83693oE(String.valueOf(c2ec.C7I()));
        return leo.A01.EOb(null, null, null, null, C2EY.A1j, c83693oE, null, null, str, NetInfoModule.CONNECTION_TYPE_NONE, "external_sheet_send_attribution_text", null, null, null, null, c2ec.CWO(), false);
    }
}
