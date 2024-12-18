package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2DM, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2DM {
    public final List A00 = new ArrayList();

    public final boolean A00(String str) {
        C14360o3.A0B(str, 0);
        List list = this.A00;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!((InterfaceC2056198l) it.next()).EiU(str)) {
                    return false;
                }
            }
        }
        return true;
    }
}
