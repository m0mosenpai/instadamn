package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.DLb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30015DLb extends C0YY implements InterfaceC16660sJ {
    public static final C30015DLb A00 = new C30015DLb();

    public C30015DLb() {
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
            C5C7 c5c7 = AbstractC28160Cb7.A05;
            Object obj3 = null;
            if (!AbstractC166997dE.A1Z(obj2, false) && obj2 != null) {
                obj3 = c5c7.EKR(obj2);
            }
            C14360o3.A0A(obj3);
            A0q.add(obj3);
        }
        return new C114095Cv(A0q);
    }
}
