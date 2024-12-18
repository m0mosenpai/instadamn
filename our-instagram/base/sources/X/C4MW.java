package X;

import android.os.Handler;
import com.facebook.mqtt.service.MqttPublishListener;
import com.facebook.proxygen.LigerSamplePolicy;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.4MW, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4MW {
    public static final AtomicInteger A05 = new AtomicInteger(0);
    public C20H A00;
    public boolean A01;
    public final AnonymousClass209 A02;
    public final LinkedList A03;
    public final ReentrantReadWriteLock A04;

    public C4MW(AnonymousClass209 anonymousClass209) {
        C14360o3.A0B(anonymousClass209, 1);
        this.A02 = anonymousClass209;
        this.A04 = new ReentrantReadWriteLock();
        this.A03 = new LinkedList();
        this.A01 = true;
    }

    public final int A00(MqttPublishListener mqttPublishListener, C4QA c4qa, String str, String str2, byte[] bArr) {
        C64085Sz1 c64085Sz1;
        try {
            ReentrantReadWriteLock reentrantReadWriteLock = this.A04;
            reentrantReadWriteLock.readLock().lock();
            int i = -1;
            if (!this.A01) {
                C0K8.A0D("MqttXplatPublisher", AnonymousClass001.A0R("Publisher is disabled for msg to ", str));
            } else if (str2 != null && !str2.equals(null)) {
                C0K8.A0D("MqttXplatPublisher", AnonymousClass001.A0u("The target user id ", str2, " doesn't match the client's user id ", null));
            } else {
                C20H c20h = this.A00;
                if (c20h == null) {
                    reentrantReadWriteLock.readLock().unlock();
                    reentrantReadWriteLock.writeLock().lock();
                    try {
                        C20H c20h2 = this.A00;
                        if (c20h2 == null) {
                            c64085Sz1 = new C64085Sz1(mqttPublishListener, this, c4qa, str, bArr, A05.incrementAndGet());
                            LinkedList linkedList = this.A03;
                            if (linkedList.size() >= 100) {
                                linkedList.poll();
                            }
                            linkedList.offer(c64085Sz1);
                            c64085Sz1.A00.set(true);
                            AnonymousClass209 anonymousClass209 = this.A02;
                            TNZ tnz = new TNZ(c64085Sz1, this);
                            anonymousClass209.A03.incrementAndGet();
                            final C9F8 c9f8 = new C9F8(7, tnz, anonymousClass209);
                            Handler A00 = anonymousClass209.A00();
                            if (A00 != null) {
                                A00.postDelayed(new Runnable() { // from class: X.ApS
                                    @Override // java.lang.Runnable
                                    public final /* synthetic */ void run() {
                                        InterfaceC16820sZ.this.invoke();
                                    }
                                }, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
                            }
                        } else {
                            c64085Sz1 = new C64085Sz1(null, this, c4qa, str, bArr, c20h2.publish(str, bArr, c4qa, mqttPublishListener));
                        }
                        reentrantReadWriteLock.writeLock().unlock();
                        reentrantReadWriteLock.readLock().lock();
                        i = c64085Sz1.A01;
                    } catch (Throwable th) {
                        reentrantReadWriteLock.writeLock().unlock();
                        throw th;
                    }
                } else {
                    i = c20h.publish(str, bArr, c4qa, mqttPublishListener);
                }
            }
            reentrantReadWriteLock.readLock().unlock();
            return i;
        } catch (Throwable th2) {
            this.A04.readLock().unlock();
            throw th2;
        }
    }

    public final void A02(C20H c20h) {
        try {
            ReentrantReadWriteLock reentrantReadWriteLock = this.A04;
            reentrantReadWriteLock.writeLock().lock();
            this.A00 = c20h;
            while (true) {
                LinkedList linkedList = this.A03;
                if (!linkedList.isEmpty()) {
                    C64085Sz1 c64085Sz1 = (C64085Sz1) linkedList.poll();
                    if (c64085Sz1 != null && !c64085Sz1.A04.get() && c64085Sz1.A00.compareAndSet(true, false) && c20h.publish(c64085Sz1.A03, c64085Sz1.A05, c64085Sz1.A02, c64085Sz1) == -1) {
                        c64085Sz1.onFailure(0, 0);
                    }
                } else {
                    reentrantReadWriteLock.writeLock().unlock();
                    return;
                }
            }
        } catch (Throwable th) {
            this.A04.writeLock().unlock();
            throw th;
        }
    }

    public final void A01() {
        try {
            ReentrantReadWriteLock reentrantReadWriteLock = this.A04;
            reentrantReadWriteLock.writeLock().lock();
            this.A00 = null;
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th) {
            this.A04.writeLock().unlock();
            throw th;
        }
    }

    public final boolean A03(int i) {
        boolean z;
        try {
            ReentrantReadWriteLock reentrantReadWriteLock = this.A04;
            reentrantReadWriteLock.readLock().lock();
            C20H c20h = this.A00;
            if (c20h != null) {
                z = c20h.cancelPublish(i);
            } else {
                z = false;
            }
            reentrantReadWriteLock.readLock().unlock();
            return z;
        } catch (Throwable th) {
            this.A04.readLock().unlock();
            throw th;
        }
    }
}
