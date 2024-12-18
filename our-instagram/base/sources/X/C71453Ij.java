package X;

import com.facebook.common.dextricks.StringTreeSet;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.3Ij, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71453Ij {
    public final AtomicReferenceArray A00 = new AtomicReferenceArray(128);
    public volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    public volatile /* synthetic */ int consumerIndex$volatile;
    public volatile /* synthetic */ Object lastScheduledTask$volatile;
    public volatile /* synthetic */ int producerIndex$volatile;
    public static final /* synthetic */ AtomicReferenceFieldUpdater A04 = AtomicReferenceFieldUpdater.newUpdater(C71453Ij.class, Object.class, "lastScheduledTask$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater A03 = AtomicIntegerFieldUpdater.newUpdater(C71453Ij.class, "producerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater A02 = AtomicIntegerFieldUpdater.newUpdater(C71453Ij.class, "consumerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater A01 = AtomicIntegerFieldUpdater.newUpdater(C71453Ij.class, "blockingTasksInBuffer$volatile");

    public static final C1E5 A00(C71453Ij c71453Ij) {
        C1E5 c1e5;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A02;
            int i = atomicIntegerFieldUpdater.get(c71453Ij);
            c1e5 = null;
            if (i - A03.get(c71453Ij) == 0) {
                break;
            }
            int i2 = i & StringTreeSet.MAX_SYMBOL_COUNT;
            if (atomicIntegerFieldUpdater.compareAndSet(c71453Ij, i, i + 1) && (c1e5 = (C1E5) c71453Ij.A00.getAndSet(i2, null)) != null) {
                if (c1e5.A01.A00 == 1) {
                    A01.decrementAndGet(c71453Ij);
                }
            }
        }
        return c1e5;
    }
}
