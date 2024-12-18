package X;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes12.dex */
public final class YG4 implements Iterable, InterfaceC15590qF {
    public final int A00;
    public final C117445Td A01;
    public final int A02;

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i;
        ArrayList arrayList;
        int A01;
        Object obj;
        C117445Td c117445Td = this.A01;
        if (c117445Td.A03 == this.A00) {
            int i2 = this.A02;
            HashMap hashMap = c117445Td.A06;
            if (hashMap != null) {
                if (!(!c117445Td.A07)) {
                    C5UC.A03("use active SlotWriter to crate an anchor for location instead");
                    throw C00O.createAndThrow();
                }
                if (i2 >= 0 && i2 < (i = c117445Td.A00) && (A01 = AbstractC117585Tt.A01((arrayList = c117445Td.A05), i2, i)) >= 0 && (obj = arrayList.get(A01)) != null) {
                    hashMap.get(obj);
                }
            }
            return new YJ2(c117445Td, i2 + 1, i2 + c117445Td.A08[(i2 * 5) + 3]);
        }
        throw new ConcurrentModificationException();
    }

    public YG4(C117445Td c117445Td, int i, int i2) {
        this.A01 = c117445Td;
        this.A02 = i;
        this.A00 = i2;
    }
}
