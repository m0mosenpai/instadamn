package X;

import com.facebook.react.views.webview.ReactWebViewManager;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: X.W0y, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC70064W0y {
    public static final Charset A00 = Charset.forName("US-ASCII");
    public static final Charset A01 = Charset.forName(ReactWebViewManager.HTML_ENCODING);

    public static void A00(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    A00(file2);
                }
                if (!file2.delete()) {
                    throw new IOException(AbstractC167017dG.A0n(file2, "failed to delete file: ", new StringBuilder()));
                }
            }
            return;
        }
        throw new IOException(AbstractC167017dG.A0n(file, "not a readable directory: ", new StringBuilder()));
    }
}
