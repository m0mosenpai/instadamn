package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressLinkMessageSender;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.1dl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C30821dl implements InterfaceC29301b7 {
    public static final C0KV A03 = new C0KV() { // from class: X.1dm
        @Override // X.C0KV
        public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
            int A032 = C0f9.A03(-192074974);
            int A033 = C0f9.A03(1222497859);
            C30821dl c30821dl = new C30821dl(userSession);
            C0f9.A0A(1296752633, A033);
            C0f9.A0A(-578841835, A032);
            return c30821dl;
        }
    };
    public final UserSession A00;
    public final C2DS A01;
    public final InterfaceC09390do A02;

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        return LCX.A01(mnp, (AbstractC29011ae) c1ow, this.A01);
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        C30801dj c30801dj = (C30801dj) c1ow;
        List C7R = c30801dj.C7R();
        boolean z = true;
        if (C7R.size() != 1) {
            z = false;
        }
        C18C.A0E(z);
        DirectThreadKey directThreadKey = (DirectThreadKey) C7R.get(0);
        JTa jTa = ((C1OW) c30801dj).A02;
        UserSession userSession = this.A00;
        if (AbstractC159387Cy.A07(userSession, c30801dj, directThreadKey)) {
            ((ArmadilloExpressLinkMessageSender) this.A02.getValue()).A05(null, interfaceC37261GbE, c30801dj.ACZ());
            C162337Ov.A0U(c19260xA);
            return;
        }
        ProductDetailsProductItemDict productDetailsProductItemDict = (ProductDetailsProductItemDict) c30801dj.A00.A00;
        String A06 = c30801dj.A06();
        String str = c30801dj.A05;
        String str2 = jTa.A04;
        L1W l1w = jTa.A00;
        boolean z2 = jTa.A09;
        boolean z3 = jTa.A07;
        boolean z4 = jTa.A0A;
        C25621Ms c25621Ms = new C25621Ms(userSession);
        c25621Ms.A05();
        String str3 = null;
        c25621Ms.A0B(new StringBuilder(AnonymousClass001.A0g("direct_v2/threads/broadcast/", C2EY.A1a.A00, "/")).toString());
        c25621Ms.A0S(C32207EDg.class, C34793FUv.class);
        AbstractC47995LLh.A0D(c25621Ms, l1w, directThreadKey, A06, str, str2, z2, z3, z4);
        String str4 = productDetailsProductItemDict.A0h;
        if (str4 == null) {
            str4 = null;
        }
        c25621Ms.A9s("product_id", str4);
        User user = productDetailsProductItemDict.A0G;
        if (user != null) {
            str3 = AbstractC76433bn.A00(user);
        }
        c25621Ms.A9s("merchant_id", str3);
        C1ON A0N = c25621Ms.A0N();
        A0N.A00 = AbstractC46987Kq6.A00(userSession, interfaceC37261GbE);
        C1GJ.A03(A0N);
    }

    public C30821dl(final UserSession userSession) {
        this.A00 = userSession;
        this.A01 = AbstractC28761aE.A00(userSession);
        this.A02 = AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.M8u
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return new ArmadilloExpressLinkMessageSender(UserSession.this);
            }
        });
    }
}
