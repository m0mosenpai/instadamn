package X;

/* renamed from: X.56N, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C56N {
    public void A00(C56K c56k, C56K c56k2) {
        ((C56M) this).A02.lazySet(c56k, c56k2);
    }

    public void A01(C56K c56k, Thread thread) {
        ((C56M) this).A03.lazySet(c56k, thread);
    }

    public boolean A02(C56L c56l, C56L c56l2, C56J c56j) {
        return C1E0.A00(c56j, c56l, c56l2, ((C56M) this).A00);
    }

    public boolean A03(C56K c56k, C56K c56k2, C56J c56j) {
        return C1E0.A00(c56j, c56k, c56k2, ((C56M) this).A04);
    }

    public boolean A04(C56J c56j, Object obj, Object obj2) {
        return C1E0.A00(c56j, null, obj2, ((C56M) this).A01);
    }
}
