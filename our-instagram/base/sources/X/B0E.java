package X;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class B0E implements InvocationHandler {
    public final C82K A00;

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        C14360o3.A0B(method, 1);
        C82M A00 = this.A00.A00();
        if (objArr == null) {
            objArr = new Object[0];
        }
        return method.invoke(A00, Arrays.copyOf(objArr, objArr.length));
    }

    public B0E(C82K c82k) {
        this.A00 = c82k;
    }
}
