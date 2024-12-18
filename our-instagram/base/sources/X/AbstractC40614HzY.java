package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.HzY, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40614HzY {
    public static ArrayList A00(C155376yQ c155376yQ, List list) {
        C38321qM c38321qM;
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : list) {
            if (obj instanceof C128005qU) {
                List list2 = ((C128005qU) obj).A02;
                ArrayList A1E2 = AbstractC166987dD.A1E();
                for (Object obj2 : list2) {
                    if ((obj2 instanceof C127995qS) && (c38321qM = ((C127995qS) obj2).A01) != null && c155376yQ.EjD(c38321qM)) {
                        A1E2.add(c38321qM);
                    }
                }
                A1E.addAll(A1E2);
            }
        }
        return A1E;
    }
}
