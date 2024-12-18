package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5Cq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C114045Cq extends C0YY implements InterfaceC16620sF {
    public static final C114045Cq A00 = new C114045Cq();

    public C114045Cq() {
        super(2);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C6MR c6mr = (C6MR) obj;
        List list = ((C114095Cv) obj2).A01;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(C5C9.A00(C5C9.A08, c6mr, list.get(i)));
        }
        return arrayList;
    }
}
