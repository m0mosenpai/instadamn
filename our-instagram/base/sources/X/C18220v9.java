package X;

import android.os.SystemClock;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.0v9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18220v9 implements InterfaceC14020nS {
    public boolean A00;
    public final C13920nI A02;
    public final InterfaceC14020nS A03;
    public final Queue A04 = new ConcurrentLinkedQueue();
    public final AtomicLong A01 = new AtomicLong();

    public C18220v9(C13920nI c13920nI, InterfaceC14020nS interfaceC14020nS) {
        this.A02 = c13920nI;
        this.A03 = interfaceC14020nS;
    }

    public static final void A00(C18220v9 c18220v9) {
        synchronized (c18220v9) {
            if (c18220v9.A00) {
                if (c18220v9.A01.get() != 0) {
                    SystemClock.elapsedRealtime();
                }
            } else {
                Object poll = c18220v9.A04.poll();
                if (poll != null) {
                    c18220v9.A00 = true;
                    c18220v9.A03.ATO((AbstractRunnableC14200nk) poll);
                }
            }
        }
    }

    @Override // X.InterfaceC14020nS
    public final void ATO(final AbstractRunnableC14200nk abstractRunnableC14200nk) {
        C14360o3.A0B(abstractRunnableC14200nk, 0);
        this.A04.add(new AbstractRunnableC14200nk(abstractRunnableC14200nk, this) { // from class: X.0vA
            public final AbstractRunnableC14200nk A00;
            public final /* synthetic */ C18220v9 A01;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(abstractRunnableC14200nk.runnableId, abstractRunnableC14200nk.priority, abstractRunnableC14200nk.isSendToNetworkThreadPool, abstractRunnableC14200nk.isMayRunDuringStartup);
                this.A01 = this;
                this.A00 = new C18260vD(abstractRunnableC14200nk);
                SystemClock.elapsedRealtime();
            }

            @Override // java.lang.Runnable
            public final void run() {
                C18220v9 c18220v9 = this.A01;
                c18220v9.A01.set(SystemClock.elapsedRealtime());
                SystemClock.currentThreadTimeMillis();
                this.A00.run();
                SystemClock.currentThreadTimeMillis();
                SystemClock.elapsedRealtime();
                synchronized (c18220v9) {
                    c18220v9.A00 = false;
                }
                C18220v9.A00(c18220v9);
            }

            public final String toString() {
                return this.A00.toString();
            }
        });
        A00(this);
    }

    @Override // X.InterfaceC14020nS
    public final void ATN(C14160ng c14160ng) {
        throw new UnsupportedOperationException();
    }
}
