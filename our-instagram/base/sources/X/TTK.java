package X;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class TTK implements Iterator, C0s1 {
    public int A00;
    public Object A01 = C6LU.A00;
    public boolean A02;
    public int A03;
    public Object A04;
    public final C58476Pw2 A05;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Iterator
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C58477Pw3 next() {
        Pw1 pw1 = this.A05.A03;
        if (pw1.A00 == this.A00) {
            if (hasNext()) {
                Object obj = this.A04;
                this.A01 = obj;
                this.A02 = true;
                this.A03++;
                V v = pw1.get(obj);
                if (v != 0) {
                    C58477Pw3 c58477Pw3 = (C58477Pw3) v;
                    this.A04 = c58477Pw3.A00;
                    return c58477Pw3;
                }
                StringBuilder A1C = AbstractC166987dD.A1C();
                A1C.append("Hash code of a key (");
                A1C.append(this.A04);
                throw new ConcurrentModificationException(AbstractC166997dE.A0x(") has changed after it was added to the persistent map.", A1C));
            }
            throw AbstractC58318PtA.A13();
        }
        throw AbstractC58318PtA.A0z();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return AbstractC167007dF.A1Q(this.A03, this.A05.size());
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.A02) {
            C58476Pw2 c58476Pw2 = this.A05;
            C15500q5.A04(c58476Pw2).remove(this.A01);
            this.A01 = null;
            this.A02 = false;
            this.A00 = c58476Pw2.A03.A00;
            this.A03--;
            return;
        }
        throw AbstractC58318PtA.A0Z();
    }

    public TTK(Object obj, C58476Pw2 c58476Pw2) {
        this.A04 = obj;
        this.A05 = c58476Pw2;
        this.A00 = c58476Pw2.A03.A00;
    }
}
