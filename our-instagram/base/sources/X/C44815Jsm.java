package X;

import java.util.Iterator;

/* renamed from: X.Jsm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44815Jsm extends AbstractC72053XLu {
    public LA2 A00;
    public String A01;
    public String A02;
    public A6P A03;
    public final C8EC A04;

    public final boolean A09() {
        if (this.A03 == null && A08()) {
            try {
                A6P A00 = A6P.A00(this.A01, 0);
                A00.A00.loadMethod("forward");
                this.A03 = A00;
                return true;
            } catch (Exception e) {
                C0K8.A0F("Text2FilterExecuTorchProcessor", "Failed to load color model", e);
                return false;
            }
        }
        return true;
    }

    public C44815Jsm(C8EC c8ec) {
        this.A04 = c8ec;
    }

    public static final Integer A00(Iterable iterable) {
        Object next;
        Iterator it = AbstractC001800i.A0p(iterable).iterator();
        if (!it.hasNext()) {
            next = null;
        } else {
            next = it.next();
            if (it.hasNext()) {
                Comparable comparable = (Comparable) ((C0eP) next).A01;
                do {
                    Object next2 = it.next();
                    Comparable comparable2 = (Comparable) ((C0eP) next2).A01;
                    if (comparable.compareTo(comparable2) < 0) {
                        next = next2;
                        comparable = comparable2;
                    }
                } while (it.hasNext());
            }
        }
        C0eP c0eP = (C0eP) next;
        if (c0eP == null) {
            return null;
        }
        return Integer.valueOf(c0eP.A00);
    }

    public final boolean A0A() {
        String str;
        if (!A08() || (str = this.A02) == null) {
            return false;
        }
        LA2 la2 = this.A00;
        if (la2 == null) {
            la2 = new LA2(str);
            this.A00 = la2;
        }
        if (la2.A00()) {
            return true;
        }
        return la2.A01();
    }
}
