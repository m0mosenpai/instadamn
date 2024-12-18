package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.mediatype.ProductType;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class OVF {
    public static final OVF A00 = new Object();

    public final String A00(UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4) {
        int i;
        C1NB c1nb;
        User CDj;
        Boolean bool;
        boolean z;
        C06090Tz c06090Tz = C06090Tz.A05;
        int A07 = AbstractC25225BEi.A07(c06090Tz, userSession, 36601870210371963L);
        int A072 = AbstractC25225BEi.A07(c06090Tz, userSession, 36601870210437500L);
        if (c41181vS.A0b == null) {
            return null;
        }
        Reel reel = c41551w4.A0H;
        if (reel.A0d() || reel.A0i() || reel.A0b() || A07 > (i = c41551w4.A0E) || i > A072 || !AbstractC25351Lp.A02(userSession) || (c1nb = reel.A0W) == null || (CDj = c1nb.CDj()) == null) {
            return null;
        }
        List BlY = c41181vS.BlY(EnumC75383a5.A0k);
        boolean z2 = true;
        boolean z3 = false;
        if (BlY != null) {
            if (!(BlY instanceof Collection) || !BlY.isEmpty()) {
                Iterator it = BlY.iterator();
                while (it.hasNext()) {
                    ProductType productType = ((C84823qW) it.next()).A0n;
                    if (productType == ProductType.CLIPS || productType == ProductType.FEED || productType == ProductType.FEED_CAROUSEL) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            bool = Boolean.valueOf(z);
        } else {
            bool = null;
        }
        if (AbstractC166997dE.A1Z(bool, true)) {
            z3 = true;
        } else {
            List BlY2 = c41181vS.BlY(EnumC75383a5.A0o);
            if (BlY2 != null) {
                if (!(BlY2 instanceof Collection) || !BlY2.isEmpty()) {
                    Iterator it2 = BlY2.iterator();
                    while (it2.hasNext()) {
                        if (C14360o3.A0K(((C84823qW) it2.next()).A1h, "mention_reshare")) {
                            break;
                        }
                    }
                }
                z2 = false;
                z3 = z2;
            }
        }
        boolean A06 = C18U.A06(c06090Tz, userSession, 36320395233927607L);
        boolean CQw = CDj.CQw();
        if (A06) {
            if (!CQw || !z3) {
                return null;
            }
            return "993037385446738";
        }
        if (CQw && !z3) {
            return "314035167862263";
        }
        if (CDj.CQw()) {
            if (z3) {
                return "872079241274699";
            }
            return "1531915574286221";
        }
        if (z3) {
            return "383822497838496";
        }
        return "1531915574286221";
    }
}
