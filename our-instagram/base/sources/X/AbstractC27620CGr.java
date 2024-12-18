package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.CGr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27620CGr {
    public static final C26869BtW A00(UserSession userSession, String str) {
        AbstractC167017dG.A1N(userSession, str);
        C26869BtW c26869BtW = new C26869BtW();
        Bundle A0b = AbstractC166987dD.A0b();
        AbstractC03240Dh.A00(A0b, userSession);
        A0b.putString("args_media_id", str);
        c26869BtW.setArguments(A0b);
        return c26869BtW;
    }
}
