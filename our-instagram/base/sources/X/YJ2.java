package X;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* loaded from: classes12.dex */
public final class YJ2 implements Iterator, InterfaceC15590qF {
    public int A00;
    public final int A01;
    public final C117445Td A02;
    public final int A03;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.A00 >= this.A03) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        C117445Td c117445Td = this.A02;
        int i = c117445Td.A03;
        int i2 = this.A01;
        if (i == i2) {
            int i3 = this.A00;
            this.A00 = c117445Td.A08[(i3 * 5) + 3] + i3;
            return new YG4(c117445Td, i3, i2);
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw AbstractC166987dD.A1D(AbstractC111324zv.A00(30));
    }

    public YJ2(C117445Td c117445Td, int i, int i2) {
        this.A02 = c117445Td;
        this.A03 = i2;
        this.A00 = i;
        this.A01 = c117445Td.A03;
        if (!c117445Td.A07) {
        } else {
            throw new ConcurrentModificationException();
        }
    }
}
