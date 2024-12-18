package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressLinkMessageSender;
import com.instagram.model.direct.DirectThreadKey;
import kotlin.enums.EnumEntries;

/* renamed from: X.1jP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34251jP implements InterfaceC29301b7 {
    public static final C0KV A03 = C34261jQ.A00;
    public final UserSession A00;
    public final C2DS A01;
    public final InterfaceC09390do A02 = AbstractC09440dt.A01(new MHR(this, 34));

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        AbstractC29011ae abstractC29011ae = (AbstractC29011ae) c1ow;
        C14360o3.A0B(abstractC29011ae, 0);
        C14360o3.A0B(mnp, 1);
        return LCX.A01(mnp, abstractC29011ae, this.A01);
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        C34231jN c34231jN = (C34231jN) c1ow;
        C14360o3.A0B(c34231jN, 0);
        C14360o3.A0B(c19260xA, 1);
        C14360o3.A0B(interfaceC37261GbE, 2);
        if (c34231jN.C7R().size() == 1) {
            DirectThreadKey directThreadKey = (DirectThreadKey) c34231jN.C7R().get(0);
            JTa jTa = ((C1OW) c34231jN).A02;
            C31281Dp3 c31281Dp3 = new C31281Dp3(interfaceC37261GbE, null);
            UserSession userSession = this.A00;
            C14360o3.A0A(directThreadKey);
            if (AbstractC159387Cy.A07(userSession, c34231jN, directThreadKey)) {
                ((ArmadilloExpressLinkMessageSender) this.A02.getValue()).A05(null, interfaceC37261GbE, c34231jN.ACZ());
                C162337Ov.A0U(c19260xA);
                return;
            }
            String str = c34231jN.A02;
            if (str != null) {
                String A06 = c34231jN.A06();
                String str2 = c34231jN.A05;
                boolean z = jTa.A09;
                String str3 = jTa.A04;
                L1W l1w = jTa.A00;
                boolean z2 = jTa.A07;
                boolean z3 = jTa.A0A;
                C25621Ms c25621Ms = new C25621Ms(userSession);
                c25621Ms.A05();
                EnumEntries enumEntries = C2EY.A0D;
                c25621Ms.A0B("direct_v2/threads/broadcast/fundraiser_share/");
                c25621Ms.A0S(C32207EDg.class, C34793FUv.class);
                AbstractC47995LLh.A0D(c25621Ms, l1w, directThreadKey, A06, str2, str3, z, z2, z3);
                c25621Ms.A9s("fundraiser_id", str);
                C1ON A0N = c25621Ms.A0N();
                A0N.A00 = new EE4(userSession, c31281Dp3);
                C1GJ.A03(A0N);
                return;
            }
            C14360o3.A0F("fundraiserId");
            throw C00O.createAndThrow();
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public C34251jP(UserSession userSession) {
        this.A00 = userSession;
        this.A01 = AbstractC28761aE.A00(userSession);
    }
}
