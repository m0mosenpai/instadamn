package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressLinkMessageSender;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;
import kotlin.enums.EnumEntries;

/* renamed from: X.1cS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C30121cS implements InterfaceC29301b7 {
    public static final C0KV A03 = new C0KV() { // from class: X.1cT
        @Override // X.C0KV
        public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
            int A032 = C0f9.A03(1129766401);
            int A033 = C0f9.A03(-287610329);
            C30121cS c30121cS = new C30121cS(userSession);
            C0f9.A0A(-287159369, A033);
            C0f9.A0A(409494605, A032);
            return c30121cS;
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
        C30101cQ c30101cQ = (C30101cQ) c1ow;
        List C7R = c30101cQ.C7R();
        boolean z = true;
        if (C7R.size() != 1) {
            z = false;
        }
        C18C.A0E(z);
        DirectThreadKey directThreadKey = (DirectThreadKey) C7R.get(0);
        String A06 = c30101cQ.A06();
        String str = c30101cQ.A05;
        C206409Bx c206409Bx = c30101cQ.A00;
        JTa jTa = ((C1OW) c30101cQ).A02;
        C31281Dp3 c31281Dp3 = new C31281Dp3(interfaceC37261GbE, null);
        UserSession userSession = this.A00;
        if (AbstractC159387Cy.A07(userSession, c30101cQ, directThreadKey)) {
            ArmadilloExpressLinkMessageSender armadilloExpressLinkMessageSender = (ArmadilloExpressLinkMessageSender) this.A02.getValue();
            C29481bP ACZ = c30101cQ.ACZ();
            ACZ.getClass();
            armadilloExpressLinkMessageSender.A05(null, interfaceC37261GbE, ACZ);
            C162337Ov.A0U(c19260xA);
            return;
        }
        boolean z2 = jTa.A09;
        String str2 = jTa.A04;
        L1W l1w = jTa.A00;
        boolean z3 = jTa.A07;
        boolean z4 = jTa.A0A;
        C25621Ms c25621Ms = new C25621Ms(userSession);
        c25621Ms.A05();
        EnumEntries enumEntries = C2EY.A0D;
        c25621Ms.A0B("direct_v2/threads/broadcast/felix_share/");
        c25621Ms.A0S(C32207EDg.class, C34793FUv.class);
        AbstractC47995LLh.A0D(c25621Ms, l1w, directThreadKey, A06, str, str2, z2, z3, z4);
        C38321qM c38321qM = (C38321qM) c206409Bx.A00;
        c25621Ms.A9s("media_id", c38321qM.A38());
        c25621Ms.A0H("inventory_source", c38321qM.A0C.BJN());
        C1ON A0N = c25621Ms.A0N();
        A0N.A00 = new EE4(userSession, c31281Dp3);
        C1GJ.A03(A0N);
    }

    public C30121cS(final UserSession userSession) {
        this.A00 = userSession;
        this.A01 = AbstractC28761aE.A00(userSession);
        this.A02 = AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.M8n
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return new ArmadilloExpressLinkMessageSender(UserSession.this);
            }
        });
    }
}
