package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher;

/* loaded from: classes6.dex */
public final class G8B implements InterfaceC199918sv {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ InterfaceC11380iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ String A03;

    public G8B(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str) {
        this.A02 = userSession;
        this.A03 = str;
        this.A00 = fragmentActivity;
        this.A01 = interfaceC11380iw;
    }

    @Override // X.InterfaceC199918sv
    public final void onClick() {
        UserSession userSession = this.A02;
        C7F3 c7f3 = new C7F3(userSession);
        String str = this.A03;
        C25531Mh A0H = AbstractC31172DnG.A0H(c7f3);
        if (AbstractC25226BEj.A1Z(A0H)) {
            A0H.A0Z(41);
            A0H.A0X(0);
            A0H.A0M(EnumC33519Ers.A0G, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A0H.A0R("agent_id", str);
            A0H.Cht();
        }
        new AiAgentThreadLauncher(userSession).A08(this.A00, this.A01, str, null, null, null, true);
    }
}
