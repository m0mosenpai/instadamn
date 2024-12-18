package X;

import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: X.8f2, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8f2 {
    public java.util.Set A00;
    public final AbstractC192018ex A01;
    public final InterfaceC192058f1 A02;

    public static void A00(C8f4 c8f4, C8f2 c8f2) {
        C1LV.A02("Emitter_addSubscriber");
        try {
            java.util.Set set = c8f2.A00;
            if (set == null) {
                set = new LinkedHashSet();
                c8f2.A00 = set;
            }
            set.add(c8f4);
            c8f2.A00.size();
        } finally {
            C1LV.A01();
        }
    }

    public static void A01(C8f4 c8f4, C8f2 c8f2) {
        C1LV.A02("Emitter_unsubscribe");
        try {
            java.util.Set set = c8f2.A00;
            if (set != null && !set.isEmpty()) {
                c8f2.A00.remove(c8f4);
                c8f2.A00.isEmpty();
            }
        } finally {
            C1LV.A01();
        }
    }

    public static void A02(C8f2 c8f2, Object obj) {
        C1LV.A02("Emitter_emitToSubscribers");
        try {
            java.util.Set set = c8f2.A00;
            if (set != null && !set.isEmpty()) {
                Iterator it = c8f2.A00.iterator();
                while (it.hasNext()) {
                    C8f3 c8f3 = ((C8f4) it.next()).A00;
                    int incrementAndGet = c8f3.A03.incrementAndGet();
                    InterfaceC192058f1 interfaceC192058f1 = c8f3.A02;
                    if (interfaceC192058f1.CZZ()) {
                        C8f3.A02(c8f3, obj, incrementAndGet);
                    } else {
                        interfaceC192058f1.E4t(new RunnableC24740AxO(c8f3, obj, incrementAndGet), "DataSynchronizer_sendNewResult");
                    }
                }
            }
        } finally {
            C1LV.A01();
        }
    }

    public final void A03(final int i) {
        if (i != 0 && i != 1 && i != 3) {
            throw new IllegalArgumentException(AnonymousClass001.A0c("FetchType ", " is not supported in Emitter", i));
        }
        String A0O = AnonymousClass001.A0O("Emitter_delegateFetch_", i);
        C1LV.A02(A0O);
        try {
            InterfaceC192058f1 interfaceC192058f1 = this.A02;
            if (interfaceC192058f1.CZZ()) {
                this.A01.A00(i);
            } else {
                interfaceC192058f1.E4t(new Runnable() { // from class: X.8f8
                    @Override // java.lang.Runnable
                    public final void run() {
                        C8f2.this.A01.A00(i);
                    }
                }, A0O);
            }
        } finally {
            C1LV.A01();
        }
    }

    public C8f2(AbstractC192018ex abstractC192018ex, InterfaceC192058f1 interfaceC192058f1) {
        this.A01 = abstractC192018ex;
        this.A02 = interfaceC192058f1;
    }
}
