package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5Z2, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5Z2 implements C5Z3 {
    public C18570vk A00;
    public final java.util.Set A07;
    public final List A05 = new ArrayList();
    public final List A03 = new ArrayList();
    public final List A06 = new ArrayList();
    public final List A04 = new ArrayList();
    public final C18770w4 A02 = new C01I(16);
    public final C18770w4 A01 = new C01I(16);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [X.0w4, X.01I] */
    /* JADX WARN: Type inference failed for: r5v3, types: [X.01I] */
    public static final void A00(C5Z2 c5z2, int i) {
        List list = c5z2.A04;
        if (!list.isEmpty()) {
            ArrayList arrayList = null;
            int i2 = 0;
            C18770w4 c18770w4 = null;
            C18770w4 c18770w42 = null;
            int i3 = 0;
            while (true) {
                C18770w4 c18770w43 = c5z2.A01;
                if (i3 >= c18770w43.A00) {
                    break;
                }
                if (i <= c18770w43.A00(i3)) {
                    Object remove = list.remove(i3);
                    int A01 = c18770w43.A01(i3);
                    int A012 = c5z2.A02.A01(i3);
                    if (arrayList == null) {
                        arrayList = AbstractC16960so.A1N(remove);
                        ?? c01i = new C01I(16);
                        c01i.A02(A01);
                        c18770w42 = c01i;
                        c18770w4 = new C01I(16);
                    } else {
                        C14360o3.A0C(c18770w4, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                        C14360o3.A0C(c18770w42, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                        arrayList.add(remove);
                        c18770w42.A02(A01);
                        c18770w42 = c18770w42;
                        c18770w4 = c18770w4;
                    }
                    c18770w4.A02(A012);
                } else {
                    i3++;
                }
            }
            if (arrayList != null) {
                C14360o3.A0C(c18770w4, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                C14360o3.A0C(c18770w42, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                int size = arrayList.size() - 1;
                while (i2 < size) {
                    int i4 = i2 + 1;
                    int size2 = arrayList.size();
                    for (int i5 = i4; i5 < size2; i5++) {
                        int A00 = c18770w42.A00(i2);
                        int A002 = c18770w42.A00(i5);
                        if (A00 < A002 || (A002 == A00 && c18770w4.A00(i2) < c18770w4.A00(i5))) {
                            Object obj = arrayList.get(i2);
                            arrayList.set(i2, arrayList.get(i5));
                            arrayList.set(i5, obj);
                            int A003 = c18770w4.A00(i2);
                            c18770w4.A04(i2, c18770w4.A00(i5));
                            c18770w4.A04(i5, A003);
                            int A004 = c18770w42.A00(i2);
                            c18770w42.A04(i2, c18770w42.A00(i5));
                            c18770w42.A04(i5, A004);
                        }
                    }
                    i2 = i4;
                }
                c5z2.A03.addAll(arrayList);
            }
        }
    }

    public final void A01() {
        java.util.Set set = this.A07;
        if (!set.isEmpty()) {
            AbstractC09790fc.A01("Compose:abandons", 1854082573);
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    C2DD c2dd = (C2DD) it.next();
                    it.remove();
                    c2dd.CuG();
                }
            } finally {
                AbstractC09790fc.A00(1166705813);
            }
        }
    }

    public final void A02() {
        A00(this, Integer.MIN_VALUE);
        List list = this.A03;
        if (!list.isEmpty()) {
            AbstractC09790fc.A01("Compose:onForgotten", 1854082573);
            try {
                C18570vk c18570vk = this.A00;
                int size = list.size();
                while (true) {
                    size--;
                    if (-1 >= size) {
                        break;
                    }
                    Object obj = list.get(size);
                    if (obj instanceof C2DD) {
                        this.A07.remove(obj);
                        ((C2DD) obj).DI8();
                    }
                    if (obj instanceof C59C) {
                        if (c18570vk != null && c18570vk.A04(obj)) {
                            ((C59C) obj).DeW();
                        } else {
                            ((C59C) obj).D9L();
                        }
                    }
                }
            } finally {
                AbstractC09790fc.A00(1166705813);
            }
        }
        List list2 = this.A05;
        if (!list2.isEmpty()) {
            AbstractC09790fc.A01("Compose:onRemembered", 1854082573);
            int size2 = list2.size();
            for (int i = 0; i < size2; i++) {
                C2DD c2dd = (C2DD) list2.get(i);
                this.A07.remove(c2dd);
                c2dd.Deh();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0w4, X.01I] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.0w4, X.01I] */
    public C5Z2(java.util.Set set) {
        this.A07 = set;
    }

    @Override // X.C5Z3
    public final void AWY(C2DD c2dd, int i, int i2, int i3) {
        A00(this, i);
        if (i3 >= 0 && i3 < i) {
            this.A04.add(c2dd);
            this.A02.A02(i2);
            this.A01.A02(i3);
            return;
        }
        this.A03.add(c2dd);
    }
}
