package X;

import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.2bY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C52912bY {
    public static final C52912bY A00 = new Object();

    public static final void A00(Bundle bundle, ClassLoader classLoader) {
        C14360o3.A0B(classLoader, 1);
        try {
            A00.A01(bundle, classLoader, new HashSet());
        } catch (Exception e) {
            C0K8.A0G("BundleUtil", "failed to overwrite classloader completely", e);
        }
    }

    private final void A01(Bundle bundle, ClassLoader classLoader, java.util.Set set) {
        if (!set.contains(bundle)) {
            bundle.setClassLoader(classLoader);
            set.add(bundle);
            Iterator<String> it = bundle.keySet().iterator();
            while (it.hasNext()) {
                Object obj = bundle.get(it.next());
                if (obj instanceof Bundle) {
                    A01((Bundle) obj, classLoader, set);
                }
            }
        }
    }
}
