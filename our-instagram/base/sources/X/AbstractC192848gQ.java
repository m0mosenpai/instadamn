package X;

import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.8gQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC192848gQ {
    public void A01() {
    }

    public void A02() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A03(AbstractC115105If abstractC115105If) {
        C215539gT c215539gT;
        AtomicReference atomicReference;
        C214109e9 c214109e9;
        if (this instanceof C192828gO) {
            C192828gO c192828gO = (C192828gO) this;
            C192008ew c192008ew = c192828gO.A00;
            C1EM.A00(c192828gO.A01, null, c192008ew.A06);
            Throwable A01 = abstractC115105If.A01();
            if (A01 == null) {
                A01 = new Throwable("Network error.");
            }
            c215539gT = new C215539gT(new C193028gi(new C193018gh(c192008ew.A00, c192008ew.A01.now(), c192008ew.A02.A02, -1L, -1L, true), 3), new RuntimeException(A01));
            atomicReference = c192008ew.A05;
            c214109e9 = c192008ew;
        } else {
            C215039ff c215039ff = (C215039ff) this;
            C214109e9 c214109e92 = c215039ff.A00;
            C1EM.A00(c215039ff.A01, null, c214109e92.A06);
            Throwable A012 = abstractC115105If.A01();
            if (A012 == null) {
                A012 = new Throwable("Network error.");
            }
            c215539gT = new C215539gT(new C193028gi(new C193018gh(c214109e92.A00, c214109e92.A01.now(), 0L, 0L, 0L, true), 3), new RuntimeException(A012));
            atomicReference = c214109e92.A05;
            c214109e9 = c214109e92;
        }
        atomicReference.set(c215539gT);
        c214109e9.A01(c215539gT);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A04(Object obj) {
        int i;
        Object c215549gU;
        AtomicReference atomicReference;
        C214109e9 c214109e9;
        int i2;
        String str;
        if (this instanceof C192828gO) {
            C192828gO c192828gO = (C192828gO) this;
            C192998gf c192998gf = (C192998gf) obj;
            C192008ew c192008ew = c192828gO.A00;
            C192028ey c192028ey = c192008ew.A03;
            if (c192028ey != null && (str = c192008ew.A04) != null) {
                C191998ev c191998ev = c192008ew.A02;
                c192028ey.A00(c192998gf, str, c191998ev.A03, c191998ev.A02);
            }
            C1EM.A00(c192828gO.A01, null, c192008ew.A06);
            if (c192828gO.A02) {
                i2 = 0;
            } else {
                i2 = 2;
                if (((AbstractC193008gg) c192998gf).A00 == 1) {
                    i2 = 1;
                }
            }
            c215549gU = new C193038gj(c192998gf.A00, new C193028gi(new C193018gh(c192008ew.A00, c192008ew.A01.now(), c192008ew.A02.A02, c192998gf.A02, c192998gf.A01, true), i2));
            atomicReference = c192008ew.A05;
            c214109e9 = c192008ew;
        } else {
            C215039ff c215039ff = (C215039ff) this;
            C209899Qb c209899Qb = (C209899Qb) obj;
            C214109e9 c214109e92 = c215039ff.A00;
            C192028ey c192028ey2 = c214109e92.A03;
            if (c192028ey2 != null) {
                String str2 = c214109e92.A04;
                str2.getClass();
                C22940A9k c22940A9k = c214109e92.A02;
                c192028ey2.A00(c209899Qb, str2, c22940A9k.A01, c22940A9k.A00);
            }
            C1EM.A00(c215039ff.A01, null, c214109e92.A06);
            if (c215039ff.A02) {
                i = 0;
            } else {
                i = 2;
                if (((AbstractC193008gg) c209899Qb).A00 == 1) {
                    i = 1;
                }
            }
            c215549gU = new C215549gU(c209899Qb.A00, new C193028gi(new C193018gh(c214109e92.A00, c214109e92.A01.now(), c214109e92.A02.A00, 0L, 0L, true), i), Collections.emptyMap());
            atomicReference = c214109e92.A05;
            c214109e9 = c214109e92;
        }
        atomicReference.set(c215549gU);
        c214109e9.A01(c215549gU);
    }
}
