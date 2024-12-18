package X;

import android.util.Base64OutputStream;
import com.facebook.react.views.webview.ReactWebViewManager;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1UQ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1UQ {
    public static final Map A02 = new HashMap();
    public final Object A00 = new Object();
    public final InterfaceC08830cm A01;

    public final String A00() {
        String str;
        try {
            File file = (File) this.A01.get();
            FileInputStream fileInputStream = new FileInputStream(file);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((int) file.length());
            Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 0);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read != -1) {
                        base64OutputStream.write(bArr, 0, read);
                    } else {
                        base64OutputStream.close();
                        return byteArrayOutputStream.toString(ReactWebViewManager.HTML_ENCODING);
                    }
                }
            } finally {
                fileInputStream.close();
                base64OutputStream.close();
            }
        } catch (IOException e) {
            if (e.getMessage() != null) {
                str = e.getMessage();
            } else {
                str = "description N/A";
            }
            return AnonymousClass001.A0g("[I/O error: ", str, "]");
        }
    }

    public C1UQ(InterfaceC08830cm interfaceC08830cm) {
        this.A01 = interfaceC08830cm;
    }
}
