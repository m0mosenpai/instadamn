package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.LnD, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49087LnD implements InterfaceC165787b5, InterfaceC165797b6 {
    public final UserSession A00;
    public final C7W4 A01;
    public final C163867Va A02;
    public final LEK A03;

    public final void A01(String str) {
        C14360o3.A0B(str, 0);
        AnonymousClass983.A06(this.A02.A00).A1T(str);
    }

    public final void A00(EnumC160197Gf enumC160197Gf) {
        AnonymousClass983.A06(this.A02.A00).A1Q(enumC160197Gf);
    }

    @Override // X.InterfaceC165787b5
    public final void EL0() {
        if (this.A01.A0U()) {
            C159737El A06 = AnonymousClass983.A06(this.A02.A00);
            A06.A07.setVisibility(0);
            AbstractC125325le A0o = AbstractC43592JPx.A0o(A06.A07, 0);
            A0o.A0T(AbstractC166987dD.A08(A06.A07), 0.0f);
            A0o.A0A().A0H();
            A06.A1G = false;
        }
    }

    @Override // X.InterfaceC165797b6
    public final void ELa(MessageIdentifier messageIdentifier) {
        String str;
        String C2p;
        LEK lek = this.A03;
        UserSession userSession = this.A00;
        if (messageIdentifier != null) {
            str = messageIdentifier.A01;
        } else {
            str = null;
        }
        C83403nh A00 = LEK.A00(lek, str, "DirectThreadFragment.saveAsQuickReply", true);
        if (A00 != null && (C2p = AbstractC43594JPz.A0f(A00).C2p(userSession, A00)) != null) {
            AnonymousClass983 anonymousClass983 = this.A02.A00;
            C7O6 c7o6 = AnonymousClass983.A06(anonymousClass983).A0n;
            if (c7o6 != null) {
                C46512KiB c46512KiB = c7o6.A02;
                UserSession userSession2 = anonymousClass983.A10;
                InterfaceC60442pS interfaceC60442pS = anonymousClass983.A1Q;
                String str2 = c46512KiB.A01;
                C14360o3.A07(str2);
                String str3 = c46512KiB.A02;
                C14360o3.A07(str3);
                C14360o3.A0B(interfaceC60442pS, 1);
                AbstractC31173DnH.A1S(C162337Ov.A01(interfaceC60442pS, "thread_save_tap", str2, str3), userSession2);
                Bundle A0b = AbstractC166987dD.A0b();
                c46512KiB.A00(A0b);
                A0b.putString("DirectEditQuickReplyFragment.quick_reply_message", C2p);
                AbstractC59962oe abstractC59962oe = anonymousClass983.A0u;
                AbstractC31172DnG.A1M(abstractC59962oe, new C6XJ(abstractC59962oe.requireActivity(), A0b, userSession2, ModalActivity.class, "direct_edit_quick_reply"));
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    public C49087LnD(UserSession userSession, C7W4 c7w4, C163867Va c163867Va, LEK lek) {
        AbstractC167027dH.A13(lek, c163867Va, c7w4);
        this.A03 = lek;
        this.A02 = c163867Va;
        this.A01 = c7w4;
        this.A00 = userSession;
    }
}
