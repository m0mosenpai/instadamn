package X;

import java.util.Iterator;

/* loaded from: classes9.dex */
public final class PUE implements Iterator, InterfaceC15590qF {
    public int A00;
    public final int A01 = 1;
    public final Object A02;
    public final Object A03;

    public PUE(PV2 pv2) {
        this.A03 = pv2;
        this.A02 = pv2.A01.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.A01 != 0) {
            return ((Iterator) this.A02).hasNext();
        }
        return AbstractC167007dF.A1Q(this.A00, ((String[]) this.A02).length);
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (this.A01 != 0) {
            InterfaceC16620sF interfaceC16620sF = ((PV2) this.A03).A00;
            int i = this.A00;
            this.A00 = i + 1;
            if (i < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            return interfaceC16620sF.invoke(Integer.valueOf(i), ((Iterator) this.A02).next());
        }
        int i2 = this.A00;
        this.A00 = i2 + 1;
        return new PUF((Object[]) this.A03, (String[]) this.A02, i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.A01;
        throw AbstractC166987dD.A1D(AbstractC111324zv.A00(30));
    }

    public PUE(Object[] objArr, String[] strArr) {
        this.A02 = strArr;
        this.A03 = objArr;
    }
}
