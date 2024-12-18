package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;
import kotlin.enums.EnumEntries;

/* renamed from: X.1dx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C30941dx implements InterfaceC29301b7 {
    public static final C0KV A02 = new C0KV() { // from class: X.1dy
        @Override // X.C0KV
        public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
            int A03 = C0f9.A03(1294530264);
            int A032 = C0f9.A03(566936776);
            C30941dx c30941dx = new C30941dx(userSession);
            C0f9.A0A(835871319, A032);
            C0f9.A0A(-1665754367, A03);
            return c30941dx;
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
        C30921dv c30921dv = (C30921dv) c1ow;
        List C7R = c30921dv.C7R();
        boolean z = true;
        if (C7R.size() != 1) {
            z = false;
        }
        C18C.A0E(z);
        DirectThreadKey directThreadKey = (DirectThreadKey) C7R.get(0);
        String A06 = c30921dv.A06();
        String str = c30921dv.A05;
        JTa jTa = ((C1OW) c30921dv).A02;
        boolean z2 = jTa.A09;
        C31281Dp3 c31281Dp3 = new C31281Dp3(interfaceC37261GbE, null);
        UserSession userSession = this.A00;
        List list = c30921dv.A02;
        String str2 = c30921dv.A00;
        String str3 = jTa.A04;
        L1W l1w = jTa.A00;
        boolean z3 = jTa.A07;
        C25621Ms c25621Ms = new C25621Ms(userSession);
        c25621Ms.A05();
        EnumEntries enumEntries = C2EY.A0D;
        c25621Ms.A0B("direct_v2/threads/broadcast/hscroll_share/");
        c25621Ms.A0S(C32207EDg.class, C34793FUv.class);
        AbstractC47995LLh.A0D(c25621Ms, l1w, directThreadKey, A06, str, str3, z2, z3, false);
        c25621Ms.A9s("merchant_id", str2);
        c25621Ms.A9s("product_ids", list.toString());
        C1ON A0N = c25621Ms.A0N();
        A0N.A00 = new EE4(userSession, c31281Dp3);
        C1GJ.A03(A0N);
    }

    public C30941dx(UserSession userSession) {
        this.A00 = userSession;
        this.A01 = AbstractC28761aE.A00(userSession);
    }
}
