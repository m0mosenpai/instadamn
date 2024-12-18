package X;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class TSV implements Iterator {
    public Deque A00;
    public Iterator A01;
    public Iterator A02;
    public Iterator A03;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        while (true) {
            Iterator it2 = this.A01;
            it2.getClass();
            if (it2.hasNext()) {
                return true;
            }
            while (true) {
                Iterator it3 = this.A02;
                if (it3 != null && it3.hasNext()) {
                    it = this.A02;
                    break;
                }
                Deque deque = this.A00;
                if (deque == null || deque.isEmpty()) {
                    break;
                }
                this.A02 = (Iterator) this.A00.removeFirst();
            }
            it = null;
            this.A02 = it;
            if (it == null) {
                return false;
            }
            Iterator it4 = (Iterator) it.next();
            this.A01 = it4;
            if (it4 instanceof TSV) {
                TSV tsv = (TSV) it4;
                this.A01 = tsv.A01;
                Deque deque2 = this.A00;
                if (deque2 == null) {
                    deque2 = new ArrayDeque();
                    this.A00 = deque2;
                }
                deque2.addFirst(this.A02);
                if (tsv.A00 != null) {
                    while (!tsv.A00.isEmpty()) {
                        this.A00.addFirst(tsv.A00.removeLast());
                    }
                }
                this.A02 = tsv.A02;
            }
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        Iterator it = this.A03;
        if (it != null) {
            it.remove();
            this.A03 = null;
            return;
        }
        throw AbstractC166987dD.A14("no calls to next() since the last call to remove()");
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            Iterator it = this.A01;
            this.A03 = it;
            return it.next();
        }
        throw AbstractC58318PtA.A13();
    }
}
