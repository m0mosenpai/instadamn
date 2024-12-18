package X;

import java.util.Iterator;

/* renamed from: X.TSt, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64759TSt implements Iterator {
    public int A00;
    public int A01;
    public AbstractC62759SPq A02;
    public boolean A03;
    public final InterfaceC75173Zi A04;
    public final Iterator A05;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.A00 <= 0 && !this.A05.hasNext()) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final void remove() {
        AbstractC58321PtD.A1T(this.A03);
        if (this.A01 == 1) {
            this.A05.remove();
        } else {
            InterfaceC75173Zi interfaceC75173Zi = this.A04;
            AbstractC62759SPq abstractC62759SPq = this.A02;
            abstractC62759SPq.getClass();
            interfaceC75173Zi.remove(abstractC62759SPq.A01());
        }
        this.A01--;
        this.A03 = false;
    }

    public C64759TSt(InterfaceC75173Zi multiset, Iterator entryIterator) {
        this.A04 = multiset;
        this.A05 = entryIterator;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            int i = this.A00;
            if (i == 0) {
                AbstractC62759SPq abstractC62759SPq = (AbstractC62759SPq) this.A05.next();
                this.A02 = abstractC62759SPq;
                i = abstractC62759SPq.A00();
                this.A00 = i;
                this.A01 = i;
            }
            this.A00 = i - 1;
            this.A03 = true;
            AbstractC62759SPq abstractC62759SPq2 = this.A02;
            abstractC62759SPq2.getClass();
            return abstractC62759SPq2.A01();
        }
        throw AbstractC58318PtA.A13();
    }
}
