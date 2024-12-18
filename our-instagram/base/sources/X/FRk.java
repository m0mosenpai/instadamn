package X;

import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;
import com.instagram.direct.prompts.DirectPromptTypes;
import java.util.Map;

/* loaded from: classes6.dex */
public final class FRk {
    public final C18920wW A00;

    public final void A00(EnumC33511Erk enumC33511Erk, EnumC33506Erf enumC33506Erf, String str, String str2, String str3) {
        C14360o3.A0B(enumC33506Erf, 1);
        C25531Mh A03 = C25531Mh.A03(this.A00);
        if (AbstractC25226BEj.A1Z(A03)) {
            A03.A0M(enumC33511Erk, "action");
            A03.A0M(enumC33506Erf, CacheBehaviorLogger.SOURCE);
            A03.A0M(EnumC33458Eqt.A02, "prompt_type");
            A03.A0R("trending_text_prompt_id", str);
            A03.A0R("prompt_id", str3);
            A03.A0R("open_thread_id", str2);
            A03.Cht();
        }
    }

    public final void A03(EnumC33506Erf enumC33506Erf, String str, String str2) {
        C14360o3.A0B(str, 1);
        C25531Mh A03 = C25531Mh.A03(this.A00);
        if (AbstractC25226BEj.A1Z(A03)) {
            A03.A0M(EnumC33511Erk.ADD_YOURS_TAPPED, "action");
            AbstractC31179DnN.A13(enumC33506Erf, A03, str, str2);
        }
    }

    public final void A01(EnumC33511Erk enumC33511Erk, String str) {
        C25531Mh A03 = C25531Mh.A03(this.A00);
        if (AbstractC25226BEj.A1Z(A03)) {
            A03.A0M(enumC33511Erk, "action");
            A03.A0M(EnumC33506Erf.NUX, CacheBehaviorLogger.SOURCE);
            A03.A0M(EnumC33458Eqt.A02, "prompt_type");
            A03.A0R("open_thread_id", str);
            A03.Cht();
        }
    }

    public final void A02(EnumC33511Erk enumC33511Erk, String str, String str2) {
        C25531Mh A03 = C25531Mh.A03(this.A00);
        if (AbstractC25226BEj.A1Z(A03)) {
            A03.A0M(enumC33511Erk, "action");
            AbstractC31179DnN.A13(EnumC33506Erf.RESPONSE, A03, str, str2);
        }
    }

    public final void A05(DirectPromptTypes directPromptTypes, boolean z) {
        String str;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "direct_question_tab_send");
        Map A0t = AbstractC31180DnO.A0t(directPromptTypes);
        if (A0f.isSampled()) {
            if (z) {
                str = "impression";
            } else {
                str = "tap";
            }
            AbstractC31171DnF.A1C(A0f, str);
            A0f.AAP(CacheBehaviorLogger.SOURCE, "question");
            AbstractC31174DnI.A1F(A0f, A0t);
        }
    }

    public FRk(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        AbstractC167017dG.A1P(userSession, interfaceC11380iw);
        this.A00 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
    }

    public final void A04(DirectPromptTypes directPromptTypes, Boolean bool, String str) {
        C25531Mh A0A;
        int ordinal = directPromptTypes.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 4) {
                    A0A = C25531Mh.A03(this.A00);
                } else {
                    return;
                }
            } else {
                A0A = AbstractC31171DnF.A0A(AbstractC166987dD.A0f(this.A00, "direct_composer_tap_question"), 138);
            }
        } else {
            A0A = AbstractC31171DnF.A0A(AbstractC166987dD.A0f(this.A00, "direct_composer_tap_add_yours"), 137);
        }
        if (A0A.A00 == 148) {
            A0A.A0M(EnumC33511Erk.TAP, "action");
            A0A.A0M(EnumC33506Erf.STICKER_TAB, CacheBehaviorLogger.SOURCE);
            A0A.A0M(EnumC33458Eqt.A02, "prompt_type");
            A0A.A0O("chat_has_recurring_prompt", bool);
            A0A.A0R("open_thread_id", str);
        }
        if (AbstractC25226BEj.A1Z(A0A)) {
            A0A.Cht();
        }
    }
}
