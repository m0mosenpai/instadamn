package X;

import android.content.Context;
import android.content.Intent;
import com.instagram.common.session.UserSession;
import com.instagram.inappbrowser.launcher.ExternalBrowserLauncher;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public abstract class SUK {
    public static final List A00 = AbstractC16960so.A1Q("com.android.chrome", "com.chrome.beta", "com.google.android.googlequicksearchbox", "com.sec.android.app.sbrowser", "org.mozilla.firefox", "com.opera.mini.native", "com.microsoft.emmx", "com.opera.browser");

    public static final boolean A00(Context context, android.net.Uri uri, AbstractC18680vv abstractC18680vv) {
        C14360o3.A0B(context, 1);
        try {
            Intent addCategory = AbstractC58318PtA.A0D(uri).addCategory("android.intent.category.BROWSABLE");
            C14360o3.A07(addCategory);
            if (abstractC18680vv instanceof UserSession) {
                ExternalBrowserLauncher externalBrowserLauncher = new ExternalBrowserLauncher(context, (UserSession) abstractC18680vv);
                addCategory.addFlags(268468224);
                C62594SHx A01 = externalBrowserLauncher.A01(uri);
                if (A01 != null) {
                    addCategory.setPackage(A01.A01);
                    if (C12260kU.A0E(context, addCategory)) {
                        return true;
                    }
                }
            }
            Iterator it = A00.iterator();
            while (it.hasNext()) {
                it.next();
                if (C12260kU.A0E(context, addCategory)) {
                    return true;
                }
            }
        } catch (IllegalStateException unused) {
        }
        return false;
    }
}
