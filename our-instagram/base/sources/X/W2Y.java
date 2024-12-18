package X;

import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;

/* loaded from: classes11.dex */
public final class W2Y {
    public Object A00;
    public final C62723SNn A01;
    public final Runnable A02 = new RunnableC71280WrA(this);
    public final /* synthetic */ C69571Vra A03;

    public static synchronized void A00(W2Y w2y) {
        long now;
        synchronized (w2y) {
            C69571Vra c69571Vra = w2y.A03;
            C5J3 c5j3 = c69571Vra.A02;
            if (c5j3.A06 != null) {
                long j = c69571Vra.A00;
                if (j == Long.MIN_VALUE) {
                    if (c5j3.A05.size() > 10) {
                        now = StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS;
                    } else {
                        now = 0;
                    }
                    c69571Vra.A00 = (now - (w2y.A01.A00 * 1000)) + c5j3.A03.A01.now();
                } else {
                    now = (j + (w2y.A01.A00 * 1000)) - c5j3.A03.A01.now();
                }
                C102524jl c102524jl = c5j3.A04;
                Runnable runnable = w2y.A02;
                c102524jl.A01(runnable, Math.max(0L, now));
                w2y.A00 = runnable;
            }
        }
    }

    public W2Y(C69571Vra c69571Vra, C62723SNn c62723SNn) {
        this.A03 = c69571Vra;
        this.A01 = c62723SNn;
        A00(this);
    }
}
