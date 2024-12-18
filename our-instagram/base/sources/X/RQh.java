package X;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class RQh extends AbstractC58576Pxu {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Iterable A01;

    public RQh(final Iterable val$iterable, final int val$numberToSkip) {
        this.A01 = val$iterable;
        this.A00 = val$numberToSkip;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterable iterable = this.A01;
        if (iterable instanceof List) {
            List list = (List) iterable;
            return list.subList(Math.min(list.size(), this.A00), list.size()).iterator();
        }
        Iterator it = iterable.iterator();
        int i = this.A00;
        it.getClass();
        C18C.A0G(MSY.A1R(i), "numberToAdvance must be nonnegative");
        for (int i2 = 0; i2 < i && it.hasNext(); i2++) {
            it.next();
        }
        return new C64744TSd(it);
    }
}
