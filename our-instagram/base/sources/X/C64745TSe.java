package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.TSe, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64745TSe implements Iterator {
    public int A00 = -1;
    public final /* synthetic */ C62652t4 A01;

    public C64745TSe(C62652t4 c62652t4) {
        this.A01 = c62652t4;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.A00 + 1;
        C62652t4 c62652t4 = this.A01;
        if (i < c62652t4.A01.size() + c62652t4.A00.A01.size()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.A00++;
        C62652t4 c62652t4 = this.A01;
        List list = c62652t4.A01;
        int size = list.size();
        List list2 = c62652t4.A00.A01;
        int size2 = list2.size();
        int i = size + size2;
        int i2 = this.A00;
        if (i > i2) {
            if (i2 < size) {
                return list.get(i2);
            }
            return list2.get(i2 - size);
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("index ");
        A1C.append(i2);
        A1C.append("is greater than ");
        A1C.append(size);
        throw new ArrayIndexOutOfBoundsException(AbstractC58318PtA.A0l(A1C, size2));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw AbstractC166987dD.A14("not implemented");
    }
}
