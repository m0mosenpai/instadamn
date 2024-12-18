package X;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: X.0Yr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C07000Yr extends C17020su implements ListIterator, InterfaceC15590qF {
    public final /* synthetic */ AbstractC06990Yq A00;

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C07000Yr(AbstractC06990Yq abstractC06990Yq, int i) {
        super(abstractC06990Yq);
        this.A00 = abstractC06990Yq;
        C0eC.A03(i, abstractC06990Yq.size());
        super.A00 = i;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (super.A00 <= 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return super.A00;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return super.A00 - 1;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            AbstractC06990Yq abstractC06990Yq = this.A00;
            int i = super.A00 - 1;
            super.A00 = i;
            return abstractC06990Yq.get(i);
        }
        throw new NoSuchElementException();
    }
}
