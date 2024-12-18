package X;

import android.os.Build;
import java.lang.reflect.Field;
import java.net.Proxy;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: X.S3o, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62243S3o {
    /* JADX WARN: Type inference failed for: r4v1, types: [X.1FN, javax.net.ssl.SSLSocketFactory, X.1FM] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, javax.net.ssl.HostnameVerifier] */
    public static final C58355Ptv A00() {
        Proxy proxy = Proxy.NO_PROXY;
        if (Build.VERSION.SDK_INT < 29) {
            try {
                Field declaredField = Class.forName("com.android.okhttp.ConfigAwareConnectionPool").getDeclaredField("CONNECTION_POOL_MAX_IDLE_CONNECTIONS");
                declaredField.setAccessible(true);
                declaredField.set(null, 100);
            } catch (ClassNotFoundException e) {
                C0w9.A06("modify_max_idle_connections_failed", "Failed to access private API field: com.android.okhttp.ConfigAwareConnectionPool#CONNECTION_POOL_MAX_IDLE_CONNECTION", e);
            } catch (IllegalAccessException e2) {
                C0w9.A06("modify_max_idle_connections_failed", "Failed to access private API field: com.android.okhttp.ConfigAwareConnectionPool#CONNECTION_POOL_MAX_IDLE_CONNECTION", e2);
            } catch (NoSuchFieldException e3) {
                C0w9.A06("modify_max_idle_connections_failed", "Failed to access private API field: com.android.okhttp.ConfigAwareConnectionPool#CONNECTION_POOL_MAX_IDLE_CONNECTION", e3);
            }
        } else {
            C0K8.A0D("IGHttpEngineSupplier", "No modification made to CONNECTION_POOL_MAX_IDLE_CONNECTIONS for UrlConnectionHttpStack. Not accessible on Android 10+.");
        }
        boolean A0K = C17280tP.A4E.A00().A0K();
        ?? sSLSocketFactory = new SSLSocketFactory();
        sSLSocketFactory.A01 = A0K;
        sSLSocketFactory.A00 = null;
        return new C58355Ptv(sSLSocketFactory, C1FO.A00(), proxy, new Object(), sSLSocketFactory, sSLSocketFactory);
    }
}
