package X;

import com.google.common.collect.LinkedListMultimap;
import java.util.ListIterator;

/* loaded from: classes10.dex */
public final class TTR implements ListIterator {
    public int A00;
    public RQI A01;
    public RQI A02;
    public RQI A03;
    public final Object A04;
    public final /* synthetic */ LinkedListMultimap A05;

    public TTR(final LinkedListMultimap this$0, Object key) {
        RQI rqi;
        this.A05 = this$0;
        this.A04 = key;
        C61569Rps c61569Rps = (C61569Rps) this$0.A04.get(key);
        if (c61569Rps == null) {
            rqi = null;
        } else {
            rqi = c61569Rps.A01;
        }
        this.A02 = rqi;
    }

    @Override // java.util.ListIterator
    public final void add(Object value) {
        this.A03 = LinkedListMultimap.A00(this.A02, this.A05, this.A04, value);
        this.A00++;
        this.A01 = null;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return AbstractC167007dF.A1W(this.A02);
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return AbstractC167007dF.A1W(this.A03);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        RQI rqi = this.A02;
        if (rqi != null) {
            this.A01 = rqi;
            this.A03 = rqi;
            this.A02 = rqi.A01;
            this.A00++;
            return rqi.A04;
        }
        throw AbstractC58318PtA.A13();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.A00;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        RQI rqi = this.A03;
        if (rqi != null) {
            this.A01 = rqi;
            this.A02 = rqi;
            this.A03 = rqi.A03;
            this.A00--;
            return rqi.A04;
        }
        throw AbstractC58318PtA.A13();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.A00 - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        AbstractC58321PtD.A1T(AbstractC167007dF.A1W(this.A01));
        RQI rqi = this.A01;
        if (rqi != this.A02) {
            this.A03 = rqi.A03;
            this.A00--;
        } else {
            this.A02 = rqi.A01;
        }
        LinkedListMultimap.A01(rqi, this.A05);
        this.A01 = null;
    }

    @Override // java.util.ListIterator
    public final void set(Object value) {
        RQI rqi = this.A01;
        C18C.A0F(AbstractC167007dF.A1W(rqi));
        rqi.A04 = value;
    }

    public TTR(final LinkedListMultimap this$0, Object key, int index) {
        int i;
        RQI rqi;
        RQI rqi2;
        this.A05 = this$0;
        C61569Rps c61569Rps = (C61569Rps) this$0.A04.get(key);
        if (c61569Rps == null) {
            i = 0;
        } else {
            i = c61569Rps.A00;
        }
        C18C.A02(index, i);
        if (index >= i / 2) {
            if (c61569Rps == null) {
                rqi2 = null;
            } else {
                rqi2 = c61569Rps.A02;
            }
            this.A03 = rqi2;
            this.A00 = i;
            while (true) {
                int i2 = index + 1;
                if (index >= i) {
                    break;
                }
                previous();
                index = i2;
            }
        } else {
            if (c61569Rps == null) {
                rqi = null;
            } else {
                rqi = c61569Rps.A01;
            }
            this.A02 = rqi;
            while (true) {
                int i3 = index - 1;
                if (index <= 0) {
                    break;
                }
                next();
                index = i3;
            }
        }
        this.A04 = key;
        this.A01 = null;
    }
}
