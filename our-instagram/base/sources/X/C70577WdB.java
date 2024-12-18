package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.WdB, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70577WdB implements XA1 {
    public final List A00 = new ArrayList();

    @Override // X.XA1
    public final List FDW(InterfaceC71973XDg interfaceC71973XDg, InterfaceC71973XDg interfaceC71973XDg2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            arrayList.addAll(((XA1) it.next()).FDW(interfaceC71973XDg, interfaceC71973XDg2));
        }
        return arrayList;
    }
}
