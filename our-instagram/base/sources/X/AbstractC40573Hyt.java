package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.Hyt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40573Hyt {
    public static final C38935HCi A00(UserSession userSession, String str, boolean z) {
        AbstractC167017dG.A1N(userSession, str);
        Bundle A05 = AbstractC31178DnM.A05(userSession);
        A05.putString("media_id", str);
        A05.putBoolean("is_story", z);
        C38935HCi c38935HCi = new C38935HCi();
        c38935HCi.setArguments(A05);
        return c38935HCi;
    }
}
