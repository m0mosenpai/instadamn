package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.io.File;
import java.util.List;

/* renamed from: X.1bl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C29701bl implements InterfaceC29301b7 {
    public static final C0KV A02 = new C0KV() { // from class: X.1bm
        @Override // X.C0KV
        public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
            int A03 = C0f9.A03(1025041960);
            int A032 = C0f9.A03(-2133238709);
            C29701bl c29701bl = new C29701bl(userSession, AbstractC28761aE.A00(userSession));
            C0f9.A0A(1138433502, A032);
            C0f9.A0A(-427356445, A03);
            return c29701bl;
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
        C29681bj c29681bj = (C29681bj) c1ow;
        List C7R = c29681bj.C7R();
        boolean z = true;
        if (C7R.size() != 1) {
            z = false;
        }
        C18C.A0E(z);
        if (!new File(c29681bj.A00.A02()).exists()) {
            interfaceC37261GbE.DUq(C114675Fx.A0Q, null);
            return;
        }
        DirectThreadKey directThreadKey = (DirectThreadKey) C7R.get(0);
        C2EY c2ey = C2EY.A1C;
        String A06 = c29681bj.A06();
        JTa jTa = ((C1OW) c29681bj).A02;
        boolean z2 = jTa.A09;
        UserSession userSession = this.A00;
        C7Q4 c7q4 = c29681bj.A00;
        L1W l1w = jTa.A00;
        boolean z3 = jTa.A07;
        boolean z4 = false;
        if (c7q4.A01 == EnumC40111tc.A0Q) {
            z4 = true;
        }
        C18C.A0E(z4);
        C25621Ms c25621Ms = new C25621Ms(userSession);
        c25621Ms.A05();
        c25621Ms.A0B("direct_v2/threads/broadcast/upload_photo/");
        c25621Ms.A0S(C32207EDg.class, C34793FUv.class);
        AbstractC47995LLh.A0D(c25621Ms, l1w, directThreadKey, A06, null, null, z2, z3, false);
        c25621Ms.A07(new File(c7q4.A03()), "photo");
        C1ON A0N = c25621Ms.A0N();
        A0N.A00 = new C45387K8a(userSession, interfaceC37261GbE, this, directThreadKey, c2ey, A06);
        C1GJ.A03(A0N);
        C162337Ov.A0Y(c19260xA, C05F.A00);
    }

    public C29701bl(UserSession userSession, C2DS c2ds) {
        this.A00 = userSession;
        this.A01 = c2ds;
    }
}
