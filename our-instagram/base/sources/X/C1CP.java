package X;

/* renamed from: X.1CP, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1CP implements C1CQ {
    public static final C1CP A03 = new C1CP();
    public boolean A02;
    public C1CQ A01 = new C1CR(true);
    public C1CQ A00 = new C1CR(true);

    @Override // X.C1CQ
    public final C09530e4 AIp(C1QW c1qw, C1QY c1qy) {
        C1CQ c1cq;
        EnumC23341Bw enumC23341Bw = c1qy.A09;
        if (enumC23341Bw != EnumC23341Bw.API && enumC23341Bw != EnumC23341Bw.CriticalAPI) {
            c1cq = this.A01;
        } else {
            c1cq = this.A00;
        }
        return c1cq.AIp(c1qw, c1qy);
    }
}
