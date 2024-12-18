package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.1lX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35511lX implements InterfaceC29301b7 {
    public static final C0KV A02 = C35521lY.A00;
    public final UserSession A00;
    public final InterfaceC09390do A01 = AbstractC09440dt.A00(EnumC09460dv.A02, new MHR(this, 41));

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        return true;
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        C35491lV c35491lV = (C35491lV) c1ow;
        C14360o3.A0B(c35491lV, 0);
        C14360o3.A0B(interfaceC37261GbE, 2);
        UserSession userSession = this.A00;
        EE5 ee5 = new EE5(AbstractC46987Kq6.A00(userSession, interfaceC37261GbE), userSession, this, c35491lV);
        String str = c35491lV.A00;
        if (str != null) {
            boolean z = c35491lV.A01;
            String str2 = c35491lV.A05;
            C25621Ms c25621Ms = new C25621Ms(userSession, -2);
            c25621Ms.A09(C05F.A01);
            c25621Ms.A0L("direct_v2/threads/%s/toggle_typing_indicator_control/", str);
            c25621Ms.A0P(null, C40781ul.class, C55702hA.class, false);
            c25621Ms.A0I("is_typing_indicator_disabled", z);
            c25621Ms.A9s("mutation_token", str2);
            C1ON A0N = c25621Ms.A0N();
            A0N.A00 = ee5;
            C1GJ.A03(A0N);
            return;
        }
        C14360o3.A0F("threadId");
        throw C00O.createAndThrow();
    }

    public C35511lX(UserSession userSession) {
        this.A00 = userSession;
    }
}
