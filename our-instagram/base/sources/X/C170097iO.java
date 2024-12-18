package X;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.7iO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C170097iO extends AbstractC66542zW {
    public static final C170107iP A08 = new Object();
    public final C2V9 A00;
    public final C2V9 A01;
    public final C169827hw A02;
    public final C170107iP A03;
    public final ThreadLocal A04;
    public final List A05;
    public final List A06;
    public final AtomicBoolean A07;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.7iP, java.lang.Object] */
    public static boolean A00(C170097iO c170097iO, Object obj, Object obj2) {
        C170107iP c170107iP;
        if (obj == obj2) {
            return true;
        }
        C2V9 c2v9 = c170097iO.A01;
        if (c2v9 != 0) {
            C2VD c2vd = c2v9.A00.A01;
            AtomicBoolean atomicBoolean = c170097iO.A07;
            boolean compareAndSet = atomicBoolean.compareAndSet(false, true);
            if (compareAndSet) {
                c170107iP = c170097iO.A03;
            } else {
                c170107iP = (C170107iP) c170097iO.A04.get();
            }
            if (C2V3.reduceMemorySpikeDataDiffSection && c2vd != null && c170107iP != null) {
                Object obj3 = c170107iP.A01;
                C170107iP c170107iP2 = A08;
                if (obj3 == c170107iP2.A01) {
                    c170107iP.A01 = obj;
                    c170107iP.A00 = obj2;
                    try {
                        Object A00 = c2v9.A00(c170107iP);
                        if (A00 == null) {
                            return false;
                        }
                        boolean booleanValue = ((Boolean) A00).booleanValue();
                        c170107iP.A01 = c170107iP2.A01;
                        c170107iP.A00 = c170107iP2.A00;
                        if (compareAndSet) {
                            atomicBoolean.set(false);
                            return booleanValue;
                        }
                        return booleanValue;
                    } finally {
                        c170107iP.A01 = c170107iP2.A01;
                        c170107iP.A00 = c170107iP2.A00;
                        if (compareAndSet) {
                            atomicBoolean.set(false);
                        }
                    }
                }
            }
            ?? obj4 = new Object();
            obj4.A01 = obj;
            obj4.A00 = obj2;
            return ((Boolean) c2v9.A00(obj4)).booleanValue();
        }
        return obj.equals(obj2);
    }

    @Override // X.AbstractC66542zW
    public final int A02() {
        List list = this.A05;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // X.AbstractC66542zW
    public final int A03() {
        List list = this.A06;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.7hV, java.lang.Object] */
    @Override // X.AbstractC66542zW
    public final boolean A04(int i, int i2) {
        List list;
        List list2 = this.A06;
        if (list2 != null && (list = this.A05) != null) {
            Object obj = list2.get(i);
            Object obj2 = list.get(i2);
            if (obj == obj2) {
                return true;
            }
            C2V9 c2v9 = this.A00;
            if (c2v9 != 0) {
                ?? obj3 = new Object();
                obj3.A01 = obj;
                obj3.A00 = obj2;
                return ((Boolean) c2v9.A00(obj3)).booleanValue();
            }
            return obj.equals(obj2);
        }
        return false;
    }

    @Override // X.AbstractC66542zW
    public final boolean A05(int i, int i2) {
        List list;
        List list2 = this.A06;
        if (list2 != null && (list = this.A05) != null) {
            return A00(this, list2.get(i), list.get(i2));
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [X.7iP, java.lang.Object] */
    public C170097iO(C169827hw c169827hw, List list, List list2) {
        C2V9 c2v9;
        C2V9 c2v92;
        this.A02 = c169827hw;
        if (c169827hw.A0E() == null) {
            c2v9 = null;
        } else {
            c2v9 = ((C170027iH) c169827hw.A0E()).A01;
        }
        this.A01 = c2v9;
        if (c169827hw.A0E() == null) {
            c2v92 = null;
        } else {
            c2v92 = ((C170027iH) c169827hw.A0E()).A00;
        }
        this.A00 = c2v92;
        this.A06 = list;
        this.A05 = list2;
        this.A04 = new ThreadLocal() { // from class: X.7iQ
            /* JADX WARN: Type inference failed for: r2v0, types: [X.7iP, java.lang.Object] */
            @Override // java.lang.ThreadLocal
            public final /* bridge */ /* synthetic */ Object initialValue() {
                ?? obj = new Object();
                C170107iP c170107iP = C170097iO.A08;
                obj.A01 = c170107iP.A01;
                obj.A00 = c170107iP.A00;
                return obj;
            }
        };
        this.A03 = new Object();
        this.A07 = new AtomicBoolean(false);
    }
}
