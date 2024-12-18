package X;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* loaded from: classes10.dex */
public final class TS4 implements PrivilegedExceptionAction {
    @Override // java.security.PrivilegedExceptionAction
    public final /* bridge */ /* synthetic */ Object run() {
        Field[] declaredFields = Unsafe.class.getDeclaredFields();
        int length = declaredFields.length;
        for (int i = 0; i < length; i++) {
            Object A0v = AbstractC58320PtC.A0v(declaredFields, i);
            if (Unsafe.class.isInstance(A0v)) {
                return Unsafe.class.cast(A0v);
            }
        }
        return null;
    }
}
