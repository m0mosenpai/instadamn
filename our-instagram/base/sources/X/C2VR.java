package X;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.2VR, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2VR {
    public static final C2VR A05 = new C2VR();
    public AbstractC460029k A01;
    public Boolean A02;
    public volatile Map A04 = new HashMap();
    public final C2VS A03 = new Object() { // from class: X.2VS
        public final ConcurrentLinkedQueue A00 = new ConcurrentLinkedQueue();
    };
    public int A00 = 0;

    public static void A00(C2VR c2vr) {
        LinkedList linkedList;
        synchronized (c2vr) {
            linkedList = null;
            for (java.util.Set<InterfaceC53292cD> set : c2vr.A04.values()) {
                for (InterfaceC53292cD interfaceC53292cD : set) {
                    if (linkedList == null) {
                        linkedList = new LinkedList();
                    }
                    linkedList.add(interfaceC53292cD);
                }
                set.clear();
            }
            c2vr.A04.clear();
            c2vr.A00 = 0;
        }
        if (linkedList != null) {
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                InterfaceC53292cD interfaceC53292cD2 = (InterfaceC53292cD) it.next();
                try {
                    try {
                        interfaceC53292cD2.stop();
                        interfaceC53292cD2.release();
                    } catch (Throwable th) {
                        interfaceC53292cD2.release();
                        throw th;
                        break;
                    }
                } catch (Exception unused) {
                }
            }
            linkedList.clear();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00cf A[Catch: Exception -> 0x00d9, TryCatch #2 {Exception -> 0x00d9, blocks: (B:46:0x007a, B:48:0x008e, B:52:0x0098, B:53:0x00cb, B:55:0x00cf, B:56:0x00d1, B:61:0x00ac, B:62:0x00bf), top: B:45:0x007a, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC53292cD A01(X.AbstractC460029k r11, X.C2VQ r12, java.lang.Integer r13, final java.lang.String r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2VR.A01(X.29k, X.2VQ, java.lang.Integer, java.lang.String, boolean):X.2cD");
    }

    public final void A02(AbstractC460029k abstractC460029k, C2VQ c2vq, InterfaceC53292cD interfaceC53292cD, Integer num, String str, boolean z) {
        if (this.A01 == null) {
            this.A01 = abstractC460029k;
        }
        if (!z ? c2vq.A09 : c2vq.A0A) {
            if (!str.equals("meta.dav1d.av1.decoder") || !c2vq.A05) {
                synchronized (this) {
                    if (this.A00 < c2vq.A01) {
                        java.util.Set set = (java.util.Set) this.A04.get(str);
                        if (set == null) {
                            Boolean bool = this.A02;
                            if (bool != null && bool.booleanValue()) {
                                set = new CopyOnWriteArraySet();
                            } else {
                                set = new HashSet();
                            }
                            this.A04.put(str, set);
                        }
                        if (!set.contains(interfaceC53292cD)) {
                            if (z) {
                            }
                            if (set.size() < c2vq.A00) {
                                set.add(interfaceC53292cD);
                                this.A00++;
                            }
                        }
                        try {
                            SystemClock.elapsedRealtime();
                            interfaceC53292cD.reset();
                            AbstractC460029k abstractC460029k2 = this.A01;
                            if (abstractC460029k2 == null) {
                                abstractC460029k2 = XXh.A00;
                            }
                            abstractC460029k2.A02(interfaceC53292cD.hashCode(), num);
                            return;
                        } catch (IllegalStateException unused) {
                            java.util.Set set2 = (java.util.Set) this.A04.get(str);
                            if (set2 != null && set2.remove(interfaceC53292cD)) {
                                this.A00--;
                            }
                        }
                    }
                }
            }
        }
        try {
            interfaceC53292cD.stop();
        } finally {
            AbstractC460029k abstractC460029k3 = this.A01;
            if (abstractC460029k3 == null) {
                abstractC460029k3 = XXh.A00;
            }
            abstractC460029k3.A01(interfaceC53292cD.hashCode(), num);
            interfaceC53292cD.release();
            AbstractC460029k abstractC460029k4 = this.A01;
            if (abstractC460029k4 == null) {
                abstractC460029k4 = XXh.A00;
            }
            abstractC460029k4.A00(interfaceC53292cD.hashCode(), num);
        }
    }
}
