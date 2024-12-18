package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.1wo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C41981wo implements InterfaceC13000lm {
    public Map A00;
    public boolean A01;
    public AbstractC12990ll A02;
    public final C42201xA A03;
    public final Lock A04;
    public final Lock A05;
    public final InterfaceC42271xH A06;
    public final java.util.Set A07;
    public final ReentrantReadWriteLock A08;

    public static synchronized void A01(C41981wo c41981wo, String str) {
        synchronized (c41981wo) {
            Iterator it = c41981wo.A07.iterator();
            if (it.hasNext()) {
                it.next();
                C14360o3.A0B(str, 1);
                throw new NullPointerException("onPresenceChanged");
            }
        }
    }

    public static C41981wo A00(final AbstractC12990ll abstractC12990ll) {
        return (C41981wo) abstractC12990ll.A01(C41981wo.class, new InterfaceC16820sZ() { // from class: X.1wq
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return new C41981wo(AbstractC12990ll.this);
            }
        });
    }

    public final void A02(C42321xM c42321xM) {
        Lock lock = this.A05;
        lock.lock();
        try {
            if (this.A01) {
                return;
            }
            Map map = this.A00;
            String str = c42321xM.A04;
            map.put(str, c42321xM);
            this.A03.accept(new HashMap(this.A00));
            lock.unlock();
            A01(this, str);
        } finally {
            lock.unlock();
        }
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        Lock lock = this.A05;
        lock.lock();
        try {
            this.A00.clear();
            this.A03.accept(Collections.emptyMap());
            this.A01 = true;
            lock.unlock();
            AbstractC25651Mw.A00(this.A02).A02(this.A06, C42281xI.class);
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    public C41981wo(AbstractC12990ll abstractC12990ll) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.A08 = reentrantReadWriteLock;
        this.A04 = reentrantReadWriteLock.readLock();
        this.A05 = reentrantReadWriteLock.writeLock();
        this.A00 = new HashMap();
        this.A03 = AbstractC42021ws.A01(Collections.emptyMap());
        this.A07 = new HashSet();
        InterfaceC42271xH interfaceC42271xH = new InterfaceC42271xH() { // from class: X.1xF
            @Override // X.InterfaceC42271xH
            public final /* bridge */ /* synthetic */ boolean A79(Object obj) {
                return ((C42281xI) obj).A00.CYY();
            }

            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(1480629420);
                int A032 = C0f9.A03(-2070443671);
                C41981wo c41981wo = C41981wo.this;
                String id = ((C42281xI) obj).A00.getId();
                Lock lock = c41981wo.A05;
                lock.lock();
                try {
                    if (!c41981wo.A01) {
                        c41981wo.A00.remove(id);
                        c41981wo.A03.accept(new HashMap(c41981wo.A00));
                        lock.unlock();
                        C41981wo.A01(c41981wo, id);
                    }
                    C0f9.A0A(-1888255223, A032);
                    C0f9.A0A(-1823150316, A03);
                } finally {
                    lock.unlock();
                }
            }
        };
        this.A06 = interfaceC42271xH;
        this.A02 = abstractC12990ll;
        AbstractC25651Mw.A00(abstractC12990ll).A01(interfaceC42271xH, C42281xI.class);
    }
}
