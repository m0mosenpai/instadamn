package X;

import com.facebook.msys.mca.Mailbox;
import com.instagram.common.session.UserSession;

/* renamed from: X.1Zi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C28471Zi extends AbstractC28481Zj {
    public InterfaceC41521w1 A00;
    public Mailbox A01;
    public C132615yk A02;
    public final InterfaceC16660sJ A03;
    public final InterfaceC16620sF A04;

    public C28471Zi(InterfaceC16660sJ interfaceC16660sJ, InterfaceC16620sF interfaceC16620sF) {
        C14360o3.A0B(interfaceC16620sF, 1);
        C14360o3.A0B(interfaceC16660sJ, 2);
        this.A04 = interfaceC16620sF;
        this.A03 = interfaceC16660sJ;
    }

    @Override // X.AbstractC28481Zj
    public final void A01(Mailbox mailbox, UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(mailbox, 1);
        this.A01 = mailbox;
        this.A00 = (InterfaceC41521w1) this.A04.invoke(userSession, mailbox);
        this.A02 = (C132615yk) this.A03.invoke(mailbox);
        Mailbox mailbox2 = this.A01;
        if (mailbox2 != null) {
            mailbox2.addStoredProcedureChangedListener(this.A00);
        }
        C132615yk c132615yk = this.A02;
        if (c132615yk != null) {
            C218914p.A03(EnumC220415e.A03, c132615yk.A03);
        }
    }

    @Override // X.AbstractC28481Zj
    public final void A00() {
        Mailbox mailbox;
        InterfaceC41521w1 interfaceC41521w1 = this.A00;
        if (interfaceC41521w1 != null && (mailbox = this.A01) != null) {
            mailbox.mStoredProcedureChangedListeners.remove(interfaceC41521w1);
        }
        C132615yk c132615yk = this.A02;
        if (c132615yk != null) {
            C218914p.A06(c132615yk.A03);
        }
    }
}
