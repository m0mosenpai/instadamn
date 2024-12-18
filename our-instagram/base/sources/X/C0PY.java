package X;

import com.facebook.react.views.webview.ReactWebViewManager;
import java.io.OutputStream;

/* renamed from: X.0PY, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0PY {
    public static int A00;

    public static void A00(OutputStream outputStream, String str, String str2, String str3) {
        outputStream.write(String.format("--%s\r\nContent-Disposition: %s\"%s\"\r\nContent-Type: application/binary\r\nContent-Transfer-Encoding: binary\r\n\r\n", str3, "form-data; name=", str).getBytes());
        outputStream.write(str2.getBytes(ReactWebViewManager.HTML_ENCODING));
        outputStream.write("\r\n".getBytes());
    }
}
