package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.M2a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49907M2a implements Runnable {
    public final /* synthetic */ C143316dW A00;

    public RunnableC49907M2a(C143316dW c143316dW) {
        this.A00 = c143316dW;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C143316dW c143316dW = this.A00;
        UserSession userSession = c143316dW.A0e;
        Context context = c143316dW.A0W;
        C14360o3.A07(context);
        View view = c143316dW.A0Y;
        InterfaceC11380iw interfaceC11380iw = c143316dW.A0d;
        C45078Jx7 c45078Jx7 = c143316dW.A05;
        if (c45078Jx7 != null) {
            AbstractC47850LBt.A01(context, view, interfaceC11380iw, userSession, c143316dW.A0l, null, c45078Jx7);
            C45078Jx7 c45078Jx72 = c143316dW.A05;
            if (c45078Jx72 != null) {
                if (AbstractC47020Kqd.A00(userSession, c45078Jx72, false)) {
                    ViewOnKeyListenerC148356m5 viewOnKeyListenerC148356m5 = c143316dW.A0o;
                    viewOnKeyListenerC148356m5.A00 = false;
                    viewOnKeyListenerC148356m5.A06.A0M(false);
                    return;
                }
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
