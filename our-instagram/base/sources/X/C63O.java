package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.63O, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C63O {
    public final Object A00 = new Object();
    public final List A01 = new ArrayList(1);

    /* JADX WARN: Type inference failed for: r0v3, types: [X.63i] */
    public final RunnableC1340063i A00(InterfaceC1339663e interfaceC1339663e) {
        final C1339963h c1339963h = new C1339963h(interfaceC1339663e, new C9EB(this, 6));
        synchronized (this.A00) {
            this.A01.add(c1339963h);
        }
        return new Runnable() { // from class: X.63i
            @Override // java.lang.Runnable
            public final void run() {
                C1339963h c1339963h2 = C1339963h.this;
                c1339963h2.A00.invoke(c1339963h2);
                c1339963h2.A01 = null;
            }
        };
    }

    public final void A01(Object obj) {
        List A0a;
        synchronized (this.A00) {
            A0a = AbstractC001800i.A0a(this.A01);
        }
        Iterator it = A0a.iterator();
        while (it.hasNext()) {
            InterfaceC1339663e interfaceC1339663e = ((C1339963h) it.next()).A01;
            if (interfaceC1339663e != null) {
                interfaceC1339663e.DnA(obj);
            }
        }
    }
}
