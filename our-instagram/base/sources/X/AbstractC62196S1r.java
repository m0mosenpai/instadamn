package X;

import com.facebook.react.views.webview.ReactWebViewManager;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* renamed from: X.S1r, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62196S1r {
    public static Reader A00(C16H c16h, InputStream inputStream, byte[] bArr, int i, int i2) {
        boolean z;
        String str;
        InputStream inputStream2 = inputStream;
        Integer num = c16h.A00;
        int intValue = num.intValue();
        switch (intValue) {
            case 3:
            case 4:
                if (3 - intValue != 0) {
                    z = false;
                } else {
                    z = true;
                }
                return new C61054ReT(c16h, inputStream2, bArr, i2, i, z);
            default:
                if (inputStream == null) {
                    inputStream2 = new ByteArrayInputStream(bArr, i2, i);
                } else if (i2 < i) {
                    inputStream2 = new C61044ReG(c16h, inputStream, bArr, i2, i);
                }
                switch (num.intValue()) {
                    case 1:
                        str = "UTF-16BE";
                        break;
                    case 2:
                        str = "UTF-16LE";
                        break;
                    case 3:
                        str = "UTF-32BE";
                        break;
                    case 4:
                        str = "UTF-32LE";
                        break;
                    default:
                        str = ReactWebViewManager.HTML_ENCODING;
                        break;
                }
                return new InputStreamReader(inputStream2, str);
        }
    }
}
