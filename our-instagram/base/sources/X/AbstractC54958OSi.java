package X;

import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.OSi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54958OSi {
    public static final Map A00 = AbstractC166987dD.A1G();
    public static final Map A01 = AbstractC166987dD.A1G();
    public static final ReentrantReadWriteLock A02 = new ReentrantReadWriteLock();

    public static final void A00(String str) {
        ReentrantReadWriteLock.ReadLock A0b = AbstractC50523MSb.A0b(str);
        try {
            OU3 ou3 = (OU3) A00.get(str);
            if (ou3 != null) {
                InterfaceC103384lE interfaceC103384lE = ou3.A04;
                C131845xK.A00(ou3.A00, C6FW.A01, interfaceC103384lE);
            }
        } finally {
            A0b.unlock();
        }
    }
}
