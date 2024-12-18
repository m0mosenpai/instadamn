package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.EwT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33803EwT {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Object obj;
        String A0d = AbstractC31177DnL.A0d(c6fw);
        int A0D = AbstractC25230BEn.A0D(c6fw.A03(1), "null cannot be cast to non-null type kotlin.Number");
        C6FG c6fg = c6fq.A03;
        if (c6fg != null) {
            AbstractC52232aO.A00(c6fg.A00);
            Iterator it = ((Collection) AbstractC52312aW.A02.getValue()).iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (AbstractC002300n.A0g(((C52462al) obj).A09, A0d, true)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            C52462al c52462al = (C52462al) obj;
            if (c52462al != null) {
                c52462al.A01(((C52432ai) c52462al.A07.A00.get(A0D)).A01);
            }
        }
        return null;
    }
}
