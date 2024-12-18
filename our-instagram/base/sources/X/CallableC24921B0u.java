package X;

import java.util.concurrent.Callable;

/* renamed from: X.B0u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class CallableC24921B0u implements Callable {
    public final /* synthetic */ C175057qf A00;
    public final /* synthetic */ boolean A01;

    public CallableC24921B0u(C175057qf c175057qf, boolean z) {
        this.A00 = c175057qf;
        this.A01 = z;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C175057qf c175057qf = this.A00;
        if (c175057qf.isConnected() && c175057qf.A08 != null) {
            C176837tf c176837tf = new C176837tf();
            c176837tf.A01(AbstractC176797tb.A0P, true);
            c176837tf.A01(AbstractC176797tb.A0R, true);
            c175057qf.Cpo(new C176427t0(), c176837tf.A00());
            if (this.A01) {
                C175297r3 c175297r3 = c175057qf.A0P;
                c175297r3.A0D = false;
                c175297r3.A00();
                return null;
            }
            return null;
        }
        throw new C6M2("Camera disconnected, failed to lock automatics (focus, AE, AWB)");
    }
}
