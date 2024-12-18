package X;

import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Nsp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53916Nsp {
    public static final String A00(List list) {
        StringWriter A0O = AbstractC37300Gc1.A0O();
        C17z A06 = AbstractC37301Gc2.A06(A0O);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC54871OOg.A00(A06, (C51710Msf) it.next());
        }
        A06.A0Z();
        return MSY.A0e(A06, A0O);
    }
}
