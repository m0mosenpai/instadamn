package X;

import android.util.Pair;
import com.instagram.api.schemas.IntentAwareAdsInfoIntf;
import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class HK0 extends AbstractC64162vb {
    public final C37526Gfi A00;
    public final UserSession A01;
    public final C30W A02;
    public final InterfaceC60442pS A03;
    public final String A04;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public HK0(com.instagram.common.session.UserSession r4, X.C30W r5, X.InterfaceC60442pS r6, X.C37526Gfi r7, java.lang.String r8) {
        /*
            r3 = this;
            r0 = 4
            X.C14360o3.A0B(r5, r0)
            X.2tB r0 = X.AbstractC62712tA.A00(r4)
            X.2tC r0 = r0.A00
            X.1BX r2 = r0.A01
            X.C14360o3.A07(r2)
            r1 = 1
            X.GrZ r0 = new X.GrZ
            r0.<init>(r4, r1)
            r3.<init>(r2, r0)
            r3.A01 = r4
            r3.A04 = r8
            r3.A03 = r6
            r3.A02 = r5
            r3.A00 = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HK0.<init>(com.instagram.common.session.UserSession, X.30W, X.2pS, X.Gfi, java.lang.String):void");
    }

    @Override // X.AbstractC64162vb
    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        Long l;
        Long l2;
        C120985dq c120985dq = (C120985dq) obj;
        C37644Ghd c37644Ghd = (C37644Ghd) obj2;
        AbstractC167017dG.A1N(c120985dq, c37644Ghd);
        A00(c120985dq, c37644Ghd, "impression");
        C37526Gfi c37526Gfi = this.A00;
        int A06 = c37644Ghd.A06();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c37526Gfi.A01, AbstractC111324zv.A00(2549));
        if (A0f.isSampled()) {
            IntentAwareAdsInfoIntf A00 = C42159Im7.A00(c120985dq);
            AbstractC37303Gc4.A0i(A0f, c120985dq.A06());
            C37526Gfi.A00(A0f, c37526Gfi, A06);
            Long A0d = AbstractC167007dF.A0d();
            Integer A0B = c120985dq.A0B();
            String str = null;
            if (A0B != null) {
                l = AbstractC25229BEm.A0n(A0B);
            } else {
                l = null;
            }
            A0f.AAk("position", AbstractC16960so.A1N(A0d, l));
            AbstractC37301Gc2.A14(A0f, A00);
            AbstractC37302Gc3.A0v(A0f, A00);
            Integer BVJ = A00.BVJ();
            if (BVJ != null) {
                l2 = AbstractC25229BEm.A0n(BVJ);
            } else {
                l2 = null;
            }
            A0f.A9K("multi_ads_type_number", l2);
            AbstractC37301Gc2.A15(A0f, c37526Gfi.A00);
            A0f.A9K("hscroll_seed_ad_id", AbstractC37302Gc3.A0W(A00.Brx()));
            A0f.A7v("is_seed_ad_multi_ads_eligible", A00.CcZ());
            Integer A2T = AbstractC25226BEj.A0y(c120985dq).A2T();
            if (A2T != null) {
                str = A2T.toString();
            }
            A0f.AAP("imp_signature", str);
            A0f.Cht();
        }
    }

    @Override // X.AbstractC64162vb
    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
        C120985dq c120985dq = (C120985dq) obj;
        C37644Ghd c37644Ghd = (C37644Ghd) obj2;
        AbstractC167017dG.A1N(c120985dq, c37644Ghd);
        A00(c120985dq, c37644Ghd, "sub_impression");
    }

    private final void A00(C120985dq c120985dq, C37644Ghd c37644Ghd, String str) {
        int i;
        Pair pair;
        int i2;
        int i3;
        int i4;
        boolean z;
        C40971v4 A06 = c120985dq.A06();
        C30W c30w = this.A02;
        InterfaceC60442pS interfaceC60442pS = this.A03;
        C75113Zb c75113Zb = c37644Ghd.A0E;
        if (c75113Zb != null) {
            i = c75113Zb.getPosition();
        } else {
            i = -1;
        }
        C82713mZ A062 = c30w.A06(interfaceC60442pS, A06, str, i);
        if (A062 != null) {
            A062.A03();
            A062.A02();
            A062.A6S = this.A04;
            UserSession userSession = this.A01;
            A062.A0K(userSession, A06);
            C38321qM c38321qM = A06.A0K;
            if (c75113Zb != null) {
                pair = c75113Zb.A04();
                if (pair != null) {
                    A062.A6W = (String) pair.first;
                    A062.A6G = (String) pair.second;
                }
            } else {
                pair = null;
            }
            Integer A2N = c38321qM.A2N();
            if (A2N != null) {
                A062.A0E = A2N.intValue();
            }
            if (pair != null) {
                String str2 = (String) pair.first;
                if (str2 != null) {
                    A062.A6L = str2;
                }
                String str3 = (String) pair.second;
                if (str3 != null) {
                    A062.A6K = str3;
                }
            }
            if (c75113Zb != null) {
                Pair A03 = c75113Zb.A03();
                if (A03 != null) {
                    Number number = (Number) A03.first;
                    if (number != null) {
                        A062.A0D = number.intValue();
                    }
                    Number number2 = (Number) A03.second;
                    if (number2 != null) {
                        A062.A0C = number2.intValue();
                    }
                }
                i2 = c75113Zb.A0H;
            } else {
                i2 = -1;
            }
            A062.A0Q(Integer.valueOf(i2));
            if (c75113Zb != null) {
                i3 = c75113Zb.A0J;
            } else {
                i3 = -1;
            }
            A062.A0R(Integer.valueOf(i3));
            if (c75113Zb != null) {
                i4 = c75113Zb.A0N;
            } else {
                i4 = -1;
            }
            A062.A0U(Integer.valueOf(i4));
            if (c75113Zb != null) {
                z = c75113Zb.A2Q;
            } else {
                z = false;
            }
            A062.A8I = z;
            A062.A7b = AbstractC38220GrP.A00(c120985dq);
            A062.A5o = AbstractC31180DnO.A0k(c38321qM.A2T());
            A062.A0D(c120985dq.A00());
            A062.A43 = AbstractC31171DnF.A0V(AbstractC25227BEk.A06(c120985dq.A0B(), -1));
            C32U.A0H(userSession, A062, interfaceC60442pS);
        }
    }
}
