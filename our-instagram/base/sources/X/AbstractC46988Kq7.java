package X;

import android.content.Context;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.io.IOException;

/* renamed from: X.Kq7, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46988Kq7 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.8Ee] */
    public static C183978Ee A00(Context context, android.net.Uri uri, UserSession userSession) {
        AbstractC167017dG.A1N(uri, userSession);
        if (uri != android.net.Uri.EMPTY) {
            ?? createTempFile = File.createTempFile("direct_share_content_", ".jpg", context.getCacheDir());
            try {
                createTempFile = AbstractC23083AFp.A00(context, uri, userSession, createTempFile);
                return createTempFile;
            } catch (Throwable th) {
                createTempFile.delete();
                throw new IOException(StringFormatUtil.formatStrLocaleSafe("DirectExternalMediaShareHelper#getPhoto failure: %s", "DirectExternalMediaShareHelper io error"), th);
            }
        }
        throw AbstractC166987dD.A12("Photo uri is empty");
    }
}
