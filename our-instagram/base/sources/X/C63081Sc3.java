package X;

import android.os.Build;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Collection;

/* renamed from: X.Sc3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63081Sc3 {
    public static Object A00(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(C63081Sc3.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static boolean A01(String str, Collection collection) {
        if (!collection.contains(str)) {
            String str2 = Build.TYPE;
            if (("eng".equals(str2) || "userdebug".equals(str2)) && collection.contains(AnonymousClass001.A0R(str, ":dev"))) {
                return true;
            }
            return false;
        }
        return true;
    }
}
