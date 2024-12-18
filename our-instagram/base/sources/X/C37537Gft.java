package X;

import com.instagram.api.schemas.IntentAwareAdsInfoIntf;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Gft, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37537Gft implements InterfaceC43071ya {
    public final UserSession A00;
    public final C64052vQ A01;
    public final C64092vU A02;
    public final C37526Gfi A03;

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        Runnable runnable;
        boolean A1R = AbstractC167007dF.A1R(0, c59062n7, interfaceC57162jr);
        Object obj = c59062n7.A03;
        if (!((C120985dq) obj).A0G()) {
            obj = null;
        }
        C120985dq c120985dq = (C120985dq) obj;
        if (c120985dq != null) {
            C82383m1 A00 = this.A02.A00(c120985dq.getId());
            float CGk = interfaceC57162jr.CGk(c59062n7);
            Integer CFq = interfaceC57162jr.CFq(c59062n7);
            C14360o3.A07(CFq);
            int intValue = CFq.intValue();
            if (intValue != 0) {
                if (intValue != A1R) {
                    A00.A04(interfaceC57162jr);
                    if (A00.A05 >= 250) {
                        C37526Gfi c37526Gfi = this.A03;
                        long A06 = ((C37644Ghd) c59062n7.A04).A06();
                        long j = A00.A05;
                        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c37526Gfi.A01, AbstractC111324zv.A00(2555));
                        Long l = null;
                        if (A0f.isSampled()) {
                            IntentAwareAdsInfoIntf A002 = C42159Im7.A00(c120985dq);
                            List A01 = C42159Im7.A01(c120985dq);
                            ArrayList A1E = AbstractC166987dD.A1E();
                            Iterator it = A01.iterator();
                            while (it.hasNext()) {
                                Long A0j = AbstractC25231BEo.A0j(0, ((C40971v4) it.next()).A0S);
                                if (A0j != null) {
                                    A1E.add(A0j);
                                }
                            }
                            AbstractC37301Gc2.A12(A0f, A06);
                            C1M1 c1m1 = c37526Gfi.A03;
                            AbstractC37300Gc1.A0r(A0f, c1m1.getSessionId());
                            A0f.AAP("client_session_id", c1m1.getSessionId());
                            A0f.A9K("sum_duration_ms", Long.valueOf(j));
                            A0f.AAk("ad_ids", A1E);
                            A0f.A9K("first_hscroll_item_ad_id", (Long) AbstractC001800i.A0J(A1E));
                            AbstractC37301Gc2.A15(A0f, c37526Gfi.A00);
                            Integer BVJ = A002.BVJ();
                            if (BVJ != null) {
                                l = AbstractC25229BEm.A0n(BVJ);
                            }
                            A0f.A9K("multi_ads_type_number", l);
                            AbstractC37301Gc2.A14(A0f, A002);
                            A0f.AAP("insertion_mechanism", A002.BIG());
                            AbstractC37303Gc4.A0d(A0f, A002, AbstractC37302Gc3.A0V(A002.Brx()));
                            AbstractC37302Gc3.A0v(A0f, A002);
                            A0f.Cht();
                        }
                    }
                    C64052vQ c64052vQ = this.A01;
                    if (c64052vQ != null && (runnable = c64052vQ.A03) != null) {
                        c64052vQ.A08.removeCallbacks(runnable);
                        c64052vQ.A07 = false;
                    }
                    A00.A02();
                    return;
                }
                A00.A03(c59062n7, interfaceC57162jr);
                C64052vQ c64052vQ2 = this.A01;
                if (c64052vQ2 != null) {
                    if (c120985dq.A03().A00 == 10 && CGk >= 1.0d && c64052vQ2.A01 == C05F.A00) {
                        if (C18U.A06(C06090Tz.A06, this.A00, 36319209827343447L)) {
                            String BVL = C42159Im7.A00(c120985dq).BVL();
                            if (BVL != null) {
                                c64052vQ2.A02(BVL, "476267598351478");
                            } else {
                                throw AbstractC166997dE.A0g();
                            }
                        }
                    }
                    if (c64052vQ2.A01.intValue() == A1R) {
                        c64052vQ2.A01 = C05F.A0C;
                        return;
                    }
                    return;
                }
                return;
            }
            A00.A03(c59062n7, interfaceC57162jr);
            C64052vQ c64052vQ3 = this.A01;
            if (c64052vQ3 != null) {
                c64052vQ3.A00(((C37644Ghd) c59062n7.A04).A06());
            }
        }
    }

    public C37537Gft(UserSession userSession, C64052vQ c64052vQ, C37526Gfi c37526Gfi) {
        this.A00 = userSession;
        this.A03 = c37526Gfi;
        this.A01 = c64052vQ;
        this.A02 = new C64092vU(AbstractC11060iN.A00(userSession), true);
    }
}
