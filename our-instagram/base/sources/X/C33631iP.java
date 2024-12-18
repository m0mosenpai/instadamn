package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;

/* renamed from: X.1iP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33631iP implements InterfaceC29301b7 {
    public static final C0KV A03 = C33641iQ.A00;
    public final UserSession A00;
    public final C2DS A01;
    public final InterfaceC09390do A02 = AbstractC09440dt.A01(new MHR(this, 29));

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        C33611iN c33611iN = (C33611iN) c1ow;
        C14360o3.A0B(c33611iN, 0);
        C14360o3.A0B(c19260xA, 1);
        C14360o3.A0B(interfaceC37261GbE, 2);
        List C7R = c33611iN.C7R();
        C14360o3.A07(C7R);
        DirectThreadKey directThreadKey = (DirectThreadKey) AbstractC001800i.A0I(C7R);
        UserSession userSession = this.A00;
        C14360o3.A0A(directThreadKey);
        if (AbstractC159387Cy.A07(userSession, c33611iN, directThreadKey)) {
            Kx5 kx5 = (Kx5) this.A02.getValue();
            EnumC46252KdU enumC46252KdU = EnumC46252KdU.NOTE;
            C47813L9v A07 = c33611iN.A07();
            AbstractC46926Kp7.A00(kx5.A00).A02(enumC46252KdU, EnumC46251KdT.MENTION, interfaceC37261GbE, c33611iN, A07, A07.A00());
            C162337Ov.A0U(c19260xA);
            return;
        }
        interfaceC37261GbE.DUq(C114675Fx.A0Z, null);
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        AbstractC29011ae abstractC29011ae = (AbstractC29011ae) c1ow;
        C14360o3.A0B(abstractC29011ae, 0);
        C14360o3.A0B(mnp, 1);
        return LCX.A01(mnp, abstractC29011ae, this.A01);
    }

    public C33631iP(UserSession userSession) {
        this.A00 = userSession;
        this.A01 = AbstractC28761aE.A00(userSession);
    }
}
