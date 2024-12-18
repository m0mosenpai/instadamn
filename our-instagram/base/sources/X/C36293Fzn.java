package X;

import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.Fzn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36293Fzn implements InterfaceC13000lm {
    public final long A00;
    public final C18920wW A01;
    public final UserSession A02;
    public final String A03 = AbstractC167017dG.A0j();

    public static final void A00(EnumC33514Ern enumC33514Ern, EnumC33512Erl enumC33512Erl, C36293Fzn c36293Fzn, String str, String str2, Map map) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c36293Fzn.A01, "igd_creator_subscriber_chats_action");
        if (A0f.isSampled()) {
            A0f.A9K("actor_id", Long.valueOf(c36293Fzn.A00));
            A0f.AAP("parent_surface", "instagram");
            AbstractC31171DnF.A1B(A0f, str);
            AbstractC31171DnF.A1C(A0f, str2);
            A0f.A8R(enumC33514Ern, CacheBehaviorLogger.SOURCE);
            A0f.A8R(enumC33512Erl, "surface");
            A0f.AAP(AbstractC70143W6w.A01(9, 10, 0), c36293Fzn.A03);
            if (map != null) {
                A0f.A9M("extra", map);
            }
            A0f.Cht();
        }
    }

    public static final void A01(C36293Fzn c36293Fzn, String str, String str2, Map map) {
        A00(EnumC33514Ern.A0O, EnumC33512Erl.THREAD_VIEW, c36293Fzn, str, str2, map);
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A02.A03(C36293Fzn.class);
    }

    public C36293Fzn(UserSession userSession) {
        this.A02 = userSession;
        this.A00 = AbstractC31178DnM.A03(AbstractC25231BEo.A0j(0, userSession.userId));
        C12210kP c12210kP = new C12210kP(userSession);
        c12210kP.A01 = "creator_subscriber_chat";
        this.A01 = c12210kP.A00();
    }
}
