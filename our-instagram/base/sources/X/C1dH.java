package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressLinkMessageSender;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;
import kotlin.enums.EnumEntries;

/* renamed from: X.1dH, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1dH implements InterfaceC29301b7 {
    public static final C0KV A03 = new C0KV() { // from class: X.1dI
        @Override // X.C0KV
        public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
            int A032 = C0f9.A03(1593210809);
            int A033 = C0f9.A03(-1053909402);
            C1dH c1dH = new C1dH(userSession);
            C0f9.A0A(-1539358388, A033);
            C0f9.A0A(-1544222637, A032);
            return c1dH;
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
        C30541dF c30541dF = (C30541dF) c1ow;
        List C7R = c30541dF.C7R();
        boolean z = true;
        if (C7R.size() != 1) {
            z = false;
        }
        C18C.A0E(z);
        DirectThreadKey directThreadKey = (DirectThreadKey) C7R.get(0);
        String A06 = c30541dF.A06();
        String str = c30541dF.A05;
        JTa jTa = ((C1OW) c30541dF).A02;
        C31281Dp3 c31281Dp3 = new C31281Dp3(interfaceC37261GbE, null);
        UserSession userSession = this.A00;
        if (AbstractC159387Cy.A07(userSession, c30541dF, directThreadKey)) {
            ((ArmadilloExpressLinkMessageSender) this.A02.getValue()).A05(null, interfaceC37261GbE, c30541dF.ACZ());
            C162337Ov.A0U(c19260xA);
            return;
        }
        String A00 = AbstractC47055KrC.A00(c30541dF.A01);
        boolean z2 = jTa.A09;
        String str2 = jTa.A04;
        L1W l1w = jTa.A00;
        boolean z3 = jTa.A07;
        boolean z4 = jTa.A0A;
        C25621Ms c25621Ms = new C25621Ms(userSession);
        c25621Ms.A05();
        EnumEntries enumEntries = C2EY.A0D;
        c25621Ms.A0B("direct_v2/threads/broadcast/info_center/");
        c25621Ms.A0S(C32207EDg.class, C34793FUv.class);
        AbstractC47995LLh.A0D(c25621Ms, l1w, directThreadKey, A06, str, str2, z2, z3, z4);
        c25621Ms.A9s("info_center_type", A00);
        C1ON A0N = c25621Ms.A0N();
        A0N.A00 = new EE4(userSession, c31281Dp3);
        C1GJ.A03(A0N);
    }

    public C1dH(final UserSession userSession) {
        this.A00 = userSession;
        this.A01 = AbstractC28761aE.A00(userSession);
        this.A02 = AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.M8p
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return new ArmadilloExpressLinkMessageSender(UserSession.this);
            }
        });
    }
}
