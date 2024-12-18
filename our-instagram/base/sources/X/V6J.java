package X;

import com.instagram.banyan.BanyanCoordinator;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes11.dex */
public final class V6J extends AbstractRunnableC14200nk {
    public final /* synthetic */ BanyanCoordinator A00;
    public final /* synthetic */ C48032Iq A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V6J(BanyanCoordinator banyanCoordinator, C48032Iq c48032Iq) {
        super(20, 3, true, true);
        this.A00 = banyanCoordinator;
        this.A01 = c48032Iq;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BanyanCoordinator banyanCoordinator = this.A00;
        String str = AbstractC1345466e.A01(this.A01.A00).A00;
        try {
            ReentrantReadWriteLock reentrantReadWriteLock = banyanCoordinator.A09.A00;
            if (AbstractC65702TsY.A1b(reentrantReadWriteLock)) {
                try {
                    C5e8 c5e8 = banyanCoordinator.A07;
                    C121125e6 c121125e6 = c5e8.A02;
                    c121125e6.A00();
                    if (c5e8.A08.remove(str) != null) {
                        Iterator A16 = AbstractC166997dE.A16(c5e8.A07);
                        while (A16.hasNext()) {
                            C15500q5.A04(((C121395ef) A16.next()).A04).remove(str);
                        }
                    }
                    c121125e6.A00();
                    C5e8.A00(c5e8, null);
                    AbstractC65702TsY.A1W(reentrantReadWriteLock);
                } catch (Throwable th) {
                    AbstractC65702TsY.A1W(reentrantReadWriteLock);
                    throw th;
                }
            }
        } catch (InterruptedException e) {
            C0K8.A0F("BanyanCoordinator", "Unable to acquire lock for executing this block.", e);
        }
    }
}
