package X;

import android.os.Bundle;

/* renamed from: X.Rtx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61803Rtx {
    public static Object A00(Bundle bundle, Class cls, String str) {
        if (bundle.containsKey(str)) {
            Object cast = cls.cast(bundle.get(str));
            if (cast != null) {
                return cast;
            }
            throw AbstractC58320PtC.A0p("value for required key %s is null", new Object[]{str});
        }
        throw AbstractC58320PtC.A0p("key %s is missing but required", new Object[]{str});
    }
}
