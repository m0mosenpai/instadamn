package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import java.lang.reflect.Proxy;

/* loaded from: classes10.dex */
public abstract class S5A {
    public static final SharedPreferences A00(ContextWrapper contextWrapper, String str, int i) {
        C14360o3.A0B(contextWrapper, 0);
        Context baseContext = contextWrapper.getBaseContext();
        C14360o3.A07(baseContext);
        Object newProxyInstance = Proxy.newProxyInstance(SharedPreferences.class.getClassLoader(), new Class[]{SharedPreferences.class}, new TRy(baseContext, str, i));
        C14360o3.A0C(newProxyInstance, "null cannot be cast to non-null type android.content.SharedPreferences");
        return (SharedPreferences) newProxyInstance;
    }
}
