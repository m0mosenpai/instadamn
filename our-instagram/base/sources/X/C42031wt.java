package X;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.1wt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C42031wt extends AbstractC42041wu {
    public static final C42091wz[] A07 = new C42091wz[0];
    public static final C42091wz[] A08 = new C42091wz[0];
    public long A00;
    public final AtomicReference A01;
    public final AtomicReference A02;
    public final AtomicReference A03;
    public final Lock A04;
    public final Lock A05;
    public final ReadWriteLock A06;

    @Override // X.AbstractC42051wv
    public final void A02(InterfaceC42071wx interfaceC42071wx) {
        AtomicReference atomicReference;
        C42091wz[] c42091wzArr;
        C42091wz[] c42091wzArr2;
        C133045zT c133045zT;
        C42091wz c42091wz = new C42091wz(interfaceC42071wx, this);
        interfaceC42071wx.Dpc(c42091wz);
        do {
            atomicReference = this.A01;
            c42091wzArr = (C42091wz[]) atomicReference.get();
            if (c42091wzArr == A08) {
                Throwable th = (Throwable) this.A02.get();
                if (th == Y4X.A00) {
                    interfaceC42071wx.onComplete();
                    return;
                } else {
                    interfaceC42071wx.onError(th);
                    return;
                }
            }
            int length = c42091wzArr.length;
            c42091wzArr2 = new C42091wz[length + 1];
            System.arraycopy(c42091wzArr, 0, c42091wzArr2, 0, length);
            c42091wzArr2[length] = c42091wz;
        } while (!C1EM.A00(c42091wzArr, c42091wzArr2, atomicReference));
        if (c42091wz.A07) {
            A03(c42091wz);
            return;
        }
        if (c42091wz.A07) {
            return;
        }
        synchronized (c42091wz) {
            if (!c42091wz.A07 && !c42091wz.A04) {
                C42031wt c42031wt = c42091wz.A06;
                Lock lock = c42031wt.A04;
                lock.lock();
                c42091wz.A00 = c42031wt.A00;
                Object obj = c42031wt.A03.get();
                lock.unlock();
                boolean z = false;
                if (obj != null) {
                    z = true;
                }
                c42091wz.A02 = z;
                c42091wz.A04 = true;
                if (obj == null || c42091wz.test(obj)) {
                    return;
                }
                while (!c42091wz.A07) {
                    synchronized (c42091wz) {
                        c133045zT = c42091wz.A01;
                        if (c133045zT == null) {
                            c42091wz.A02 = false;
                            return;
                        }
                        c42091wz.A01 = null;
                    }
                    c133045zT.A00(c42091wz);
                }
            }
        }
    }

    public final void A03(C42091wz c42091wz) {
        AtomicReference atomicReference;
        C42091wz[] c42091wzArr;
        C42091wz[] c42091wzArr2;
        do {
            atomicReference = this.A01;
            c42091wzArr = (C42091wz[]) atomicReference.get();
            int length = c42091wzArr.length;
            if (length != 0) {
                int i = 0;
                while (c42091wzArr[i] != c42091wz) {
                    i++;
                    if (i >= length) {
                        return;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        c42091wzArr2 = A07;
                    } else {
                        c42091wzArr2 = new C42091wz[length - 1];
                        System.arraycopy(c42091wzArr, 0, c42091wzArr2, 0, i);
                        System.arraycopy(c42091wzArr, i + 1, c42091wzArr2, i, (length - i) - 1);
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (!C1EM.A00(c42091wzArr, c42091wzArr2, atomicReference));
    }

    @Override // X.InterfaceC42071wx
    public final void Dpc(InterfaceC41801wU interfaceC41801wU) {
        if (this.A02.get() != null) {
            interfaceC41801wU.dispose();
        }
    }

    @Override // X.InterfaceC42071wx
    public final void onComplete() {
        if (C1EM.A00(null, Y4X.A00, this.A02)) {
            EnumC42671xv enumC42671xv = EnumC42671xv.A01;
            AtomicReference atomicReference = this.A01;
            C42091wz[] c42091wzArr = A08;
            C42091wz[] c42091wzArr2 = (C42091wz[]) atomicReference.getAndSet(c42091wzArr);
            if (c42091wzArr2 != c42091wzArr) {
                Lock lock = this.A05;
                lock.lock();
                this.A00++;
                this.A03.lazySet(enumC42671xv);
                lock.unlock();
            }
            for (C42091wz c42091wz : c42091wzArr2) {
                c42091wz.A00(enumC42671xv, this.A00);
            }
        }
    }

    public C42031wt() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.A06 = reentrantReadWriteLock;
        this.A04 = reentrantReadWriteLock.readLock();
        this.A05 = reentrantReadWriteLock.writeLock();
        this.A01 = new AtomicReference(A07);
        this.A03 = new AtomicReference();
        this.A02 = new AtomicReference();
    }

    @Override // X.InterfaceC42071wx
    public final void DVo(Object obj) {
        AbstractC42141x4.A01(obj, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.A02.get() == null) {
            Lock lock = this.A05;
            lock.lock();
            this.A00++;
            this.A03.lazySet(obj);
            lock.unlock();
            for (C42091wz c42091wz : (C42091wz[]) this.A01.get()) {
                c42091wz.A00(obj, this.A00);
            }
        }
    }

    @Override // X.InterfaceC42071wx
    public final void onError(Throwable th) {
        AbstractC42141x4.A01(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!C1EM.A00(null, th, this.A02)) {
            AbstractC142886co.A02(th);
            return;
        }
        C42741y2 c42741y2 = new C42741y2(th);
        AtomicReference atomicReference = this.A01;
        C42091wz[] c42091wzArr = A08;
        C42091wz[] c42091wzArr2 = (C42091wz[]) atomicReference.getAndSet(c42091wzArr);
        if (c42091wzArr2 != c42091wzArr) {
            Lock lock = this.A05;
            lock.lock();
            this.A00++;
            this.A03.lazySet(c42741y2);
            lock.unlock();
        }
        for (C42091wz c42091wz : c42091wzArr2) {
            c42091wz.A00(c42741y2, this.A00);
        }
    }
}
