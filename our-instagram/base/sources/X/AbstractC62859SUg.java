package X;

import android.util.SparseArray;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.SUg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62859SUg {
    public static SparseArray A00 = AbstractC58318PtA.A0G();
    public static HashMap A01;

    public static int A00(EnumC61103RfI enumC61103RfI) {
        Number number = (Number) A01.get(enumC61103RfI);
        if (number != null) {
            return number.intValue();
        }
        throw AbstractC43594JPz.A0o(enumC61103RfI, "PriorityMapping is missing known Priority value ", AbstractC166987dD.A1C());
    }

    static {
        HashMap A1G = AbstractC166987dD.A1G();
        A01 = A1G;
        AbstractC166997dE.A1U(EnumC61103RfI.DEFAULT, A1G, 0);
        AbstractC166997dE.A1U(EnumC61103RfI.VERY_LOW, A01, 1);
        AbstractC166997dE.A1U(EnumC61103RfI.HIGHEST, A01, 2);
        Iterator A0l = AbstractC167007dF.A0l(A01);
        while (A0l.hasNext()) {
            Object next = A0l.next();
            A00.append(AbstractC166987dD.A0H(A01.get(next)), next);
        }
    }
}
