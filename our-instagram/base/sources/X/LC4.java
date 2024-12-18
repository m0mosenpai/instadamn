package X;

import android.view.LayoutInflater;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public abstract class LC4 {
    public static final C49115Lns A00(InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC164977Zm interfaceC164977Zm, AnonymousClass988 anonymousClass988, boolean z) {
        C49020Lm8 c49020Lm8 = new C49020Lm8(userSession, (InterfaceC164987Zn) interfaceC164977Zm);
        boolean z2 = anonymousClass988.A1U;
        C7AZ c7az = new C7AZ(z2);
        C158657Ab A00 = c7az.A00((InterfaceC165247aD) interfaceC164977Zm);
        C7Q9 c7q9 = new C7Q9((InterfaceC165307aJ) interfaceC164977Zm, z2);
        boolean z3 = false;
        return new C49115Lns(userSession, interfaceC164977Zm, new C47969LId(interfaceC11380iw, userSession, interfaceC164977Zm, 4, 56, z3, z3, z, true), AbstractC43594JPz.A0b(new C1580177l(new C162897Ra((InterfaceC165207a9) interfaceC164977Zm), c49020Lm8, A00, c7q9, (InterfaceC165507ad) interfaceC164977Zm, anonymousClass988, null, false), c7az));
    }

    public static final void A01(LayoutInflater layoutInflater, C7SP c7sp) {
        AbstractC163037Ro abstractC163037Ro = c7sp.A07;
        C14360o3.A0C(abstractC163037Ro, "null cannot be cast to non-null type com.instagram.direct.messagethread.commondecorations.RootSwitcher.Frame");
        AbstractC13880nE.A0U(AbstractC166987dD.A0c(((C163027Rn) abstractC163037Ro).A00, R.id.prompt_xma_message_container), layoutInflater.getContext().getResources().getDimensionPixelSize(R.dimen.asset_picker_section_title_horizontal_padding));
    }
}
