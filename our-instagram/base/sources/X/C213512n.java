package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.12n, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C213512n {
    public static final /* synthetic */ AtomicReferenceFieldUpdater A00 = AtomicReferenceFieldUpdater.newUpdater(C213512n.class, Object.class, "_cur$volatile");
    public volatile /* synthetic */ Object _cur$volatile;

    public final int A00() {
        long j = C213612o.A05.get(A00.get(this));
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j) >> 0)));
    }

    public final Object A01() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A00;
        while (true) {
            C213612o c213612o = (C213612o) atomicReferenceFieldUpdater.get(this);
            Object A03 = c213612o.A03();
            if (A03 != C213612o.A04) {
                return A03;
            }
            C1E0.A00(this, c213612o, C213612o.A01(c213612o, C213612o.A00(c213612o)), atomicReferenceFieldUpdater);
        }
    }

    public final boolean A02(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A00;
        while (true) {
            C213612o c213612o = (C213612o) atomicReferenceFieldUpdater.get(this);
            int A02 = c213612o.A02(obj);
            if (A02 == 0) {
                return true;
            }
            if (A02 != 1) {
                return false;
            }
            C1E0.A00(this, c213612o, C213612o.A01(c213612o, C213612o.A00(c213612o)), atomicReferenceFieldUpdater);
        }
    }

    public C213512n(boolean z) {
        this._cur$volatile = new C213612o(8, z);
    }
}
