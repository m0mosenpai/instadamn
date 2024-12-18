package X;

import android.os.SystemClock;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.0vB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18240vB implements InterfaceC14020nS {
    public boolean A00;
    public final int A01;
    public final String A02;
    public final C13920nI A03;
    public final InterfaceC14020nS A04;
    public final Queue A05 = new ConcurrentLinkedQueue();

    public static final void A00(C18240vB c18240vB) {
        Object poll;
        synchronized (c18240vB) {
            if (!c18240vB.A00 && (poll = c18240vB.A05.poll()) != null) {
                c18240vB.A00 = true;
                c18240vB.A04.ATO((AbstractRunnableC14200nk) poll);
            }
        }
    }

    @Override // X.InterfaceC14020nS
    public final void ATO(final AbstractRunnableC14200nk abstractRunnableC14200nk) {
        C14360o3.A0B(abstractRunnableC14200nk, 0);
        this.A05.add(new AbstractRunnableC14200nk(abstractRunnableC14200nk, this) { // from class: X.0vC
            public final long A00;
            public final AbstractRunnableC14200nk A01;
            public final /* synthetic */ C18240vB A02;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(abstractRunnableC14200nk.runnableId, abstractRunnableC14200nk.priority, abstractRunnableC14200nk.isSendToNetworkThreadPool, abstractRunnableC14200nk.isMayRunDuringStartup);
                this.A02 = this;
                this.A01 = new C18260vD(abstractRunnableC14200nk);
                this.A00 = SystemClock.elapsedRealtime();
            }

            @Override // java.lang.Runnable
            public final void run() {
                C18240vB c18240vB = this.A02;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                int i = c18240vB.A01;
                if (i != -1 && elapsedRealtime - this.A00 > i) {
                    C0w9.A03("dispatch time exceeded limit", AnonymousClass001.A07(this.runnableId, "name: ", c18240vB.A02, ", runnableId: "));
                }
                SystemClock.currentThreadTimeMillis();
                this.A01.run();
                SystemClock.currentThreadTimeMillis();
                SystemClock.elapsedRealtime();
                synchronized (c18240vB) {
                    c18240vB.A00 = false;
                }
                C18240vB.A00(c18240vB);
            }

            public final String toString() {
                return this.A01.toString();
            }
        });
        A00(this);
    }

    @Override // X.InterfaceC14020nS
    public final void ATN(C14160ng c14160ng) {
        throw new UnsupportedOperationException();
    }

    public C18240vB(C0o0 c0o0) {
        this.A03 = c0o0.A02;
        this.A02 = c0o0.A01;
        this.A04 = c0o0.A03;
        this.A01 = c0o0.A00;
    }
}
