package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class LEX {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final InterfaceC09390do A02 = AbstractC09440dt.A01(new C50164MDr(this, 9));

    public LEX(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
    }

    public static final void A00(LEX lex, String str) {
        String A14 = AbstractC25225BEi.A14();
        if (A14 != null) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC37300Gc1.A0C(lex.A02), AbstractC111324zv.A00(4702));
            AbstractC25225BEi.A1N(A0f, A14);
            A0f.A9K("ig_user_id", AbstractC25231BEo.A0j(0, lex.A01.userId));
            A0f.AAP("event_type", "trending_prompts_netego_interaction");
            A0f.AAP("component_type", "story");
            A0f.AAP("target_type", str);
            A0f.AAP("feed_type", "trending");
            A0f.Cht();
        }
    }
}
