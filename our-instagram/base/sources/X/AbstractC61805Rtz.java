package X;

import android.os.Bundle;

/* renamed from: X.Rtz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61805Rtz {
    public static Object A00(Bundle bundle, Class cls, String str) {
        if (bundle.containsKey(str)) {
            Object obj = bundle.get(str);
            if (cls.isInstance(obj)) {
                Object cast = cls.cast(obj);
                if (cast != null) {
                    return cast;
                }
                throw AbstractC58320PtC.A0p("value for required key %s is null", new Object[]{str});
            }
            throw AbstractC58320PtC.A0p("value for required key %s is not of type $s", new Object[]{str, cls.getSimpleName()});
        }
        throw AbstractC58320PtC.A0p("key %s is missing but required", new Object[]{str});
    }
}
