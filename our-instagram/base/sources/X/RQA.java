package X;

import java.util.List;
import java.util.ListIterator;

/* loaded from: classes10.dex */
public final class RQA extends TT3 implements ListIterator {
    public final /* synthetic */ RQB A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RQA(final RQB this$1, int index) {
        super(this$1, ((List) this$1.A00).listIterator(index));
        this.A00 = this$1;
    }

    @Override // java.util.ListIterator
    public final void add(Object value) {
        RQB rqb = this.A00;
        boolean isEmpty = rqb.isEmpty();
        A00();
        ((ListIterator) this.A01).add(value);
        rqb.A00.A00++;
        if (isEmpty) {
            rqb.A00();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        A00();
        return ((ListIterator) this.A01).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        A00();
        return ((ListIterator) this.A01).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        A00();
        return ((ListIterator) this.A01).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        A00();
        return ((ListIterator) this.A01).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object value) {
        A00();
        ((ListIterator) this.A01).set(value);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RQA(final RQB this$1) {
        super(this$1);
        this.A00 = this$1;
    }
}
