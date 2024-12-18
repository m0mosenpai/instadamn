package X;

import com.instagram.banyan.BanyanCoordinator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes11.dex */
public final class V3U extends C1P1 {
    public final /* synthetic */ BanyanCoordinator A00;

    public V3U(BanyanCoordinator banyanCoordinator) {
        this.A00 = banyanCoordinator;
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Lock writeLock;
        Long l;
        long j;
        int A03 = C0f9.A03(100710706);
        C3DC c3dc = (C3DC) obj;
        int A0N = AbstractC167017dG.A0N(c3dc, 544820556);
        BanyanCoordinator banyanCoordinator = this.A00;
        Object F7f = c3dc.F7f();
        C14360o3.A07(F7f);
        BanyanCoordinator.A03((XFO) F7f, banyanCoordinator);
        C121125e6 c121125e6 = banyanCoordinator.A09;
        boolean z = c121125e6.A01;
        ReentrantReadWriteLock reentrantReadWriteLock = c121125e6.A00;
        if (z) {
            writeLock = reentrantReadWriteLock.readLock();
        } else {
            writeLock = reentrantReadWriteLock.writeLock();
        }
        if (writeLock.tryLock(1L, TimeUnit.SECONDS)) {
            try {
                C121395ef A02 = banyanCoordinator.A07.A02(AbstractC111324zv.A00(5224));
                if (A02 != null) {
                    l = Long.valueOf(A02.A01);
                } else {
                    l = null;
                }
                InterfaceC19610xo ARD = banyanCoordinator.A0B.A01.ARD();
                if (l != null) {
                    j = l.longValue();
                } else {
                    j = -1;
                }
                ARD.E7G("last_sync_timestamp_sec", j);
                ARD.apply();
                writeLock.unlock();
                C0f9.A0A(1112828067, A0N);
                C0f9.A0A(836645751, A03);
                return;
            } catch (Throwable th) {
                writeLock.unlock();
                C0f9.A0A(831471337, A0N);
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException("Failed to claim lock after 1 seconds");
        C0f9.A0A(-902012876, A0N);
        throw interruptedException;
    }
}
