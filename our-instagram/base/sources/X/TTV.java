package X;

import java.util.ListIterator;

/* loaded from: classes10.dex */
public final class TTV implements ListIterator, C0s1 {
    public final /* synthetic */ TTN A00;
    public final /* synthetic */ C15100pQ A01;

    public TTV(TTN ttn, C15100pQ c15100pQ) {
        this.A01 = c15100pQ;
        this.A00 = ttn;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        throw AbstractC166987dD.A14("Cannot modify a state list through an iterator");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        if (this.A01.A00 < this.A00.size() - 1) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return MSY.A1R(this.A01.A00);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        C15100pQ c15100pQ = this.A01;
        int i = c15100pQ.A00 + 1;
        TTN ttn = this.A00;
        ST3.A00(i, ttn.size());
        c15100pQ.A00 = i;
        return ttn.get(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.A01.A00 + 1;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        C15100pQ c15100pQ = this.A01;
        int i = c15100pQ.A00;
        TTN ttn = this.A00;
        ST3.A00(i, ttn.size());
        c15100pQ.A00 = i - 1;
        return ttn.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.A01.A00;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ void remove() {
        throw AbstractC166987dD.A14("Cannot modify a state list through an iterator");
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        throw AbstractC166987dD.A14("Cannot modify a state list through an iterator");
    }
}
