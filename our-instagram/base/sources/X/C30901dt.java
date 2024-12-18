package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.model.DirectForwardingParams;
import com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressLinkMessageSender;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;
import kotlin.enums.EnumEntries;

/* renamed from: X.1dt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C30901dt implements InterfaceC29301b7 {
    public static final C0KV A03 = new C0KV() { // from class: X.1du
        @Override // X.C0KV
        public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
            int A032 = C0f9.A03(-236496085);
            int A033 = C0f9.A03(471885860);
            C30901dt c30901dt = new C30901dt(userSession);
            C0f9.A0A(-1836083693, A033);
            C0f9.A0A(-2135027266, A032);
            return c30901dt;
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
        C1ON A0N;
        C30881dr c30881dr = (C30881dr) c1ow;
        List C7R = c30881dr.C7R();
        boolean z = true;
        if (C7R.size() != 1) {
            z = false;
        }
        C18C.A0E(z);
        DirectThreadKey directThreadKey = (DirectThreadKey) C7R.get(0);
        String A06 = c30881dr.A06();
        String str = c30881dr.A05;
        JTa jTa = ((C1OW) c30881dr).A02;
        boolean z2 = jTa.A09;
        C31281Dp3 c31281Dp3 = new C31281Dp3(interfaceC37261GbE, null);
        UserSession userSession = this.A00;
        if (AbstractC159387Cy.A07(userSession, c30881dr, directThreadKey)) {
            ArmadilloExpressLinkMessageSender armadilloExpressLinkMessageSender = (ArmadilloExpressLinkMessageSender) this.A02.getValue();
            C29481bP ACZ = c30881dr.ACZ();
            ACZ.getClass();
            armadilloExpressLinkMessageSender.A05(null, interfaceC37261GbE, ACZ);
            C162337Ov.A0U(c19260xA);
            return;
        }
        DirectForwardingParams directForwardingParams = c30881dr.A00;
        if (directForwardingParams != null) {
            A0N = AbstractC47995LLh.A05(userSession, jTa.A00, directForwardingParams, directThreadKey, A06, str, jTa.A04, z2, jTa.A07, jTa.A0A);
        } else {
            String str2 = c30881dr.A01;
            String str3 = jTa.A04;
            L1W l1w = jTa.A00;
            boolean z3 = jTa.A07;
            boolean z4 = jTa.A0A;
            C25621Ms c25621Ms = new C25621Ms(userSession);
            c25621Ms.A05();
            EnumEntries enumEntries = C2EY.A0D;
            c25621Ms.A0B("direct_v2/threads/broadcast/shop_share/");
            c25621Ms.A0S(C32207EDg.class, C34793FUv.class);
            AbstractC47995LLh.A0D(c25621Ms, l1w, directThreadKey, A06, str, str3, z2, z3, z4);
            c25621Ms.A9s("link_id", str2);
            A0N = c25621Ms.A0N();
        }
        A0N.A00 = new EE4(userSession, c31281Dp3);
        C1GJ.A03(A0N);
    }

    public C30901dt(final UserSession userSession) {
        this.A00 = userSession;
        this.A01 = AbstractC28761aE.A00(userSession);
        this.A02 = AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.M8y
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return new ArmadilloExpressLinkMessageSender(UserSession.this);
            }
        });
    }
}
