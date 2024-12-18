package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.WdF, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70580WdF implements XA2 {
    public final List A00 = new ArrayList();

    @Override // X.XA2
    public final List FDV(InterfaceC71973XDg interfaceC71973XDg) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            arrayList.addAll(((XA2) it.next()).FDV(interfaceC71973XDg));
        }
        return arrayList;
    }
}
