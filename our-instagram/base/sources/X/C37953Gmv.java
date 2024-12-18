package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.androidlink.AndroidLink;
import com.instagram.model.reels.Reel;
import java.util.List;

/* renamed from: X.Gmv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37953Gmv {
    public final C37952Gmu A00;
    public final C92494Cg A01;

    public static void A00(UserSession userSession, C37952Gmu c37952Gmu) {
        Reel reel = c37952Gmu.A0M;
        if (reel != null) {
            List A0O = reel.A0O(userSession);
            C14360o3.A07(A0O);
            if (!A0O.isEmpty()) {
                A0O.get(A0O.size() - 1);
            }
        }
    }

    public static void A02(C37952Gmu c37952Gmu) {
        new C37953Gmv(c37952Gmu).A04();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C37954Gmw A03() {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37953Gmv.A03():X.Gmw");
    }

    public final void A04() {
        C37952Gmu c37952Gmu = this.A00;
        C006802i c006802i = ((C92494Cg) c37952Gmu.A15.getValue()).A00;
        if (c006802i != null) {
            c006802i.markerPoint(1056313521, "on_ad_cta_opener");
        }
        C37954Gmw A03 = A03();
        C38321qM c38321qM = A03.A00;
        if (c38321qM != null) {
            AndroidLink androidLink = A03.A02;
            C1NI c1ni = c37952Gmu.A0O;
            if (c1ni == null) {
                c1ni = c38321qM;
            }
            C1NI c1ni2 = c1ni;
            UserSession userSession = c37952Gmu.A11;
            String BzL = c1ni2.BzL(userSession);
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36320519787651718L) && !c38321qM.A3Y().isEmpty()) {
                I9I.A00(userSession, c38321qM, (AndroidLink) c38321qM.A3Y().get(0), AbstractC111324zv.A00(1897), BzL, false);
            }
            if (A05(c1ni2, c38321qM, androidLink, A03.A01)) {
                String BzL2 = c1ni2.BzL(userSession);
                if (C18U.A06(c06090Tz, userSession, 36320519787651718L) && androidLink != null) {
                    I9I.A00(userSession, c38321qM, androidLink, "navigation", BzL2, true);
                    return;
                }
                return;
            }
            InterfaceC60442pS interfaceC60442pS = c37952Gmu.A13;
            String obj = c37952Gmu.A14.toString();
            C5H9 c5h9 = c37952Gmu.A12;
            AbstractC11060iN.A00(userSession);
            C82713mZ A01 = C32U.A01(c5h9, c1ni2, interfaceC60442pS, "action_failed");
            A01.A5R = obj;
            c5h9.A8X(A01, interfaceC60442pS, "action_failed");
            C32U.A0C(userSession, A01, c1ni2, interfaceC60442pS, null);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public C37953Gmv(C37952Gmu c37952Gmu) {
        this.A00 = c37952Gmu;
        this.A01 = (C92494Cg) c37952Gmu.A15.getValue();
    }

    public static void A01(C1NI c1ni, AndroidLink androidLink, C37952Gmu c37952Gmu) {
        AbstractC41772Ieo.A07(c1ni, c37952Gmu, I9H.A00(androidLink), androidLink.Aw8());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x06ee, code lost:
    
        if (r1 != null) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x09f2, code lost:
    
        if (r2 == null) goto L306;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x013d, code lost:
    
        if (r4 != false) goto L691;
     */
    /* JADX WARN: Code restructure failed: missing block: B:639:0x1221, code lost:
    
        if (X.C14360o3.A0K(r11, new X.C38673GzE(null, false)) == false) goto L534;
     */
    /* JADX WARN: Code restructure failed: missing block: B:641:0x1225, code lost:
    
        if (r11.A00 != false) goto L536;
     */
    /* JADX WARN: Code restructure failed: missing block: B:643:0x1231, code lost:
    
        if (r74.A3Y().size() >= 2) goto L540;
     */
    /* JADX WARN: Code restructure failed: missing block: B:644:0x1233, code lost:
    
        X.WD5.A00(X.VHi.OEM_FALLBACK_OEM_STORE_NOT_FOUND, r9, null, "FALLBACK_TO_OEM_LAYOUT", null);
        X.C9GR.A01(r9, null, 2131969213, 0);
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:645:0x1243, code lost:
    
        new X.C37953Gmv(r0).A05(r73, r74, r2, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:646:0x124d, code lost:
    
        X.WD5.A00(null, r9, null, "FALLBACK_TO_OEM_LAYOUT", null);
        r2 = (com.instagram.model.androidlink.AndroidLink) r74.A3Y().get(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:660:0x12c5, code lost:
    
        if (r11.A01 >= 1) goto L563;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01fa, code lost:
    
        if (X.C18U.A06(r2, r3, 36324827640508923L) == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x02a4, code lost:
    
        if (X.C18U.A06(r2, r3, 36324827640508923L) == false) goto L84;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:42:0x011f. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:449:0x0bfd. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x118d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x164d  */
    /* JADX WARN: Removed duplicated region for block: B:832:0x15e1  */
    /* JADX WARN: Removed duplicated region for block: B:851:0x17ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A05(X.C1NI r73, X.C38321qM r74, com.instagram.model.androidlink.AndroidLink r75, com.instagram.model.androidlink.AndroidLink r76) {
        /*
            Method dump skipped, instructions count: 6178
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37953Gmv.A05(X.1NI, X.1qM, com.instagram.model.androidlink.AndroidLink, com.instagram.model.androidlink.AndroidLink):boolean");
    }
}
