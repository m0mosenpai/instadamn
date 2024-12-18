package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5CC, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5CC extends C0YY implements InterfaceC16620sF {
    public static final C5CC A00 = new C5CC();

    public C5CC() {
        super(2);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C6MR c6mr = (C6MR) obj;
        List list = (List) obj2;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(C5C9.A00(C5C9.A02, c6mr, list.get(i)));
        }
        return arrayList;
    }
}
