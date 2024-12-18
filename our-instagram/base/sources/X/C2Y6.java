package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.2Y6, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2Y6 extends AbstractC50922Vo {
    public final List A00;

    @Override // X.AbstractC50922Vo
    public final void A01(C125975mo c125975mo) {
        throw new UnsupportedOperationException("Kotlin states should not be updated through applyStateUpdate calls");
    }

    public C2Y6(C2Y6 c2y6, Object obj) {
        ArrayList arrayList;
        if (c2y6 != null) {
            arrayList = new ArrayList(c2y6.A00.size() + 1);
            arrayList.addAll(c2y6.A00);
        } else {
            arrayList = new ArrayList();
        }
        arrayList.add(obj);
        List unmodifiableList = Collections.unmodifiableList(arrayList);
        C14360o3.A07(unmodifiableList);
        this.A00 = unmodifiableList;
    }

    public C2Y6(C2Y6 c2y6, Object obj, int i) {
        ArrayList arrayList = new ArrayList(c2y6.A00);
        arrayList.set(i, obj);
        List unmodifiableList = Collections.unmodifiableList(arrayList);
        C14360o3.A07(unmodifiableList);
        this.A00 = unmodifiableList;
    }
}
