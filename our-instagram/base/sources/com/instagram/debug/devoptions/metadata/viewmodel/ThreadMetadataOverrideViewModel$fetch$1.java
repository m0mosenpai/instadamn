package com.instagram.debug.devoptions.metadata.viewmodel;

import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.C0YY;
import X.C0eB;
import X.C14360o3;
import X.C80693iy;
import X.C81543kP;
import X.C81663kb;
import X.InterfaceC16620sF;
import com.instagram.debug.devoptions.metadata.model.ThreadMetadataOverride;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes6.dex */
public final class ThreadMetadataOverrideViewModel$fetch$1 extends C0YY implements InterfaceC16620sF {
    public static final ThreadMetadataOverrideViewModel$fetch$1 INSTANCE = new ThreadMetadataOverrideViewModel$fetch$1();

    public ThreadMetadataOverrideViewModel$fetch$1() {
        super(2);
    }

    public final void invoke(ThreadMetadataOverride threadMetadataOverride, C81663kb c81663kb) {
        int i;
        AbstractC167017dG.A1N(threadMetadataOverride, c81663kb);
        Object obj = threadMetadataOverride.value;
        C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.Int");
        int A0H = AbstractC166987dD.A0H(obj);
        if (AbstractC167007dF.A1Z(c81663kb.A05)) {
            ReentrantReadWriteLock reentrantReadWriteLock = c81663kb.A03;
            ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
            int i2 = 0;
            if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                i = reentrantReadWriteLock.getReadHoldCount();
                for (int i3 = 0; i3 < i; i3++) {
                    readLock.unlock();
                }
            } else {
                i = 0;
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                C81543kP c81543kP = c81663kb.A01.A0t;
                if (c81543kP != null) {
                    c81543kP.A02 = A0H;
                }
                return;
            } finally {
                while (i2 < i) {
                    readLock.lock();
                    i2++;
                }
                writeLock.unlock();
            }
        }
        C80693iy c80693iy = c81663kb.A01;
        synchronized (c80693iy) {
            C81543kP c81543kP2 = c80693iy.A0t;
            if (c81543kP2 != null) {
                c81543kP2.A02 = A0H;
            }
        }
    }

    @Override // X.InterfaceC16620sF
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((ThreadMetadataOverride) obj, (C81663kb) obj2);
        return C0eB.A00;
    }
}
