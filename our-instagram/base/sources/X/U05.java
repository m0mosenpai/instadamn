package X;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class U05 {
    public static final String A00(List list, InterfaceC16620sF interfaceC16620sF) {
        StringWriter stringWriter = new StringWriter();
        C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
        A0A.A0c();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            interfaceC16620sF.invoke(A0A, it.next());
        }
        A0A.A0Z();
        A0A.close();
        return AbstractC166987dD.A19(stringWriter);
    }

    public static final List A01(String str, InterfaceC16660sJ interfaceC16660sJ) {
        if (str == null) {
            return C16930sl.A00;
        }
        C16L A03 = AbstractC221915u.A00.A03(str);
        ArrayList A10 = AbstractC31174DnI.A10(A03);
        if (A03.A1J() != C16R.A0C) {
            return A10;
        }
        while (A03.A1J() != C16R.A08) {
            Object invoke = interfaceC16660sJ.invoke(A03);
            if (invoke != null) {
                A10.add(invoke);
            }
        }
        return A10;
    }
}
