package X;

import com.google.common.collect.LinkedListMultimap;
import java.util.Iterator;

/* renamed from: X.TSs, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64758TSs implements Iterator {
    public int A00;
    public RQI A01;
    public RQI A02;
    public final java.util.Set A03;
    public final /* synthetic */ LinkedListMultimap A04;

    public C64758TSs(final LinkedListMultimap this$0) {
        this.A04 = this$0;
        this.A03 = AbstractC103614ld.A02(this$0.keySet().size());
        this.A02 = this$0.A02;
        this.A00 = this$0.A00;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.A04.A00 == this.A00) {
            return AbstractC167007dF.A1W(this.A02);
        }
        throw AbstractC58318PtA.A0z();
    }

    @Override // java.util.Iterator
    public final Object next() {
        RQI rqi;
        if (this.A04.A00 == this.A00) {
            RQI rqi2 = this.A02;
            if (rqi2 != null) {
                this.A01 = rqi2;
                java.util.Set set = this.A03;
                set.add(rqi2.A05);
                do {
                    rqi = this.A02.A00;
                    this.A02 = rqi;
                    if (rqi == null) {
                        break;
                    }
                } while (!set.add(rqi.A05));
                return this.A01.A05;
            }
            throw AbstractC58318PtA.A13();
        }
        throw AbstractC58318PtA.A0z();
    }

    @Override // java.util.Iterator
    public final void remove() {
        LinkedListMultimap linkedListMultimap = this.A04;
        if (linkedListMultimap.A00 == this.A00) {
            AbstractC58321PtD.A1T(AbstractC167007dF.A1W(this.A01));
            LinkedListMultimap.A02(linkedListMultimap, this.A01.A05);
            this.A01 = null;
            this.A00 = linkedListMultimap.A00;
            return;
        }
        throw AbstractC58318PtA.A0z();
    }
}
