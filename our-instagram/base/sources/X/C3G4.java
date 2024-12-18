package X;

import android.graphics.Bitmap;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3G4, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3G4 {
    public Bitmap A00;
    public C73743Sc A01;
    public boolean A02;
    public final Reel A03;
    public final C3G2 A04;
    public final C3G3 A05;

    public C3G4(C3G3 c3g3, Reel reel, C3G2 c3g2) {
        C14360o3.A0B(reel, 1);
        C14360o3.A0B(c3g2, 2);
        this.A03 = reel;
        this.A04 = c3g2;
        this.A05 = c3g3;
    }

    public final C41181vS A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return this.A03.A09(userSession);
    }

    public final boolean A04(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        Reel reel = this.A03;
        if (reel.A0Z()) {
            return false;
        }
        if (reel.A1R) {
            return reel.A16(userSession);
        }
        if (!reel.A0i()) {
            if (reel.A1a) {
                List A0O = reel.A0O(userSession);
                C14360o3.A07(A0O);
                if (A0O.isEmpty()) {
                    return false;
                }
            }
            if (this.A04 != C3G2.A06) {
                if (reel.A15(userSession) && reel.A1X) {
                    return true;
                }
                if ((!reel.A1P || !C41661wG.A00(userSession).A05(reel)) && !reel.A16(userSession) && !reel.A1Y) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final boolean A06(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        List A0O = this.A03.A0O(userSession);
        C14360o3.A07(A0O);
        return A0O.isEmpty();
    }

    public final java.util.Set A01() {
        java.util.Set A06;
        C105824pt c105824pt = this.A03.A0H;
        if (c105824pt == null || (A06 = c105824pt.A06()) == null) {
            return C16910sj.A00;
        }
        return A06;
    }

    public final boolean A02() {
        Iterator it = this.A03.A13.iterator();
        while (it.hasNext()) {
            C47Z c47z = ((C105814ps) it.next()).A00;
            if (!c47z.A0y() && !c47z.A0m()) {
                return true;
            }
        }
        return false;
    }

    public final boolean A03() {
        if (this.A03.A0d() && (!A01().isEmpty())) {
            return true;
        }
        return false;
    }

    public final boolean A05(UserSession userSession) {
        Reel reel = this.A03;
        if (!reel.A1a) {
            return false;
        }
        if (!reel.A0z(userSession)) {
            return reel.A1H;
        }
        Iterator it = reel.A0O(userSession).iterator();
        while (it.hasNext()) {
            if (((C41181vS) it.next()).A1I()) {
                return true;
            }
        }
        return false;
    }
}
