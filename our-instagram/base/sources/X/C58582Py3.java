package X;

import java.util.Iterator;

/* renamed from: X.Py3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58582Py3 extends AbstractC58576Pxu {
    public final int A00 = 0;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C58582Py3(Iterable iterable, final Iterable val$iterable) {
        super(iterable);
        this.A01 = val$iterable;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, java.lang.Object, X.TSV] */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        if (this.A00 != 0) {
            RQ1 rq1 = new RQ1(this);
            ?? obj = new Object();
            obj.A01 = RQ2.A01;
            obj.A02 = rq1;
            return obj;
        }
        return ((Iterable) this.A01).iterator();
    }

    public C58582Py3(final Iterable[] val$inputs) {
        this.A01 = val$inputs;
    }
}
