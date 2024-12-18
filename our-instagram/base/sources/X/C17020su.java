package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.0su, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C17020su implements Iterator, InterfaceC15590qF {
    public int A00;
    public final /* synthetic */ AbstractC06990Yq A01;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public C17020su(AbstractC06990Yq abstractC06990Yq) {
        this.A01 = abstractC06990Yq;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.A00 >= this.A01.size()) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            AbstractC06990Yq abstractC06990Yq = this.A01;
            int i = this.A00;
            this.A00 = i + 1;
            return abstractC06990Yq.get(i);
        }
        throw new NoSuchElementException();
    }
}
