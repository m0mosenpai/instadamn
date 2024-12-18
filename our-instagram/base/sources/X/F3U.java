package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.clipsinteractionreply.ClipsInteractionReplySheetContent;

/* loaded from: classes6.dex */
public abstract class F3U {
    public static final void A00(FragmentActivity fragmentActivity, UserSession userSession, ClipsInteractionReplySheetContent clipsInteractionReplySheetContent, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
        C14360o3.A0B(userSession, 2);
        EN9 en9 = new EN9();
        Bundle A05 = AbstractC31178DnM.A05(userSession);
        A05.putParcelable("REPLY_CONTENT", clipsInteractionReplySheetContent);
        en9.setArguments(A05);
        en9.A04 = interfaceC16820sZ;
        en9.A05 = interfaceC16820sZ2;
        C189448aO A0y = AbstractC25225BEi.A0y(userSession);
        C3DO c3do = C3DN.A00;
        C3DN A00 = c3do.A00(fragmentActivity);
        C189478aR A0x = AbstractC25228BEl.A0x(fragmentActivity, c3do);
        if (A0x != null && A0x.A03.getViewLifecycleOwner().getLifecycle().A07().A00(C07S.CREATED)) {
            C3DN A002 = c3do.A00(fragmentActivity);
            if (A002 != null) {
                ((C3DP) A002).A0H = new GH9(2, fragmentActivity, en9, A0y);
            }
            if (A00 != null) {
                A00.A0B();
                return;
            }
            return;
        }
        AbstractC31173DnH.A0w(fragmentActivity, en9, A0y);
    }
}
