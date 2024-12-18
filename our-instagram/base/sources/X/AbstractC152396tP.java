package X;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.6tP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC152396tP {
    public static final List A00 = AbstractC16960so.A1Q(Application.class, C152406tQ.class);
    public static final List A01;

    public static final AbstractC52922bZ A00(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (AbstractC52922bZ) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to access ");
            sb.append(cls);
            throw new RuntimeException(sb.toString(), e);
        } catch (InstantiationException e2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("A ");
            sb2.append(cls);
            sb2.append(" cannot be instantiated.");
            throw new RuntimeException(sb2.toString(), e2);
        } catch (InvocationTargetException e3) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("An exception happened in constructor of ");
            sb3.append(cls);
            throw new RuntimeException(sb3.toString(), e3.getCause());
        }
    }

    static {
        List singletonList = Collections.singletonList(C152406tQ.class);
        C14360o3.A07(singletonList);
        A01 = singletonList;
    }

    public static final Constructor A01(Class cls, List list) {
        Constructor<?>[] constructors = cls.getConstructors();
        C14360o3.A07(constructors);
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            C14360o3.A07(parameterTypes);
            List A0J = AbstractC009903n.A0J(parameterTypes);
            if (!list.equals(A0J)) {
                if (list.size() == A0J.size() && A0J.containsAll(list)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Class ");
                    sb.append(cls.getSimpleName());
                    sb.append(" must have parameters in the proper order: ");
                    sb.append(list);
                    throw new UnsupportedOperationException(sb.toString());
                }
            } else {
                return constructor;
            }
        }
        return null;
    }
}
