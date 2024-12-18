package X;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.6WZ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6WZ implements Runnable {
    public int A00;
    public AbstractC219814y A01;
    public AtomicBoolean A02 = new AtomicBoolean(false);
    public boolean A03;
    public boolean A04;
    public boolean A05;

    @Override // java.lang.Runnable
    public final void run() {
        AnonymousClass153[] anonymousClass153Arr;
        int length;
        AbstractC219814y abstractC219814y = this.A01;
        synchronized (abstractC219814y.A08) {
            anonymousClass153Arr = abstractC219814y.A04;
        }
        if (anonymousClass153Arr != null && (length = anonymousClass153Arr.length) > 0) {
            int i = 0;
            do {
                AnonymousClass153 anonymousClass153 = anonymousClass153Arr[i];
                if (!this.A02.get()) {
                    boolean z = this.A05;
                    boolean z2 = this.A04;
                    if (z) {
                        if (!z2) {
                            anonymousClass153.onPostRequestBoost(this.A01, this.A03, this.A00);
                        }
                    } else {
                        AbstractC219814y abstractC219814y2 = this.A01;
                        int i2 = this.A00;
                        boolean z3 = this.A03;
                        if (z2) {
                            anonymousClass153.onPreReleaseBoost(abstractC219814y2, i2, z3);
                        } else {
                            anonymousClass153.onPostReleaseBoost(abstractC219814y2, i2, z3);
                        }
                    }
                    i++;
                } else {
                    return;
                }
            } while (i < length);
        }
        Queue queue = AbstractC219814y.A0A;
        synchronized (queue) {
            queue.offer(this);
        }
    }
}
