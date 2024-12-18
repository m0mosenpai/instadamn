package X;

import com.google.gson.Gson;
import com.instagram.api.schemas.FanClubInfoDict;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.AbstractMap;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Dou, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31272Dou {
    public static final boolean A00(UserSession userSession, C2EC c2ec) {
        C17Q c17q;
        long j;
        AbstractMap A1G;
        AbstractMap A1G2;
        C14360o3.A0B(userSession, 0);
        if (c2ec != null && c2ec.CZe()) {
            C9BW c9bw = ((C81663kb) c2ec).A01.A0T;
            if (c9bw == null || !AbstractC166997dE.A1Z(c9bw.A01, true)) {
                User A02 = AnonymousClass189.A00(userSession).A02(c2ec.BaA());
                if (A02 != null) {
                    c17q = A02.A02;
                } else {
                    c17q = null;
                }
                if (c17q != C17Q.A03) {
                    return false;
                }
            }
            C83403nh BLX = c2ec.BLX();
            if (BLX != null) {
                j = AbstractC166987dD.A0L(BLX.C8i());
            } else {
                j = 0;
            }
            if (j > System.currentTimeMillis() - 1000 && C18U.A06(C06090Tz.A05, userSession, 36330930788385877L)) {
                C143436di A00 = AbstractC149676oK.A00(userSession);
                String BaA = c2ec.BaA();
                if (BaA == null) {
                    return false;
                }
                Gson gson = new Gson();
                InterfaceC19630xq interfaceC19630xq = A00.A01;
                String string = interfaceC19630xq.getString("fan_dm_upsell_count_map", null);
                if (string != null) {
                    Object A09 = gson.A09(string, new C60770RSf().A00);
                    C14360o3.A07(A09);
                    A1G = (AbstractMap) A09;
                } else {
                    A1G = AbstractC166987dD.A1G();
                }
                String string2 = interfaceC19630xq.getString("fan_dm_upsell_timestamp_map", null);
                if (string2 != null) {
                    Object A092 = gson.A09(string2, new C60771RSg().A00);
                    C14360o3.A07(A092);
                    A1G2 = (AbstractMap) A092;
                } else {
                    A1G2 = AbstractC166987dD.A1G();
                }
                Number A0W = AbstractC31171DnF.A0W(BaA, A1G);
                if ((A0W == null || A0W.intValue() < 3) && AbstractC25232BEp.A0t(AbstractC31171DnF.A0W(BaA, A1G2)) < System.currentTimeMillis() - TimeUnit.DAYS.toMillis(3L)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static final boolean A01(UserSession userSession, C2EC c2ec) {
        long j;
        C14360o3.A0B(userSession, 0);
        if (c2ec != null && c2ec.C7g() == 29) {
            FanClubInfoDict A0M = AbstractC31172DnG.A0M(AbstractC166997dE.A0Y(userSession));
            if (A0M == null || A0M.getFanClubId() == null) {
                InterfaceC19630xq interfaceC19630xq = AbstractC149676oK.A00(userSession).A01;
                if (interfaceC19630xq.getInt("messaging_led_broadcast_channels_impression_count", 0) < 3 && interfaceC19630xq.getLong("messaging_led_broadcast_channels_last_seen_timestamp", 0L) < System.currentTimeMillis() - TimeUnit.DAYS.toMillis(7L)) {
                    C83403nh BLX = c2ec.BLX();
                    if (BLX != null) {
                        j = AbstractC166987dD.A0L(BLX.C8i());
                    } else {
                        j = 0;
                    }
                    if (j > System.currentTimeMillis() - 1000 && C18U.A06(C06090Tz.A05, userSession, 36328444002385441L)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
