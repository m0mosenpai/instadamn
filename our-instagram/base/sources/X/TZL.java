package X;

import java.util.AbstractQueue;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class TZL<E> extends AbstractQueue<E> {
    public int A00;
    public int A01;
    public Object[] A02;
    public final SP1 A03;
    public final SP1 A04;
    public final int maximumSize;

    public TZL(Comparator comparator, int i, int i2) {
        C4VF A00 = C4VF.A00(comparator);
        SP1 sp1 = new SP1(this, A00);
        this.A04 = sp1;
        SP1 sp12 = new SP1(this, A00.A01());
        this.A03 = sp12;
        sp1.A00 = sp12;
        sp12.A00 = sp1;
        this.maximumSize = i;
        this.A02 = new Object[i2];
    }

    public static int initialQueueSize(int configuredExpectedSize, int maximumSize, Iterable initialContents) {
        if (configuredExpectedSize == -1) {
            configuredExpectedSize = 11;
        }
        if (initialContents instanceof Collection) {
            configuredExpectedSize = Math.max(configuredExpectedSize, ((Collection) initialContents).size());
        }
        return Math.min(configuredExpectedSize - 1, maximumSize) + 1;
    }

    public static boolean isEvenLevel(int index) {
        int i = ((index + 1) ^ (-1)) ^ (-1);
        C18C.A0H(AbstractC167007dF.A1O(i), "negative index");
        return (1431655765 & i) > (i & (-1431655766));
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        for (int i = 0; i < this.A01; i++) {
            this.A02[i] = null;
        }
        this.A01 = 0;
    }

    public boolean isIntact() {
        SP1 sp1;
        int i;
        for (int i2 = 1; i2 < this.A01; i2++) {
            if (isEvenLevel(i2)) {
                sp1 = this.A04;
            } else {
                sp1 = this.A03;
            }
            int i3 = i2 * 2;
            int i4 = i3 + 1;
            TZL tzl = sp1.A02;
            if ((i4 >= tzl.A01 || sp1.A00(i2, i4) <= 0) && ((i = i3 + 2) >= tzl.A01 || sp1.A00(i2, i) <= 0)) {
                if (i2 > 0) {
                    int i5 = (i2 - 1) / 2;
                    if (sp1.A00(i2, i5) <= 0) {
                        if (i2 > 2 && sp1.A00((i5 - 1) / 2, i2) > 0) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static Object A00(TZL tzl, int i) {
        Object obj = tzl.A02[i];
        obj.getClass();
        return obj;
    }

    public int capacity() {
        return this.A02.length;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new TT0(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.C62498SEa removeAt(int r12) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TZL.removeAt(int):X.SEa");
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.A01;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        int i = this.A01;
        Object[] objArr = new Object[i];
        System.arraycopy(this.A02, 0, objArr, 0, i);
        return objArr;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public final boolean add(Object element) {
        offer(element);
        return true;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection newElements) {
        Iterator<E> it = newElements.iterator();
        boolean z = false;
        while (it.hasNext()) {
            offer(it.next());
            z = true;
        }
        return z;
    }

    @Override // java.util.Queue
    public final boolean offer(Object element) {
        SP1 sp1;
        int i;
        element.getClass();
        this.A00++;
        int i2 = this.A01;
        int i3 = i2 + 1;
        this.A01 = i3;
        int length = this.A02.length;
        if (i3 > length) {
            if (length < 64) {
                i = (length + 1) * 2;
            } else {
                int i4 = length / 2;
                long j = i4 * 3;
                i = (int) j;
                S38.A00(i4, 3, "checkedMultiply", AbstractC167007dF.A1N((j > i ? 1 : (j == i ? 0 : -1))));
            }
            Object[] objArr = new Object[Math.min(i - 1, this.maximumSize) + 1];
            Object[] objArr2 = this.A02;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.A02 = objArr;
        }
        if (isEvenLevel(i2)) {
            sp1 = this.A04;
        } else {
            sp1 = this.A03;
        }
        int A02 = sp1.A02(element, i2);
        if (A02 == i2) {
            A02 = i2;
        } else {
            sp1 = sp1.A00;
        }
        sp1.A01(element, A02);
        if (this.A01 <= this.maximumSize || isEmpty()) {
            return true;
        }
        int i5 = this.A01;
        int i6 = 1;
        if (i5 != 1) {
            if (i5 != 2 && this.A03.A00(1, 2) > 0) {
                i6 = 2;
            }
        } else {
            i6 = 0;
        }
        Object A00 = A00(this, i6);
        removeAt(i6);
        if (A00 != element) {
            return true;
        }
        return false;
    }

    @Override // java.util.Queue
    public final Object peek() {
        if (isEmpty()) {
            return null;
        }
        return A00(this, 0);
    }

    @Override // java.util.Queue
    public final Object poll() {
        if (isEmpty()) {
            return null;
        }
        Object A00 = A00(this, 0);
        removeAt(0);
        return A00;
    }
}
