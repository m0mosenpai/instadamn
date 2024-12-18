package X;

import android.os.Bundle;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: X.S4m, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62267S4m {
    public static final LinkedHashMap A00(Bundle bundle) {
        if (bundle == null) {
            return AbstractC166987dD.A1I();
        }
        LinkedHashMap A18 = AbstractC25225BEi.A18(bundle.size());
        Iterator<String> it = bundle.keySet().iterator();
        while (it.hasNext()) {
            String A1B = AbstractC166987dD.A1B(it);
            A18.put(A1B, bundle.getString(A1B));
        }
        return A18;
    }
}
