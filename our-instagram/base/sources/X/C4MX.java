package X;

import com.facebook.mqtt.service.MqttSubscribeListener;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.4MX, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4MX {
    public C20H A00;
    public final AnonymousClass209 A01;
    public final ReentrantReadWriteLock A02;

    public C4MX(AnonymousClass209 anonymousClass209) {
        C14360o3.A0B(anonymousClass209, 1);
        this.A01 = anonymousClass209;
        this.A02 = new ReentrantReadWriteLock();
    }

    public final void A00() {
        try {
            ReentrantReadWriteLock reentrantReadWriteLock = this.A02;
            reentrantReadWriteLock.writeLock().lock();
            this.A00 = null;
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th) {
            this.A02.writeLock().unlock();
            throw th;
        }
    }

    public final void A01(C20H c20h) {
        try {
            ReentrantReadWriteLock reentrantReadWriteLock = this.A02;
            reentrantReadWriteLock.writeLock().lock();
            this.A00 = c20h;
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th) {
            this.A02.writeLock().unlock();
            throw th;
        }
    }

    public final boolean A02(C51757Mtg c51757Mtg) {
        boolean subscribe;
        try {
            ReentrantReadWriteLock reentrantReadWriteLock = this.A02;
            reentrantReadWriteLock.readLock().lock();
            C20H c20h = this.A00;
            if (c20h == null) {
                subscribe = this.A01.A01(new PPS(c51757Mtg, this));
            } else {
                subscribe = c20h.subscribe(c51757Mtg.A02, (C4QA) c51757Mtg.A01, (MqttSubscribeListener) c51757Mtg.A00);
            }
            reentrantReadWriteLock.readLock().unlock();
            return subscribe;
        } catch (Throwable th) {
            this.A02.readLock().unlock();
            throw th;
        }
    }

    public final boolean A03(List list) {
        boolean z;
        try {
            ReentrantReadWriteLock reentrantReadWriteLock = this.A02;
            reentrantReadWriteLock.readLock().lock();
            C20H c20h = this.A00;
            if (c20h != null) {
                z = c20h.unsubscribe(list);
            } else {
                z = false;
            }
            reentrantReadWriteLock.readLock().unlock();
            return z;
        } catch (Throwable th) {
            this.A02.readLock().unlock();
            throw th;
        }
    }
}
