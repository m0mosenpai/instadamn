package X;

import java.util.ListIterator;

/* loaded from: classes10.dex */
public final class TTW implements ListIterator, C0s1 {
    public int A00;
    public int A01 = -1;
    public int A02;
    public final C6MK A03;

    private final void A00() {
        if (this.A03.A01() == this.A02) {
        } else {
            throw AbstractC58318PtA.A0z();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        if (this.A00 < this.A03.size() - 1) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return MSY.A1R(this.A00);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.A00 + 1;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.A00;
    }

    public TTW(C6MK c6mk, int i) {
        this.A03 = c6mk;
        this.A00 = i - 1;
        this.A02 = c6mk.A01();
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        A00();
        C6MK c6mk = this.A03;
        c6mk.add(this.A00 + 1, obj);
        this.A01 = -1;
        this.A00++;
        this.A02 = c6mk.A01();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        A00();
        int i = this.A00 + 1;
        this.A01 = i;
        C6MK c6mk = this.A03;
        ST3.A00(i, c6mk.size());
        Object obj = c6mk.get(i);
        this.A00 = i;
        return obj;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        A00();
        int i = this.A00;
        C6MK c6mk = this.A03;
        ST3.A00(i, c6mk.size());
        int i2 = this.A00;
        this.A01 = i2;
        this.A00--;
        return c6mk.get(i2);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        A00();
        C6MK c6mk = this.A03;
        c6mk.remove(this.A00);
        this.A00--;
        this.A01 = -1;
        this.A02 = c6mk.A01();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        A00();
        int i = this.A01;
        if (i >= 0) {
            C6MK c6mk = this.A03;
            c6mk.set(i, obj);
            this.A02 = c6mk.A01();
            return;
        }
        throw AbstractC166987dD.A14("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
    }
}
