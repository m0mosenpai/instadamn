package X;

import com.google.common.collect.AbstractMapBasedMultimap;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: Add missing generic type declarations: [V] */
/* loaded from: classes10.dex */
public class RQB<V> extends AbstractMapBasedMultimap<K, V>.WrappedCollection implements List<V> {
    public final /* synthetic */ AbstractMapBasedMultimap A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RQB(final AbstractC64893TYt this$0, AbstractMapBasedMultimap key, Object delegate, List ancestor) {
        super(this$0, key, delegate, ancestor);
        this.A00 = key;
    }

    @Override // java.util.List
    public final void add(int index, Object element) {
        A01();
        boolean isEmpty = this.A00.isEmpty();
        ((List) this.A00).add(index, element);
        this.A00.A00++;
        if (isEmpty) {
            A00();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int index, Collection c) {
        if (c.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.A00).addAll(index, c);
        if (!addAll) {
            return addAll;
        }
        int size2 = this.A00.size();
        this.A00.A00 += size2 - size;
        if (size != 0) {
            return addAll;
        }
        A00();
        return addAll;
    }

    @Override // java.util.List
    public final Object get(int index) {
        A01();
        return ((List) this.A00).get(index);
    }

    @Override // java.util.List
    public final int indexOf(Object o) {
        A01();
        return ((List) this.A00).indexOf(o);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object o) {
        A01();
        return ((List) this.A00).lastIndexOf(o);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int index) {
        A01();
        return new RQA(this, index);
    }

    @Override // java.util.List
    public final Object remove(int index) {
        A01();
        Object remove = ((List) this.A00).remove(index);
        AbstractMapBasedMultimap abstractMapBasedMultimap = this.A00;
        abstractMapBasedMultimap.A00--;
        A02();
        return remove;
    }

    @Override // java.util.List
    public final Object set(int index, Object element) {
        A01();
        return ((List) this.A00).set(index, element);
    }

    @Override // java.util.List
    public final List subList(int fromIndex, int toIndex) {
        A01();
        AbstractMapBasedMultimap abstractMapBasedMultimap = this.A00;
        Object obj = this.A02;
        List subList = ((List) this.A00).subList(fromIndex, toIndex);
        AbstractC64893TYt abstractC64893TYt = this.A01;
        if (abstractC64893TYt == null) {
            abstractC64893TYt = this;
        }
        if (subList instanceof RandomAccess) {
            return new RQB(abstractC64893TYt, abstractMapBasedMultimap, obj, subList);
        }
        return new RQB(abstractC64893TYt, abstractMapBasedMultimap, obj, subList);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        A01();
        return new RQA(this);
    }
}
