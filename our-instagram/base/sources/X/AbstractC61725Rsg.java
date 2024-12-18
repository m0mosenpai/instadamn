package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.Rsg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61725Rsg {
    public static final boolean A00(C62620SJd c62620SJd, C43031yW c43031yW) {
        Number A0Q;
        AbstractC167017dG.A1N(c43031yW, c62620SJd);
        C51756Mtf c51756Mtf = c62620SJd.A0G;
        C14360o3.A0B(c51756Mtf, 0);
        if (((Map) c51756Mtf.A00).containsKey(8) && (A0Q = AbstractC37300Gc1.A0Q(8, (Map) c51756Mtf.A00)) != null && A0Q.intValue() == 19) {
            return true;
        }
        UserSession userSession = c43031yW.A00;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!AbstractC58319PtB.A1S(c06090Tz, userSession) && AbstractC31177DnL.A1U(c06090Tz, userSession, 36322800420661886L)) {
            return true;
        }
        return false;
    }
}
