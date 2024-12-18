package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5CD, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5CD extends C0YY implements InterfaceC16660sJ {
    public static final C5CD A00 = new C5CD();

    public C5CD() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj2 = list.get(i);
            C5C7 c5c7 = C5C9.A02;
            Object obj3 = null;
            if (!C14360o3.A0K(obj2, false) && obj2 != null) {
                obj3 = c5c7.EKR(obj2);
            }
            C14360o3.A0A(obj3);
            arrayList.add(obj3);
        }
        return arrayList;
    }
}
