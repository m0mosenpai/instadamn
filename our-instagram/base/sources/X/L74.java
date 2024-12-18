package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes8.dex */
public final class L74 {
    public final LinkedHashMap A00;
    public final ReentrantReadWriteLock A01 = new ReentrantReadWriteLock();
    public final int A02;

    public final void A00(EnumC46144Kbi enumC46144Kbi, String str) {
        C14360o3.A0B(str, 0);
        try {
            ReentrantReadWriteLock reentrantReadWriteLock = this.A01;
            reentrantReadWriteLock.writeLock().lock();
            LinkedHashMap linkedHashMap = this.A00;
            if (linkedHashMap.containsKey(str)) {
                linkedHashMap.remove(str);
            }
            linkedHashMap.put(str, enumC46144Kbi);
            Iterator A14 = AbstractC166997dE.A14(linkedHashMap);
            while (linkedHashMap.size() > this.A02 && A14.hasNext()) {
                A14.next();
                A14.remove();
            }
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th) {
            this.A01.writeLock().unlock();
            throw th;
        }
    }

    public L74(int i) {
        this.A02 = i;
        this.A00 = AbstractC25225BEi.A18(i);
    }
}
