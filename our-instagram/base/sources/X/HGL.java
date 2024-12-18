package X;

import android.os.SystemClock;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes7.dex */
public final class HGL extends C1P1 {
    public final /* synthetic */ C670230t A00;

    public HGL(C670230t c670230t) {
        this.A00 = c670230t;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x006a, code lost:
    
        if (r14.A01 == false) goto L19;
     */
    @Override // X.C1P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 527
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HGL.onSuccess(java.lang.Object):void");
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int i;
        int i2;
        String str;
        Integer num;
        Long l;
        Long l2;
        String str2;
        int i3;
        StringBuilder A1C;
        User A2E;
        String A2u;
        int A03 = C0f9.A03(1632928186);
        C14360o3.A0B(abstractC115105If, 0);
        C670230t c670230t = this.A00;
        if (!c670230t.A03) {
            i2 = 1952489547;
        } else {
            C40791um c40791um = (C40791um) abstractC115105If.A00();
            if (c40791um != null) {
                i = c40791um.mStatusCode;
            } else {
                i = 0;
            }
            C670030r c670030r = c670230t.A02;
            long elapsedRealtime = SystemClock.elapsedRealtime() - c670230t.A00;
            C669430l c669430l = c670030r.A00;
            C31G c31g = c669430l.A0B;
            if (c31g != null) {
                c31g.CiD(i, false, elapsedRealtime);
            }
            C38321qM c38321qM = c669430l.A04;
            if (c38321qM != null) {
                C64042vP c64042vP = c669430l.A0K;
                EnumC71153Hb enumC71153Hb = c669430l.A06;
                if (enumC71153Hb == null || (str = enumC71153Hb.A00) == null) {
                    str = "";
                }
                C14360o3.A0B(str, 1);
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c64042vP.A01, "instagram_ad_pivots_fetch_fail");
                if (A0f.isSampled()) {
                    boolean A1N = AbstractC167007dF.A1N(c38321qM.CdW() ? 1 : 0);
                    A0f.A9K("chaining_position", AbstractC167007dF.A0d());
                    AbstractC37300Gc1.A0r(A0f, "");
                    A0f.AAP("client_session_id", c64042vP.A04.getSessionId());
                    A0f.AAP("contextual_ads_category", "");
                    AbstractC31171DnF.A1I(A0f, "feed_timeline");
                    A0f.AAP("trigger_type", str);
                    if (!c38321qM.CdW()) {
                        num = C05F.A0j;
                    } else {
                        num = C05F.A0N;
                    }
                    A0f.A9K("multi_ads_type_number", Long.valueOf(C5MB.A00(num)));
                    Long l3 = null;
                    A0f.AAP("inventory_source", C74493Wh.A02(AbstractC37300Gc1.A0S(c38321qM)));
                    if (!A1N) {
                        String A07 = AbstractC41071vF.A07(c64042vP.A02, c38321qM);
                        if (A07 != null) {
                            l = AbstractC25228BEl.A13(A07);
                        } else {
                            throw AbstractC166997dE.A0g();
                        }
                    } else {
                        l = null;
                    }
                    A0f.A9K("hscroll_seed_ad_id", l);
                    if (A1N && (A2u = c38321qM.A2u()) != null) {
                        l2 = AbstractC166997dE.A0j(A2u);
                    } else {
                        l2 = null;
                    }
                    A0f.A9K(AbstractC111324zv.A00(2456), l2);
                    if (A1N && (A2E = c38321qM.A2E(c64042vP.A02)) != null) {
                        l3 = AbstractC25231BEo.A0k(A2E);
                    }
                    A0f.A9K(AbstractC111324zv.A00(2455), l3);
                    UserSession userSession = c64042vP.A02;
                    A0f.A7v("is_seed_ad_multi_ads_eligible", C64042vP.A02(userSession, c38321qM));
                    A0f.AAP("hscroll_seed_ad_tracking_token", C64042vP.A05(userSession, c38321qM));
                    Throwable A01 = abstractC115105If.A01();
                    if (A01 != null) {
                        A1C = AbstractC166987dD.A1C();
                        A1C.append("failure_reason_exception:");
                        A1C.append(A01);
                    } else if (c40791um != null && (i3 = c40791um.mStatusCode) > 0) {
                        A1C = AbstractC166987dD.A1C();
                        A1C.append("failure_reason_status_code:");
                        A1C.append(i3);
                    } else {
                        str2 = "failure_reason_unknown";
                        A0f.AAP(TraceFieldType.FailureReason, str2);
                        A0f.Cht();
                    }
                    str2 = A1C.toString();
                    A0f.AAP(TraceFieldType.FailureReason, str2);
                    A0f.Cht();
                }
            }
            C1P1 c1p1 = c670230t.A01;
            if (c1p1 != null) {
                c1p1.onFail(abstractC115105If);
            }
            i2 = 616814439;
        }
        C0f9.A0A(i2, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int i;
        int A03 = C0f9.A03(-1698704586);
        C670230t c670230t = this.A00;
        if (!c670230t.A03) {
            i = -272161395;
        } else {
            c670230t.A02.A00.A0C = C05F.A00;
            C1P1 c1p1 = c670230t.A01;
            if (c1p1 != null) {
                c1p1.onFinish();
            }
            i = 2143686111;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int i;
        int A03 = C0f9.A03(-386137082);
        C670230t c670230t = this.A00;
        if (!c670230t.A03) {
            i = 696646346;
        } else {
            c670230t.A00 = SystemClock.elapsedRealtime();
            C1P1 c1p1 = c670230t.A01;
            if (c1p1 != null) {
                c1p1.onStart();
            }
            i = 466965244;
        }
        C0f9.A0A(i, A03);
    }
}
