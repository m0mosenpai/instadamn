package X;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes10.dex */
public class RNW extends AbstractC64892TYs implements List {
    public final /* synthetic */ AbstractC60698RNa A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNW(AbstractC64892TYs abstractC64892TYs, AbstractC60698RNa abstractC60698RNa, Object obj, List list) {
        super(abstractC64892TYs, abstractC60698RNa, obj, list);
        this.A00 = abstractC60698RNa;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        A01();
        boolean isEmpty = super.A00.isEmpty();
        ((List) super.A00).add(i, obj);
        this.A00.A00++;
        if (isEmpty) {
            A00();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) super.A00).addAll(i, collection);
        if (!addAll) {
            return addAll;
        }
        int size2 = super.A00.size();
        this.A00.A00 += size2 - size;
        if (size != 0) {
            return addAll;
        }
        A00();
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        A01();
        return ((List) super.A00).get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        A01();
        return ((List) super.A00).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        A01();
        return ((List) super.A00).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        A01();
        return new RNU(this, i);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        A01();
        Object remove = ((List) super.A00).remove(i);
        AbstractC60698RNa abstractC60698RNa = this.A00;
        abstractC60698RNa.A00--;
        A02();
        return remove;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        A01();
        return ((List) super.A00).set(i, obj);
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        A01();
        AbstractC60698RNa abstractC60698RNa = this.A00;
        Object obj = this.A02;
        List subList = ((List) super.A00).subList(i, i2);
        AbstractC64892TYs abstractC64892TYs = this.A01;
        if (abstractC64892TYs == null) {
            abstractC64892TYs = this;
        }
        if (subList instanceof RandomAccess) {
            return new RNW(abstractC64892TYs, abstractC60698RNa, obj, subList);
        }
        return new RNW(abstractC64892TYs, abstractC60698RNa, obj, subList);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        A01();
        return new RNU(this);
    }
}
