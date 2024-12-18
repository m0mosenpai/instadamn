package X;

/* renamed from: X.DuK, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31592DuK extends AbstractRunnableC14200nk {
    public final /* synthetic */ JR2 A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31592DuK(JR2 jr2, int i) {
        super(449242285, i, false, false);
        this.A00 = jr2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JR2 jr2 = this.A00;
        C5e4 c5e4 = jr2.A0K;
        if (c5e4 != null) {
            if (C5e4.A00(c5e4)) {
                synchronized (c5e4) {
                    c5e4.A00.A0B();
                }
            } else {
                c5e4.A00.A0B();
            }
            C5e4 c5e42 = jr2.A0K;
            if (c5e42 == null) {
                C14360o3.A0F("banyanClient");
                throw C00O.createAndThrow();
            }
            jr2.A1H = AbstractC167007dF.A1O(c5e42.A01("direct_ibc_nullstate").A02.size());
        }
    }
}
