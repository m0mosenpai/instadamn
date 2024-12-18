package X;

import android.webkit.WebViewFactory;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: X.4qg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C106264qg {
    public final Field A00;
    public final Field A01;
    public final Method A02;

    public static C106264qg A00() {
        Method declaredMethod = WebViewFactory.class.getDeclaredMethod("getProvider", new Class[0]);
        declaredMethod.setAccessible(true);
        Field declaredField = WebViewFactory.class.getDeclaredField("sProviderInstance");
        declaredField.setAccessible(true);
        Field declaredField2 = WebViewFactory.class.getDeclaredField("sPackageInfo");
        declaredField2.setAccessible(true);
        return new C106264qg(declaredField, declaredField2, declaredMethod);
    }

    public C106264qg(Field field, Field field2, Method method) {
        this.A02 = method;
        this.A00 = field;
        this.A01 = field2;
    }
}
