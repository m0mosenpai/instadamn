package X;

import java.lang.ref.ReferenceQueue;
import java.util.HashSet;
import java.util.concurrent.ExecutorService;

/* renamed from: X.2RE, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2RE {
    public final ExecutorService A04;
    public final ReferenceQueue A02 = new ReferenceQueue();
    public boolean A00 = false;
    public final HashSet A03 = new HashSet();
    public final Runnable A01 = new Runnable() { // from class: X.2RF
        @Override // java.lang.Runnable
        public final void run() {
            C61192qh c61192qh;
            while (true) {
                C2RE c2re = C2RE.this;
                try {
                    c61192qh = (C61192qh) c2re.A02.remove();
                    try {
                        try {
                            c61192qh.A00.run();
                            c61192qh.clear();
                            HashSet hashSet = c2re.A03;
                            synchronized (hashSet) {
                                hashSet.remove(c61192qh);
                            }
                        } catch (Throwable th) {
                            if (c61192qh != null) {
                                c61192qh.clear();
                                HashSet hashSet2 = c2re.A03;
                                synchronized (hashSet2) {
                                    hashSet2.remove(c61192qh);
                                    throw th;
                                }
                            }
                            throw th;
                        }
                    } catch (InterruptedException e) {
                        e = e;
                        C0K8.A0F("GarbageCollectionNotifier", "Reference queue exception!", e);
                        if (c61192qh != null) {
                            c61192qh.clear();
                            HashSet hashSet3 = c2re.A03;
                            synchronized (hashSet3) {
                                hashSet3.remove(c61192qh);
                            }
                        } else {
                            continue;
                        }
                    }
                } catch (InterruptedException e2) {
                    e = e2;
                    c61192qh = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    };

    public C2RE(ExecutorService executorService) {
        this.A04 = executorService;
    }
}
