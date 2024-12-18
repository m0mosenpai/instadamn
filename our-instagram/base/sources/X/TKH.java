package X;

import com.facebook.mqtt.service.XplatServiceDelegate;
import java.util.LinkedList;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes10.dex */
public final class TKH implements Runnable {
    public final /* synthetic */ XplatServiceDelegate A00;

    public TKH(XplatServiceDelegate xplatServiceDelegate) {
        this.A00 = xplatServiceDelegate;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (XplatServiceDelegate.A07 == null) {
            C0K8.A0C("MqttXplatService", "Service have been destroyed!");
            return;
        }
        C14360o3.A0B(C05F.A00, 0);
        C4MW c4mw = XplatServiceDelegate.A02;
        try {
            ReentrantReadWriteLock reentrantReadWriteLock = c4mw.A04;
            reentrantReadWriteLock.writeLock().lock();
            c4mw.A01 = false;
            C0K8.A0D("MqttXplatPublisher", "Disabling publisher and flushing pending tasks");
            while (true) {
                LinkedList linkedList = c4mw.A03;
                if (!linkedList.isEmpty()) {
                    C64085Sz1 c64085Sz1 = (C64085Sz1) linkedList.poll();
                    if (c64085Sz1 != null && !c64085Sz1.A04.get() && c64085Sz1.A00.compareAndSet(true, false)) {
                        c64085Sz1.onFailure(0, 0);
                    }
                } else {
                    reentrantReadWriteLock.writeLock().unlock();
                    return;
                }
            }
        } catch (Throwable th) {
            c4mw.A04.writeLock().unlock();
            throw th;
        }
    }
}
