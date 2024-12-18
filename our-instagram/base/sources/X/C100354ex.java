package X;

import android.os.Handler;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.4ex, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C100354ex extends AbstractC100374ez implements InterfaceC100384f0, InterfaceC100294er {
    public long A00;
    public final Handler A01;
    public final Runnable A02;
    public final ConcurrentLinkedQueue A03;
    public final AtomicBoolean A04;
    public final long A05;
    public final Runnable A06;

    @Override // X.InterfaceC100294er
    public final void ASt(boolean z) {
        long j;
        if (z) {
            j = this.A05;
        } else {
            j = StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS;
        }
        this.A00 = j;
        Handler handler = this.A01;
        Runnable runnable = this.A02;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, this.A00);
    }

    @Override // X.InterfaceC100384f0
    public final void E66(C88023wA c88023wA) {
        ConcurrentLinkedQueue concurrentLinkedQueue = this.A03;
        concurrentLinkedQueue.add(c88023wA);
        if (concurrentLinkedQueue.size() >= 256) {
            AtomicBoolean atomicBoolean = this.A04;
            if (!atomicBoolean.get()) {
                atomicBoolean.set(true);
                this.A01.post(this.A06);
            }
        }
    }

    @Override // X.InterfaceC100384f0
    public final void start() {
        this.A01.postDelayed(this.A02, this.A00);
    }

    public C100354ex(InterfaceC100264eo[] interfaceC100264eoArr, long j) {
        super(interfaceC100264eoArr);
        this.A03 = new ConcurrentLinkedQueue();
        this.A04 = new AtomicBoolean(false);
        this.A02 = new Runnable() { // from class: X.4f1
            @Override // java.lang.Runnable
            public final void run() {
                C100354ex c100354ex = C100354ex.this;
                ConcurrentLinkedQueue concurrentLinkedQueue = c100354ex.A03;
                int size = concurrentLinkedQueue.size();
                if (size != 0) {
                    while (true) {
                        int i = size - 1;
                        if (size <= 0) {
                            break;
                        }
                        C88023wA c88023wA = (C88023wA) concurrentLinkedQueue.poll();
                        if (c88023wA != null) {
                            c100354ex.A00(c88023wA);
                        }
                        size = i;
                    }
                }
                c100354ex.A01.postDelayed(c100354ex.A02, c100354ex.A00);
            }
        };
        this.A06 = new Runnable() { // from class: X.4f2
            @Override // java.lang.Runnable
            public final void run() {
                C100354ex c100354ex = C100354ex.this;
                ConcurrentLinkedQueue concurrentLinkedQueue = c100354ex.A03;
                int size = concurrentLinkedQueue.size();
                if (size != 0) {
                    while (true) {
                        int i = size - 1;
                        if (size <= 0) {
                            break;
                        }
                        C88023wA c88023wA = (C88023wA) concurrentLinkedQueue.poll();
                        if (c88023wA != null) {
                            c100354ex.A00(c88023wA);
                        }
                        size = i;
                    }
                }
                c100354ex.A04.set(false);
            }
        };
        this.A05 = j;
        this.A01 = new Handler(C87923w0.A00().A01.getLooper());
        this.A00 = C87973w5.A02.A01.get() ? j : StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS;
        C87973w5.A02.A00(this);
    }
}
