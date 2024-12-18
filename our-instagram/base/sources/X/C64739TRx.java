package X;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: X.TRx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64739TRx implements InvocationHandler {
    public String A00;
    public boolean A01;
    public final List A02;

    public C64739TRx(List list) {
        this.A02 = list;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (objArr == null) {
            objArr = AbstractC63404SjZ.A08;
        }
        if (name.equals("supports") && Boolean.TYPE == returnType) {
            return true;
        }
        if (name.equals("unsupported") && Void.TYPE == returnType) {
            this.A01 = true;
            return null;
        }
        if (name.equals("protocols") && objArr.length == 0) {
            return this.A02;
        }
        if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1) {
            Object obj2 = objArr[0];
            if (obj2 instanceof List) {
                List list = (List) obj2;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    String A1I = AbstractC25226BEj.A1I(list, i);
                    if (this.A02.contains(A1I)) {
                        this.A00 = A1I;
                        return A1I;
                    }
                }
                String A1I2 = AbstractC25226BEj.A1I(this.A02, 0);
                this.A00 = A1I2;
                return A1I2;
            }
        }
        if ((name.equals("protocolSelected") || name.equals("selected")) && objArr.length == 1) {
            this.A00 = (String) objArr[0];
            return null;
        }
        return method.invoke(this, objArr);
    }
}
