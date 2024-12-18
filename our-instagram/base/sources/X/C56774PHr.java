package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.PHr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56774PHr implements InterfaceC58129Pps {
    @Override // X.InterfaceC58129Pps
    public final int Bpi(int i, int i2) {
        if (i2 != 2) {
            return (int) Math.floor((i2 + 1) / 2.0d);
        }
        return 2;
    }

    @Override // X.InterfaceC58129Pps
    public final ArrayList Bpk(List list, java.util.Set set, int i, int i2) {
        Object obj;
        int max;
        ArrayList A1E = AbstractC166987dD.A1E();
        if (set.size() == 2) {
            Iterator it = set.iterator();
            int A0B = AbstractC167007dF.A0B(it);
            int A0B2 = AbstractC167007dF.A0B(it);
            if (i == 0) {
                max = Math.min(A0B, A0B2);
            } else {
                max = Math.max(A0B, A0B2);
            }
            obj = Integer.valueOf(max);
        } else {
            if (!list.isEmpty()) {
                int i3 = i * 2;
                if (list.size() % 2 == 0) {
                    A1E.add(list.get(i3));
                    i3++;
                } else if (i == 0) {
                    i3 = 0;
                } else {
                    A1E.add(list.get(i3 - 1));
                }
                obj = list.get(i3);
            }
            return A1E;
        }
        A1E.add(obj);
        return A1E;
    }

    @Override // X.InterfaceC58129Pps
    public final boolean CcG(InterfaceC58129Pps interfaceC58129Pps) {
        return interfaceC58129Pps.getClass().equals(C56774PHr.class);
    }
}
