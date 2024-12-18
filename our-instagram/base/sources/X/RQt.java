package X;

import com.google.common.collect.ConcurrentHashMultiset;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class RQt extends AbstractC451425u implements Iterator {
    public AbstractC62759SPq A00;
    public final /* synthetic */ ConcurrentHashMultiset A01;
    public final /* synthetic */ Iterator A02;

    public RQt(final ConcurrentHashMultiset this$0, final Iterator val$readOnlyIterator) {
        this.A01 = this$0;
        this.A02 = val$readOnlyIterator;
    }

    @Override // X.AbstractC451425u
    public final /* bridge */ /* synthetic */ Object A00() {
        return this.A02;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A02.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        AbstractC62759SPq abstractC62759SPq = (AbstractC62759SPq) this.A02.next();
        this.A00 = abstractC62759SPq;
        return abstractC62759SPq;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        if (r0 == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        if (r1.compareAndSet(r0, 0) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        r2.remove(r4, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0022, code lost:
    
        if (r1 == null) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
    
        r5.A00 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0027, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        r0 = r1.get();
     */
    @Override // java.util.Iterator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void remove() {
        /*
            r5 = this;
            X.SPq r0 = r5.A00
            boolean r0 = X.AbstractC167007dF.A1W(r0)
            X.AbstractC58321PtD.A1T(r0)
            com.google.common.collect.ConcurrentHashMultiset r1 = r5.A01
            X.SPq r0 = r5.A00
            java.lang.Object r4 = r0.A01()
            r3 = 0
            r4.getClass()
            java.util.concurrent.ConcurrentMap r2 = r1.A00
            r2.getClass()
            java.lang.Object r1 = r2.get(r4)     // Catch: java.lang.Throwable -> L1f
            goto L20
        L1f:
            r1 = 0
        L20:
            java.util.concurrent.atomic.AtomicInteger r1 = (java.util.concurrent.atomic.AtomicInteger) r1
            if (r1 != 0) goto L28
        L24:
            r0 = 0
            r5.A00 = r0
            return
        L28:
            int r0 = r1.get()
            if (r0 == 0) goto L24
            boolean r0 = r1.compareAndSet(r0, r3)
            if (r0 == 0) goto L28
            r2.remove(r4, r1)
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RQt.remove():void");
    }

    public RQt() {
    }
}
