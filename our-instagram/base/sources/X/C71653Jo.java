package X;

import com.facebook.common.memory.leaklistener.core.KeyedWeakReference;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.proxygen.LigerSamplePolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* renamed from: X.3Jo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71653Jo {
    public C71643Jn A00;
    public ScheduledFuture A03;
    public final ScheduledExecutorService A05;
    public final Runnable A04 = new Runnable() { // from class: X.3Jp
        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList;
            C0K8.A03(C71653Jo.class, "Detecting leaks");
            Runtime.getRuntime().gc();
            try {
                Thread.sleep(100L);
            } catch (InterruptedException unused) {
            }
            Runtime.getRuntime().runFinalization();
            C71653Jo c71653Jo = C71653Jo.this;
            synchronized (c71653Jo) {
                WeakHashMap weakHashMap = c71653Jo.A02;
                if (weakHashMap.isEmpty()) {
                    c71653Jo.A03 = null;
                    return;
                }
                synchronized (c71653Jo) {
                    arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    long now = c71653Jo.A01.now();
                    for (Map.Entry entry : weakHashMap.entrySet()) {
                        Object key = entry.getKey();
                        KeyedWeakReference keyedWeakReference = (KeyedWeakReference) entry.getValue();
                        if (now - keyedWeakReference.mTimestamp > LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT && keyedWeakReference.mCanary.get() == null) {
                            key.toString();
                            arrayList.add(keyedWeakReference);
                            arrayList2.add(new WeakReference(key));
                        } else {
                            key.toString();
                        }
                    }
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        Object obj = ((WeakReference) it.next()).get();
                        if (obj != null) {
                            weakHashMap.remove(obj);
                        }
                    }
                }
                if (c71653Jo.A00 != null && !arrayList.isEmpty()) {
                    for (C3Tt c3Tt : C2S1.A00().A09()) {
                        if (c3Tt.isEnabled()) {
                            c3Tt.onLeaksDetected(arrayList);
                        }
                    }
                    synchronized (C2S1.A00()) {
                    }
                }
                synchronized (c71653Jo) {
                    c71653Jo.A03 = null;
                }
            }
        }
    };
    public WeakHashMap A02 = new WeakHashMap();
    public C0JO A01 = RealtimeSinceBootClock.A00;

    public static synchronized void A00(C71653Jo c71653Jo, Object obj, String str, Map map) {
        synchronized (c71653Jo) {
            WeakHashMap weakHashMap = c71653Jo.A02;
            if (weakHashMap.containsKey(obj)) {
                C0K8.A09(C71653Jo.class, "Already tracking %s ?", obj.toString());
            } else {
                obj.toString();
                weakHashMap.put(obj, new KeyedWeakReference(obj, c71653Jo.A01.now(), map, str));
            }
        }
    }

    public C71653Jo(C71643Jn c71643Jn, ScheduledExecutorService scheduledExecutorService) {
        this.A05 = scheduledExecutorService;
        this.A00 = c71643Jn;
    }
}
