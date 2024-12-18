package X;

/* renamed from: X.DuA, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31582DuA extends AbstractRunnableC14200nk {
    public final /* synthetic */ C25201La A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31582DuA(C25201La c25201La) {
        super(408, 4, false, false);
        this.A00 = c25201La;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.FHe, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        C25201La c25201La = this.A00;
        ?? obj = new Object();
        C25331Ln c25331Ln = c25201La.A00;
        obj.A00 = c25331Ln;
        synchronized (c25331Ln) {
            if (!c25201La.A00.A00.isEmpty()) {
                c25201La.A02.A05(AnonymousClass001.A0R("pending_reel_tray_seen_state_", c25201La.A03.userId), obj);
            }
        }
    }
}
