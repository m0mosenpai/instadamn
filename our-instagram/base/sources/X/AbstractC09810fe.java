package X;

import com.facebook.profilo.provider.constants.ExternalProvider;
import com.facebook.profilo.provider.constants.ExternalProviders;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLConnection;

/* renamed from: X.0fe, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC09810fe {
    public static void A02(URLConnection uRLConnection, int i) {
        ExternalProvider externalProvider = ExternalProviders.A07;
        int A00 = externalProvider.A07().A00(6, 21, i, 0L, 0);
        try {
            uRLConnection.connect();
        } finally {
            externalProvider.A07().A00(6, 22, i, 0L, A00);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0fR, java.io.InputStream] */
    public static C0fR A00(URLConnection uRLConnection, int i) {
        InputStream inputStream = uRLConnection.getInputStream();
        ?? inputStream2 = new InputStream();
        inputStream2.A01 = inputStream;
        inputStream2.A00 = i;
        return inputStream2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.OutputStream, X.0fU] */
    public static C0fU A01(URLConnection uRLConnection, int i) {
        OutputStream outputStream = uRLConnection.getOutputStream();
        ?? outputStream2 = new OutputStream();
        outputStream2.A01 = outputStream;
        outputStream2.A00 = i;
        return outputStream2;
    }
}
