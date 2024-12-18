package X;

import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Fzr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36297Fzr implements InterfaceC13000lm {
    public final C18920wW A00;
    public final long A01;
    public final UserSession A02;
    public final String A03;

    public C36297Fzr(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = AbstractC31178DnM.A03(AbstractC25231BEo.A0j(0, userSession.userId));
        this.A03 = AbstractC167017dG.A0j();
        C12210kP c12210kP = new C12210kP(userSession);
        c12210kP.A01 = "daily_prompts_broadcast_chat";
        this.A00 = c12210kP.A00();
    }

    public static final void A01(C36297Fzr c36297Fzr, String str, String str2, String str3, String str4, String str5, String str6, int i) {
        A00(null, c36297Fzr, str, str2, str3, str4, str5, str6, null, null, null, i);
    }

    public static final void A02(C36297Fzr c36297Fzr, String str, String str2, String str3, String str4, String str5, String str6, Map map, int i) {
        A00(null, c36297Fzr, str, str2, str3, str4, str5, str6, null, null, map, i);
    }

    public static final void A00(EnumC33508Erh enumC33508Erh, C36297Fzr c36297Fzr, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Map map, int i) {
        C25531Mh A0E = C25531Mh.A0E(c36297Fzr.A00);
        if (AbstractC25226BEj.A1Z(A0E)) {
            AbstractC31180DnO.A1M(A0E, str3, str4, c36297Fzr.A01);
            A0E.A0o(str5);
            A0E.A0h(AbstractC31179DnN.A0a(A0E, str6, str, str2, i));
            A0E.A0u(c36297Fzr.A03);
            A0E.A0M(enumC33508Erh, "entrypoint");
            AbstractC31176DnK.A1M(A0E, str7, str8);
            A0E.A0v(map);
            A0E.Cht();
        }
    }

    public final void A03(String str, String str2, int i) {
        A01(this, str, str2, "daily_prompt_reply_reminder_dialog_rendered", "tap", "daily_prompt_button", "thread_view", i);
    }

    public final void A04(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, boolean z) {
        String str8;
        C09530e4 A1L = AbstractC166987dD.A1L("user_type", str3);
        C09530e4 A1L2 = AbstractC166987dD.A1L("share_reason", "share_daily_prompt");
        if (AbstractC166997dE.A1Z(Boolean.valueOf(z), true)) {
            str8 = "ACTIVE";
        } else {
            str8 = "ENDED";
        }
        LinkedHashMap A0u = AbstractC167017dG.A0u("prompt_id", str4, A1L, A1L2, AbstractC166987dD.A1L("daily_prompt_status", str8));
        String str9 = "thread_view";
        if (!str7.equals("channel_daily_prompt_xma") && str7.equals("channel_daily_prompt_responses")) {
            str9 = "daily_prompt_responses_sheet";
        }
        A00(null, this, str, str2, "daily_prompt_share_sheet_rendered", "tap", "share_button", str9, str5, str6, A0u, i);
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A02.A03(C36297Fzr.class);
    }
}
