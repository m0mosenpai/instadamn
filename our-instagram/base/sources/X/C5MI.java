package X;

import com.facebook.ppml.enigma.InstallReferrerEventV2;
import com.instagram.common.session.UserSession;
import com.instagram.feed.media.ReelCTAIntf;
import com.instagram.model.androidlink.AndroidLink;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.5MI, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5MI {
    public final UserSession A00;

    public C5MI(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public static final void A00(int i, String str, String str2, String str3, String str4) {
        C97h A00;
        if (str.length() != 0 && !str.equals("0") && str2.length() != 0 && str3.length() != 0 && (A00 = C97g.A00()) != null) {
            A00.A02(new InstallReferrerEventV2(str, 1, i, str2, TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()), str3), str4);
        }
    }

    public final void A03(C38321qM c38321qM, String str) {
        if (C18U.A06(C06090Tz.A05, this.A00, 36319016549358470L)) {
            if (!c38321qM.A3Y().isEmpty()) {
                Iterator it = c38321qM.A3Y().iterator();
                while (it.hasNext()) {
                    A01((AndroidLink) it.next(), str);
                }
                return;
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
                        A01((AndroidLink) it3.next(), str);
                    }
                }
                return;
            }
            if (c38321qM.A0C.AmB() != null && (!r0.isEmpty())) {
                List AmB = c38321qM.A0C.AmB();
                if (AmB == null) {
                    AmB = new ArrayList();
                }
                Iterator it4 = AmB.iterator();
                while (it4.hasNext()) {
                    Iterator it5 = ((C38321qM) it4.next()).A3Y().iterator();
                    while (it5.hasNext()) {
                        A01((AndroidLink) it5.next(), str);
                    }
                }
            }
        }
    }

    private final void A01(AndroidLink androidLink, String str) {
        String Bm5;
        Boolean Cg8;
        String AcH = androidLink.AcH();
        if (AcH != null && (Bm5 = androidLink.Bm5()) != null && (Cg8 = androidLink.Cg8()) != null) {
            boolean booleanValue = Cg8.booleanValue();
            String CIt = androidLink.CIt();
            if (CIt != null && booleanValue) {
                A00(0, AcH, Bm5, CIt, str);
            }
        }
    }

    public static final void A02(AndroidLink androidLink, String str) {
        String Bm5;
        String CIt;
        String AcH = androidLink.AcH();
        if (AcH != null && (Bm5 = androidLink.Bm5()) != null && (CIt = androidLink.CIt()) != null) {
            A00(2, AcH, Bm5, CIt, str);
        }
    }
}
