package X;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public abstract class OQ1 {
    public static final C51747MtW A00(C51747MtW c51747MtW) {
        C51747MtW A00;
        C14360o3.A0B(c51747MtW, 0);
        List list = c51747MtW.A0H;
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : list) {
            if (!(obj instanceof UPQ) || ((UPQ) obj).A04 != C05F.A0C) {
                A1E.add(obj);
            }
        }
        ArrayList A1E2 = AbstractC166987dD.A1E();
        for (Object obj2 : A1E) {
            AbstractC25228BEl.A1Q(obj2, A1E2, obj2 instanceof C26173Bhy ? 1 : 0);
        }
        C51735MtI c51735MtI = c51747MtW.A06;
        String str = c51735MtI.A02;
        String str2 = c51735MtI.A03;
        boolean z = c51735MtI.A06;
        AbstractC167007dF.A1D(str, 1, str2);
        A00 = C51747MtW.A00(null, new C51735MtI(null, str, str2, false, z, true), null, null, null, null, c51747MtW, null, null, null, null, null, null, null, A1E2, null, null, 0, 0, 16777214, false, false, false, false, false, false);
        return A00;
    }

    public static final C51747MtW A01(C51747MtW c51747MtW, boolean z) {
        return C51747MtW.A00(null, null, null, null, null, null, c51747MtW, null, null, null, null, null, null, null, null, null, null, 0, 0, 18874367, false, false, false, false, true, z);
    }
}
