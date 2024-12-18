package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.1hz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33371hz implements InterfaceC29301b7 {
    public static final C0KV A02 = C33381i0.A00;
    public final UserSession A00;
    public final C2DS A01;

    public C33371hz(UserSession userSession, C2DS c2ds) {
        C14360o3.A0B(c2ds, 2);
        this.A00 = userSession;
        this.A01 = c2ds;
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        C33351hx c33351hx = (C33351hx) c1ow;
        C14360o3.A0B(c33351hx, 0);
        C14360o3.A0B(mnp, 1);
        String str = ((JTV) mnp).A02;
        if ("upload_failed_permanent".equals(str) || "upload_failed_transient".equals(str)) {
            return false;
        }
        if (C2DU.A03((C2DU) this.A01, c33351hx.C7Q()) == null) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        C33351hx c33351hx = (C33351hx) c1ow;
        C14360o3.A0B(c33351hx, 0);
        C14360o3.A0B(interfaceC37261GbE, 2);
        UserSession userSession = this.A00;
        DirectThreadKey C7Q = c33351hx.C7Q();
        boolean z = c33351hx.A01;
        String str = c33351hx.A05;
        C25621Ms c25621Ms = new C25621Ms(userSession);
        c25621Ms.A05();
        c25621Ms.A0B(AbstractC13670mt.A06("direct_v2/threads/%s/change_thread_group_link_joinable_mode/", C7Q.A00));
        c25621Ms.A0D("joinable_mode", z ? 1 : 0);
        c25621Ms.A9s("mutation_token", str);
        c25621Ms.A0S(C40781ul.class, C55702hA.class);
        LLX.A0A(c25621Ms, C7Q);
        C1ON A0N = c25621Ms.A0N();
        A0N.A00 = AbstractC46987Kq6.A00(userSession, interfaceC37261GbE);
        C1GJ.A03(A0N);
    }
}
