package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.1ft, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32091ft implements InterfaceC29301b7 {
    public static final C0KV A01 = new C0KV() { // from class: X.1fu
        @Override // X.C0KV
        public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
            int A03 = C0f9.A03(-1362367763);
            int A032 = C0f9.A03(980771550);
            C32091ft c32091ft = new C32091ft(userSession);
            C0f9.A0A(1740168937, A032);
            C0f9.A0A(-1701745679, A03);
            return c32091ft;
        }
    };
    public final UserSession A00;

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        if (((C32071fr) c1ow).A01 == null) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        String str;
        C32071fr c32071fr = (C32071fr) c1ow;
        UserSession userSession = this.A00;
        String str2 = c32071fr.A01;
        boolean z = c32071fr.A02;
        Integer num = c32071fr.A00;
        C25621Ms c25621Ms = new C25621Ms(userSession);
        c25621Ms.A05();
        if (z) {
            str = "mute_video_call";
        } else {
            str = "unmute_video_call";
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

    public C32091ft(UserSession userSession) {
        this.A00 = userSession;
    }
}
