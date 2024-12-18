package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.7XE, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7XE {
    public final AbstractC59962oe A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final C164357Wy A03;
    public final C163947Vi A04;
    public final InterfaceC60442pS A05;
    public final InterfaceC16820sZ A06;
    public final InterfaceC16820sZ A07;
    public final InterfaceC16820sZ A08;
    public final InterfaceC16820sZ A09;
    public final InterfaceC16820sZ A0A;
    public final InterfaceC16820sZ A0B;
    public final InterfaceC16820sZ A0C;
    public final InterfaceC16820sZ A0D;
    public final InterfaceC16820sZ A0E;
    public final InterfaceC16820sZ A0F;
    public final InterfaceC16820sZ A0G;
    public final InterfaceC16820sZ A0H;
    public final InterfaceC16820sZ A0I;
    public final InterfaceC16820sZ A0J;
    public final InterfaceC16820sZ A0K;
    public final InterfaceC16820sZ A0L;
    public final InterfaceC16820sZ A0M;
    public final InterfaceC16660sJ A0N;
    public final C18920wW A0O;
    public final C7XA A0P;
    public final InterfaceC16820sZ A0Q;
    public final InterfaceC16820sZ A0R;
    public final InterfaceC16820sZ A0S;
    public final InterfaceC16820sZ A0T;
    public final InterfaceC16820sZ A0U;
    public final InterfaceC16820sZ A0V;

    public C7XE(AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, C18920wW c18920wW, UserSession userSession, C7XA c7xa, C164357Wy c164357Wy, C163947Vi c163947Vi, InterfaceC60442pS interfaceC60442pS, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16820sZ interfaceC16820sZ4, InterfaceC16820sZ interfaceC16820sZ5, InterfaceC16820sZ interfaceC16820sZ6, InterfaceC16820sZ interfaceC16820sZ7, InterfaceC16820sZ interfaceC16820sZ8, InterfaceC16820sZ interfaceC16820sZ9, InterfaceC16820sZ interfaceC16820sZ10, InterfaceC16820sZ interfaceC16820sZ11, InterfaceC16820sZ interfaceC16820sZ12, InterfaceC16820sZ interfaceC16820sZ13, InterfaceC16820sZ interfaceC16820sZ14, InterfaceC16820sZ interfaceC16820sZ15, InterfaceC16820sZ interfaceC16820sZ16, InterfaceC16820sZ interfaceC16820sZ17, InterfaceC16820sZ interfaceC16820sZ18, InterfaceC16820sZ interfaceC16820sZ19, InterfaceC16820sZ interfaceC16820sZ20, InterfaceC16820sZ interfaceC16820sZ21, InterfaceC16820sZ interfaceC16820sZ22, InterfaceC16820sZ interfaceC16820sZ23, InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(abstractC59962oe, 1);
        C14360o3.A0B(interfaceC11380iw, 3);
        C14360o3.A0B(c18920wW, 4);
        C14360o3.A0B(interfaceC16820sZ, 8);
        C14360o3.A0B(interfaceC16820sZ2, 9);
        C14360o3.A0B(interfaceC16820sZ6, 13);
        C14360o3.A0B(interfaceC16820sZ7, 14);
        C14360o3.A0B(interfaceC16820sZ16, 23);
        C14360o3.A0B(interfaceC16820sZ20, 29);
        this.A00 = abstractC59962oe;
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A0O = c18920wW;
        this.A05 = interfaceC60442pS;
        this.A04 = c163947Vi;
        this.A0P = c7xa;
        this.A07 = interfaceC16820sZ;
        this.A0J = interfaceC16820sZ2;
        this.A0F = interfaceC16820sZ3;
        this.A06 = interfaceC16820sZ4;
        this.A0H = interfaceC16820sZ5;
        this.A0G = interfaceC16820sZ6;
        this.A0T = interfaceC16820sZ7;
        this.A0V = interfaceC16820sZ8;
        this.A0K = interfaceC16820sZ9;
        this.A0U = interfaceC16820sZ10;
        this.A0Q = interfaceC16820sZ11;
        this.A08 = interfaceC16820sZ12;
        this.A09 = interfaceC16820sZ13;
        this.A0M = interfaceC16820sZ14;
        this.A0L = interfaceC16820sZ15;
        this.A0E = interfaceC16820sZ16;
        this.A0R = interfaceC16820sZ17;
        this.A03 = c164357Wy;
        this.A0N = interfaceC16660sJ;
        this.A0S = interfaceC16820sZ18;
        this.A0A = interfaceC16820sZ19;
        this.A0C = interfaceC16820sZ20;
        this.A0D = interfaceC16820sZ21;
        this.A0I = interfaceC16820sZ22;
        this.A0B = interfaceC16820sZ23;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03(X.C7TT r8, java.util.List r9, boolean r10) {
        /*
            r7 = this;
            r4 = 0
            com.instagram.common.session.UserSession r6 = r7.A02
            boolean r0 = r8.A1C
            if (r0 == 0) goto L2f
            int r3 = r8.A08
            r2 = 29
            if (r3 != r2) goto L30
            X.0Tz r5 = X.C06090Tz.A05
            r0 = 36319377327463729(0x81084800111d31, double:3.031858696057452E-306)
            boolean r0 = X.C18U.A06(r5, r6, r0)
        L18:
            if (r0 == 0) goto L2f
        L1a:
            if (r3 != r2) goto L2f
            X.0sZ r0 = r7.A0R
            java.lang.Object r0 = r0.invoke()
            X.7YO r0 = (X.C7YO) r0
            X.0do r0 = r0.A03
            java.lang.Object r0 = r0.getValue()
            X.GaI r0 = (X.InterfaceC37207GaI) r0
            r0.F8Y(r8, r9, r10, r4)
        L2f:
            return
        L30:
            java.lang.Boolean r0 = X.AbstractC159077Bt.A00(r6)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L5b
            X.3oI r0 = r8.A0P
            if (r0 == 0) goto L59
            X.3o9 r0 = X.AbstractC1345466e.A05(r0)
        L42:
            boolean r1 = r0 instanceof com.instagram.model.direct.threadkey.impl.MsysThreadId
            X.3kW r0 = r8.A0G
            boolean r0 = X.C161867Mw.A02(r0)
            if (r1 != 0) goto L2f
            if (r0 != 0) goto L2f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            boolean r0 = X.C4GR.A07(r0)
            if (r0 != 0) goto L2f
            goto L1a
        L59:
            r0 = 0
            goto L42
        L5b:
            boolean r0 = X.F3B.A00(r6, r8)
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7XE.A03(X.7TT, java.util.List, boolean):void");
    }

    public final void A05(String str) {
        C14360o3.A0B(str, 0);
        C23031Ai A00 = AbstractC23021Ah.A00(this.A02);
        C18920wW c18920wW = this.A0O;
        C14360o3.A0B(c18920wW, 0);
        InterfaceC02590Ai A002 = c18920wW.A00(c18920wW.A00, "direct_shh_mode_nux_impression");
        A002.AAP(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
        A002.Cht();
        InterfaceC19630xq interfaceC19630xq = A00.A01;
        InterfaceC19610xo ARD = interfaceC19630xq.ARD();
        ARD.E7D("direct_shhmode_display_count", interfaceC19630xq.getInt("direct_shhmode_display_count", 0) + 1);
        ARD.apply();
        InterfaceC19610xo ARD2 = interfaceC19630xq.ARD();
        ARD2.E7G("direct_shhmode_seen_timestamp", System.currentTimeMillis());
        ARD2.apply();
    }

    public final boolean A0A(InterfaceC163837Ux interfaceC163837Ux) {
        C81613kW c81613kW;
        UserSession userSession = this.A02;
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        InterfaceC163837Ux C7r = ((C7U0) this.A07.invoke()).C7r();
        C2EC Co6 = C7r.Co6();
        Capabilities AlV = C7r.AlV();
        C14360o3.A07(AlV);
        if (AbstractC31236DoJ.A00(userSession, AlV, Co6)) {
            if (Co6 != null) {
                c81613kW = Co6.Aic();
            } else {
                c81613kW = null;
            }
            if (AbstractC31236DoJ.A02(userSession, C161867Mw.A02(c81613kW))) {
                InterfaceC19630xq interfaceC19630xq = A00.A01;
                if (interfaceC19630xq.getInt("direct_shhmode_display_count", 0) < 5 && TimeUnit.MILLISECONDS.toHours(System.currentTimeMillis() - interfaceC19630xq.getLong("direct_shhmode_seen_timestamp", 0L)) >= 1 && !C6X6.A0S(userSession, interfaceC163837Ux)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void A00() {
        InterfaceC19630xq interfaceC19630xq = AbstractC2056298m.A00(this.A02).A00;
        InterfaceC19610xo ARD = interfaceC19630xq.ARD();
        ARD.E7D("direct_shh_mode_swipe_to_leave_nux_count", interfaceC19630xq.getInt("direct_shh_mode_swipe_to_leave_nux_count", 0) + 1);
        ARD.apply();
        InterfaceC19610xo ARD2 = interfaceC19630xq.ARD();
        ARD2.E7G("direct_shh_mode_swipe_to_leave_nux_seen_timestamp", System.currentTimeMillis());
        ARD2.apply();
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0097, code lost:
    
        if (r1 != 8) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00cc, code lost:
    
        if (r1 > 0) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(com.instagram.common.typedurl.ImageUrl r8, boolean r9, boolean r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7XE.A01(com.instagram.common.typedurl.ImageUrl, boolean, boolean, boolean, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0080, code lost:
    
        if (X.C14360o3.A0K(r1.A01.getString("has_seen_thread_title_change_banner_thread_id", null), r3) == false) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(X.C7TT r10) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7XE.A02(X.7TT):void");
    }

    public final void A04(String str) {
        if (str != null) {
            UserSession userSession = this.A02;
            C81663kb A0N = ((C2DU) AbstractC28761aE.A00(userSession)).A0N(str);
            C162307Os c162307Os = (C162307Os) this.A06.invoke();
            if (A0N != null && c162307Os != null && AbstractC31274Dow.A00(userSession, A0N)) {
                c162307Os.A04(new KR9(A0N));
            }
        }
    }

    public final void A06(List list) {
        DirectMessageIdentifier directMessageIdentifier;
        InterfaceC16820sZ interfaceC16820sZ = this.A0Q;
        C47664L2x c47664L2x = ((C7DK) interfaceC16820sZ.invoke()).A02;
        if (c47664L2x != null && (directMessageIdentifier = c47664L2x.A01) != null) {
            for (Object obj : list) {
                if (C14360o3.A0K(obj, directMessageIdentifier.A00) || C14360o3.A0K(obj, directMessageIdentifier.A02)) {
                    ((C7DK) interfaceC16820sZ.invoke()).A0A("message_unsent");
                    return;
                }
            }
        }
    }

    public final void A07(InterfaceC16820sZ interfaceC16820sZ, int i) {
        AbstractC70663Fe abstractC70663Fe = (AbstractC70663Fe) this.A0T.invoke();
        if (abstractC70663Fe != null) {
            C51108MiD c51108MiD = new C51108MiD(this.A00.requireContext(), new C9EW(interfaceC16820sZ, 35));
            ((AbstractC110824yu) c51108MiD).A00 = i;
            abstractC70663Fe.A10(c51108MiD);
        }
    }

    public final void A08(boolean z) {
        C2EC c2ec;
        Integer num;
        String C7I;
        C159737El c159737El = ((C163867Va) this.A0F.invoke()).A00.A0R;
        if (c159737El != null && z != c159737El.A0y) {
            C159737El.A0m(c159737El, true);
            c159737El.A18();
            if (z) {
                Context context = c159737El.A1R;
                if ((context instanceof Activity) && (c2ec = (C2EC) c159737El.A22.get()) != null) {
                    UserSession userSession = c159737El.A1Z;
                    boolean A0O = C6X6.A0O(userSession, c2ec);
                    Long A01 = AbstractC160897Ix.A01(c2ec);
                    EnumC92794Ds A012 = C6X6.A01(userSession, c2ec.Aic());
                    boolean A0x = C159737El.A0x(c159737El);
                    boolean CPg = AbstractC160497Hj.A03(userSession, c2ec).CPg(userSession, c2ec);
                    if (V1J.A03.A02(userSession, A0O, A0x, CPg)) {
                        c159737El.A19();
                        boolean Ay8 = c2ec.Ay8();
                        C1118752z Ay9 = c2ec.Ay9();
                        Long l = null;
                        if (Ay9 != null) {
                            num = Ay9.A03;
                        } else {
                            num = null;
                        }
                        if (Ay8 && num != null) {
                            Long valueOf = Long.valueOf(TimeUnit.SECONDS.toMillis(num.intValue()));
                            if (valueOf != null && valueOf.longValue() > -1) {
                                l = valueOf;
                            }
                        }
                        Activity activity = (Activity) context;
                        C2EE c2ee = c159737El.A0W;
                        if (c2ee == null) {
                            C7I = null;
                        } else {
                            C7I = c2ee.C7I();
                        }
                        WCt.A01(activity, userSession, A012, A01, l, C7I, ((Boolean) c159737El.A25.get()).booleanValue(), C6X6.A0I(userSession, c2ec.Aic()), A0O, A0x, CPg);
                    }
                }
            }
            c159737El.A0y = z;
            c159737El.A1F();
            C7E0 c7e0 = c159737El.A1w;
            if (c7e0 instanceof C159637Dz) {
                C159637Dz c159637Dz = (C159637Dz) c7e0;
                InterfaceC160517Hl interfaceC160517Hl = (InterfaceC160517Hl) c159737El.A23.get();
                C14360o3.A0B(interfaceC160517Hl, 1);
                c159637Dz.A05 = z;
                c159637Dz.A01 = interfaceC160517Hl;
                C159637Dz.A00(c159637Dz);
            }
        }
    }

    public final boolean A09() {
        UserSession userSession = this.A02;
        C2056398n A00 = AbstractC2056298m.A00(userSession);
        if (AbstractC31236DoJ.A02(userSession, C161867Mw.A02(((C7U0) this.A07.invoke()).C7r().C7W().A0G))) {
            InterfaceC19630xq interfaceC19630xq = A00.A00;
            if (interfaceC19630xq.getInt("direct_shh_mode_swipe_to_leave_nux_count", 0) < 5 && TimeUnit.MILLISECONDS.toHours(System.currentTimeMillis() - interfaceC19630xq.getLong("direct_shh_mode_swipe_to_leave_nux_seen_timestamp", 0L)) >= 1) {
                return true;
            }
        }
        return false;
    }
}
