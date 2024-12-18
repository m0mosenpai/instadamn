package X;

/* renamed from: X.3Ex, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C70603Ex {
    public final C005001p A01 = new C005001p(0);
    public final C003501a A00 = new C003501a();

    /* JADX WARN: Multi-variable type inference failed */
    public final void A00(C73733Sb c73733Sb, C3OO c3oo) {
        C005001p c005001p = this.A01;
        C3OR c3or = (C3OR) c005001p.get(c3oo);
        C3OR c3or2 = c3or;
        if (c3or == null) {
            C3OR c3or3 = (C3OR) C3OR.A03.A7H();
            Object obj = c3or3;
            if (c3or3 == null) {
                obj = new Object();
            }
            c005001p.put(c3oo, obj);
            c3or2 = obj;
        }
        c3or2.A01 = c73733Sb;
        c3or2.A00 |= 8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A01(C73733Sb c73733Sb, C3OO c3oo) {
        C005001p c005001p = this.A01;
        C3OR c3or = (C3OR) c005001p.get(c3oo);
        C3OR c3or2 = c3or;
        if (c3or == null) {
            C3OR c3or3 = (C3OR) C3OR.A03.A7H();
            Object obj = c3or3;
            if (c3or3 == null) {
                obj = new Object();
            }
            c005001p.put(c3oo, obj);
            c3or2 = obj;
        }
        c3or2.A02 = c73733Sb;
        c3or2.A00 |= 4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A02(C3OO c3oo) {
        C005001p c005001p = this.A01;
        C3OR c3or = (C3OR) c005001p.get(c3oo);
        C3OR c3or2 = c3or;
        if (c3or == null) {
            C3OR c3or3 = (C3OR) C3OR.A03.A7H();
            Object obj = c3or3;
            if (c3or3 == null) {
                obj = new Object();
            }
            c005001p.put(c3oo, obj);
            c3or2 = obj;
        }
        c3or2.A00 |= 1;
    }

    public final void A03(C3OO c3oo) {
        C3OR c3or = (C3OR) this.A01.get(c3oo);
        if (c3or != null) {
            c3or.A00 &= -2;
        }
    }

    public final void A04(C3OO c3oo) {
        C003501a c003501a = this.A00;
        int A00 = c003501a.A00();
        while (true) {
            A00--;
            if (A00 < 0) {
                break;
            }
            if (c3oo == c003501a.A04(A00)) {
                Object[] objArr = c003501a.A03;
                Object obj = objArr[A00];
                Object obj2 = AbstractC003601b.A00;
                if (obj != obj2) {
                    objArr[A00] = obj2;
                    c003501a.A01 = true;
                }
            }
        }
        C3OR c3or = (C3OR) this.A01.remove(c3oo);
        if (c3or != null) {
            c3or.A00 = 0;
            c3or.A02 = null;
            c3or.A01 = null;
            C3OR.A03.EE6(c3or);
        }
    }
}
