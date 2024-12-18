package X;

/* loaded from: classes10.dex */
public final class RN9 extends RNA {
    public int A00;
    public final int A01;
    public final RN5 A02;

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.A00;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.A00 - 1;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return AbstractC167007dF.A1Q(this.A00, this.A01);
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return AbstractC167007dF.A1O(this.A00);
    }

    public RN9(RN5 rn5, int i) {
        int size = rn5.size();
        if (i <= size) {
            this.A01 = size;
            this.A00 = i;
            this.A02 = rn5;
            return;
        }
        throw AbstractC58318PtA.A0a(AbstractC63067Sbo.A00("index", i, size));
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i = this.A00;
            this.A00 = i + 1;
            return this.A02.get(i);
        }
        throw AbstractC58318PtA.A13();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.A00 - 1;
            this.A00 = i;
            return this.A02.get(i);
        }
        throw AbstractC58318PtA.A13();
    }
}
