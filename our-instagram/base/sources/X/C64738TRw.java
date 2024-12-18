package X;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.WritableNativeArray;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* renamed from: X.TRw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64738TRw implements InvocationHandler {
    public String A00;
    public final Class A01;
    public final CatalystInstance A02;

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        WritableNativeArray writableNativeArray;
        if (objArr != null) {
            writableNativeArray = Arguments.fromJavaArgs(objArr);
        } else {
            writableNativeArray = new WritableNativeArray();
        }
        CatalystInstance catalystInstance = this.A02;
        String str = this.A00;
        if (str == null) {
            str = this.A01.getSimpleName();
            int lastIndexOf = str.lastIndexOf(36);
            if (lastIndexOf != -1) {
                str = AbstractC58318PtA.A0g(lastIndexOf, str);
            }
            this.A00 = str;
        }
        catalystInstance.callFunction(str, method.getName(), writableNativeArray);
        return null;
    }

    public C64738TRw(CatalystInstance catalystInstance, Class cls) {
        this.A02 = catalystInstance;
        this.A01 = cls;
    }
}
