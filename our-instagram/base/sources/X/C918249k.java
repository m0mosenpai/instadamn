package X;

import java.util.NoSuchElementException;

/* renamed from: X.49k, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C918249k extends C1LC {
    public Object A00;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.A00 == null) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = this.A00;
        this.A00 = null;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException();
    }
}
