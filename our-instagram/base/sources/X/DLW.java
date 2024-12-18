package X;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class DLW extends C0YY implements InterfaceC16660sJ {
    public static final DLW A00 = new DLW();

    public DLW() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C14360o3.A0B(obj, 0);
        List list = (List) obj;
        ArrayList A0q = AbstractC25230BEn.A0q(list);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj2 = list.get(i);
            C5C7 c5c7 = AbstractC28160Cb7.A01;
            Object obj3 = null;
            if (!AbstractC166997dE.A1Z(obj2, false) && obj2 != null) {
                obj3 = c5c7.EKR(obj2);
            }
            C14360o3.A0A(obj3);
            A0q.add(obj3);
        }
        return A0q;
    }
}
