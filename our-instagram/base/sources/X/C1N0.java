package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/* renamed from: X.1N0, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1N0 {
    public final Handler A01;
    public final Map A05 = new HashMap();
    public final Map A03 = new HashMap();
    public final Map A04 = new HashMap();
    public final List A00 = new ArrayList();
    public final C1N2 A02 = new C1N2();

    public static synchronized void A00(C1N0 c1n0, InterfaceC41501vz interfaceC41501vz, Class cls, boolean z) {
        synchronized (c1n0) {
            Map map = c1n0.A05;
            java.util.Set set = (java.util.Set) map.get(cls);
            if (set != null) {
                synchronized (set) {
                    try {
                        set.remove(interfaceC41501vz);
                        if (set.isEmpty()) {
                            map.remove(cls);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            Pair pair = new Pair(cls, interfaceC41501vz);
            Object remove = c1n0.A04.remove(pair);
            if (z && remove != null) {
                Map map2 = c1n0.A03;
                java.util.Set set2 = (java.util.Set) map2.get(remove);
                if (set2 != null) {
                    synchronized (set2) {
                        try {
                            set2.remove(pair);
                            if (set2.isEmpty()) {
                                map2.remove(remove);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
        }
    }

    public final synchronized void A02(InterfaceC41501vz interfaceC41501vz, Class cls) {
        Map map = this.A05;
        java.util.Set set = (java.util.Set) map.get(cls);
        if (set == null) {
            set = new HashSet();
            map.put(cls, set);
        }
        synchronized (set) {
            set.add(interfaceC41501vz);
        }
    }

    public final synchronized void A03(InterfaceC41501vz interfaceC41501vz, Class cls, Object obj) {
        Pair pair = new Pair(cls, interfaceC41501vz);
        Map map = this.A03;
        java.util.Set set = (java.util.Set) map.get(obj);
        if (set == null) {
            set = new HashSet();
            map.put(obj, set);
        }
        synchronized (set) {
            try {
                set.add(pair);
            } catch (Throwable th) {
                throw th;
            }
        }
        Map map2 = this.A04;
        Object obj2 = map2.get(pair);
        if (obj2 != null) {
            if (obj2 != obj) {
                throw new IllegalStateException("Attempting to overwrite group token for existing listener");
            }
        } else {
            map2.put(pair, obj);
        }
        A02(interfaceC41501vz, cls);
    }

    public final synchronized void A05(Object obj) {
        Map map = this.A03;
        java.util.Set<Pair> set = (java.util.Set) map.get(obj);
        if (set != null) {
            synchronized (set) {
                for (Pair pair : set) {
                    A00(this, (InterfaceC41501vz) pair.second, (Class) pair.first, false);
                }
                set.clear();
            }
            map.remove(obj);
        }
    }

    public static boolean A01(C1N0 c1n0, Object obj) {
        java.util.Set set;
        C1N2 c1n2;
        ArrayList arrayList;
        C13080lu A00 = AbstractC13090lv.A00("BaseIgEventBus.dispatchEvent");
        boolean z = false;
        try {
            synchronized (c1n0) {
                try {
                    set = (java.util.Set) c1n0.A05.get(obj.getClass());
                } finally {
                }
            }
            if (set != null && !set.isEmpty()) {
                synchronized (set) {
                    try {
                        c1n2 = c1n0.A02;
                        synchronized (c1n2) {
                            if (set.size() > 8) {
                                arrayList = new ArrayList(set);
                            } else {
                                Queue queue = c1n2.A00;
                                if (queue.isEmpty()) {
                                    arrayList = new ArrayList(8);
                                } else {
                                    arrayList = (ArrayList) queue.remove();
                                }
                                if (arrayList.isEmpty()) {
                                    arrayList.addAll(set);
                                } else {
                                    throw new IllegalStateException("recycled list has entries");
                                }
                            }
                        }
                    } finally {
                    }
                }
                try {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        InterfaceC41501vz interfaceC41501vz = (InterfaceC41501vz) it.next();
                        synchronized (set) {
                            if (set.contains(interfaceC41501vz)) {
                                if (!(interfaceC41501vz instanceof InterfaceC42271xH) || ((InterfaceC42271xH) interfaceC41501vz).A79(obj)) {
                                    interfaceC41501vz.onEvent(obj);
                                    z = true;
                                }
                            }
                        }
                    }
                    c1n2.A00(arrayList);
                } catch (Throwable th) {
                    c1n2.A00(arrayList);
                    throw th;
                }
            }
            A00.close();
            return z;
        } catch (Throwable th2) {
            try {
                A00.close();
                throw th2;
            } catch (Throwable th3) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                throw th2;
            }
        }
    }

    public final void A04(Object obj) {
        List list = this.A00;
        synchronized (list) {
            list.add(obj);
            Handler handler = this.A01;
            if (!handler.hasMessages(1)) {
                handler.sendEmptyMessage(1);
            }
        }
    }

    public C1N0(final Looper looper) {
        this.A01 = new Handler(looper) { // from class: X.1N1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                ArrayList arrayList;
                if (message.what != 1) {
                    super.handleMessage(message);
                    return;
                }
                C1N0 c1n0 = this;
                List list = c1n0.A00;
                synchronized (list) {
                    arrayList = new ArrayList(list.size());
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(it.next());
                    }
                    list.clear();
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    C1N0.A01(c1n0, it2.next());
                }
            }
        };
    }
}
