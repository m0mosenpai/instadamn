package X;

import android.util.Pair;
import java.util.List;

/* loaded from: classes10.dex */
public final class TO0 implements Runnable {
    public final /* synthetic */ Pair A00;
    public final /* synthetic */ C63367SiS A01;

    public TO0(Pair pair, C63367SiS c63367SiS) {
        this.A01 = c63367SiS;
        this.A00 = pair;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C63364SiN c63364SiN;
        C63364SiN c63364SiN2;
        C63367SiS c63367SiS = this.A01;
        Pair pair = this.A00;
        List list = (List) pair.first;
        if (list != null && !list.isEmpty() && (c63364SiN2 = c63367SiS.A0w) != null && c63364SiN2.A04()) {
            try {
                int andIncrement = C63364SiN.A0e.getAndIncrement() & 65535;
                c63367SiS.A0O.A02(c63364SiN2, EnumC61172RgY.SUBACK, "callSub", andIncrement, c63367SiS.A0E.A00().A0L);
                synchronized (c63364SiN2) {
                    if (c63364SiN2.A04()) {
                        c63364SiN2.A0J.execute(new RunnableC64690TPv(c63364SiN2, list, andIncrement));
                    } else {
                        Integer num = C05F.A15;
                        throw new C42Y(num, AbstractC62804SRy.A01(num), null);
                    }
                }
            } catch (C42Y e) {
                C0K8.A0I(c63367SiS.A0X, "exception/subscribe", e);
                c63367SiS.A07(c63364SiN2, RhR.A0J, C05F.A01);
            }
        }
        List list2 = (List) pair.second;
        if (list2 != null && !list2.isEmpty() && (c63364SiN = c63367SiS.A0w) != null && c63364SiN.A04()) {
            try {
                int andIncrement2 = C63364SiN.A0e.getAndIncrement() & 65535;
                c63367SiS.A0O.A02(c63364SiN, EnumC61172RgY.UNSUBACK, "callUnSub", andIncrement2, c63367SiS.A0E.A00().A0L);
                synchronized (c63364SiN) {
                    if (c63364SiN.A04()) {
                        c63364SiN.A0J.execute(new RunnableC64691TPw(c63364SiN, list2, andIncrement2));
                    } else {
                        Integer num2 = C05F.A15;
                        throw new C42Y(num2, AbstractC62804SRy.A01(num2), null);
                    }
                }
            } catch (C42Y e2) {
                C0K8.A0I(c63367SiS.A0X, "exception/unsubscribe", e2);
                c63367SiS.A07(c63364SiN, RhR.A0J, C05F.A01);
            }
        }
    }
}
