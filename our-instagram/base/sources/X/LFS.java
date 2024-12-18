package X;

import android.content.Intent;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class LFS {
    public static final LFS A00 = new Object();

    public final boolean A00(Intent intent, AbstractC10360h2 abstractC10360h2, UserSession userSession) {
        String stringExtra = intent.getStringExtra("android.intent.extra.shortcut.ID");
        String stringExtra2 = intent.getStringExtra("android.intent.extra.TEXT");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        if (stringExtra != null && stringExtra.length() != 0) {
            if (MSV.A00(81).equals(intent.getAction()) && AbstractC43594JPz.A0d(userSession, stringExtra) != null) {
                AbstractC167007dF.A0J().postDelayed(new RunnableC50023M6m(intent, (android.net.Uri) intent.getParcelableExtra(MSV.A00(19)), abstractC10360h2, stringExtra, stringExtra2), 100L);
                return true;
            }
        }
        return false;
    }
}
