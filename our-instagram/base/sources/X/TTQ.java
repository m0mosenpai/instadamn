package X;

import com.google.common.collect.LinkedListMultimap;
import java.util.ListIterator;

/* loaded from: classes10.dex */
public final class TTQ implements ListIterator {
    public int A00;
    public int A01;
    public RQI A02;
    public RQI A03;
    public RQI A04;
    public final /* synthetic */ LinkedListMultimap A05;

    public TTQ(final LinkedListMultimap this$0, int index) {
        this.A05 = this$0;
        this.A00 = this$0.A00;
        int i = this$0.A01;
        C18C.A02(index, i);
        if (index >= i / 2) {
            this.A04 = this$0.A03;
            this.A01 = i;
            while (true) {
                int i2 = index + 1;
                if (index >= i) {
                    break;
                }
                A00();
                RQI rqi = this.A04;
                if (rqi != null) {
                    this.A02 = rqi;
                    this.A03 = rqi;
                    this.A04 = rqi.A02;
                    this.A01--;
                    index = i2;
                } else {
                    throw AbstractC58318PtA.A13();
                }
            }
        } else {
            this.A03 = this$0.A02;
            while (true) {
                int i3 = index - 1;
                if (index <= 0) {
                    break;
                }
                A00();
                RQI rqi2 = this.A03;
                if (rqi2 != null) {
                    this.A02 = rqi2;
                    this.A04 = rqi2;
                    this.A03 = rqi2.A00;
                    this.A01++;
                    index = i3;
                } else {
                    throw AbstractC58318PtA.A13();
                }
            }
        }
        this.A02 = null;
    }

    private void A00() {
        if (this.A05.A00 == this.A00) {
        } else {
            throw AbstractC58318PtA.A0z();
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.A01;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.A01 - 1;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object e) {
        throw AbstractC43592JPx.A11();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        A00();
        return AbstractC167007dF.A1W(this.A03);
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        A00();
        return AbstractC167007dF.A1W(this.A04);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        A00();
        RQI rqi = this.A03;
        if (rqi != null) {
            this.A02 = rqi;
            this.A04 = rqi;
            this.A03 = rqi.A00;
            this.A01++;
            return rqi;
        }
        throw AbstractC58318PtA.A13();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        A00();
        RQI rqi = this.A04;
        if (rqi != null) {
            this.A02 = rqi;
            this.A03 = rqi;
            this.A04 = rqi.A02;
            this.A01--;
            return rqi;
        }
        throw AbstractC58318PtA.A13();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        A00();
        AbstractC58321PtD.A1T(AbstractC167007dF.A1W(this.A02));
        RQI rqi = this.A02;
        if (rqi != this.A03) {
            this.A04 = rqi.A02;
            this.A01--;
        } else {
            this.A03 = rqi.A00;
        }
        LinkedListMultimap linkedListMultimap = this.A05;
        LinkedListMultimap.A01(rqi, linkedListMultimap);
        this.A02 = null;
        this.A00 = linkedListMultimap.A00;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object e) {
        throw AbstractC43592JPx.A11();
    }
}
