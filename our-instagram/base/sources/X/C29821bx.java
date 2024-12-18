package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.List;
import kotlin.enums.EnumEntries;

/* renamed from: X.1bx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C29821bx implements InterfaceC29301b7 {
    public static final C0KV A02 = new C0KV() { // from class: X.1by
        @Override // X.C0KV
        public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
            int A03 = C0f9.A03(1897495263);
            int A032 = C0f9.A03(-1888870202);
            C29821bx c29821bx = new C29821bx(userSession);
            C0f9.A0A(-1292098156, A032);
            C0f9.A0A(397552236, A03);
            return c29821bx;
        }
    };
    public final UserSession A00;
    public final C2DS A01;

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        return LCX.A01(mnp, (AbstractC29011ae) c1ow, this.A01);
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        C29801bv c29801bv = (C29801bv) c1ow;
        List C7R = c29801bv.C7R();
        boolean z = true;
        if (C7R.size() != 1) {
            z = false;
        }
        C18C.A0E(z);
        DirectThreadKey directThreadKey = (DirectThreadKey) C7R.get(0);
        String A06 = c29801bv.A06();
        String str = ((C1OW) c29801bv).A05;
        JTa jTa = ((C1OW) c29801bv).A02;
        boolean z2 = jTa.A09;
        C31281Dp3 c31281Dp3 = new C31281Dp3(interfaceC37261GbE, null);
        String str2 = c29801bv.A04;
        if (str2 != null && c29801bv.A03 != null && c29801bv.A02 != null && c29801bv.A00 != null && c29801bv.A01 != null && c29801bv.A06 != null) {
            UserSession userSession = this.A00;
            str2.getClass();
            String str3 = c29801bv.A03;
            str3.getClass();
            String str4 = c29801bv.A02;
            str4.getClass();
            String str5 = c29801bv.A00;
            str5.getClass();
            String str6 = c29801bv.A01;
            str6.getClass();
            String str7 = c29801bv.A06;
            str7.getClass();
            String str8 = c29801bv.A05;
            String str9 = jTa.A04;
            L1W l1w = jTa.A00;
            boolean z3 = jTa.A07;
            C25621Ms c25621Ms = new C25621Ms(userSession);
            c25621Ms.A05();
            EnumEntries enumEntries = C2EY.A0D;
            c25621Ms.A0B("direct_v2/threads/broadcast/p2b_order/");
            c25621Ms.A0S(C32207EDg.class, C34793FUv.class);
            AbstractC47995LLh.A0D(c25621Ms, l1w, directThreadKey, A06, str, str9, z2, z3, false);
            c25621Ms.A9s("order_id", str2);
            c25621Ms.A9s("merchant_id", str3);
            c25621Ms.A9s("consumer_id", str4);
            c25621Ms.A9s("currency", str6);
            c25621Ms.A9s("amount", str5);
            c25621Ms.A9s(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, str7);
            c25621Ms.A9s("order_notes", str8);
            C1ON A0N = c25621Ms.A0N();
            A0N.A00 = new EE4(userSession, c31281Dp3);
            C1GJ.A03(A0N);
        }
    }

    public C29821bx(UserSession userSession) {
        this.A00 = userSession;
        this.A01 = AbstractC28761aE.A00(userSession);
    }
}
