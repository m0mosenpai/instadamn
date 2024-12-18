package X;

import android.os.SystemClock;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0HX, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0HX implements InvocationHandler {
    public final Object A00;
    public final Object A01;
    public final String A02;

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        List list = C0HU.A00;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C0HW Ajg = ((C0HV) it.next()).Ajg(this, this.A02, method, objArr);
                if (Ajg != null) {
                    return Ajg.A00;
                }
            }
        }
        return A01(method, objArr);
    }

    public C0HX(Class cls, Object obj, String str, boolean z) {
        this.A02 = str;
        this.A01 = obj;
        this.A00 = Proxy.newProxyInstance(C0HX.class.getClassLoader(), new Class[]{cls}, this);
        if (z) {
            C0HU.A01.add(str);
        }
    }

    public final C0HW A00(Method method, Object[] objArr) {
        Object obj;
        try {
            return new C0HW(A01(method, objArr));
        } catch (Throwable unused) {
            int i = 0;
            if (method.getReturnType() == Boolean.TYPE) {
                obj = false;
            } else {
                if (method.getReturnType() == Integer.TYPE) {
                    i = -1;
                } else if (method.getReturnType() != Long.TYPE) {
                    obj = null;
                }
                obj = Integer.valueOf(i);
            }
            return new C0HW(obj);
        }
    }

    public final Object A01(Method method, Object[] objArr) {
        Throwable targetException;
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Object invoke = method.invoke(this.A01, objArr);
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            List list = C0HU.A00;
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((C0HV) it.next()).DEj(invoke, this.A02, method, objArr, elapsedRealtime2 - elapsedRealtime);
                }
            }
            return invoke;
        } catch (InvocationTargetException e) {
            if (e.getCause() != null) {
                targetException = e.getCause();
            } else {
                targetException = e.getTargetException();
            }
            if (targetException != null) {
                throw targetException;
            }
            throw e;
        }
    }
}
