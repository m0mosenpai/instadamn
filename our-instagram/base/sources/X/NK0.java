package X;

import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;

/* loaded from: classes9.dex */
public final class NK0 extends OX6 {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final C52457NJb A02;
    public final PendingRecipient A03;
    public final InterfaceC09390do A04;
    public final InterfaceC19390xP A05;
    public final C05A A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NK0(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C52457NJb c52457NJb, PendingRecipient pendingRecipient) {
        super(c52457NJb);
        C14360o3.A0B(userSession, 2);
        this.A02 = c52457NJb;
        this.A01 = userSession;
        this.A03 = pendingRecipient;
        this.A00 = interfaceC11380iw;
        C008002u A1H = AbstractC25225BEi.A1H(new C51737MtK(15));
        this.A06 = A1H;
        this.A05 = A1H;
        this.A04 = C1XM.A00(C57525Pfz.A00(this, 47));
    }
}
