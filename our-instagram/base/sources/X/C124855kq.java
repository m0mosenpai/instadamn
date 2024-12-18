package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.5kq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C124855kq implements InterfaceC19610xo {
    public final Object A00 = new Object();
    public final Map A01 = new HashMap();
    public final /* synthetic */ C1FE A02;

    @Override // X.InterfaceC19610xo
    public final boolean commit() {
        HashMap hashMap;
        java.util.Set keySet;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        C1FE c1fe = this.A02;
        Map map = C1FE.A09;
        synchronized (c1fe.A06) {
            synchronized (this.A00) {
                hashMap = new HashMap(this.A01);
            }
            A01(hashMap);
            HashMap hashMap2 = new HashMap(c1fe.A02);
            keySet = hashMap.keySet();
            c1fe.A04.schedule(new C23664Adz(this, hashMap2, countDownLatch, atomicBoolean));
        }
        try {
            if (!countDownLatch.await(5L, TimeUnit.SECONDS)) {
                C0w9.A03("EncryptedSharedPrefs_commit_timedOut", "Timed out waiting for commit to complete.");
                return false;
            }
            boolean z = atomicBoolean.get();
            if (z) {
                keySet.getClass();
                if (!keySet.isEmpty()) {
                    A00(this, keySet);
                }
            }
            return z;
        } catch (InterruptedException e) {
            C0w9.A07("EncryptedSharedPrefs_commit_interrupted", e);
            return false;
        }
    }

    public C124855kq(C1FE c1fe) {
        this.A02 = c1fe;
    }

    @Override // X.InterfaceC19610xo
    public final InterfaceC19610xo AHW() {
        synchronized (this.A00) {
            C1FE c1fe = this.A02;
            Map map = C1FE.A09;
            synchronized (c1fe.A06) {
                Iterator it = c1fe.A02.keySet().iterator();
                while (it.hasNext()) {
                    this.A01.put((String) it.next(), null);
                }
            }
        }
        return this;
    }

    @Override // X.InterfaceC19610xo
    public final InterfaceC19610xo E77(String str, boolean z) {
        synchronized (this.A00) {
            this.A01.put(str, Boolean.valueOf(z));
        }
        return this;
    }

    @Override // X.InterfaceC19610xo
    public final InterfaceC19610xo E7A(String str, float f) {
        synchronized (this.A00) {
            this.A01.put(str, Float.valueOf(f));
        }
        return this;
    }

    @Override // X.InterfaceC19610xo
    public final InterfaceC19610xo E7D(String str, int i) {
        synchronized (this.A00) {
            this.A01.put(str, Integer.valueOf(i));
        }
        return this;
    }

    @Override // X.InterfaceC19610xo
    public final InterfaceC19610xo E7G(String str, long j) {
        synchronized (this.A00) {
            this.A01.put(str, Long.valueOf(j));
        }
        return this;
    }

    @Override // X.InterfaceC19610xo
    public final InterfaceC19610xo E7K(String str, String str2) {
        synchronized (this.A00) {
            this.A01.put(str, str2);
        }
        return this;
    }

    @Override // X.InterfaceC19610xo
    public final InterfaceC19610xo E7L(String str, java.util.Set set) {
        synchronized (this.A00) {
            this.A01.put(str, set);
        }
        return this;
    }

    @Override // X.InterfaceC19610xo
    public final InterfaceC19610xo EEj(String str) {
        synchronized (this.A00) {
            this.A01.put(str, null);
        }
        return this;
    }

    @Override // X.InterfaceC19610xo
    public final void apply() {
        HashMap hashMap;
        C1FE c1fe = this.A02;
        Map map = C1FE.A09;
        synchronized (c1fe.A06) {
            synchronized (this.A00) {
                hashMap = new HashMap(this.A01);
            }
            A01(hashMap);
            final HashMap hashMap2 = new HashMap(c1fe.A02);
            final java.util.Set keySet = hashMap.keySet();
            c1fe.A04.schedule(new C2AG() { // from class: X.5kr
                @Override // X.C11R
                public final int getRunnableId() {
                    return 233;
                }

                @Override // java.util.concurrent.Callable
                public final /* bridge */ /* synthetic */ Object call() {
                    C1FE c1fe2 = C124855kq.this.A02;
                    Map map2 = C1FE.A09;
                    return Boolean.valueOf(c1fe2.A00.A00(c1fe2.A03, hashMap2));
                }

                @Override // X.C2AH
                public final void onFail(Exception exc) {
                    C0w9.A07("EncryptedSharedPrefs_apply_failed_write_to_disk", exc);
                }

                @Override // X.C2AH
                public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                    if (((Boolean) obj).booleanValue()) {
                        java.util.Set set = keySet;
                        set.getClass();
                        if (!set.isEmpty()) {
                            C124855kq.A00(C124855kq.this, set);
                        }
                    }
                }
            });
        }
    }

    public static void A00(C124855kq c124855kq, java.util.Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            C1FE c1fe = c124855kq.A02;
            Map map = C1FE.A09;
            Iterator it2 = c1fe.A07.iterator();
            while (it2.hasNext()) {
                ((InterfaceC19620xp) it2.next()).onChanged(c1fe, str);
            }
        }
    }

    private void A01(HashMap hashMap) {
        for (Map.Entry entry : hashMap.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            C1FE c1fe = this.A02;
            Map map = C1FE.A09;
            Map map2 = c1fe.A02;
            if (value == null) {
                map2.remove(key);
            } else {
                map2.put(key, value);
            }
        }
    }
}
