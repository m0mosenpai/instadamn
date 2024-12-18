package X;

/* renamed from: X.PKt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56849PKt implements Runnable {
    public final /* synthetic */ C55039OZl A00;

    public RunnableC56849PKt(C55039OZl c55039OZl) {
        this.A00 = c55039OZl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C55039OZl c55039OZl = this.A00;
        if (!c55039OZl.A08) {
            c55039OZl.A00 = false;
            OXE.A00.A00("ForegroundEligibilityStatus", "No longer safe to start foreground service");
        }
    }
}
