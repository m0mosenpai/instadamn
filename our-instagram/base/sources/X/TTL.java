package X;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* loaded from: classes10.dex */
public final class TTL implements List<C58J>, InterfaceC15590qF {
    public final int A00;
    public final int A01;
    public final /* synthetic */ C5BP A02;

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC13370mN.A00(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC13370mN.A01(this, objArr);
    }

    public TTL(C5BP c5bp, int i, int i2) {
        this.A02 = c5bp;
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof C58J)) {
            return false;
        }
        return MSY.A1S(indexOf(obj), -1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.List
    public final /* bridge */ /* synthetic */ C58J get(int i) {
        C114325Dw c114325Dw = this.A02.A04[i + this.A01];
        C14360o3.A0C(c114325Dw, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return c114325Dw;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        int i;
        int i2;
        if ((obj instanceof C58J) && (i = this.A01) <= (i2 = this.A00)) {
            while (!C14360o3.A0K(this.A02.A04[i], obj)) {
                if (i != i2) {
                    i++;
                } else {
                    return -1;
                }
            }
            return i - i;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        C5BP c5bp = this.A02;
        int i = this.A01;
        return new TTT(c5bp, i, i, this.A00);
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        int i;
        int i2;
        if ((obj instanceof C58J) && (i2 = this.A01) <= (i = this.A00)) {
            while (!C14360o3.A0K(this.A02.A04[i], obj)) {
                if (i != i2) {
                    i--;
                } else {
                    return -1;
                }
            }
            return i - i2;
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator<C58J> listIterator(int i) {
        C5BP c5bp = this.A02;
        int i2 = this.A01;
        return new TTT(c5bp, i + i2, i2, this.A00);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return this.A00 - this.A01;
    }

    @Override // java.util.List
    public final List<C58J> subList(int i, int i2) {
        C5BP c5bp = this.A02;
        int i3 = this.A01;
        return new TTL(c5bp, i + i3, i3 + i2);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, C58J c58j) {
        throw AbstractC58321PtD.A10();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends C58J> collection) {
        throw AbstractC58321PtD.A10();
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw AbstractC58321PtD.A10();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return AbstractC167007dF.A1N(size());
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ C58J remove(int i) {
        throw AbstractC58321PtD.A10();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw AbstractC58321PtD.A10();
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator<C58J> unaryOperator) {
        throw AbstractC58321PtD.A10();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw AbstractC58321PtD.A10();
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ C58J set(int i, C58J c58j) {
        throw AbstractC58321PtD.A10();
    }

    @Override // java.util.List
    public final void sort(Comparator<? super C58J> comparator) {
        throw AbstractC58321PtD.A10();
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw AbstractC58321PtD.A10();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw AbstractC58321PtD.A10();
    }

    @Override // java.util.List
    public final ListIterator<C58J> listIterator() {
        C5BP c5bp = this.A02;
        int i = this.A01;
        return new TTT(c5bp, i, i, this.A00);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw AbstractC58321PtD.A10();
    }
}
