package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.msys.mailbox.core.mutation.MsysImageSender$sendSecureImageMessage$1;

/* loaded from: classes8.dex */
public final class L6O {
    public final UserSession A00;

    public L6O(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final LWT A00(InterfaceC2056098k interfaceC2056098k, C183978Ee c183978Ee, Long l, String str, String str2) {
        C14360o3.A0B(interfaceC2056098k, 7);
        C19K A01 = AbstractC24771Iv.A01(20641710, 3);
        InterfaceC16620sF msysImageSender$sendSecureImageMessage$1 = new MsysImageSender$sendSecureImageMessage$1(this, interfaceC2056098k, c183978Ee, null, l, null, str, str2, null, false);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        Integer num = C05F.A00;
        C50374MMb c50374MMb = new C50374MMb(AbstractC23651Dv.A01(anonymousClass191, A01));
        c50374MMb.A0W(num, c50374MMb, msysImageSender$sendSecureImageMessage$1);
        return c50374MMb.A00;
    }
}
