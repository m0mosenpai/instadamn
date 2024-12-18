package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;

/* renamed from: X.1bc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C29611bc implements InterfaceC29301b7 {
    public static final C0KV A02 = C29621bd.A00;
    public final UserSession A00;
    public final C2DS A01;

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        AbstractC29011ae abstractC29011ae = (AbstractC29011ae) c1ow;
        C14360o3.A0B(abstractC29011ae, 0);
        C14360o3.A0B(mnp, 1);
        return LCX.A01(mnp, abstractC29011ae, this.A01);
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        C29581bZ c29581bZ = (C29581bZ) c1ow;
        C14360o3.A0B(c29581bZ, 0);
        C14360o3.A0B(interfaceC37261GbE, 2);
        List C7R = c29581bZ.C7R();
        C14360o3.A07(C7R);
        if (C7R.size() == 1) {
            DirectThreadKey directThreadKey = (DirectThreadKey) C7R.get(0);
            JTa jTa = ((C1OW) c29581bZ).A02;
            String str = c29581bZ.A02;
            String str2 = c29581bZ.A03;
            if (str != null && str2 != null) {
                UserSession userSession = this.A00;
                String A06 = c29581bZ.A06();
                String str3 = c29581bZ.A05;
                String str4 = jTa.A04;
                L1W l1w = jTa.A00;
                boolean z = jTa.A09;
                boolean z2 = jTa.A07;
                boolean z3 = jTa.A0A;
                C25621Ms c25621Ms = new C25621Ms(userSession);
                c25621Ms.A05();
                c25621Ms.A0B(new StringBuilder(AnonymousClass001.A0g("direct_v2/threads/broadcast/", C2EY.A0g.A00, "/")).toString());
                c25621Ms.A0S(C32207EDg.class, C34793FUv.class);
                AbstractC47995LLh.A0D(c25621Ms, l1w, directThreadKey, A06, str3, str4, z, z2, z3);
                c25621Ms.A9s("destination_id", str);
                c25621Ms.A9s("tag_id", str2);
                C1ON A0N = c25621Ms.A0N();
                A0N.A00 = AbstractC46987Kq6.A00(userSession, interfaceC37261GbE);
                C1GJ.A03(A0N);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public C29611bc(UserSession userSession) {
        this.A00 = userSession;
        this.A01 = AbstractC28761aE.A00(userSession);
    }
}
