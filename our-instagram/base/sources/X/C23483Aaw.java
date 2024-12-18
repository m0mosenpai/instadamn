package X;

import android.util.Pair;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.Aaw, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23483Aaw implements InterfaceC65564Tmq {
    public C93744Je A00;
    public boolean A01;
    public final C4N8 A02;
    public final ReentrantLock A03;

    @Override // X.InterfaceC65564Tmq
    public final String Ao1() {
        return "device_auth";
    }

    @Override // X.InterfaceC65564Tmq
    public final synchronized C93744Je BKl() {
        C93744Je c93744Je;
        try {
            ReentrantLock reentrantLock = this.A03;
            reentrantLock.lock();
            c93744Je = this.A00;
            reentrantLock.unlock();
        } catch (Throwable th) {
            this.A03.unlock();
            throw th;
        }
        return c93744Je;
    }

    @Override // X.InterfaceC65564Tmq
    public final synchronized boolean FA5(C93744Je c93744Je) {
        boolean z;
        ReentrantLock reentrantLock = this.A03;
        reentrantLock.lock();
        if (this.A00.equals(c93744Je)) {
            reentrantLock.unlock();
            z = false;
        } else {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            A81 a81 = new A81(c93744Je, this, countDownLatch);
            C91M ARA = this.A02.ARA();
            ARA.E7I("/settings/mqtt/id/connection_key", (String) ((Pair) c93744Je).first);
            ARA.E7I("/settings/mqtt/id/connection_secret", (String) ((Pair) c93744Je).second);
            ARA.AIa(a81);
            try {
                countDownLatch.await(5L, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                C0K8.A0F("MqttDeviceAuthCredentials", "Interrupted while waiting for latch", e);
            }
            try {
                z = this.A01;
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        return z;
    }

    @Override // X.InterfaceC65564Tmq
    public final synchronized void clear() {
        FA5(C93744Je.A00);
    }

    public C23483Aaw(C4N8 c4n8) {
        this.A00 = C93744Je.A00;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.A03 = reentrantLock;
        this.A01 = false;
        this.A02 = c4n8;
        reentrantLock.lock();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        C4N7 c4n7 = (C4N7) c4n8;
        this.A00 = C93744Je.A00(c4n7.getString("/settings/mqtt/id/connection_key", ""), c4n7.getString("/settings/mqtt/id/connection_secret", ""));
        countDownLatch.countDown();
        try {
            countDownLatch.await(5L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            C0K8.A0F("MqttDeviceAuthCredentials", "Interrupted while waiting for latch", e);
        }
        reentrantLock.unlock();
    }
}
