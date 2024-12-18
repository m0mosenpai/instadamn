package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.1cb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C30201cb implements InterfaceC29301b7 {
    public static final C0KV A03 = C30211cc.A00;
    public final UserSession A00;
    public final C2DS A01;
    public final InterfaceC09390do A02 = AbstractC09440dt.A01(new C206819Dm(this, 5));

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        C30181cZ c30181cZ = (C30181cZ) c1ow;
        C14360o3.A0B(c30181cZ, 0);
        C14360o3.A0B(c19260xA, 1);
        C14360o3.A0B(interfaceC37261GbE, 2);
        Object obj = c30181cZ.C7R().get(0);
        C14360o3.A07(obj);
        if (AbstractC159387Cy.A07(this.A00, c30181cZ, (DirectThreadKey) obj)) {
            C22843A5m c22843A5m = (C22843A5m) this.A02.getValue();
            EnumC46252KdU enumC46252KdU = EnumC46252KdU.CLIP;
            C1575375n c1575375n = c30181cZ.A00;
            if (c1575375n != null) {
                C38321qM c38321qM = c1575375n.A01;
                C14360o3.A07(c38321qM);
                AbstractC46926Kp7.A00(c22843A5m.A00).A02(enumC46252KdU, EnumC46251KdT.MENTION, interfaceC37261GbE, c30181cZ, c38321qM, null);
                C162337Ov.A0U(c19260xA);
                return;
            }
            C14360o3.A0F("clipsShare");
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

    public C30201cb(UserSession userSession) {
        this.A00 = userSession;
        this.A01 = AbstractC28761aE.A00(userSession);
    }
}
