package X;

import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.5As, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C113555As extends C0YY implements InterfaceC16620sF {
    public static final C113555As A00 = new C113555As();

    public C113555As() {
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
