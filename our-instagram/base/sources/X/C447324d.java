package X;

import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.24d, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C447324d {
    public long A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final C24Q A04;
    public final C24P A05;
    public final Map A06;

    public C447324d(UserSession userSession, C24P c24p) {
        C14360o3.A0B(c24p, 2);
        this.A05 = c24p;
        this.A04 = new C24Q(userSession);
        this.A06 = new LinkedHashMap();
        this.A00 = 17640780L;
    }

    public final void A00() {
        this.A02 = false;
        this.A01 = false;
        this.A03 = false;
        this.A06.clear();
        C24Q c24q = this.A04;
        long A04 = c24q.A04(null, null, 17640780, 15000L);
        this.A00 = A04;
        c24q.A0B(A04, "camera_destination", String.valueOf(this.A05.A00.A0J()), false);
    }

    public final void A01(String str) {
        C14360o3.A0B(str, 0);
        Map map = this.A06;
        if (map.containsKey(str) && !((Boolean) AbstractC09990gB.A0I(str, map)).booleanValue()) {
            map.put(str, true);
            C24Q c24q = this.A04;
            c24q.A02(316083801, c24q.A00.generateFlowId(316083801, str.hashCode()));
        }
    }

    public final void A02(String str, String str2) {
        C14360o3.A0B(str2, 1);
        Map map = this.A06;
        if (!map.containsKey(str)) {
            C24Q c24q = this.A04;
            long A04 = c24q.A04(Integer.valueOf(str.hashCode()), null, 316083801, 10000L);
            map.put(str, false);
            c24q.A0B(A04, "camera_destination", String.valueOf(this.A05.A00.A0J()), false);
            c24q.A0B(A04, "sticker_id", str, false);
            c24q.A0B(A04, "sticker_type", str2, false);
        }
    }
}
