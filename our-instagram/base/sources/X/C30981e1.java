package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;
import kotlin.enums.EnumEntries;

/* renamed from: X.1e1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C30981e1 implements InterfaceC29301b7 {
    public static final C0KV A02 = new C0KV() { // from class: X.1e2
        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X.1e1] */
        @Override // X.C0KV
        public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
            int A03 = C0f9.A03(-1840484362);
            int A032 = C0f9.A03(174799197);
            ?? obj = new Object();
            obj.A00 = userSession;
            obj.A01 = AbstractC28761aE.A00(userSession);
            C0f9.A0A(1772131308, A032);
            C0f9.A0A(-485622406, A03);
            return obj;
        }
    };
    public UserSession A00;
    public C2DS A01;

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        return LCX.A01(mnp, (AbstractC29011ae) c1ow, this.A01);
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        C30961dz c30961dz = (C30961dz) c1ow;
        List C7R = c30961dz.C7R();
        boolean z = true;
        if (C7R.size() != 1) {
            z = false;
        }
        C18C.A0E(z);
        DirectThreadKey directThreadKey = (DirectThreadKey) C7R.get(0);
        String A06 = c30961dz.A06();
        String str = c30961dz.A05;
        JTa jTa = ((C1OW) c30961dz).A02;
        boolean z2 = jTa.A09;
        C31281Dp3 c31281Dp3 = new C31281Dp3(interfaceC37261GbE, null);
        String str2 = c30961dz.A00;
        UserSession userSession = this.A00;
        String str3 = jTa.A04;
        L1W l1w = jTa.A00;
        boolean z3 = jTa.A07;
        boolean z4 = jTa.A0A;
        C25621Ms c25621Ms = new C25621Ms(userSession);
        c25621Ms.A05();
        EnumEntries enumEntries = C2EY.A0D;
        c25621Ms.A0B("direct_v2/threads/broadcast/fbpay_referral/");
        c25621Ms.A0S(C32207EDg.class, C34793FUv.class);
        AbstractC47995LLh.A0D(c25621Ms, l1w, directThreadKey, A06, str, str3, z2, z3, z4);
        c25621Ms.A9s("referral_id", str2);
        C1ON A0N = c25621Ms.A0N();
        A0N.A00 = new EE4(userSession, c31281Dp3);
        C1GJ.A03(A0N);
    }
}
