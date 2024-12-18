package X;

import android.app.Activity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes9.dex */
public final class OVR {
    public static final OVR A00 = new Object();
    public static final C01U A03 = new C01U();
    public static final HashMap A02 = AbstractC166987dD.A1G();
    public static final HashMap A01 = AbstractC166987dD.A1G();

    public final synchronized void A00(String str, Throwable th) {
        AbstractC53642Nnn abstractC53642Nnn = (AbstractC53642Nnn) A02.remove(str);
        if (abstractC53642Nnn != null) {
            abstractC53642Nnn.A04(th);
        }
        C01U c01u = A03;
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : c01u) {
            if (AbstractC002300n.A0h((String) obj, AnonymousClass001.A0C(str, '$'), false)) {
                A1E.add(obj);
            }
        }
        Iterator it = A1E.iterator();
        while (it.hasNext()) {
            String A1B = AbstractC166987dD.A1B(it);
            Activity A002 = OVM.A00.A00(A1B);
            if (A002 != null) {
                A002.finish();
            }
            c01u.remove(A1B);
        }
    }
}
