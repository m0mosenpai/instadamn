package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.user.model.User;

/* renamed from: X.IdR, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41698IdR {
    public static final I51 A06 = new Object();
    public Integer A00;
    public EnumC53253Ngr A01;
    public final C42201xA A02;
    public final UserSession A03;
    public final C18A A04;
    public final I50 A05;

    public C41698IdR(UserSession userSession, I50 i50, C18A c18a) {
        C14360o3.A0B(c18a, 3);
        this.A03 = userSession;
        this.A05 = i50;
        this.A04 = c18a;
        this.A01 = EnumC53253Ngr.A04;
        this.A02 = AbstractC42021ws.A00();
    }

    public static final C41030IEz A00(C41698IdR c41698IdR) {
        return new C41030IEz(c41698IdR.A01, c41698IdR.A00, C17060sy.A01.A01(c41698IdR.A03).A1h());
    }

    public final C42221xC A01(boolean z) {
        String str;
        C08730cb c08730cb = C17060sy.A01;
        UserSession userSession = this.A03;
        User A01 = c08730cb.A01(userSession);
        A01.A03.Ege(Boolean.valueOf(z));
        C25621Ms A0M = AbstractC31173DnH.A0M(userSession);
        A0M.A0B(MSV.A00(1703));
        A0M.A0S(C40781ul.class, C55702hA.class);
        if (z) {
            str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        } else {
            str = "0";
        }
        A0M.A9s("enabled", str);
        return AbstractC34046F0z.A00(AbstractC31176DnK.A0P(A0M)).A0K(new C48357LaX(2, this, z));
    }
}
