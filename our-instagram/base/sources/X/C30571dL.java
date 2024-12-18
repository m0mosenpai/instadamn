package X;

import android.text.TextUtils;
import com.instagram.common.session.UserSession;
import com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressLinkMessageSender;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;
import kotlin.enums.EnumEntries;

/* renamed from: X.1dL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C30571dL implements InterfaceC29301b7 {
    public static final C0KV A03 = new C0KV() { // from class: X.1dM
        @Override // X.C0KV
        public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
            int A032 = C0f9.A03(-756902784);
            int A033 = C0f9.A03(-98372246);
            C30571dL c30571dL = new C30571dL(userSession);
            C0f9.A0A(1087517618, A033);
            C0f9.A0A(337408424, A032);
            return c30571dL;
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
        C1dJ c1dJ = (C1dJ) c1ow;
        List C7R = c1dJ.C7R();
        boolean z = true;
        if (C7R.size() != 1) {
            z = false;
        }
        C18C.A0E(z);
        DirectThreadKey directThreadKey = (DirectThreadKey) C7R.get(0);
        String A06 = c1dJ.A06();
        String str = ((C1OW) c1dJ).A05;
        JTa jTa = ((C1OW) c1dJ).A02;
        C31281Dp3 c31281Dp3 = new C31281Dp3(interfaceC37261GbE, null);
        UserSession userSession = this.A00;
        if (AbstractC159387Cy.A07(userSession, c1dJ, directThreadKey)) {
            ((ArmadilloExpressLinkMessageSender) this.A02.getValue()).A05(null, interfaceC37261GbE, c1dJ.ACZ());
            C162337Ov.A0U(c19260xA);
            return;
        }
        String A00 = AbstractC47055KrC.A00(c1dJ.A03);
        String str2 = c1dJ.A08;
        String str3 = c1dJ.A09;
        String str4 = c1dJ.A05;
        boolean z2 = jTa.A09;
        String str5 = jTa.A04;
        L1W l1w = jTa.A00;
        boolean z3 = jTa.A07;
        boolean z4 = jTa.A0A;
        C25621Ms c25621Ms = new C25621Ms(userSession);
        c25621Ms.A05();
        EnumEntries enumEntries = C2EY.A0D;
        c25621Ms.A0B("direct_v2/threads/broadcast/info_center_fact/");
        c25621Ms.A0S(C32207EDg.class, C34793FUv.class);
        AbstractC47995LLh.A0D(c25621Ms, l1w, directThreadKey, A06, str, str5, z2, z3, z4);
        c25621Ms.A9s("info_center_type", A00);
        c25621Ms.A9s("fact_name", str2);
        if (!TextUtils.isEmpty(str3)) {
            c25621Ms.A9s("fact_title", str3);
        }
        c25621Ms.A9s("content_source", str4);
        C1ON A0N = c25621Ms.A0N();
        A0N.A00 = new EE4(userSession, c31281Dp3);
        C1GJ.A03(A0N);
    }

    public C30571dL(final UserSession userSession) {
        this.A00 = userSession;
        this.A01 = AbstractC28761aE.A00(userSession);
        this.A02 = AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.M8o
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return new ArmadilloExpressLinkMessageSender(UserSession.this);
            }
        });
    }
}
