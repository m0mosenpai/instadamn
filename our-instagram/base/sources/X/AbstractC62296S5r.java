package X;

import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* renamed from: X.S5r, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62296S5r {
    public static final InterfaceC65568Tn1 A00;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.Tn1] */
    static {
        ?? r0;
        try {
            r0 = new C63647SrD((WebViewProviderFactoryBoundaryInterface) C63081Sc3.A00(WebViewProviderFactoryBoundaryInterface.class, (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, WebView.getWebViewClassLoader()).getDeclaredMethod("createWebViewProviderFactory", new Class[0]).invoke(null, new Object[0])));
        } catch (ClassNotFoundException unused) {
            r0 = new Object();
        } catch (IllegalAccessException e) {
            throw AbstractC58318PtA.A0f(e);
        } catch (NoSuchMethodException e2) {
            throw AbstractC58318PtA.A0f(e2);
        } catch (InvocationTargetException e3) {
            throw AbstractC58318PtA.A0f(e3);
        }
        A00 = r0;
    }
}
