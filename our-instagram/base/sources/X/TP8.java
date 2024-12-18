package X;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;

/* loaded from: classes10.dex */
public final class TP8 implements Runnable {
    public final /* synthetic */ IgReactNavigatorModule A00;
    public final /* synthetic */ String A01;

    public TP8(IgReactNavigatorModule igReactNavigatorModule, String str) {
        this.A00 = igReactNavigatorModule;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FragmentActivity fragmentActivity;
        C3AY A00;
        IgReactNavigatorModule igReactNavigatorModule = this.A00;
        Activity A01 = AbstractC58321PtD.A0b(igReactNavigatorModule).A01();
        if (A01 != null) {
            String str = this.A01;
            if (!C63357SiE.A03(A01, igReactNavigatorModule.mSession, str, "Navigation")) {
                C14K c14k = C14J.A04;
                if (c14k.A00().A00(igReactNavigatorModule.mSession, str) != null) {
                    if ((A01 instanceof FragmentActivity) && (fragmentActivity = (FragmentActivity) A01) != null && (A00 = c14k.A00().A00(igReactNavigatorModule.mSession, str)) != null) {
                        ((InterfaceC37185GZw) A00.A00).CJ9((Bundle) A00.A01, fragmentActivity, igReactNavigatorModule.mSession);
                        return;
                    }
                    return;
                }
                C63397SjR c63397SjR = new C63397SjR(A01, (UserSession) igReactNavigatorModule.mSession, C2Fb.A37, str);
                c63397SjR.A0S = "Navigation";
                c63397SjR.A0A();
            }
        }
    }
}
