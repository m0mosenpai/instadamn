package com.instagram.common.lifecycleannotations;

import X.AbstractC002300n;
import X.AbstractC166987dD;
import X.AbstractC58319PtB;
import X.AnonymousClass001;
import X.C0K8;
import X.C14360o3;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes10.dex */
public final class LifecycleUtil {
    public static final LifecycleUtil INSTANCE = new Object();
    public static final Map REFERENCE_CLEANERS = AbstractC166987dD.A1I();
    public static final String TAG = "LifecycleUtil";

    public static final void cleanupReferences(Object obj) {
        Object[] objArr;
        String str;
        C14360o3.A0B(obj, 0);
        try {
            LifecycleUtil lifecycleUtil = INSTANCE;
            Class<?> cls = obj.getClass();
            Method findReferenceCleanerForClass = lifecycleUtil.findReferenceCleanerForClass(cls);
            if (findReferenceCleanerForClass != null) {
                findReferenceCleanerForClass.invoke(null, obj);
            } else {
                cls.getCanonicalName();
            }
        } catch (IllegalAccessException e) {
            e = e;
            objArr = new Object[]{AbstractC58319PtB.A0u(obj)};
            str = "unable to access cleanup for: %s";
            C0K8.A0L(TAG, str, e, objArr);
        } catch (IllegalArgumentException e2) {
            e = e2;
            objArr = new Object[]{AbstractC58319PtB.A0u(obj)};
            str = "unable to handle argument for: %s";
            C0K8.A0L(TAG, str, e, objArr);
        } catch (InvocationTargetException e3) {
            e = e3;
            objArr = new Object[]{AbstractC58319PtB.A0u(obj)};
            str = "unable to invoke cleanup for: %s";
            C0K8.A0L(TAG, str, e, objArr);
        }
    }

    private final Method findReferenceCleanerForClass(Class cls) {
        Object[] objArr;
        String str;
        Map map = REFERENCE_CLEANERS;
        Method method = (Method) map.get(cls);
        if (method == null) {
            String name = cls.getName();
            C14360o3.A0A(name);
            if (AbstractC002300n.A0h(name, "android.", false) || AbstractC002300n.A0h(name, "java.", false)) {
                return null;
            }
            try {
                Method declaredMethod = Class.forName(AnonymousClass001.A0R(name, TAG)).getDeclaredMethod("cleanupReferences", cls);
                map.put(cls, declaredMethod);
                return declaredMethod;
            } catch (ClassNotFoundException unused) {
                Class superclass = cls.getSuperclass();
                if (superclass == null) {
                    return null;
                }
                return findReferenceCleanerForClass(superclass);
            } catch (NoSuchMethodException e) {
                e = e;
                objArr = new Object[]{cls.getCanonicalName()};
                str = "referenceCleanerClass generated incorrectly: %s";
                C0K8.A0L(TAG, str, e, objArr);
                return null;
            } catch (SecurityException e2) {
                e = e2;
                objArr = new Object[]{cls.getCanonicalName()};
                str = "referenceCleanerClass is denied to access method: %s";
                C0K8.A0L(TAG, str, e, objArr);
                return null;
            }
        }
        return method;
    }
}
