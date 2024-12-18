package X;

import com.facebook.common.dextricks.Constants;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.13C, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C13C extends C13D implements C13E {
    public static final /* synthetic */ AtomicIntegerFieldUpdater A01 = AtomicIntegerFieldUpdater.newUpdater(C13C.class, "cleanedAndPointers$volatile");
    public final long A00;
    public volatile /* synthetic */ int cleanedAndPointers$volatile;

    public abstract int A04();

    public abstract void A06(Throwable th, C12W c12w, int i);

    @Override // X.C13D
    public final boolean A03() {
        if (A01.get(this) == A04() && A00() != null) {
            return true;
        }
        return false;
    }

    public final void A05() {
        if (A01.incrementAndGet(this) == A04()) {
            A02();
        }
    }

    public final boolean A07() {
        if (A01.addAndGet(this, -65536) == A04() && A00() != null) {
            return true;
        }
        return false;
    }

    public final boolean A08() {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A01;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            if (i == A04() && A00() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, Constants.LOAD_RESULT_PGO_ATTEMPTED + i));
        return true;
    }

    public C13C(C13C c13c, int i, long j) {
        this._prev$volatile = c13c;
        this.A00 = j;
        this.cleanedAndPointers$volatile = i << 16;
    }
}
