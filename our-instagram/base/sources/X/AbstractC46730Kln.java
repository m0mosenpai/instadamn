package X;

/* renamed from: X.Kln, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46730Kln {
    public static final void A00(C41761wQ c41761wQ, C47707L4o c47707L4o, MQY mqy, Integer num) {
        String str;
        AbstractC167017dG.A1P(c47707L4o, c41761wQ);
        KPQ kpq = c47707L4o.A05;
        kpq.A03();
        if (num == C05F.A00) {
            str = "YES";
        } else {
            str = "NO";
        }
        kpq.A07("IS_V3_IMPLICIT_BACKUP", str);
        kpq.A07("CALLSITE", AbstractC46733Klq.A00(num));
        JQn.A00(C42221xC.A06(new C44091JeG(c41761wQ, c47707L4o, 1)), c41761wQ, mqy, 3);
    }
}
