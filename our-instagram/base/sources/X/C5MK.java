package X;

import com.instagram.common.session.UserSession;
import com.instagram.feed.media.ReelCTAIntf;
import com.instagram.model.androidlink.AndroidLink;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5MK, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5MK {
    public final C5MJ A00(UserSession userSession, C38321qM c38321qM, String str) {
        String AcH;
        if (!C18U.A06(C06090Tz.A05, userSession, 36319016549424007L) || str == null || !c38321qM.Cff() || c38321qM.CAR() == null) {
            return null;
        }
        if (!c38321qM.A3Y().isEmpty()) {
            Iterator it = c38321qM.A3Y().iterator();
            while (it.hasNext()) {
                AcH = ((AndroidLink) it.next()).AcH();
                if (AcH == null || AcH.equals("0")) {
                }
            }
            return null;
        }
        if (c38321qM.A0C.C1N() != null && (!r0.isEmpty())) {
            List C1N = c38321qM.A0C.C1N();
            if (C1N == null) {
                C1N = new ArrayList();
            }
            Iterator it2 = C1N.iterator();
            while (it2.hasNext()) {
                List BNi = ((ReelCTAIntf) it2.next()).BNi();
                if (BNi == null) {
                    BNi = new ArrayList();
                }
                Iterator it3 = BNi.iterator();
                while (it3.hasNext()) {
                    AcH = ((AndroidLink) it3.next()).AcH();
                    if (AcH == null || AcH.equals("0")) {
                    }
                }
            }
            return null;
        }
        if (c38321qM.A0C.AmB() == null || !(!r0.isEmpty())) {
            return null;
        }
        List AmB = c38321qM.A0C.AmB();
        if (AmB == null) {
            AmB = new ArrayList();
        }
        Iterator it4 = AmB.iterator();
        while (it4.hasNext()) {
            Iterator it5 = ((C38321qM) it4.next()).A3Y().iterator();
            while (it5.hasNext()) {
                AcH = ((AndroidLink) it5.next()).AcH();
                if (AcH == null || AcH.equals("0")) {
                }
            }
        }
        return null;
        if (AcH.equals("0")) {
            return null;
        }
        return new C5MJ(userSession);
    }
}
