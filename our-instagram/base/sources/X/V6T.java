package X;

import com.google.common.collect.ImmutableList;
import com.instagram.user.model.User;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes11.dex */
public final class V6T extends AbstractRunnableC14200nk {
    public final /* synthetic */ C69550VrE A00;
    public final /* synthetic */ C66053Tyq A01;
    public final /* synthetic */ C67850UzV A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V6T(C69550VrE c69550VrE, C66053Tyq c66053Tyq, C67850UzV c67850UzV) {
        super(1132146482, 2, false, true);
        this.A01 = c66053Tyq;
        this.A02 = c67850UzV;
        this.A00 = c69550VrE;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ReentrantReadWriteLock reentrantReadWriteLock;
        C66053Tyq c66053Tyq = this.A01;
        C67850UzV c67850UzV = this.A02;
        List list = c67850UzV.A01;
        List list2 = c67850UzV.A00;
        try {
            reentrantReadWriteLock = c66053Tyq.A07.A00;
        } catch (InterruptedException e) {
            C0K8.A0F(C66053Tyq.A0B, "Unable to acquire lock for executing this block.", e);
        }
        if (AbstractC65702TsY.A1b(reentrantReadWriteLock)) {
            try {
                C66053Tyq.A01(ImmutableList.copyOf((Collection) list), c66053Tyq);
                c66053Tyq.A00 = ImmutableList.copyOf((Collection) list2);
                C66054Tyr c66054Tyr = c66053Tyq.A03;
                c66054Tyr.A00.A00();
                try {
                    C11T.A05("This operation can't be run on UI thread.");
                    InterfaceC19610xo ARD = c66054Tyr.A01.ARD();
                    ARD.AHW();
                    ARD.E7G("last_sync_timestamp_sec", AbstractC31177DnL.A06());
                    Iterator it = list.iterator();
                    int i = 0;
                    int i2 = 0;
                    while (it.hasNext()) {
                        ARD.E7K(AnonymousClass001.A0O("user:", i2), AbstractC225717y.A00((User) it.next()));
                        i2++;
                    }
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        ARD.E7K(AnonymousClass001.A0O("thread:", i), AbstractC121365ec.A00((C121375ed) it2.next()));
                        i++;
                    }
                    ARD.apply();
                } catch (Throwable th) {
                    C0w9.A06("GenAICache", AbstractC111324zv.A00(1831), th);
                }
                AbstractC65702TsY.A1W(reentrantReadWriteLock);
                this.A00.A00();
                return;
            } catch (Throwable th2) {
                AbstractC65702TsY.A1W(reentrantReadWriteLock);
                throw th2;
            }
        }
        throw new InterruptedException("Failed to claim lock after 1 seconds");
    }
}
