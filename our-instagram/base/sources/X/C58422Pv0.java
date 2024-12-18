package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* renamed from: X.Pv0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58422Pv0 {
    public Exception A00;
    public final C2MY A01;
    public final C2MT A02;
    public final C2MR A03;
    public final Integer A04;
    public final Collection A05;
    public final java.util.Set A06;

    /* JADX WARN: Removed duplicated region for block: B:25:0x0096 A[LOOP:2: B:23:0x0090->B:25:0x0096, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C58428Pv7 A01() {
        /*
            Method dump skipped, instructions count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58422Pv0.A01():X.Pv7");
    }

    public C58422Pv0() {
    }

    public static void A00(C58424Pv2 c58424Pv2, C58422Pv0 c58422Pv0, C58427Pv6 c58427Pv6, Iterator it) {
        C129605tP c129605tP;
        if (!it.hasNext()) {
            C0K8.A0Q("AppModuleActionQueryV2", "executeAction is called when no actions exist %s", c58424Pv2.A03.toString());
            if (c58427Pv6 != null) {
                c58427Pv6.A00(AbstractC166987dD.A14("executeAction is called when no actions exist"));
                return;
            }
            return;
        }
        C58425Pv3 c58425Pv3 = (C58425Pv3) it.next();
        C58427Pv6 c58427Pv62 = new C58427Pv6();
        C58428Pv7 c58428Pv7 = c58427Pv62.A00;
        C2MT c2mt = c58422Pv0.A02;
        Executor executor = c2mt.A09;
        c58428Pv7.A05(new C58429Pv8(c58424Pv2, c58422Pv0, c58427Pv6, it), executor);
        switch (c58425Pv3.A00.intValue()) {
            case 0:
                java.util.Set set = c58425Pv3.A01;
                Iterator it2 = c58422Pv0.A05.iterator();
                while (it2.hasNext()) {
                    ((C2MN) it2.next()).A05(c58424Pv2);
                }
                c2mt.A04.EnG(new C58621Pyp(c58422Pv0.A04, set)).A05(new C58628Pyw(c58424Pv2, c58422Pv0, c58427Pv62), executor);
                return;
            case 1:
                executor.execute(new RunnableC58431PvA(c58424Pv2, c58422Pv0, c58427Pv62, c58425Pv3.A01));
                return;
            case 2:
                c2mt.A04.AOU(new C58621Pyp(c58422Pv0.A04, c58425Pv3.A01));
                c129605tP = new C129605tP(null, null, true);
                break;
            case 3:
            case 7:
            default:
                return;
            case 4:
            case 5:
                c129605tP = new C129605tP(new C124725kd(null, -1, true, false), null, true);
                break;
            case 6:
                c129605tP = new C129605tP(new C124725kd(null, -2, false, true), null, true);
                break;
            case 8:
            case 9:
            case 10:
            case 11:
                c129605tP = new C129605tP(new C124725kd(null, -1, false, false), null, true);
                break;
        }
        c58427Pv62.A01(c129605tP);
    }

    public C58422Pv0(C2MY c2my, C2MT c2mt, C2MR c2mr, Integer num, Collection collection) {
        this.A06 = AbstractC166987dD.A1H();
        this.A00 = null;
        this.A02 = c2mt;
        this.A04 = num;
        this.A05 = collection;
        this.A01 = c2my;
        this.A03 = c2mr;
    }
}
