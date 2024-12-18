package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.user.model.User;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1dQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C30611dQ implements InterfaceC29301b7 {
    public static final C0KV A03 = new C0KV() { // from class: X.1dR
        @Override // X.C0KV
        public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
            int A032 = C0f9.A03(482266136);
            int A033 = C0f9.A03(-1690368306);
            C30611dQ c30611dQ = new C30611dQ(userSession);
            C0f9.A0A(-898952916, A033);
            C0f9.A0A(1874487622, A032);
            return c30611dQ;
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
        C25621Ms c25621Ms;
        C1dN c1dN = (C1dN) c1ow;
        List C7R = c1dN.C7R();
        boolean z = true;
        if (C7R.size() != 1) {
            z = false;
        }
        C18C.A0E(z);
        DirectThreadKey directThreadKey = (DirectThreadKey) C7R.get(0);
        String A06 = c1dN.A06();
        String id = c1dN.A01.getId();
        String str = c1dN.A05;
        boolean equals = c1dN.A02().equals("send_ai_agent_profile_share_message");
        JTa jTa = ((C1OW) c1dN).A02;
        C31281Dp3 c31281Dp3 = new C31281Dp3(interfaceC37261GbE, null);
        if (!c1dN.A02 && AbstractC159387Cy.A07(this.A00, c1dN, directThreadKey)) {
            C47415Kx6 c47415Kx6 = (C47415Kx6) this.A02.getValue();
            C14360o3.A0B(interfaceC37261GbE, 1);
            EnumC46252KdU enumC46252KdU = EnumC46252KdU.PROFILE;
            User user = c1dN.A01;
            C14360o3.A07(user);
            AbstractC46926Kp7.A00(c47415Kx6.A00).A02(enumC46252KdU, EnumC46251KdT.SHARE, interfaceC37261GbE, c1dN, user, null);
            C162337Ov.A0U(c19260xA);
            return;
        }
        UserSession userSession = this.A00;
        boolean z2 = jTa.A09;
        String str2 = jTa.A04;
        L1W l1w = jTa.A00;
        boolean z3 = jTa.A07;
        boolean z4 = jTa.A0A;
        boolean z5 = c1dN.A02;
        if (equals) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("genai_bot_id", id);
            } catch (JSONException unused) {
                C0w9.A03("DirectMessageApi", "Error passing JSON params for AI Agent profile.");
            }
            KVU kvu = AbstractC47211Ktk.A08;
            C14360o3.A0B(userSession, 0);
            C14360o3.A0B(directThreadKey, 1);
            C14360o3.A0B(kvu, 3);
            c25621Ms = new C25621Ms(userSession, -2);
            c25621Ms.A05();
            c25621Ms.A0B("direct_v2/threads/broadcast/generic_share/");
            LLX.A0A(c25621Ms, directThreadKey);
            LLX.A05(c25621Ms, l1w, A06, str, str2, null, z2, z3, z4);
            LLX.A06(c25621Ms, kvu, jSONObject);
            c25621Ms.A0S(C32207EDg.class, C34793FUv.class);
        } else {
            c25621Ms = new C25621Ms(userSession);
            c25621Ms.A05();
            c25621Ms.A0B(new StringBuilder(AnonymousClass001.A0g("direct_v2/threads/broadcast/", C2EY.A1Q.A00, "/")).toString());
            c25621Ms.A0S(C32207EDg.class, C34793FUv.class);
            AbstractC47995LLh.A0D(c25621Ms, l1w, directThreadKey, A06, str, str2, z2, z3, z4);
            c25621Ms.A9s("profile_user_id", id);
        }
        c25621Ms.A0I("is_x_transport_forward", z5);
        C1ON A0N = c25621Ms.A0N();
        A0N.A00 = new EE4(userSession, c31281Dp3);
        C1GJ.A03(A0N);
    }

    public C30611dQ(final UserSession userSession) {
        this.A00 = userSession;
        this.A01 = AbstractC28761aE.A00(userSession);
        this.A02 = AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.M8v
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return new C47415Kx6(UserSession.this);
            }
        });
    }
}
