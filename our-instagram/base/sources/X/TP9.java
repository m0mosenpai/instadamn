package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;

/* loaded from: classes10.dex */
public final class TP9 implements Runnable {
    public final /* synthetic */ IgReactNavigatorModule A00;
    public final /* synthetic */ String A01;

    public TP9(IgReactNavigatorModule igReactNavigatorModule, String str) {
        this.A00 = igReactNavigatorModule;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IgReactNavigatorModule igReactNavigatorModule = this.A00;
        Activity A01 = AbstractC58321PtD.A0b(igReactNavigatorModule).A01();
        if (A01 != null) {
            C63397SjR c63397SjR = new C63397SjR(A01, (UserSession) igReactNavigatorModule.mSession, C2Fb.A37, this.A01);
            c63397SjR.A0S = "Navigation";
            c63397SjR.A0A();
        }
    }
}
