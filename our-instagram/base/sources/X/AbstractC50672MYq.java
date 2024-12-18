package X;

import android.webkit.MimeTypeMap;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.net.URLConnection;

/* renamed from: X.MYq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC50672MYq {
    public static final String A00(String str, String str2, boolean z) {
        int A05;
        if (str != null) {
            String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
            String str3 = null;
            if (fileExtensionFromUrl != null) {
                boolean z2 = false;
                if (fileExtensionFromUrl.length() == 0) {
                    z2 = true;
                }
                if (z2 && (A05 = AbstractC001900j.A05(str, '.', str.length() - 1)) >= 0) {
                    fileExtensionFromUrl = str.substring(A05 + 1);
                    C14360o3.A07(fileExtensionFromUrl);
                }
                str3 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
            }
            if (z && str3 == null) {
                try {
                    FileInputStream fileInputStream = new FileInputStream(str);
                    try {
                        str3 = URLConnection.guessContentTypeFromStream(new BufferedInputStream(fileInputStream));
                        fileInputStream.close();
                    } finally {
                    }
                } catch (Exception unused) {
                    return str2;
                }
            }
            if (str3 != null) {
                return str3;
            }
        }
        return str2;
    }
}
