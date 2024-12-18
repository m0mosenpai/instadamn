package X;

/* renamed from: X.9Tm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C210699Tm extends C56N {
    @Override // X.C56N
    public final boolean A02(C56L c56l, C56L c56l2, C56J c56j) {
        boolean z;
        synchronized (c56j) {
            if (c56j.listeners == c56l) {
                c56j.listeners = c56l2;
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // X.C56N
    public final boolean A03(C56K c56k, C56K c56k2, C56J c56j) {
        boolean z;
        synchronized (c56j) {
            if (c56j.waiters == c56k) {
                c56j.waiters = c56k2;
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // X.C56N
    public final boolean A04(C56J c56j, Object obj, Object obj2) {
        boolean z;
        synchronized (c56j) {
            if (c56j.value == null) {
                c56j.value = obj2;
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // X.C56N
    public final void A00(C56K c56k, C56K c56k2) {
        c56k.next = c56k2;
    }

    @Override // X.C56N
    public final void A01(C56K c56k, Thread thread) {
        c56k.thread = thread;
    }
}
