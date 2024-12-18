package X;

import java.lang.ref.ReferenceQueue;

/* renamed from: X.Xqm, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC72906Xqm {
    public static final C72749XmQ A00 = new C72749XmQ(new ReferenceQueue());

    public static void A00(InterfaceC73600YNc interfaceC73600YNc, Object obj) {
        C72749XmQ c72749XmQ = A00;
        YKM ykm = new YKM(interfaceC73600YNc, obj, c72749XmQ.A01);
        synchronized (c72749XmQ) {
            C02R.A07(c72749XmQ.A02.add(ykm), null);
            if (c72749XmQ.A00) {
                return;
            }
            c72749XmQ.A00 = true;
            new YK9(c72749XmQ).start();
        }
    }
}
