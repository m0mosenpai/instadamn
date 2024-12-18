package X;

/* renamed from: X.0Rl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C05610Rl implements C0CD {
    @Override // X.C0CD
    public final /* bridge */ /* synthetic */ void EIU(AbstractC02960Bu abstractC02960Bu, C0CC c0cc) {
        C0WB c0wb = (C0WB) abstractC02960Bu;
        double d = c0wb.A03;
        if (d != 0.0d) {
            c0cc.A7k("cpu_user_time_s", d);
        }
        double d2 = c0wb.A02;
        if (d2 != 0.0d) {
            c0cc.A7k("cpu_system_time_s", d2);
        }
        double d3 = c0wb.A01;
        if (d3 != 0.0d) {
            c0cc.A7k("child_cpu_user_time_s", d3);
        }
        double d4 = c0wb.A00;
        if (d4 != 0.0d) {
            c0cc.A7k("child_cpu_system_time_s", d4);
        }
    }
}
