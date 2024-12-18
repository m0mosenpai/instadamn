package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* loaded from: classes6.dex */
public final class EE2 extends AnonymousClass935 {
    public final /* synthetic */ InterfaceC37261GbE A00;
    public final /* synthetic */ C29551bW A01;
    public final /* synthetic */ C29481bP A02;
    public final /* synthetic */ DirectThreadKey A03;
    public final /* synthetic */ Boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EE2(UserSession userSession, InterfaceC37261GbE interfaceC37261GbE, C29551bW c29551bW, C29481bP c29481bP, DirectThreadKey directThreadKey, Boolean bool) {
        super(userSession);
        this.A01 = c29551bW;
        this.A00 = interfaceC37261GbE;
        this.A04 = bool;
        this.A03 = directThreadKey;
        this.A02 = c29481bP;
    }

    @Override // X.AnonymousClass935
    public final void A04(AbstractC115105If abstractC115105If, UserSession userSession) {
        int A03 = C0f9.A03(2048805019);
        InterfaceC37261GbE interfaceC37261GbE = this.A00;
        InterfaceC37261GbE.A00(interfaceC37261GbE);
        if (Boolean.TRUE.equals(this.A04)) {
            C14360o3.A0B(abstractC115105If, 0);
            AbstractC147806l5.A00(userSession).A0S(this.A03.A00, AbstractC111324zv.A00(1257), AbstractC35240FgZ.A01(abstractC115105If, AbstractC34382FDy.A00).toString());
        }
        C14360o3.A0B(abstractC115105If, 0);
        interfaceC37261GbE.DUq(AbstractC35240FgZ.A01(abstractC115105If, AbstractC34382FDy.A00), null);
        C0f9.A0A(42129036, A03);
    }

    @Override // X.AnonymousClass935
    public final /* bridge */ /* synthetic */ void A05(UserSession userSession, Object obj) {
        int A03 = C0f9.A03(-1233250533);
        int A032 = C0f9.A03(-700453569);
        InterfaceC37261GbE interfaceC37261GbE = this.A00;
        C162337Ov.A0a(interfaceC37261GbE.BtO(), C05F.A00);
        interfaceC37261GbE.DUq(null, null);
        C0f9.A0A(-334550142, A032);
        C0f9.A0A(-867298333, A03);
    }
}
