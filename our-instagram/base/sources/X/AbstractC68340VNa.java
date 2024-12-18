package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.VNa, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68340VNa {
    public static final String A00(String str, String... strArr) {
        List A0I = AbstractC009903n.A0I(strArr);
        ArrayList arrayList = new ArrayList();
        for (Object obj : A0I) {
            if (((String) obj).length() != 0) {
                arrayList.add(obj);
            }
        }
        return AbstractC31175DnJ.A0a(str, arrayList);
    }
}
