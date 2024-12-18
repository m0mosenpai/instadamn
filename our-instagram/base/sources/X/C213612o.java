package X;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.12o, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C213612o {
    public final int A00;
    public final int A01;
    public final boolean A02;
    public final /* synthetic */ AtomicReferenceArray A03;
    public volatile /* synthetic */ Object _next$volatile;
    public volatile /* synthetic */ long _state$volatile;
    public static final /* synthetic */ AtomicReferenceFieldUpdater A06 = AtomicReferenceFieldUpdater.newUpdater(C213612o.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater A05 = AtomicLongFieldUpdater.newUpdater(C213612o.class, "_state$volatile");
    public static final C20730zt A04 = new C20730zt("REMOVE_FROZEN");

    public static final long A00(C213612o c213612o) {
        long j;
        long j2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = A05;
        do {
            j = atomicLongFieldUpdater.get(c213612o);
            if ((j & 1152921504606846976L) != 0) {
                return j;
            }
            j2 = j | 1152921504606846976L;
        } while (!atomicLongFieldUpdater.compareAndSet(c213612o, j, j2));
        return j2;
    }

    public static final C213612o A01(C213612o c213612o, long j) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A06;
        while (true) {
            C213612o c213612o2 = (C213612o) atomicReferenceFieldUpdater.get(c213612o);
            if (c213612o2 != null) {
                return c213612o2;
            }
            C213612o c213612o3 = new C213612o(c213612o.A00 * 2, c213612o.A02);
            int i = (int) ((1073741823 & j) >> 0);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = c213612o.A01;
                if ((i & i3) != (i3 & i2)) {
                    Object obj = c213612o.A03.get(i3 & i);
                    if (obj == null) {
                        obj = new C50162Sf(i);
                    }
                    c213612o3.A03.set(c213612o3.A01 & i, obj);
                    i++;
                }
            }
            A05.set(c213612o3, j & (-1152921504606846977L));
            C1E0.A00(c213612o, null, c213612o3, atomicReferenceFieldUpdater);
        }
    }

    public final int A02(Object obj) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = A05;
        while (true) {
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                if ((j & 2305843009213693952L) == 0) {
                    return 1;
                }
                return 2;
            }
            int i = (int) ((1073741823 & j) >> 0);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.A01;
            if (((i2 + 2) & i3) != (i & i3)) {
                if (!this.A02 && this.A03.get(i2 & i3) != null) {
                    int i4 = this.A00;
                    if (i4 < 1024 || ((i2 - i) & 1073741823) > (i4 >> 1)) {
                        break;
                    }
                } else if (atomicLongFieldUpdater.compareAndSet(this, j, (j & (-1152921503533105153L)) | (((i2 + 1) & 1073741823) << 30))) {
                    this.A03.set(i2 & i3, obj);
                    C213612o c213612o = this;
                    while ((atomicLongFieldUpdater.get(c213612o) & 1152921504606846976L) != 0) {
                        c213612o = A01(c213612o, A00(c213612o));
                        AtomicReferenceArray atomicReferenceArray = c213612o.A03;
                        int i5 = c213612o.A01 & i2;
                        Object obj2 = atomicReferenceArray.get(i5);
                        if (!(obj2 instanceof C50162Sf) || ((C50162Sf) obj2).A00 != i2) {
                            break;
                        }
                        atomicReferenceArray.set(i5, obj);
                    }
                    return 0;
                }
            } else {
                break;
            }
        }
        return 1;
    }

    public final Object A03() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = A05;
        while (true) {
            long j = atomicLongFieldUpdater.get(this);
            if ((1152921504606846976L & j) != 0) {
                return A04;
            }
            int i = this.A01;
            int i2 = ((int) ((1152921503533105152L & j) >> 30)) & i;
            int i3 = i & ((int) ((1073741823 & j) >> 0));
            if (i2 == i3) {
                return null;
            }
            AtomicReferenceArray atomicReferenceArray = this.A03;
            Object obj = atomicReferenceArray.get(i3);
            if (obj == null) {
                if (this.A02) {
                    return null;
                }
            } else {
                if (obj instanceof C50162Sf) {
                    return null;
                }
                long j2 = ((r4 + 1) & 1073741823) << 0;
                if (atomicLongFieldUpdater.compareAndSet(this, j, (j & (-1073741824)) | j2)) {
                    atomicReferenceArray.set(i3, null);
                    return obj;
                }
                if (this.A02) {
                    C213612o c213612o = this;
                    while (true) {
                        long j3 = atomicLongFieldUpdater.get(c213612o);
                        int i4 = (int) ((1073741823 & j3) >> 0);
                        if ((1152921504606846976L & j3) != 0) {
                            c213612o = A01(c213612o, A00(c213612o));
                        } else {
                            if (atomicLongFieldUpdater.compareAndSet(c213612o, j3, (j3 & (-1073741824)) | j2)) {
                                c213612o.A03.set(c213612o.A01 & i4, null);
                                return obj;
                            }
                        }
                    }
                }
            }
        }
    }

    public final boolean A04() {
        long j;
        AtomicLongFieldUpdater atomicLongFieldUpdater = A05;
        do {
            j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, j | 2305843009213693952L));
        return true;
    }

    public C213612o(int i, boolean z) {
        this.A00 = i;
        this.A02 = z;
        int i2 = i - 1;
        this.A01 = i2;
        this.A03 = new AtomicReferenceArray(i);
        if (i2 <= 1073741823) {
            if ((i & i2) == 0) {
                return;
            } else {
                throw new IllegalStateException("Check failed.");
            }
        }
        throw new IllegalStateException("Check failed.");
    }
}
