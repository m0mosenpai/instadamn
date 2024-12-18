package X;

import android.os.Build;
import java.lang.reflect.Method;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* renamed from: X.Tec, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C65163Tec extends C63220SfQ {
    public final Class A00;
    public final Method A01;
    public final Method A02;
    public final Method A03;
    public final Method A04;
    public final C62574SGz A05;

    public static int A01() {
        try {
            return Build.VERSION.SDK_INT;
        } catch (NoClassDefFoundError unused) {
            return 0;
        }
    }

    public static C65163Tec A02() {
        if (!"Dalvik".equals(System.getProperty("java.vm.name"))) {
            return null;
        }
        try {
            Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            Class<?> cls = Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
            try {
                return new C65163Tec(cls, cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE), cls.getMethod("setHostname", String.class), AbstractC58318PtA.A0t(cls, "getAlpnSelectedProtocol"), cls.getMethod("setAlpnProtocols", byte[].class));
            } catch (NoSuchMethodException unused) {
                throw AbstractC31175DnJ.A0U("Expected Android API level 21+ but was ", Build.VERSION.SDK_INT);
            }
        } catch (ClassNotFoundException unused2) {
            return null;
        }
    }

    @Override // X.C63220SfQ
    public final AbstractC61529Rp5 A08(X509TrustManager x509TrustManager) {
        try {
            Class<?> cls = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new C65165Tee(cls.getConstructor(X509TrustManager.class).newInstance(x509TrustManager), cls.getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class));
        } catch (Exception unused) {
            return super.A08(x509TrustManager);
        }
    }

    public C65163Tec(Class cls, Method method, Method method2, Method method3, Method method4) {
        Method method5;
        Method method6;
        Method method7 = null;
        try {
            Class<?> cls2 = Class.forName("dalvik.system.CloseGuard");
            Method A0t = AbstractC58318PtA.A0t(cls2, "get");
            method6 = cls2.getMethod("open", String.class);
            method5 = AbstractC58318PtA.A0t(cls2, "warnIfOpen");
            method7 = A0t;
        } catch (Exception unused) {
            method5 = method7;
            method6 = method7;
        }
        this.A05 = new C62574SGz(method7, method6, method5);
        this.A00 = cls;
        this.A04 = method;
        this.A03 = method2;
        this.A01 = method3;
        this.A02 = method4;
    }
}
