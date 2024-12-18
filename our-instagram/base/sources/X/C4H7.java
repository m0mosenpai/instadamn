package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4H7, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4H7 {
    public static final List A00(String str) {
        if (str != null) {
            List A03 = new C11L(" ").A03(str);
            ArrayList arrayList = new ArrayList();
            for (Object obj : A03) {
                if (((String) obj).length() > 0) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        return C16930sl.A00;
    }
}
