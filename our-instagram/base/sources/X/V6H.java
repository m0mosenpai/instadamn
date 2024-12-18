package X;

import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes11.dex */
public final class V6H extends AbstractRunnableC14200nk {
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
                    if (c121375ed != null && c121375ed.A0H) {
                        c121375ed.A0H = false;
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
    public V6H(C5e8 c5e8, String str) {
        super(1366711785, 3, false, false);
        this.A00 = c5e8;
        this.A01 = str;
    }
}
