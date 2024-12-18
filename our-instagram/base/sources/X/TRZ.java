package X;

import com.facebook.common.dextricks.DexStore;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes10.dex */
public final class TRZ implements Runnable {
    public static final TRZ A00 = new TRZ();

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        Number number;
        long currentTimeMillis = System.currentTimeMillis();
        C206359Bs c206359Bs = C63160SeI.A01;
        if (c206359Bs == null) {
            C14360o3.A0F(DexStore.CONFIG_FILENAME);
            throw C00O.createAndThrow();
        }
        long j = currentTimeMillis - c206359Bs.A01;
        long j2 = 0;
        Iterator A13 = AbstractC166997dE.A13(C63160SeI.A04);
        while (A13.hasNext()) {
            AbstractC58570Pxo abstractC58570Pxo = (AbstractC58570Pxo) A13.next();
            C14360o3.A0A(abstractC58570Pxo);
            if (abstractC58570Pxo instanceof R6Z) {
                z = true;
            } else {
                z = abstractC58570Pxo instanceof C58571Pxp;
            }
            long j3 = 0;
            if (z) {
                Object obj = abstractC58570Pxo.A03.get("timestamp");
                if ((obj instanceof Long) && (number = (Number) obj) != null) {
                    j3 = number.longValue();
                }
            }
            if (j3 >= j) {
                break;
            }
            A13.remove();
            j2++;
        }
        AtomicLong atomicLong = C63160SeI.A05;
        atomicLong.set(atomicLong.get() - j2);
        if (atomicLong.get() != 0) {
            C63160SeI.A00();
        }
    }
}
