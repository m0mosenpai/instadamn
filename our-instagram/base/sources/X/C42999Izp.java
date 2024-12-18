package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.google.common.collect.ImmutableSet;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Izp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42999Izp implements InterfaceC669630n {
    public boolean A00;
    public final C26281Pj A01;
    public final UserSession A02;
    public final InterfaceC101944i9 A03;
    public final C32T A04;
    public final C31G A05;
    public final java.util.Set A06 = AbstractC31171DnF.A0l();

    @Override // X.InterfaceC669630n
    public final String B5L() {
        return "ultra_responsive_infra";
    }

    @Override // X.InterfaceC669630n
    public final void CKM(C206209Bd c206209Bd, List list) {
        int i;
        Integer num;
        String str;
        boolean A1R = AbstractC167007dF.A1R(0, c206209Bd, list);
        if (Bts().contains(c206209Bd) && list.size() == A1R) {
            if (C18U.A06(C06090Tz.A05, this.A02, 36321619299280520L)) {
                C9C7 c9c7 = (C9C7) ((C9BW) list.get(0)).A01;
                InterfaceC101944i9 interfaceC101944i9 = this.A03;
                C9CQ c9cq = (C9CQ) c9c7.A02;
                C41551w4 Blu = interfaceC101944i9.Blu(c9cq.A04);
                if (Blu != null) {
                    int CNR = interfaceC101944i9.CNR(Blu);
                    Reel reel = Blu.A0H;
                    if (reel.A1J) {
                        num = C05F.A01;
                    } else if (!this.A01.A03(EnumC26291Pk.A04, C05F.A01, CNR)) {
                        num = C05F.A00;
                    } else {
                        reel.A1J = A1R;
                        C32T c32t = this.A04;
                        String name = ((AnonymousClass317) c9c7.A04).name();
                        C32S c32s = (C32S) c32t;
                        if (!c32s.A06 || (i = c32s.A00) <= c32s.A01) {
                            return;
                        }
                        c32s.A0T.CoN(i);
                        C1PC c1pc = c32s.A0P;
                        C1PH c1ph = c32s.A0M;
                        if (c1ph == null || c1pc == null) {
                            return;
                        }
                        AnonymousClass318 A02 = c1ph.A02(c32s.A04, c1pc);
                        A02.A0X = "RTI";
                        A02.A0Y = name;
                        return;
                    }
                    C31G c31g = this.A05;
                    String str2 = c9cq.A01;
                    String str3 = ((AnonymousClass317) c9c7.A04).A01;
                    if (num.intValue() != 0) {
                        str = "seed_ad_already_triggered_refresh";
                    } else {
                        str = "exceeds_session_rate_limit";
                    }
                    c31g.CiF(str2, "rti", str3, str, false, A1R);
                }
            }
        }
    }

    @Override // X.InterfaceC669630n
    public final java.util.Set Bts() {
        Boolean bool;
        if (!this.A00) {
            List A0m = AbstractC167007dF.A0m(C18U.A04(C06090Tz.A06, this.A02, 36884569252823624L), InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, 0);
            if (A0m != null) {
                ArrayList A0q = AbstractC167017dG.A0q(A0m);
                Iterator it = A0m.iterator();
                while (it.hasNext()) {
                    String A1B = AbstractC166987dD.A1B(it);
                    AnonymousClass317[] values = AnonymousClass317.values();
                    int length = values.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            AnonymousClass317 anonymousClass317 = values[i];
                            if (C14360o3.A0K(anonymousClass317.A01, AbstractC25228BEl.A1A(A1B))) {
                                bool = Boolean.valueOf(this.A06.add(new C206209Bd(EnumC64262vl.A05, anonymousClass317, EnumC64222vh.A09)));
                                break;
                            }
                            i++;
                        } else {
                            bool = null;
                            break;
                        }
                    }
                    A0q.add(bool);
                }
            }
            this.A00 = true;
        }
        ImmutableSet A03 = ImmutableSet.A03(this.A06);
        C14360o3.A07(A03);
        return A03;
    }

    public C42999Izp(UserSession userSession, InterfaceC101944i9 interfaceC101944i9, C32T c32t, C26281Pj c26281Pj, C31G c31g) {
        this.A02 = userSession;
        this.A04 = c32t;
        this.A03 = interfaceC101944i9;
        this.A01 = c26281Pj;
        this.A05 = c31g;
    }
}
