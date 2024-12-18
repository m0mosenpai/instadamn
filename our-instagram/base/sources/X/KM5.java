package X;

/* loaded from: classes8.dex */
public final class KM5 extends AbstractRunnableC14200nk {
    public final /* synthetic */ C4El A00;
    public final /* synthetic */ boolean A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KM5(C4El c4El, boolean z) {
        super(2018763452, 3, false, false);
        this.A00 = c4El;
        this.A01 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4El c4El = this.A00;
        boolean z = !this.A01;
        C47909LEd c47909LEd = AbstractC46874KoH.A00(c4El.A07).A00;
        if (c47909LEd != null) {
            c4El.A06.A02(C43597JQd.A01(c47909LEd.A01, C50367MLu.A01(c47909LEd, 26), 59).A0G(), new C49706Lxb(c4El, z));
        }
    }
}
