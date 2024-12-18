package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.F2q, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34088F2q {
    public static final C32328ELw A00(UserSession userSession, InterfaceC83733oI interfaceC83733oI, String str) {
        C14360o3.A0B(userSession, 0);
        C32328ELw c32328ELw = new C32328ELw();
        Bundle A05 = AbstractC31178DnM.A05(userSession);
        AbstractC35077Fco.A02(A05, interfaceC83733oI, "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_ID");
        A05.putString("channel_control_entrypoint", str);
        c32328ELw.setArguments(A05);
        return c32328ELw;
    }
}
