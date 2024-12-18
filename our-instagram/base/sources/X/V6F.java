package X;

import com.instagram.direct.model.thread.CreatorBroadcastThreadInfo;
import com.instagram.direct.model.thread.DiscoverableThreadInfo;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes11.dex */
public final class V6F extends AbstractRunnableC14200nk {
    public final /* synthetic */ C5e8 A00;
    public final /* synthetic */ String A01;

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        try {
            C5e8 c5e8 = this.A00;
            C121125e6 c121125e6 = c5e8.A02;
            ReentrantReadWriteLock reentrantReadWriteLock = c121125e6.A00;
            if (AbstractC65702TsY.A1b(reentrantReadWriteLock)) {
                try {
                    c121125e6.A00();
                    Iterator A16 = AbstractC166997dE.A16(c5e8.A08);
                    while (A16.hasNext()) {
                        C121375ed c121375ed = (C121375ed) A16.next();
                        if (c121375ed != null) {
                            CreatorBroadcastThreadInfo creatorBroadcastThreadInfo = c121375ed.A03;
                            if (creatorBroadcastThreadInfo != null && creatorBroadcastThreadInfo.A03 != null) {
                                C14360o3.A0A(creatorBroadcastThreadInfo);
                                if (C14360o3.A0K(creatorBroadcastThreadInfo.A03, this.A01)) {
                                    c121375ed.A0D = true;
                                }
                            }
                            DiscoverableThreadInfo discoverableThreadInfo = c121375ed.A05;
                            if (discoverableThreadInfo != null && (str = discoverableThreadInfo.A01) != null && str.equals(this.A01)) {
                                c121375ed.A0D = true;
                            }
                        }
                    }
                    C5e8.A00(c5e8, null);
                    AbstractC65702TsY.A1W(reentrantReadWriteLock);
                } catch (Throwable th) {
                    AbstractC65702TsY.A1W(reentrantReadWriteLock);
                    throw th;
                }
            }
        } catch (InterruptedException e) {
            C0K8.A0F("BanyanCache", "Unable to acquire lock for executing this block.", e);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V6F(C5e8 c5e8, String str) {
        super(1424841959, 3, false, false);
        this.A00 = c5e8;
        this.A01 = str;
    }
}
