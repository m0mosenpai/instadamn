package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressNoteReplySender;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.1iL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33591iL implements InterfaceC29301b7 {
    public static final C0KV A03 = C33601iM.A00;
    public final UserSession A00;
    public final C2DS A01;
    public final InterfaceC09390do A02 = AbstractC09440dt.A01(new C206819Dm(this, 4));

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        C33571iJ c33571iJ = (C33571iJ) c1ow;
        C14360o3.A0B(c33571iJ, 0);
        C14360o3.A0B(c19260xA, 1);
        C14360o3.A0B(interfaceC37261GbE, 2);
        Object obj = c33571iJ.C7R().get(0);
        C14360o3.A07(obj);
        DirectThreadKey directThreadKey = (DirectThreadKey) obj;
        UserSession userSession = this.A00;
        if (AbstractC159387Cy.A07(userSession, c33571iJ, directThreadKey)) {
            ArmadilloExpressNoteReplySender armadilloExpressNoteReplySender = (ArmadilloExpressNoteReplySender) this.A02.getValue();
            EnumC46252KdU enumC46252KdU = EnumC46252KdU.NOTE;
            C47813L9v A07 = c33571iJ.A07();
            AbstractC46926Kp7.A00(armadilloExpressNoteReplySender.A01).A02(enumC46252KdU, EnumC46251KdT.REPLY, interfaceC37261GbE, c33571iJ, A07, A07.A00());
            C162337Ov.A0U(c19260xA);
            return;
        }
        C1ON A08 = AbstractC47995LLh.A08(userSession, AbstractC46912Kot.A00(((C1OW) c33571iJ).A02), directThreadKey, Long.valueOf(c33571iJ.A07().A00), c33571iJ.A07().A00(), c33571iJ.A01, false);
        A08.A00 = AbstractC46987Kq6.A00(userSession, interfaceC37261GbE);
        C1GJ.A03(A08);
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        AbstractC29011ae abstractC29011ae = (AbstractC29011ae) c1ow;
        C14360o3.A0B(abstractC29011ae, 0);
        C14360o3.A0B(mnp, 1);
        return LCX.A01(mnp, abstractC29011ae, this.A01);
    }

    public C33591iL(UserSession userSession) {
        this.A00 = userSession;
        this.A01 = AbstractC28761aE.A00(userSession);
    }
}
