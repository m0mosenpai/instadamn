package X;

import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;

/* loaded from: classes10.dex */
public final class RSC<E> extends RQY<E> implements SortedSet<E> {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.A01).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator<E> it = this.A01.iterator();
        InterfaceC28041Xi interfaceC28041Xi = this.A00;
        it.getClass();
        interfaceC28041Xi.getClass();
        while (it.hasNext()) {
            E next = it.next();
            if (interfaceC28041Xi.apply(next)) {
                return next;
            }
        }
        throw AbstractC58318PtA.A13();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.SortedSet, X.TYr] */
    @Override // java.util.SortedSet
    public final SortedSet headSet(Object toElement) {
        return new C64891TYr(this.A00, ((SortedSet) this.A01).headSet(toElement));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSet = (SortedSet) this.A01;
        while (true) {
            Object last = sortedSet.last();
            if (this.A00.apply(last)) {
                return last;
            }
            sortedSet = sortedSet.headSet(last);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.SortedSet, X.TYr] */
    @Override // java.util.SortedSet
    public final SortedSet subSet(Object fromElement, Object toElement) {
        return new C64891TYr(this.A00, ((SortedSet) this.A01).subSet(fromElement, toElement));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.SortedSet, X.TYr] */
    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object fromElement) {
        return new C64891TYr(this.A00, ((SortedSet) this.A01).tailSet(fromElement));
    }
}
