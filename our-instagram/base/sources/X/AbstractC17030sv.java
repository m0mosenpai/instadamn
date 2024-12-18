package X;

import java.util.Iterator;

/* renamed from: X.0sv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC17030sv implements Iterator, InterfaceC15590qF {
    public int A00;
    public Object A01;

    public abstract void A00();

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.A00;
        if (i != 0) {
            if (i == 1) {
                return true;
            }
            if (i == 2) {
                return false;
            }
            throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
        }
        this.A00 = 3;
        A00();
        if (this.A00 == 1) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0011, code lost:
    
        if (r4.A00 == 1) goto L8;
     */
    @Override // java.util.Iterator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object next() {
        /*
            r4 = this;
            int r3 = r4.A00
            r2 = 0
            r1 = 1
            if (r3 == r1) goto L13
            r0 = 2
            if (r3 == r0) goto L18
            r0 = 3
            r4.A00 = r0
            r4.A00()
            int r0 = r4.A00
            if (r0 != r1) goto L18
        L13:
            r4.A00 = r2
            java.lang.Object r0 = r4.A01
            return r0
        L18:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC17030sv.next():java.lang.Object");
    }
}
