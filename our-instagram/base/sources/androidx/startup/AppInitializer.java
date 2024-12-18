package androidx.startup;

import X.AbstractC020908f;
import X.AbstractC021008g;
import X.C08Z;
import android.content.Context;
import android.os.Bundle;
import com.facebook.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class AppInitializer {
    public static final Object A03 = new Object();
    public static volatile AppInitializer A04;
    public final Context A00;
    public final Set A02 = new HashSet();
    public final Map A01 = new HashMap();

    public static AppInitializer getInstance(Context context) {
        if (A04 == null) {
            synchronized (A03) {
                if (A04 == null) {
                    A04 = new AppInitializer(context);
                }
            }
        }
        return A04;
    }

    public void discoverAndInitialize(Bundle bundle) {
        String string = this.A00.getString(R.string.res_0x7f13014a_name_removed);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (C08Z.class.isAssignableFrom(cls)) {
                            this.A02.add(cls);
                        }
                    }
                }
                Iterator it = this.A02.iterator();
                while (it.hasNext()) {
                    A00(this, (Class) it.next(), hashSet);
                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public AppInitializer(Context context) {
        this.A00 = context.getApplicationContext();
    }

    public static Object A00(AppInitializer appInitializer, Class cls, Set set) {
        Object obj;
        if (AbstractC020908f.A01()) {
            try {
                AbstractC020908f.A00(cls.getSimpleName());
            } finally {
                AbstractC021008g.A00();
            }
        }
        if (!set.contains(cls)) {
            Map map = appInitializer.A01;
            if (!map.containsKey(cls)) {
                set.add(cls);
                try {
                    C08Z c08z = (C08Z) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    List<Class> AOq = c08z.AOq();
                    if (!AOq.isEmpty()) {
                        for (Class cls2 : AOq) {
                            if (!map.containsKey(cls2)) {
                                A00(appInitializer, cls2, set);
                            }
                        }
                    }
                    obj = c08z.ALO(appInitializer.A00);
                    set.remove(cls);
                    map.put(cls, obj);
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
            } else {
                obj = map.get(cls);
            }
            return obj;
        }
        throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
    }
}
