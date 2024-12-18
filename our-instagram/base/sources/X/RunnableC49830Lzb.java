package X;

/* renamed from: X.Lzb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49830Lzb implements Runnable {
    public final /* synthetic */ KC0 A00;

    public RunnableC49830Lzb(KC0 kc0) {
        this.A00 = kc0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            C3DN A01 = C3DN.A00.A01(this.A00.requireContext());
            if (A01 != null) {
                A01.A0W(true);
            }
        } catch (IllegalStateException e) {
            C0w9.A06(KC0.__redex_internal_original_name, "Error When anchoring Bottom Sheet ", e);
        }
    }
}
