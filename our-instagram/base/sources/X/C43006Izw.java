package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.google.common.collect.ImmutableSet;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.Izw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C43006Izw implements InterfaceC671531g {
    public int A00;
    public final UserSession A01;
    public final C31H A02;
    public final AbstractC41050IFt A03;
    public final LinkedHashSet A04 = AbstractC31171DnF.A0l();

    @Override // X.InterfaceC671531g
    public final InterfaceC673231x AMN() {
        return new J01(this, 2);
    }

    @Override // X.InterfaceC671531g
    public final C51G AND() {
        return new C43001Izr(this, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x02cb, code lost:
    
        if (r0.A05.A02(r8, r21, r3.A01) != false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0224, code lost:
    
        if (r5 >= r3) goto L94;
     */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fd A[LOOP:0: B:36:0x00f7->B:38:0x00fd, LOOP_END] */
    @Override // X.InterfaceC669630n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void CKM(X.C206209Bd r30, java.util.List r31) {
        /*
            Method dump skipped, instructions count: 1302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43006Izw.CKM(X.9Bd, java.util.List):void");
    }

    @Override // X.InterfaceC671531g
    public final void Ct4(int i) {
    }

    @Override // X.InterfaceC671531g
    public final void CtD(int i) {
    }

    @Override // X.InterfaceC671531g
    public final /* synthetic */ void DrA() {
    }

    @Override // X.InterfaceC671531g
    public final /* synthetic */ void DrD() {
    }

    @Override // X.InterfaceC671531g
    public final /* synthetic */ void DrF(String str) {
    }

    @Override // X.InterfaceC671531g
    public final /* synthetic */ void DrJ() {
    }

    @Override // X.InterfaceC671531g
    public final void ECx() {
        this.A00 = 0;
    }

    @Override // X.InterfaceC671531g
    public final void EF6(InterfaceC673031v interfaceC673031v) {
        C14360o3.A0B(interfaceC673031v, 0);
        this.A04.remove(interfaceC673031v);
    }

    @Override // X.InterfaceC671531g
    public final void EKY(C1PZ c1pz) {
    }

    @Override // X.InterfaceC671531g
    public final void EPQ(InterfaceC671731i interfaceC671731i) {
    }

    @Override // X.InterfaceC671531g
    public final void A7z(InterfaceC673031v interfaceC673031v) {
        if (interfaceC673031v != null) {
            this.A04.add(interfaceC673031v);
        }
    }

    @Override // X.InterfaceC669630n
    public final String B5L() {
        return "feed_rti";
    }

    @Override // X.InterfaceC669630n
    public final java.util.Set Bts() {
        Boolean bool;
        C39376HaG c39376HaG = (C39376HaG) this.A03;
        if (!c39376HaG.A00) {
            List A0m = AbstractC167007dF.A0m(C18U.A04(C06090Tz.A06, c39376HaG.A01, 36879312213180682L), InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, 0);
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
                            if (C14360o3.A0K(anonymousClass317.A01, AbstractC25228BEl.A1A(A1B)) && anonymousClass317.A00 != null) {
                                bool = Boolean.valueOf(c39376HaG.A0B.add(new C206209Bd(EnumC64262vl.A05, anonymousClass317, EnumC64222vh.A06)));
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
            c39376HaG.A00 = true;
        }
        ImmutableSet A03 = ImmutableSet.A03(c39376HaG.A0B);
        C14360o3.A07(A03);
        return A03;
    }

    @Override // X.InterfaceC671531g
    public final void COx() {
    }

    @Override // X.InterfaceC671531g
    public final void EKX() {
    }

    public C43006Izw(UserSession userSession, C31H c31h, AbstractC41050IFt abstractC41050IFt) {
        this.A03 = abstractC41050IFt;
        this.A02 = c31h;
        this.A01 = userSession;
    }

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        AbstractC167017dG.A1N(c59062n7, interfaceC57162jr);
        if (interfaceC57162jr.CFq(c59062n7) == C05F.A00) {
            this.A00 = Math.max(AbstractC166987dD.A0H(c59062n7.A04), this.A00);
        }
    }

    @Override // X.InterfaceC671531g
    public final C1PZ AGn(List list) {
        return C1PZ.A0K;
    }
}
