package X;

import android.util.SparseArray;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1J5, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1J5 {
    public AnonymousClass155 A00;
    public final C1JA A03;
    public final SparseArray A01 = new SparseArray();
    public final C1J9 A04 = C1J9.A01;
    public final AnonymousClass150 A02 = AnonymousClass150.A00();

    public final C1JB A04(int i) {
        C95U c95u;
        SparseArray sparseArray = this.A01;
        C1JB c1jb = (C1JB) sparseArray.get(i);
        if (c1jb == null) {
            C1JA c1ja = this.A03;
            C95T c95t = c1ja.A02;
            AnonymousClass155 anonymousClass155 = this.A00;
            AnonymousClass150 anonymousClass150 = this.A02;
            AnonymousClass157 anonymousClass157 = AnonymousClass157.A01;
            if (anonymousClass157 == null) {
                anonymousClass157 = new AnonymousClass157(anonymousClass150);
                AnonymousClass157.A01 = anonymousClass157;
            }
            if (c95t != null) {
                c95u = c95t.A00;
            } else {
                c95u = null;
            }
            C1JB c1jb2 = new C1JB(c1ja, c95u, anonymousClass157, anonymousClass155, i);
            sparseArray.put(i, c1jb2);
            return c1jb2;
        }
        return c1jb;
    }

    public final void A06(int i, List list) {
        C15E A00 = this.A04.A00(i);
        if (A00 != null && A00 != C96C.A00) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C2050395s c2050395s = (C2050395s) it.next();
                A04(c2050395s.A03).A03(c2050395s);
            }
        }
    }

    public C1J5(C1JA c1ja) {
        AnonymousClass155 anonymousClass155 = AnonymousClass155.A05;
        if (anonymousClass155 == null) {
            anonymousClass155 = new AnonymousClass155(null);
            AnonymousClass155.A05 = anonymousClass155;
        }
        this.A00 = anonymousClass155;
        this.A03 = c1ja;
    }

    public static void A03(C1J5 c1j5, int i, int i2, int i3) {
        C1JB A04 = c1j5.A04(i2);
        C15P c15p = new C15P();
        c15p.A02 = i3;
        A04.A03(new C2050395s(c15p, i, i2));
    }

    public final void A05(int i, int i2) {
        C1JB A04 = A04(i);
        C2050395s c2050395s = (C2050395s) A04.A02.get(5);
        if (c2050395s == null) {
            C15P c15p = new C15P();
            c15p.A02 = i2;
            A04.A03(new C2050395s(c15p, 5, A04.A01));
        } else {
            C15P c15p2 = c2050395s.A05;
            if (c15p2 == null) {
                return;
            }
            c15p2.A02 = i2 | c15p2.A02;
        }
    }
}
