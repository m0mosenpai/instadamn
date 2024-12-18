package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.io.File;

/* renamed from: X.1YD, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1YD {
    public final File A00(Context context, UserSession userSession) {
        C14360o3.A0B(context, 0);
        C14360o3.A0B(userSession, 1);
        File file = new File(AbstractC13670mt.A06("%s/%s/%s", context.getCacheDir(), "cold_start", userSession.userId));
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            parentFile.mkdirs();
        }
        return file;
    }
}
