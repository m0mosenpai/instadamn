package X;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.MVr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC50606MVr {
    public static final String A00(List list) {
        if (list == null) {
            return "[]";
        }
        try {
            StringWriter A0O = AbstractC37300Gc1.A0O();
            C17z A06 = AbstractC37301Gc2.A06(A0O);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC70181WFj.A04(A06, (XBS) it.next());
            }
            A06.A0Z();
            return MSY.A0e(A06, A0O);
        } catch (IOException unused) {
            return "[]";
        }
    }

    public static final List A01(String str) {
        if (str == null) {
            return C16930sl.A00;
        }
        try {
            return (List) C16V.A01(C16V.A00(str), C50607MVs.A00);
        } catch (IOException unused) {
            return C16930sl.A00;
        }
    }
}
