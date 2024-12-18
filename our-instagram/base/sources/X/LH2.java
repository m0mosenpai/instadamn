package X;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes8.dex */
public abstract class LH2 {
    public static final C56O A00(InterfaceC14020nS interfaceC14020nS, Callable callable, int i) {
        C14360o3.A0B(interfaceC14020nS, 1);
        C56O c56o = new C56O(callable, i);
        interfaceC14020nS.ATO(c56o);
        return c56o;
    }

    public static final Object A01(AbstractC24481Hr abstractC24481Hr) {
        C14360o3.A0B(abstractC24481Hr, 0);
        A02(abstractC24481Hr, new LEZ());
        return abstractC24481Hr.A07();
    }

    public static final boolean A02(AbstractC24481Hr abstractC24481Hr, LEZ lez) {
        boolean z;
        C1OL c1ol;
        abstractC24481Hr.A03(new C48526LdP(lez, 0));
        boolean z2 = lez.A03;
        CountDownLatch countDownLatch = lez.A01;
        if (z2) {
            z = countDownLatch.await(lez.A00, lez.A02);
        } else {
            countDownLatch.await();
            z = true;
        }
        if (!abstractC24481Hr.A0D()) {
            if (!abstractC24481Hr.A0B()) {
                return z;
            }
            synchronized (abstractC24481Hr.A05) {
                c1ol = abstractC24481Hr.A00;
            }
            C14360o3.A0A(c1ol);
            throw new C46341KfP(c1ol);
        }
        Exception A06 = abstractC24481Hr.A06();
        C14360o3.A0A(A06);
        throw A06;
    }
}
