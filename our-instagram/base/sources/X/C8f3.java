package X;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.8f3, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8f3 {
    public Object A00;
    public List A01;
    public final InterfaceC192058f1 A02 = new Handler(AbstractC191958er.A01);
    public final AtomicInteger A03 = new AtomicInteger(0);

    public static void A00(C192088f9 c192088f9, C8f3 c8f3, Object obj) {
        List list = c8f3.A01;
        if (list == null) {
            list = new ArrayList();
            c8f3.A01 = list;
        }
        list.add(c192088f9);
        synchronized (c8f3) {
            Object obj2 = c8f3.A00;
            if (obj2 != null && obj2 != obj) {
                A01(c192088f9, obj2);
            }
        }
    }

    public static void A01(C192088f9 c192088f9, Object obj) {
        if (c192088f9 != null) {
            C1LV.A02("DataSynchronizer_sendAdditional");
            try {
                AbstractC192138fE abstractC192138fE = (AbstractC192138fE) obj;
                synchronized (c192088f9) {
                    InterfaceC192128fD interfaceC192128fD = c192088f9.A00;
                    if (interfaceC192128fD != null) {
                        interfaceC192128fD.Dgh(abstractC192138fE);
                    }
                }
            } finally {
                C1LV.A01();
            }
        }
    }

    public static void A02(C8f3 c8f3, Object obj, int i) {
        int i2 = c8f3.A03.get();
        synchronized (c8f3) {
            if (i2 != i) {
                return;
            }
            c8f3.A00 = obj;
            List list = c8f3.A01;
            if (list != null && !list.isEmpty()) {
                Iterator it = new ArrayList(c8f3.A01).iterator();
                while (it.hasNext()) {
                    A01((C192088f9) it.next(), obj);
                }
            }
        }
    }
}
