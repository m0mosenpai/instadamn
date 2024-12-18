package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.model.DirectAREffectShare;
import com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressLinkMessageSender;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.shopping.ProductAREffectContainer;
import com.instagram.user.model.Product;
import java.util.List;
import kotlin.enums.EnumEntries;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1dh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C30781dh implements InterfaceC29301b7 {
    public static C0KV A03 = new C0KV() { // from class: X.1di
        @Override // X.C0KV
        public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
            int A032 = C0f9.A03(1997413984);
            int A033 = C0f9.A03(850841681);
            C30781dh c30781dh = new C30781dh(userSession);
            C0f9.A0A(1926357398, A033);
            C0f9.A0A(-1415838883, A032);
            return c30781dh;
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
        C30761df c30761df = (C30761df) c1ow;
        List C7R = c30761df.C7R();
        boolean z = true;
        if (C7R.size() != 1) {
            z = false;
        }
        C18C.A0E(z);
        DirectThreadKey directThreadKey = (DirectThreadKey) C7R.get(0);
        String A06 = c30761df.A06();
        String str = c30761df.A05;
        DirectAREffectShare directAREffectShare = c30761df.A00;
        JTa jTa = ((C1OW) c30761df).A02;
        UserSession userSession = this.A00;
        if (AbstractC159387Cy.A07(userSession, c30761df, directThreadKey)) {
            ((ArmadilloExpressLinkMessageSender) this.A02.getValue()).A05(null, interfaceC37261GbE, c30761df.ACZ());
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
        c25621Ms.A0B("direct_v2/threads/broadcast/ar_effect/");
        c25621Ms.A0S(C32207EDg.class, C34793FUv.class);
        AbstractC47995LLh.A0D(c25621Ms, l1w, directThreadKey, A06, str, str2, z2, z3, z4);
        c25621Ms.A9s("effect_id", directAREffectShare.A02());
        c25621Ms.A9s("query_id", "4951618228229019");
        ProductAREffectContainer productAREffectContainer = directAREffectShare.A04;
        if (productAREffectContainer != null) {
            Product A01 = AbstractC38048Gob.A01(productAREffectContainer.A00.A01);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("product_id", A01.A0H);
                jSONObject.put("merchant_id", AbstractC76433bn.A00(A01.A0B));
                c25621Ms.A9s("effect_product", jSONObject.toString());
            } catch (JSONException unused) {
                C0w9.A03("DirectMessageApi", "Error creating effect product json for direct message");
            }
        }
        C1GJ.A03(c25621Ms.A0N());
    }

    public C30781dh(final UserSession userSession) {
        this.A00 = userSession;
        this.A01 = AbstractC28761aE.A00(userSession);
        this.A02 = AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.M8l
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return new ArmadilloExpressLinkMessageSender(UserSession.this);
            }
        });
    }
}
