package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.LYn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48289LYn implements InterfaceC23471Cj {
    public final /* synthetic */ C7GN A00;

    public C48289LYn(C7GN c7gn) {
        this.A00 = c7gn;
    }

    @Override // X.InterfaceC23471Cj
    public final void DYE(Map map) {
        String str;
        C7GN c7gn = this.A00;
        if (AbstractC23451Ch.A07(c7gn.A0L, "android.permission.RECORD_AUDIO")) {
            str = "app_permission_grant";
        } else {
            str = "app_permission_deny";
        }
        UserSession userSession = c7gn.A0O;
        new C4I7(AbstractC31171DnF.A0D("VoiceMessagingController"), userSession).A00(new C9CH(C4IA.A09, C4IB.A0C), C4I8.A00(userSession), str, "VoiceMessagingController", null, AbstractC166987dD.A1J(C4I9.UNKNOWN));
    }
}
