package X;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.1FD, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1FD {
    public static void A00(C1B6 c1b6, C1F9 c1f9, File file) {
        ArrayList arrayList = new ArrayList(c1f9.A03.values());
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C1B1 c1b1 = (C1B1) it.next();
                C1MU AJx = c1b6.AJx(c1b1);
                if (AJx == null) {
                    c1b6.DwH(c1f9, c1b1);
                } else {
                    AJx.DXo(c1f9, c1b1, file);
                }
            }
        }
    }
}
