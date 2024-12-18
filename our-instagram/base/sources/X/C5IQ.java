package X;

import java.util.Iterator;

/* renamed from: X.5IQ, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5IQ implements Iterator {
    public final Iterator A00;

    public Object A00(Object from) {
        return ((C5IO) this).A00.function.apply(from);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A00.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return A00(this.A00.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.A00.remove();
    }

    public C5IQ(Iterator backingIterator) {
        backingIterator.getClass();
        this.A00 = backingIterator;
    }
}
