package X;

/* loaded from: classes10.dex */
public final class Q0T implements Runnable {
    public final /* synthetic */ Q0U A00;
    public final /* synthetic */ Q0S A01;

    public Q0T(Q0U q0u, Q0S q0s) {
        this.A01 = q0s;
        this.A00 = q0u;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Q0S q0s = this.A01;
            String A00 = Q0S.A00(this.A00);
            q0s.A00.A00(new Q07(), A00, C16930sl.A00);
        } catch (Exception e) {
            this.A01.A00.A01(new Q07(), e);
        }
    }
}
