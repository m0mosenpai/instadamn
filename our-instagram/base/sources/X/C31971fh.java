package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.1fh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31971fh implements InterfaceC29301b7 {
    public static final C0KV A01 = new C0KV() { // from class: X.1fi
        @Override // X.C0KV
        public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
            int A03 = C0f9.A03(-30847795);
            int A032 = C0f9.A03(336824083);
            C31971fh c31971fh = new C31971fh(userSession);
            C0f9.A0A(-1760022948, A032);
            C0f9.A0A(1398121664, A03);
            return c31971fh;
        }
    };
    public final UserSession A00;

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        if (((C31951ff) c1ow).A00 == null) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        String str;
        C31951ff c31951ff = (C31951ff) c1ow;
        UserSession userSession = this.A00;
        String str2 = c31951ff.A00;
        boolean z = c31951ff.A01;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(str2, 1);
        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
        c25621Ms.A05();
        if (z) {
            str = "mute";
        } else {
            str = "unmute";
        }
        c25621Ms.A0L("direct_v2/threads/%s/%s_mentions/", str2, str);
        c25621Ms.A0R(C40781ul.class, C55702hA.class);
        C1ON A0N = c25621Ms.A0N();
        A0N.A00 = AbstractC46987Kq6.A00(userSession, interfaceC37261GbE);
        C1GJ.A03(A0N);
    }

    public C31971fh(UserSession userSession) {
        this.A00 = userSession;
    }
}