package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.Ge1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37421Ge1 implements InterfaceC43071ya {
    public final int A00;
    public final Object A01;

    public C37421Ge1(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        MRJ mrj;
        MRJ mrj2;
        switch (this.A00) {
            case 0:
                int intValue = interfaceC57162jr.CFq(c59062n7).intValue();
                if (intValue != 0) {
                    if (intValue == 2) {
                        C44750JrX c44750JrX = (C44750JrX) this.A01;
                        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
                        mrj2 = c44750JrX.A00;
                        if (mrj2 == null) {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    C44750JrX c44750JrX2 = (C44750JrX) this.A01;
                    int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                    mrj = c44750JrX2.A00;
                    if (mrj == null) {
                        return;
                    }
                    mrj.E0X();
                    return;
                }
                break;
            case 1:
                int intValue2 = interfaceC57162jr.CFq(c59062n7).intValue();
                if (intValue2 != 0) {
                    if (intValue2 == 2) {
                        mrj2 = (MRJ) this.A01;
                        break;
                    } else {
                        return;
                    }
                } else {
                    mrj = (MRJ) this.A01;
                    mrj.E0X();
                    return;
                }
            default:
                Integer CFq = interfaceC57162jr.CFq(c59062n7);
                long B0m = interfaceC57162jr.B0m(c59062n7);
                if ((CFq == C05F.A00 || CFq == C05F.A01) && B0m >= 200) {
                    C37466Gek c37466Gek = (C37466Gek) this.A01;
                    int intValue3 = ((Number) c59062n7.A04).intValue();
                    List BRE = c37466Gek.A04.BRE();
                    if (!BRE.isEmpty()) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                        UserSession userSession = c37466Gek.A00;
                        C06090Tz c06090Tz = C06090Tz.A05;
                        boolean A06 = C18U.A06(c06090Tz, userSession, 36314433819052596L);
                        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                        for (int i3 = intValue3; i3 < intValue3 + 2; i3++) {
                            C38321qM c38321qM = (C38321qM) BRE.get(Math.min(i3, BRE.size() - 1));
                            if (c38321qM.A5i() && !c37466Gek.A06.contains(c38321qM.getId())) {
                                linkedHashSet2.add(c38321qM.getId());
                                if (A06) {
                                }
                            }
                            if (!c38321qM.A4S() && !c38321qM.A4k() && !c37466Gek.A05.contains(c38321qM.getId())) {
                                linkedHashSet.add(c38321qM.getId());
                                linkedHashSet3.add(c38321qM);
                            }
                        }
                        if (!linkedHashSet2.isEmpty()) {
                            c37466Gek.A06.addAll(linkedHashSet2);
                            C1ON A01 = AbstractC2044893h.A01(userSession, linkedHashSet2, A06, false);
                            A01.A00 = new C37484Gf2(2, c37466Gek, linkedHashSet2);
                            c37466Gek.A01.schedule(A01);
                        }
                        if (!linkedHashSet3.isEmpty()) {
                            c37466Gek.A05.addAll(linkedHashSet);
                            C25621Ms c25621Ms = new C25621Ms(userSession);
                            c25621Ms.A09(C05F.A0N);
                            c25621Ms.A0B("media/comment_infos/");
                            c25621Ms.A9s("media_ids", new C71473Il(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1).A02(linkedHashSet));
                            c25621Ms.A0I("can_support_carousel_mentions", C18U.A06(c06090Tz, userSession, 36323264271887486L));
                            c25621Ms.A0S(C38877H9z.class, C37458Gec.class);
                            C1ON A0N = c25621Ms.A0N();
                            A0N.A00 = new C37460Gee(2, c37466Gek, linkedHashSet3, linkedHashSet);
                            c37466Gek.A01.schedule(A0N);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
        mrj2.E0W();
    }
}
