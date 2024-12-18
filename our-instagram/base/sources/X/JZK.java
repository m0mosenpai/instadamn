package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes8.dex */
public final class JZK {
    public static JZK A09;
    public static final JZJ A0A = new Object();
    public long A00;
    public LJd A01;
    public String A02;
    public final C46877KoK A08;
    public final ConcurrentLinkedQueue A06 = new ConcurrentLinkedQueue();
    public final ConcurrentLinkedQueue A05 = new ConcurrentLinkedQueue();
    public final ConcurrentLinkedQueue A04 = new ConcurrentLinkedQueue();
    public final java.util.Set A03 = Collections.newSetFromMap(new ConcurrentHashMap());
    public final AtomicBoolean A07 = AbstractC166997dE.A17();

    public static final void A00(JZK jzk) {
        C45126Jxv c45126Jxv;
        jzk.A01 = null;
        ConcurrentLinkedQueue concurrentLinkedQueue = jzk.A05;
        if (concurrentLinkedQueue.isEmpty() && jzk.A06.isEmpty() && jzk.A04.isEmpty()) {
            jzk.A07.set(false);
        }
        ConcurrentLinkedQueue concurrentLinkedQueue2 = jzk.A04;
        if (AbstractC25226BEj.A1b(concurrentLinkedQueue2)) {
            Iterator A13 = AbstractC166997dE.A13(concurrentLinkedQueue2);
            while (A13.hasNext()) {
                C45126Jxv c45126Jxv2 = (C45126Jxv) A13.next();
                String str = c45126Jxv2.A01;
                if (C14360o3.A0K(str, jzk.A02)) {
                    concurrentLinkedQueue2.remove(c45126Jxv2);
                    break;
                } else if (!jzk.A03.contains(str)) {
                    concurrentLinkedQueue2.remove(c45126Jxv2);
                    jzk.A01(str, c45126Jxv2.A02, c45126Jxv2.A03, (HashMap) c45126Jxv2.A00);
                    return;
                }
            }
        }
        if (AbstractC25226BEj.A1b(concurrentLinkedQueue) && (c45126Jxv = (C45126Jxv) concurrentLinkedQueue.poll()) != null) {
            String str2 = c45126Jxv.A01;
            if (!C14360o3.A0K(str2, jzk.A02)) {
                if (!jzk.A03.contains(str2)) {
                    jzk.A01(str2, c45126Jxv.A02, c45126Jxv.A03, (HashMap) c45126Jxv.A00);
                    return;
                }
            }
            A00(jzk);
        }
        ConcurrentLinkedQueue concurrentLinkedQueue3 = jzk.A06;
        if (!AbstractC25226BEj.A1b(concurrentLinkedQueue3)) {
            return;
        }
        c45126Jxv = (C45126Jxv) concurrentLinkedQueue3.poll();
        if (c45126Jxv != null) {
            String str3 = c45126Jxv.A01;
            if (!C14360o3.A0K(str3, jzk.A02)) {
                if (!jzk.A03.contains(str3)) {
                    jzk.A01(str3, c45126Jxv.A02, c45126Jxv.A03, null);
                    return;
                }
            }
        }
        A00(jzk);
        return;
        if (!A03(jzk, c45126Jxv.A01, concurrentLinkedQueue2)) {
            concurrentLinkedQueue2.add(c45126Jxv);
        }
        A00(jzk);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0Jk, java.lang.Object] */
    private final void A01(String str, String str2, String str3, HashMap hashMap) {
        C57258Pbg c57258Pbg = new C57258Pbg(str, this, 2);
        C30228DTh c30228DTh = new C30228DTh(this, hashMap, str, str2, str3, 0);
        C14360o3.A0B(str, 0);
        if (!C023409i.A0A.A0A(new Object(), null, new C49586Lvf(c30228DTh, 0), str)) {
            c57258Pbg.invoke();
        }
    }

    public static final synchronized boolean A03(JZK jzk, String str, ConcurrentLinkedQueue concurrentLinkedQueue) {
        boolean z;
        synchronized (jzk) {
            z = true;
            if (!concurrentLinkedQueue.isEmpty()) {
                Iterator A13 = AbstractC166997dE.A13(concurrentLinkedQueue);
                while (A13.hasNext()) {
                    if (C14360o3.A0K(str, ((C45126Jxv) A13.next()).A01)) {
                        break;
                    }
                }
            }
            z = false;
        }
        return z;
    }

    public final void A04(String str) {
        C14360o3.A0B(str, 0);
        if (!C14360o3.A0K(this.A02, str)) {
            this.A02 = str;
            A02(str, this.A05);
            A02(str, this.A06);
            A02(str, this.A04);
            LJd lJd = this.A01;
            if (lJd != null && C14360o3.A0K(lJd.A0D, str) && lJd.A05 != null) {
                CountDownLatch countDownLatch = new CountDownLatch(1);
                LJd.A01(lJd, new RunnableC49921M2o(lJd, countDownLatch), "SwitchAccount");
                try {
                    countDownLatch.await(AbstractC166987dD.A0N(AbstractC47132Ef.A00(lJd.A0C.A01).A0v.A00()), TimeUnit.MILLISECONDS);
                } catch (InterruptedException unused) {
                    C0K8.A0E("MultiInstanceSingleBackgroundAccountSyncHandler", "Interrupted while tearing down background account instance on account switch");
                }
            }
        }
    }

    public final void A05(String str) {
        C14360o3.A0B(str, 0);
        this.A03.remove(str);
        if (this.A01 == null && AbstractC25226BEj.A1b(this.A04)) {
            A00(this);
        }
    }

    public JZK(C46877KoK c46877KoK) {
        this.A08 = c46877KoK;
    }

    public static final void A02(String str, ConcurrentLinkedQueue concurrentLinkedQueue) {
        Iterator A13 = AbstractC166997dE.A13(concurrentLinkedQueue);
        while (A13.hasNext()) {
            C45126Jxv c45126Jxv = (C45126Jxv) A13.next();
            if (str.equals(c45126Jxv.A01)) {
                concurrentLinkedQueue.remove(c45126Jxv);
            }
        }
    }
}
