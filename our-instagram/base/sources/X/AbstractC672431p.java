package X;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.31p, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC672431p implements InterfaceC43071ya {
    public int A00;
    public int A03;
    public InterfaceC62242sP A04;
    public InterfaceC670931a A07;
    public InterfaceC672031l A08;
    public final boolean A0F;
    public boolean A06 = true;
    public int A01 = -1;
    public int A02 = -1;
    public final java.util.Set A0D = new HashSet();
    public final java.util.Set A0E = new HashSet();
    public final java.util.Set A0B = new HashSet();
    public final java.util.Set A0C = new HashSet();
    public final List A09 = new LinkedList();
    public final List A0A = new LinkedList();
    public InterfaceC671731i A05 = new C671631h();

    public final int A02(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i == -1 && i2 == -1) {
            return i4;
        }
        int i7 = 0;
        int i8 = 0;
        if (i != -1) {
            i8 = i + i5 + 1;
        }
        if (i2 != -1) {
            i7 = i2 + i6 + 1;
        }
        return Math.max(Math.max(i8, i7), i3 + 1);
    }

    public int A03(C40861ut c40861ut, int i, int i2, int i3) {
        return ((C672231n) this).A0R((C671831j) c40861ut, i, i2, i3);
    }

    public abstract int A04(Object obj);

    public C1PZ A07(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        AbstractC672331o abstractC672331o = (AbstractC672331o) this;
        ((AbstractC672431p) abstractC672331o).A04.getClass();
        Object obj = c59062n7.A04;
        Object A0A = abstractC672331o.A0A(obj);
        int A04 = abstractC672331o.A04(obj);
        if (!((AbstractC672431p) abstractC672331o).A04.CdX(A0A) && !((AbstractC672431p) abstractC672331o).A04.CZK(A0A) && A04 > ((AbstractC672431p) abstractC672331o).A01 && A04 > ((AbstractC672431p) abstractC672331o).A02) {
            abstractC672331o.A0N(c59062n7, interfaceC57162jr).A03(c59062n7, interfaceC57162jr);
            if (!abstractC672331o.A0Q(((AbstractC672431p) abstractC672331o).A04.BK4(c59062n7.A03))) {
                return abstractC672331o.A0M(c59062n7, interfaceC57162jr);
            }
        }
        return C1PZ.A0K;
    }

    public abstract Object A0A(Object obj);

    public void A0B() {
        this.A06 = false;
    }

    public void A0C() {
    }

    public boolean A0H(InterfaceC57162jr interfaceC57162jr, C1PZ c1pz, C40861ut c40861ut, int i, int i2, int i3) {
        C672231n c672231n = (C672231n) this;
        C671831j c671831j = (C671831j) c40861ut;
        C14360o3.A0B(c671831j, 3);
        if (c672231n.A0R(c671831j, i, i2, i3) <= c672231n.A00) {
            return false;
        }
        return true;
    }

    public final boolean A0J(InterfaceC57162jr interfaceC57162jr, Object obj, List list, int i) {
        int A05 = A05(list);
        int A06 = A06(list);
        C40861ut A09 = A09(obj);
        A09.getClass();
        InterfaceC672031l interfaceC672031l = this.A08;
        if (A0I(interfaceC57162jr, A09, obj, A05, A06, i, interfaceC672031l.BS8(), interfaceC672031l.BS9())) {
            interfaceC672031l.CtE(A03(A09, A05, A06, i), obj);
            return true;
        }
        return false;
    }

    public boolean A0K(C40861ut c40861ut) {
        return false;
    }

    public static void A00(AbstractC672431p abstractC672431p, C1PZ c1pz, C40861ut c40861ut, int i) {
        String str;
        InterfaceC671731i interfaceC671731i = abstractC672431p.A05;
        if (interfaceC671731i != null) {
            interfaceC671731i.ESa(c40861ut);
            Integer num = C05F.A01;
            Integer num2 = c1pz.A0C;
            if (num == num2) {
                str = "Insert success";
            } else {
                str = "Insert fail";
            }
            if (C05F.A0C != num2) {
                interfaceC671731i.BuQ().A04(c1pz.A00(), i, str);
            }
        }
    }

    public C1PZ A08(List list) {
        C1PZ c1pz = new C1PZ(C05F.A0N);
        c1pz.A02 = this.A00;
        return c1pz;
    }

    public C40861ut A09(Object obj) {
        C82373m0 c82373m0 = (C82373m0) obj;
        C14360o3.A0B(c82373m0, 0);
        return c82373m0.A03;
    }

    public void A0D(int i, Object obj, Object obj2) {
        java.util.Set set;
        this.A04.getClass();
        C3Z9 BuQ = this.A05.BuQ();
        java.util.Set set2 = this.A0D;
        int size = set2.size();
        java.util.Set set3 = this.A0E;
        BuQ.A03(size, set3.size(), i);
        if (!this.A0F || (i > this.A01 && i > this.A02)) {
            set = this.A0B;
            if (!set.contains(this.A04.BK4(obj2))) {
                boolean CdX = this.A04.CdX(obj);
                InterfaceC62242sP interfaceC62242sP = this.A04;
                if (CdX) {
                    set3.add(interfaceC62242sP.BK4(obj2));
                } else {
                    boolean CZK = interfaceC62242sP.CZK(obj);
                    String BK4 = this.A04.BK4(obj2);
                    if (CZK) {
                        set2.add(BK4);
                        this.A08.CtP(i);
                    } else {
                        set2.add(BK4);
                        set3.add(this.A04.BK4(obj2));
                        this.A08.CtP(i);
                    }
                }
                this.A08.CtQ(i);
            }
        } else {
            set = this.A0B;
        }
        set.add(this.A04.BK4(obj2));
    }

    public void A0E(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr, Object obj, int i) {
        List list;
        if (obj != null) {
            this.A04.getClass();
            String BF8 = this.A04.BF8(obj);
            java.util.Set set = this.A0C;
            if (!set.contains(BF8)) {
                if (this.A04.CdX(obj)) {
                    this.A0D.clear();
                    this.A01 = i;
                    set.add(BF8);
                    list = this.A09;
                } else {
                    if (!this.A04.CZK(obj)) {
                        return;
                    }
                    this.A0E.clear();
                    this.A02 = i;
                    set.add(BF8);
                    list = this.A0A;
                }
                list.add(BF8);
                this.A06 = true;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
    
        if (A0H(r18, r19, r7, r8, r9, r22) != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001f, code lost:
    
        if (r9 != (-1)) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0F(X.InterfaceC57162jr r18, X.C1PZ r19, java.lang.Object r20, java.util.List r21, int r22) {
        /*
            r17 = this;
            r4 = r17
            r2 = r21
            int r8 = r4.A05(r2)
            int r9 = r4.A06(r2)
            r3 = r20
            X.1ut r7 = r4.A09(r3)
            r7.getClass()
            r10 = r22
            int r15 = r4.A03(r7, r8, r9, r10)
            r1 = -1
            if (r8 != r1) goto L21
            r0 = 1
            if (r9 == r1) goto L22
        L21:
            r0 = 0
        L22:
            r2.size()
            r6 = r19
            if (r0 == 0) goto L40
            java.lang.String r0 = "highest_position_rule_did_meet"
            r6.A01(r0)
        L2e:
            r11 = r4
            r12 = r6
            r13 = r8
            r14 = r9
            r16 = r10
            r11.A0G(r12, r13, r14, r15, r16)
            X.31l r0 = r4.A08
            r0.CtE(r15, r3)
        L3c:
            A00(r4, r6, r7, r15)
            return
        L40:
            r5 = r18
            boolean r0 = r4.A0H(r5, r6, r7, r8, r9, r10)
            if (r0 == 0) goto L3c
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC672431p.A0F(X.2jr, X.1PZ, java.lang.Object, java.util.List, int):void");
    }

    public void A0G(C1PZ c1pz, int i, int i2, int i3, int i4) {
        c1pz.A03 = i3;
        c1pz.A02 = i4;
        c1pz.A0C = C05F.A01;
        this.A06 = false;
    }

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        Object obj = c59062n7.A04;
        Object A0A = A0A(obj);
        if (interfaceC57162jr.CFq(c59062n7) == C05F.A00) {
            int A04 = A04(obj);
            this.A00 = A04;
            A0E(c59062n7, interfaceC57162jr, A0A, A04);
            A0D(this.A00, A0A, c59062n7.A03);
        }
    }

    public AbstractC672431p(InterfaceC670931a interfaceC670931a, InterfaceC672031l interfaceC672031l, boolean z) {
        this.A0F = z;
        this.A08 = interfaceC672031l;
        this.A07 = interfaceC670931a;
    }

    public int A05(List list) {
        if (!list.isEmpty()) {
            List list2 = this.A09;
            ListIterator listIterator = list2.listIterator(list2.size());
            while (listIterator.hasPrevious()) {
                int indexOf = list.indexOf(listIterator.previous());
                if (indexOf != -1) {
                    return indexOf;
                }
                listIterator.remove();
            }
            return -1;
        }
        return -2;
    }

    public int A06(List list) {
        if (!list.isEmpty()) {
            List list2 = this.A0A;
            ListIterator listIterator = list2.listIterator(list2.size());
            while (listIterator.hasPrevious()) {
                int indexOf = list.indexOf(listIterator.previous());
                if (indexOf != -1) {
                    return indexOf;
                }
                listIterator.remove();
            }
            return -1;
        }
        return -2;
    }

    public int A01(int i, int i2) {
        return -1;
    }

    public boolean A0I(InterfaceC57162jr interfaceC57162jr, C40861ut c40861ut, Object obj, int i, int i2, int i3, int i4, int i5) {
        return false;
    }
}
