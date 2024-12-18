package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.3lF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C81953lF {
    public static int A04;
    public int A00;
    public int A01;
    public InterfaceC114885Gz A02;
    public final Map A03;

    public final void A00(String str) {
        InterfaceC114885Gz interfaceC114885Gz;
        Map map = this.A03;
        C15500q5.A04(map).remove(str);
        if (map.isEmpty() && (interfaceC114885Gz = this.A02) != null) {
            interfaceC114885Gz.onFinish();
            this.A02 = null;
        }
    }

    public C81953lF(InterfaceC114885Gz interfaceC114885Gz, List list) {
        A04++;
        this.A03 = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C81943lE c81943lE = (C81943lE) it.next();
            this.A03.put(c81943lE.A04, c81943lE);
            this.A01++;
            this.A00 += c81943lE.A01;
        }
        this.A02 = interfaceC114885Gz;
    }
}
