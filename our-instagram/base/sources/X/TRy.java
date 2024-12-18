package X;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class TRy implements InvocationHandler {
    public SharedPreferences A00;
    public final int A01;
    public final Context A02;
    public final String A03;

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        C14360o3.A0B(method, 1);
        SharedPreferences sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A02.getSharedPreferences(this.A03, this.A01);
            this.A00 = sharedPreferences;
        }
        if (objArr == null) {
            objArr = AbstractC58318PtA.A1b();
        }
        return method.invoke(sharedPreferences, Arrays.copyOf(objArr, objArr.length));
    }

    public TRy(Context context, String str, int i) {
        this.A02 = context;
        this.A03 = str;
        this.A01 = i;
    }
}
