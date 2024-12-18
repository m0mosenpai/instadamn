package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.1iX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33711iX implements InterfaceC29301b7 {
    public static final C0KV A03 = C33721iY.A00;
    public final UserSession A00;
    public final C2DS A01;
    public final InterfaceC09390do A02 = AbstractC09440dt.A01(new C50160MDn(this, 44));

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        C33691iV c33691iV = (C33691iV) c1ow;
        C14360o3.A0B(c33691iV, 0);
        C14360o3.A0B(c19260xA, 1);
        C14360o3.A0B(interfaceC37261GbE, 2);
        Object obj = c33691iV.C7R().get(0);
        C14360o3.A07(obj);
        if (AbstractC159387Cy.A07(this.A00, c33691iV, (DirectThreadKey) obj)) {
            C47411Kx0 c47411Kx0 = (C47411Kx0) this.A02.getValue();
            EnumC46252KdU enumC46252KdU = EnumC46252KdU.MEDIA_NOTE;
            C47813L9v A07 = c33691iV.A07();
            AbstractC46926Kp7.A00(c47411Kx0.A00).A02(enumC46252KdU, EnumC46251KdT.MENTION, interfaceC37261GbE, c33691iV, A07, A07.A00());
            C162337Ov.A0U(c19260xA);
        }
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        AbstractC29011ae abstractC29011ae = (AbstractC29011ae) c1ow;
        C14360o3.A0B(abstractC29011ae, 0);
        C14360o3.A0B(mnp, 1);
        return LCX.A01(mnp, abstractC29011ae, this.A01);
    }

    public C33711iX(UserSession userSession) {
        this.A00 = userSession;
        this.A01 = AbstractC28761aE.A00(userSession);
    }
}
