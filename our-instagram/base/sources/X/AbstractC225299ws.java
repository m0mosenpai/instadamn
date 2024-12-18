package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9ws, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC225299ws {
    public static final ArrayList A00(List list) {
        ArrayList A1E = AbstractC166987dD.A1E();
        int size = list.size() - 1;
        for (int i = 1; i < size; i++) {
            if (AbstractC167007dF.A04(list, i) >= AbstractC167007dF.A04(list, i - 1) && AbstractC167007dF.A04(list, i) >= AbstractC167007dF.A04(list, i + 1)) {
                AbstractC166997dE.A1W(A1E, i);
            }
        }
        return A1E;
    }
}
