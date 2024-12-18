package X;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.TRu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64736TRu implements InvocationHandler {
    public final Object A00;

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Object obj2 = this.A00;
        try {
            return Class.forName(method.getDeclaringClass().getName(), true, AbstractC58319PtB.A0g(obj2)).getDeclaredMethod(method.getName(), method.getParameterTypes()).invoke(obj2, objArr);
        } catch (InvocationTargetException e) {
            throw e.getTargetException();
        } catch (ReflectiveOperationException e2) {
            throw AbstractC58318PtA.A0e(AbstractC167017dG.A0n(method, "Reflection failed for method ", AbstractC166987dD.A1C()), e2);
        }
    }

    public C64736TRu(Object obj) {
        this.A00 = obj;
    }
}
