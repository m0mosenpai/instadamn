package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.0l3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC12580l3 implements Iterator, C0s1 {
    public int A00;
    public int A01;
    public boolean A02;

    public abstract Object A00(int i);

    public abstract void A01(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.A01 >= this.A00) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.A02) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i = this.A01 - 1;
        this.A01 = i;
        A01(i);
        this.A00--;
        this.A02 = false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            Object A00 = A00(this.A01);
            this.A01++;
            this.A02 = true;
            return A00;
        }
        throw new NoSuchElementException();
    }
}
