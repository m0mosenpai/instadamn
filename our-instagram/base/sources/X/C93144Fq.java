package X;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/* renamed from: X.4Fq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C93144Fq implements Iterator, InterfaceC15590qF {
    public int A00;
    public int A01;
    public C3ZQ A02;
    public LinkedList A03;
    public LinkedList A04;
    public final C206209Bd A05;
    public final C5H0 A06;
    public final C93124Fo A07;
    public final C93154Fr A08;
    public final C3AW A09;
    public final java.util.Set A0A;
    public final InterfaceC16660sJ A0B;

    public C93144Fq(C206209Bd c206209Bd, C5H0 c5h0, C93124Fo c93124Fo, C3AW c3aw, Iterable iterable, InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(iterable, 1);
        this.A07 = c93124Fo;
        this.A09 = c3aw;
        this.A05 = c206209Bd;
        this.A06 = c5h0;
        this.A0B = interfaceC16660sJ;
        this.A0A = new LinkedHashSet();
        this.A03 = new LinkedList();
        this.A04 = new LinkedList();
        this.A08 = new C93154Fr();
        LinkedList linkedList = this.A03;
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((C09530e4) it.next()).A00);
        }
        linkedList.addAll(arrayList);
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return A00(this, false);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static final C9BW A00(C93144Fq c93144Fq, boolean z) {
        Object Ava;
        C3ZQ c3zq = c93144Fq.A02;
        if (c3zq == null) {
            c3zq = A01(c93144Fq);
        }
        C9BO c9bo = null;
        c93144Fq.A02 = null;
        if (c3zq != null && (Ava = c3zq.Ava()) != null) {
            if (z) {
                c9bo = new C9BO(c93144Fq.A01, 9, c93144Fq.A07.A00(c3zq));
            }
            return new C9BW(39, c9bo, Ava);
        }
        throw new IllegalStateException("UiGraphIterator: next() called without a prior call to hasNext()");
    }

    public static final C3ZQ A01(C93144Fq c93144Fq) {
        C3ZQ c3zq;
        Object Ava;
        Number number;
        int intValue;
        C09530e4 A00;
        while (true) {
            c3zq = null;
            if (c93144Fq.A03.isEmpty()) {
                break;
            }
            C3ZQ c3zq2 = (C3ZQ) c93144Fq.A03.remove();
            java.util.Set set = c93144Fq.A0A;
            if (!set.contains(c3zq2)) {
                c3zq = c3zq2;
            }
            if (c3zq != null) {
                set.add(c3zq);
                int i = c93144Fq.A00;
                c93144Fq.A01 = i;
                Iterable BWV = c3zq.BWV(c93144Fq.A05, c93144Fq.A09, i);
                ArrayList arrayList = new ArrayList();
                for (Object obj : BWV) {
                    if (!set.contains(((C09530e4) obj).A00)) {
                        arrayList.add(obj);
                    }
                }
                Iterator it = arrayList.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    C09530e4 c09530e4 = (C09530e4) it.next();
                    Number number2 = (Number) c09530e4.A01;
                    if (number2.intValue() > 1) {
                        C93154Fr c93154Fr = c93144Fq.A08;
                        Object obj2 = c09530e4.A00;
                        int intValue2 = number2.intValue();
                        int i3 = c93144Fq.A00;
                        C14360o3.A0B(obj2, 0);
                        int i4 = i3 + intValue2;
                        SparseArray sparseArray = c93154Fr.A00;
                        List list = (List) sparseArray.get(i4);
                        if (list == null) {
                            list = new ArrayList();
                            sparseArray.put(i4, list);
                            c93154Fr.A01.add(Integer.valueOf(i4));
                        }
                        list.add(obj2);
                    } else if (number2.intValue() > 0) {
                        c93144Fq.A04.add(c09530e4.A00);
                    } else if (number2.intValue() == 0) {
                        c93144Fq.A03.add(i2, c09530e4.A00);
                        i2++;
                    } else {
                        number2.intValue();
                    }
                    C93124Fo c93124Fo = c93144Fq.A07;
                    Object obj3 = c09530e4.A00;
                    C14360o3.A0B(obj3, 1);
                    if (!(obj3 instanceof C3ZR)) {
                        InterfaceC09390do interfaceC09390do = c93124Fo.A00;
                        if (!((Map) interfaceC09390do.getValue()).containsKey(obj3) && (A00 = c93124Fo.A00(c3zq)) != null) {
                            ((Map) interfaceC09390do.getValue()).put(obj3, A00);
                        }
                    }
                }
            }
            if (c93144Fq.A03.isEmpty()) {
                LinkedList linkedList = c93144Fq.A03;
                c93144Fq.A03 = c93144Fq.A04;
                c93144Fq.A04 = linkedList;
                int i5 = c93144Fq.A00 + 1;
                c93144Fq.A00 = i5;
                C93154Fr c93154Fr2 = c93144Fq.A08;
                PriorityQueue priorityQueue = c93154Fr2.A01;
                Number number3 = (Number) priorityQueue.peek();
                if (number3 != null && i5 >= (intValue = number3.intValue())) {
                    if (i5 <= intValue) {
                        priorityQueue.remove();
                        SparseArray sparseArray2 = c93154Fr2.A00;
                        Iterable iterable = (Iterable) sparseArray2.get(i5);
                        sparseArray2.delete(i5);
                        if (iterable != null) {
                            AnonymousClass016.A16(iterable, c93144Fq.A03);
                        }
                    } else {
                        throw new IllegalStateException("Skipped depth of parked nodes");
                    }
                }
                if (c93144Fq.A03.isEmpty() && (number = (Number) priorityQueue.poll()) != null) {
                    int intValue3 = number.intValue();
                    SparseArray sparseArray3 = c93154Fr2.A00;
                    Object obj4 = sparseArray3.get(intValue3);
                    sparseArray3.delete(intValue3);
                    c93144Fq.A00 = number.intValue();
                    Iterable iterable2 = (Iterable) obj4;
                    if (iterable2 != null) {
                        AnonymousClass016.A16(iterable2, c93144Fq.A03);
                    }
                }
            }
            if (c3zq != null && (Ava = c3zq.Ava()) != null && ((Boolean) c93144Fq.A0B.invoke(Ava)).booleanValue()) {
                break;
            }
        }
        return c3zq;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.A02 == null) {
            C3ZQ A01 = A01(this);
            this.A02 = A01;
            if (A01 == null) {
                return false;
            }
        }
        return true;
    }
}
