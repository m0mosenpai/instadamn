package X;

import com.instagram.api.schemas.IGAIAgentType;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.CfW, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28370CfW {
    public final UserSession A00;
    public final String A01;
    public final String A02;
    public final InterfaceC09390do A03;

    public C28370CfW(UserSession userSession, String str, String str2) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A02 = str;
        this.A01 = str2;
        this.A03 = AbstractC09440dt.A01(new C50157MDk(this, 11));
    }

    public final void A04(String str) {
        C14360o3.A0B(str, 0);
        C25531Mh A00 = A00(this);
        if (AbstractC25226BEj.A1Z(A00)) {
            A00.A0k("ai_home_see_all_button_clicked");
            A00.A0w(AbstractC25233BEq.A0p("section_name", str, AbstractC166987dD.A1L(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, this.A01)));
            A01(A00, this);
        }
        C29166CtX.A00((C29166CtX) this.A03.getValue(), "ai_home_see_all_clicked", str);
    }

    public static final C25531Mh A00(C28370CfW c28370CfW) {
        return new C25531Mh(AbstractC166987dD.A0f(AbstractC12220kQ.A02(c28370CfW.A00), "gen_ai_studio_ig_client_event"), 163);
    }

    public static void A01(C25531Mh c25531Mh, C28370CfW c28370CfW) {
        c25531Mh.A0u(c28370CfW.A02);
        c25531Mh.Cht();
    }

    public final void A02(IGAIAgentType iGAIAgentType, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i) {
        String str8;
        String str9;
        String str10 = str2;
        String str11 = str6;
        C14360o3.A0B(str5, 5);
        C25531Mh A00 = A00(this);
        if (AbstractC25226BEj.A1Z(A00)) {
            A00.A0k("ai_home_agent_clicked");
            C09530e4 A1L = AbstractC166987dD.A1L(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, this.A01);
            C09530e4 A1L2 = AbstractC166987dD.A1L("index", String.valueOf(i));
            C09530e4 A1L3 = AbstractC166987dD.A1L("persona_name", str3);
            C09530e4 A1L4 = AbstractC166987dD.A1L("screen", str4);
            C09530e4 A1L5 = AbstractC166987dD.A1L("section_name", str5);
            Long l = null;
            if (num != null) {
                str9 = num.toString();
            } else {
                str9 = null;
            }
            String str12 = "";
            if (str9 == null) {
                str9 = "";
            }
            C09530e4 A1L6 = AbstractC166987dD.A1L("section_index", str9);
            C09530e4 A1L7 = AbstractC166987dD.A1L("agent_type", iGAIAgentType.A00);
            if (str6 == null) {
                str11 = "";
            }
            C09530e4 A1L8 = AbstractC166987dD.A1L("creator_igid", str11);
            if (str2 == null) {
                str10 = "";
            }
            C09530e4 A1L9 = AbstractC166987dD.A1L("bot_id", str10);
            if (str7 != null) {
                str12 = str7;
            }
            A00.A0w(AbstractC06930Yk.A06(A1L, A1L2, A1L3, A1L4, A1L5, A1L6, A1L7, A1L8, A1L9, AbstractC166987dD.A1L("icebreaker_prompt_text", str12)));
            if (str != null) {
                l = AbstractC003100w.A0k(10, str);
            }
            A00.A0i(l);
            A01(A00, this);
        }
        C29166CtX c29166CtX = (C29166CtX) this.A03.getValue();
        if (str7 != null) {
            str8 = "ice_breaker_clicked";
        } else {
            str8 = "agent_clicked";
        }
        C29166CtX.A00(c29166CtX, str8, null);
    }

    public final void A03(String str) {
        C25531Mh A00 = A00(this);
        if (AbstractC25226BEj.A1Z(A00)) {
            A00.A0k("ai_home_create_button_clicked");
            A00.A0w(AbstractC167007dF.A0n(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str));
            A01(A00, this);
        }
        C29166CtX.A00((C29166CtX) this.A03.getValue(), "create_ai_button_clicked", str);
    }
}
