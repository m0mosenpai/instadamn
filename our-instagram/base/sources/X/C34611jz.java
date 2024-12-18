package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.1jz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34611jz implements InterfaceC29301b7 {
    public static final C0KV A01 = C34621k0.A00;
    public final UserSession A00;

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        return true;
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        String str;
        C34591jx c34591jx = (C34591jx) c1ow;
        C14360o3.A0B(c34591jx, 0);
        C14360o3.A0B(interfaceC37261GbE, 2);
        UserSession userSession = this.A00;
        DirectThreadKey C7Q = c34591jx.C7Q();
        boolean z = c34591jx.A01;
        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
        c25621Ms.A05();
        String str2 = C7Q.A00;
        if (z) {
            str = "enable_comments";
        } else {
            str = "disable_comments";
        }
        c25621Ms.A0L("direct_v2/threads/%s/%s/", str2, str);
        c25621Ms.A0R(C40781ul.class, C55702hA.class);
        C1ON A0N = c25621Ms.A0N();
        A0N.A00 = new C32226EDz(new C1P1() { // from class: X.9g7
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.1vN] */
            @Override // X.C1P1
            public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                int A03 = C0f9.A03(-875285953);
                int A0N2 = AbstractC167017dG.A0N(obj, -1455341770);
                super.onSuccess(obj);
                AbstractC25651Mw.A00(C34611jz.this.A00).E4s(new Object());
                C0f9.A0A(-607110198, A0N2);
                C0f9.A0A(-1220730143, A03);
            }
        }, userSession, interfaceC37261GbE);
        C1GJ.A03(A0N);
    }

    public C34611jz(UserSession userSession) {
        this.A00 = userSession;
    }
}
