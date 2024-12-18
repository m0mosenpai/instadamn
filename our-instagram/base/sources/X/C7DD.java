package X;

import android.content.Context;
import com.instagram.api.schemas.BizUserInboxState;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.user.model.User;
import java.util.Iterator;

/* renamed from: X.7DD, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7DD {
    public static final C7DC A00(UserSession userSession, C2EE c2ee) {
        C7DI c7di;
        C14360o3.A0B(userSession, 1);
        if (c2ee != null) {
            if (!c2ee.CdS() && !c2ee.CVQ() && !c2ee.Cc2() && AbstractC1337462f.A05(userSession)) {
                c7di = C7DI.A0F;
            } else {
                c7di = C7DI.A0E;
            }
        } else {
            c7di = C7DI.A0K;
        }
        return new C7DC(c7di, c2ee, null, null, null, null, 0, 0L);
    }

    public final C7DC A02(Context context, UserSession userSession, C81613kW c81613kW, C2EE c2ee) {
        C7DI c7di;
        Integer Bkb;
        DirectThreadKey A02;
        C81663kb A03;
        User Ba5;
        C83403nh BLs;
        DirectThreadKey A022;
        C81663kb A032;
        User Ba52;
        C14360o3.A0B(userSession, 1);
        if (c2ee != null) {
            if ((c2ee.BKb() instanceof MsysThreadId) && C18U.A06(C06090Tz.A05, userSession, 36313153918863153L) && (C08730cb.A00(userSession).A00().A0I() == EnumC222416a.A05 || C08730cb.A00(userSession).A00().A0I() == EnumC222416a.A06 || ((!c2ee.BSH().isEmpty()) && ((User) c2ee.BSH().get(0)).A2I()))) {
                c7di = C7DI.A02;
            } else if (AbstractC31225Do8.A00(c2ee)) {
                c7di = C7DI.A03;
            } else if (c2ee.BI1() == 7) {
                c7di = C7DI.A04;
            } else if (c2ee.BI1() == 10) {
                c7di = C7DI.A0J;
            } else if (c2ee.CX1() && c2ee.CgC()) {
                c7di = C7DI.A0L;
            } else if (!A01(userSession, c2ee)) {
                c7di = C7DI.A06;
            } else {
                BizUserInboxState A00 = AbstractC81043jY.A00(String.valueOf(AbstractC2056298m.A00(userSession).A02()));
                if (AbstractC159067Bs.A00(userSession) && c2ee.C7C() == 1 && A00 == BizUserInboxState.A04) {
                    c7di = C7DI.A0G;
                } else {
                    if (!c2ee.CVQ() && (!c2ee.BSH().isEmpty()) && (Bkb = ((User) c2ee.BSH().get(0)).Bkb()) != null && Bkb.intValue() == 6) {
                        C3o9 BKb = c2ee.BKb();
                        if (!(BKb instanceof DirectThreadKey) || (A022 = JRE.A02(BKb)) == null || (A032 = C2DU.A03((C2DU) C2JD.A00(userSession), A022)) == null || (Ba52 = A032.Ba5()) == null || !Ba52.A27() || !C18U.A06(C06090Tz.A05, userSession, 36323277156854918L)) {
                            C3o9 BKb2 = c2ee.BKb();
                            if ((!(BKb2 instanceof DirectThreadKey) || (A02 = JRE.A02(BKb2)) == null || (A03 = C2DU.A03((C2DU) C2JD.A00(userSession), A02)) == null || (Ba5 = A03.Ba5()) == null || (BLs = A03.BLs()) == null || !C14360o3.A0K(BLs.A1u, Ba5.getId()) || !C18U.A06(C06090Tz.A05, userSession, 36323277156985991L)) && C18U.A06(C06090Tz.A05, userSession, 36323277156658309L)) {
                                c7di = C7DI.A0H;
                            }
                        }
                    }
                    C148686md c148686md = new C148686md(userSession, context);
                    C06090Tz c06090Tz = C06090Tz.A05;
                    if (C18U.A06(c06090Tz, userSession, 36317990052108034L) && c148686md.A00()) {
                        c7di = C7DI.A07;
                    } else if ((c2ee.Ay8() || c2ee.CWO()) && !AGN.A08.A00(userSession, c81613kW, c2ee).A03) {
                        c7di = C7DI.A09;
                    } else if (c2ee.BI1() != -1) {
                        User Ba53 = c2ee.Ba5();
                        if (Ba53 != null && Ba53.A1U() && !AbstractC162267Oo.A03(userSession) && C18U.A06(c06090Tz, userSession, 36320403825893848L)) {
                            c7di = C7DI.A0C;
                        } else {
                            User Ba54 = c2ee.Ba5();
                            if (Ba54 != null) {
                                boolean z = AbstractC23021Ah.A00(userSession).A01.getBoolean(AnonymousClass001.A0u("reachable_user_composer_block_dismissed/userid/", Ba54.getId(), "/type/", String.valueOf(9)), false);
                                if (!c2ee.CVQ() && !z && !Ba54.CQf()) {
                                    Iterator it = c2ee.BSH().iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        Integer Bkb2 = ((AnonymousClass175) it.next()).Bkb();
                                        if (Bkb2 != null && Bkb2.intValue() == 9) {
                                            if (C18U.A06(c06090Tz, userSession, 36330458341983097L)) {
                                                c7di = C7DI.A0I;
                                            }
                                        }
                                    }
                                }
                            }
                            c7di = C7DI.A0K;
                        }
                    }
                }
            }
            return new C7DC(c7di, c2ee, null, null, null, null, 0, 0L);
        }
        c7di = C7DI.A0D;
        return new C7DC(c7di, c2ee, null, null, null, null, 0, 0L);
    }

    public static final boolean A01(UserSession userSession, C2EE c2ee) {
        if (!AbstractC31225Do8.A00(c2ee) && !C7DE.A00(userSession, c2ee) && !C9Gw.A00(c2ee) && !AbstractC207689Gy.A04(userSession, c2ee) && !AbstractC207679Gx.A00(userSession, c2ee) && !C7DF.A00.A01(userSession, c2ee) && c2ee.BI1() == 0) {
            return true;
        }
        return false;
    }
}
