package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.1co, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C30331co implements InterfaceC29301b7 {
    public static final C0KV A03 = C30341cp.A00;
    public final UserSession A00;
    public final C2DS A01;
    public final InterfaceC09390do A02 = AbstractC09440dt.A01(new C206819Dm(this, 6));

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        C30311cm c30311cm = (C30311cm) c1ow;
        C14360o3.A0B(c30311cm, 0);
        C14360o3.A0B(c19260xA, 1);
        C14360o3.A0B(interfaceC37261GbE, 2);
        Object obj = c30311cm.C7R().get(0);
        C14360o3.A07(obj);
        if (AbstractC159387Cy.A07(this.A00, c30311cm, (DirectThreadKey) obj)) {
            C22844A5n c22844A5n = (C22844A5n) this.A02.getValue();
            L3X l3x = c30311cm.A00;
            if (l3x != null) {
                AbstractC46926Kp7.A00(c22844A5n.A00).A02(EnumC46252KdU.COMMENT, EnumC46251KdT.MENTION, interfaceC37261GbE, c30311cm, l3x, null);
                C162337Ov.A0U(c19260xA);
                return;
            }
            C14360o3.A0F("commentData");
            throw C00O.createAndThrow();
        }
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        AbstractC29011ae abstractC29011ae = (AbstractC29011ae) c1ow;
        C14360o3.A0B(abstractC29011ae, 0);
        C14360o3.A0B(mnp, 1);
        Object obj = abstractC29011ae.C7R().get(0);
        C14360o3.A07(obj);
        DirectThreadKey directThreadKey = (DirectThreadKey) obj;
        UserSession userSession = this.A00;
        if (AbstractC159387Cy.A07(userSession, abstractC29011ae, directThreadKey)) {
            return LCX.A01(mnp, abstractC29011ae, this.A01);
        }
        C81663kb B3U = C2JD.A00(userSession).B3U(directThreadKey);
        if (B3U != null && B3U.Aic() != null) {
            return false;
        }
        return true;
    }

    public C30331co(UserSession userSession) {
        this.A00 = userSession;
        this.A01 = AbstractC28761aE.A00(userSession);
    }
}
