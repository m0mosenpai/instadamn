package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.1fb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31911fb implements InterfaceC29301b7 {
    public static final C0KV A01 = new C0KV() { // from class: X.1fc
        @Override // X.C0KV
        public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
            int A03 = C0f9.A03(151117352);
            int A032 = C0f9.A03(-1756245609);
            C31911fb c31911fb = new C31911fb(userSession);
            C0f9.A0A(-1843421929, A032);
            C0f9.A0A(-2062375754, A03);
            return c31911fb;
        }
    };
    public final UserSession A00;

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        return true;
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        String str;
        C31891fZ c31891fZ = (C31891fZ) c1ow;
        UserSession userSession = this.A00;
        String str2 = c31891fZ.A01;
        boolean z = c31891fZ.A02;
        Integer num = c31891fZ.A00;
        C25621Ms c25621Ms = new C25621Ms(userSession);
        c25621Ms.A05();
        if (z) {
            str = "mute";
        } else {
            str = "unmute";
        }
        c25621Ms.A0L("direct_v2/threads/%s/%s/", str2, str);
        c25621Ms.A0S(C40781ul.class, C55702hA.class);
        if (num != null) {
            c25621Ms.A0D("mute_seconds", num.intValue());
        }
        C1ON A0N = c25621Ms.A0N();
        A0N.A00 = AbstractC46987Kq6.A00(userSession, interfaceC37261GbE);
        C1GJ.A03(A0N);
    }

    public C31911fb(UserSession userSession) {
        this.A00 = userSession;
    }
}
