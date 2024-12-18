package X;

import com.instagram.direct.model.thread.CreatorBroadcastThreadInfo;
import com.instagram.direct.model.thread.DiscoverableThreadInfo;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes11.dex */
public final class V6G extends AbstractRunnableC14200nk {
    public final /* synthetic */ C5e8 A00;
    public final /* synthetic */ String A01;

    @Override // java.lang.Runnable
    public final void run() {
        try {
            C5e8 c5e8 = this.A00;
            C121125e6 c121125e6 = c5e8.A02;
            ReentrantReadWriteLock reentrantReadWriteLock = c121125e6.A00;
            if (AbstractC65702TsY.A1b(reentrantReadWriteLock)) {
                try {
                    c121125e6.A00();
                    Map map = c5e8.A08;
                    String str = this.A01;
                    C121375ed c121375ed = (C121375ed) map.get(str);
                    if (c121375ed != null) {
                        CreatorBroadcastThreadInfo creatorBroadcastThreadInfo = c121375ed.A03;
                        if (creatorBroadcastThreadInfo != null) {
                            creatorBroadcastThreadInfo.A07 = true;
                        } else {
                            DiscoverableThreadInfo discoverableThreadInfo = c121375ed.A05;
                            if (discoverableThreadInfo != null) {
                                discoverableThreadInfo.A03 = true;
                            }
                        }
                        map.put(str, c121375ed);
                        C5e8.A01(c5e8, c121375ed);
                        C5e8.A00(c5e8, null);
                    }
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
    public V6G(C5e8 c5e8, String str) {
        super(1929549509, 3, false, false);
        this.A00 = c5e8;
        this.A01 = str;
    }
}
