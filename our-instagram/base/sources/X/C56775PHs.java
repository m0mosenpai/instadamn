package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.PHs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56775PHs implements InterfaceC58129Pps {
    public static final int[][] A00 = {new int[]{0, 2}, new int[]{1, 3}};

    @Override // X.InterfaceC58129Pps
    public final int Bpi(int i, int i2) {
        if (i2 == 2 || i == 1) {
            return 2;
        }
        return (int) Math.ceil((i + 1) / 2.0d);
    }

    @Override // X.InterfaceC58129Pps
    public final ArrayList Bpk(List list, java.util.Set set, int i, int i2) {
        int min;
        ArrayList A1E = AbstractC166987dD.A1E();
        if (set.size() == 2) {
            Iterator it = set.iterator();
            int A0B = AbstractC167007dF.A0B(it);
            int A0B2 = AbstractC167007dF.A0B(it);
            if (i == 0) {
                min = Math.max(A0B, A0B2);
            } else {
                min = Math.min(A0B, A0B2);
            }
            AbstractC166997dE.A1W(A1E, min);
        } else {
            int Bpi = (Bpi(i2, set.size()) - 1) - i;
            int i3 = Bpi * 2;
            int[] iArr = {i3, i3 + 1};
            if (Bpi < 2) {
                iArr = A00[Bpi];
            }
            if (set.contains(Integer.valueOf(iArr[0]))) {
                AbstractC166997dE.A1W(A1E, iArr[0]);
            }
            if (set.contains(Integer.valueOf(iArr[1]))) {
                AbstractC166997dE.A1W(A1E, iArr[1]);
                return A1E;
            }
        }
        return A1E;
    }

    @Override // X.InterfaceC58129Pps
    public final boolean CcG(InterfaceC58129Pps interfaceC58129Pps) {
        return interfaceC58129Pps.getClass().equals(C56775PHs.class);
    }
}
