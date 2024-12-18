package X;

import java.util.Iterator;

/* loaded from: classes10.dex */
public final class RST extends C1LC {
    public int A00;
    public Object A01;
    public final /* synthetic */ Iterator A02;

    public RST(Iterator it) {
        this.A02 = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.A00 <= 0 && !this.A02.hasNext()) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.A00;
        if (i <= 0) {
            AbstractC62759SPq abstractC62759SPq = (AbstractC62759SPq) this.A02.next();
            this.A01 = abstractC62759SPq.A01();
            i = abstractC62759SPq.A00();
            this.A00 = i;
        }
        this.A00 = i - 1;
        Object obj = this.A01;
        obj.getClass();
        return obj;
    }
}
