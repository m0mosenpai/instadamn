package X;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.locks.Lock;

/* loaded from: classes10.dex */
public abstract class TLJ implements Runnable {
    public final /* synthetic */ T5W A00;

    public /* synthetic */ TLJ(T5W t5w) {
        this.A00 = t5w;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        java.util.Set A0k;
        T5W t5w = this.A00;
        Lock lock = t5w.A0G;
        lock.lock();
        try {
            try {
                if (!Thread.interrupted()) {
                    if (this instanceof C60660RGo) {
                        C60660RGo c60660RGo = (C60660RGo) this;
                        T5W t5w2 = c60660RGo.A01;
                        C64225T5a c64225T5a = t5w2.A0D;
                        C60650RGb c60650RGb = c64225T5a.A05;
                        C1340363l c1340363l = t5w2.A0E;
                        if (c1340363l == null) {
                            A0k = Collections.emptySet();
                        } else {
                            A0k = AbstractC31171DnF.A0k(c1340363l.A05);
                            Map map = c1340363l.A04;
                            Iterator A12 = AbstractC43593JPy.A12(map);
                            while (A12.hasNext()) {
                                C61W c61w = (C61W) A12.next();
                                if (!c64225T5a.A0A.containsKey(c61w.A01)) {
                                    map.get(c61w);
                                    throw AbstractC166987dD.A15("zaa");
                                }
                            }
                        }
                        c60650RGb.A03 = A0k;
                        ArrayList arrayList = c60660RGo.A00;
                        int size = arrayList.size();
                        for (int i = 0; i < size; i++) {
                            ((InterfaceC1340663q) arrayList.get(i)).BmV(t5w2.A00, c60650RGb.A03);
                        }
                    } else {
                        C60659RGn c60659RGn = (C60659RGn) this;
                        T5W t5w3 = c60659RGn.A01;
                        C1336261r c1336261r = new C1336261r(t5w3.A0C);
                        ArrayList A1E = AbstractC166987dD.A1E();
                        ArrayList A1E2 = AbstractC166987dD.A1E();
                        Map map2 = c60659RGn.A00;
                        Iterator A122 = AbstractC43593JPy.A12(map2);
                        while (A122.hasNext()) {
                            Object next = A122.next();
                            if (!((C64227T5c) map2.get(next)).A00) {
                                A1E.add(next);
                            } else {
                                A1E2.add(next);
                            }
                        }
                        int i2 = 0;
                        int i3 = -1;
                        if (A1E.isEmpty()) {
                            int size2 = A1E2.size();
                            while (i2 < size2) {
                                i3 = c1336261r.A00(t5w3.A0B, (InterfaceC1340663q) A1E2.get(i2));
                                i2++;
                                if (i3 == 0) {
                                    if (t5w3.A03 && (obj = t5w3.A01) != null) {
                                        BaseGmsClient baseGmsClient = (BaseGmsClient) obj;
                                        baseGmsClient.AJQ(new C64226T5b(baseGmsClient));
                                    }
                                    Iterator A123 = AbstractC43593JPy.A12(map2);
                                    while (A123.hasNext()) {
                                        InterfaceC1340663q interfaceC1340663q = (InterfaceC1340663q) A123.next();
                                        C64A c64a = (C64A) map2.get(interfaceC1340663q);
                                        if (c1336261r.A00(t5w3.A0B, interfaceC1340663q) != 0) {
                                            AbstractC166997dE.A1H(t5w3.A0D.A06, new C60662RGq(t5w3, c64a), 1);
                                        } else {
                                            interfaceC1340663q.AJQ(c64a);
                                        }
                                    }
                                }
                            }
                            ConnectionResult connectionResult = new ConnectionResult(i3, null);
                            AbstractC166997dE.A1H(t5w3.A0D.A06, new C60663RGr(connectionResult, c60659RGn, t5w3), 1);
                        } else {
                            int size3 = A1E.size();
                            while (true) {
                                if (i2 >= size3) {
                                    if (i3 != 0) {
                                    }
                                } else {
                                    i3 = c1336261r.A00(t5w3.A0B, (InterfaceC1340663q) A1E.get(i2));
                                    i2++;
                                    if (i3 != 0) {
                                        break;
                                    }
                                }
                            }
                            ConnectionResult connectionResult2 = new ConnectionResult(i3, null);
                            AbstractC166997dE.A1H(t5w3.A0D.A06, new C60663RGr(connectionResult2, c60659RGn, t5w3), 1);
                        }
                    }
                }
            } catch (RuntimeException e) {
                AbstractC166997dE.A1H(t5w.A0D.A06, e, 2);
            }
        } finally {
            lock.unlock();
        }
    }
}
