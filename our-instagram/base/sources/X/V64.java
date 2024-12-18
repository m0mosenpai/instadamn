package X;

import com.instagram.user.model.User;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

/* loaded from: classes11.dex */
public final class V64 extends AbstractRunnableC14200nk {
    public final /* synthetic */ C66053Tyq A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V64(C66053Tyq c66053Tyq) {
        super(1132146482, 2, false, true);
        this.A00 = c66053Tyq;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Lock writeLock;
        Object obj;
        try {
            C66053Tyq c66053Tyq = this.A00;
            C121125e6 c121125e6 = c66053Tyq.A07;
            if (c121125e6.A01) {
                writeLock = c121125e6.A00.readLock();
            } else {
                writeLock = c121125e6.A00.writeLock();
            }
            if (writeLock.tryLock(1L, TimeUnit.SECONDS)) {
                try {
                    Iterator<E> it = c66053Tyq.A03.A01().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((User) obj).A1U()) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    User user = (User) obj;
                    if (user != null) {
                        c66053Tyq.A04 = C66053Tyq.A00(user);
                    }
                    writeLock.unlock();
                } catch (Throwable th) {
                    writeLock.unlock();
                    throw th;
                }
            }
        } catch (IOException e) {
            C0w9.A06(C66053Tyq.A0B, "Error while deserializing user", e);
        } catch (InterruptedException e2) {
            C0K8.A0F(C66053Tyq.A0B, "Unable to acquire lock for executing this block.", e2);
        }
    }
}
