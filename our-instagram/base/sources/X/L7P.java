package X;

import com.instagram.api.schemas.StoryTrendingPromptSubType;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class L7P {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final InterfaceC09390do A02;

    public L7P(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
        this.A02 = AbstractC09440dt.A01(new C50164MDr(this, 8));
    }

    public final void A00(StoryTrendingPromptSubType storyTrendingPromptSubType, EnumC33440EqC enumC33440EqC, Integer num, String str, String str2, String str3, int i, long j) {
        String str4;
        String A14 = AbstractC25225BEi.A14();
        if (A14 != null) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC37300Gc1.A0C(this.A02), "igye_prompts_surface_component_interaction");
            AbstractC25225BEi.A1N(A0f, A14);
            if (str == null) {
                str = "";
            }
            A0f.AAP("component_id", str);
            A0f.A9K("component_position", AbstractC31171DnF.A0V(i));
            A0f.AAP("component_type", "story");
            switch (num.intValue()) {
                case 0:
                    str4 = "prompt_info";
                    break;
                case 1:
                    str4 = "media";
                    break;
                default:
                    str4 = "add_yours_button";
                    break;
            }
            A0f.AAP("target_type", str4);
            A0f.AAP("session_instance_id", str3);
            A0f.AAP("feed_type", "trending");
            A0f.A9K("num_media_loaded", Long.valueOf(j));
            A0f.AAP("component_subtype", String.valueOf(storyTrendingPromptSubType));
            A0f.AAP("target_id", str2);
            if (enumC33440EqC != null) {
                A0f.AAP("entrypoint", enumC33440EqC.toString());
            }
            A0f.Cht();
        }
    }
}
