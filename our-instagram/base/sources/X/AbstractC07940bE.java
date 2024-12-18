package X;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.0bE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC07940bE {
    public static void A00(Intent intent, InterfaceC08100bW interfaceC08100bW) {
        Bundle extras;
        if (intent.getExtras() != null && (extras = intent.getExtras()) != null) {
            java.util.Set<String> keySet = extras.keySet();
            ArrayList arrayList = new ArrayList();
            for (String str : keySet) {
                Object obj = extras.get(str);
                if (obj != null && C0QX.class.getClassLoader().equals(obj.getClass().getClassLoader())) {
                    arrayList.add(str);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                intent.removeExtra(str2);
                StringBuilder sb = new StringBuilder();
                sb.append("Removed an internal class in a different-key intent: ");
                sb.append(str2);
                sb.append(" => ");
                sb.append(extras.get(str2));
                interfaceC08100bW.EHA("ExternalIntentSanitization", sb.toString(), null);
            }
        }
    }
}
