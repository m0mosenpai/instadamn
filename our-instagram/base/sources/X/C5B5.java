package X;

import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.5B5, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5B5 extends C0YY implements InterfaceC16620sF {
    public static final C5B5 A00 = new C5B5();

    public C5B5() {
        super(2);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Collection collection = (Collection) obj;
        Collection collection2 = (Collection) obj2;
        if (collection != null) {
            ArrayList arrayList = new ArrayList(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        return collection2;
    }
}
