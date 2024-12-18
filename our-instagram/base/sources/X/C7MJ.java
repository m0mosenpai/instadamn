package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.util.HashSet;

/* renamed from: X.7MJ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7MJ implements InterfaceC13000lm {
    public static final C7MK A04 = new Object();
    public final Context A00;
    public final UserSession A02;
    public final java.util.Set A03 = new HashSet();
    public final C41761wQ A01 = new C41761wQ(null);

    public static final C7TQ A00(C7MJ c7mj, InterfaceC83733oI interfaceC83733oI) {
        C7TQ c7tp;
        if (interfaceC83733oI instanceof MsysThreadId) {
            c7tp = new G5I(c7mj.A02);
        } else {
            UserSession userSession = c7mj.A02;
            c7tp = new C7TP(userSession, new G5J(interfaceC83733oI), AbstractC28761aE.A00(userSession));
        }
        return c7tp;
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A01.A01();
    }

    public C7MJ(UserSession userSession, Context context) {
        this.A02 = userSession;
        this.A00 = context;
    }
}
