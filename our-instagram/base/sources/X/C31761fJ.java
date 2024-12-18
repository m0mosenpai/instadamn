package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.1fJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31761fJ implements InterfaceC29301b7 {
    public static final C0KV A01 = new C0KV() { // from class: X.1fK
        @Override // X.C0KV
        public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
            int A03 = C0f9.A03(-1677959398);
            int A032 = C0f9.A03(812267807);
            C31761fJ c31761fJ = new C31761fJ(userSession);
            C0f9.A0A(1063356783, A032);
            C0f9.A0A(462843757, A03);
            return c31761fJ;
        }
    };
    public final UserSession A00;

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        return true;
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        C31741fH c31741fH = (C31741fH) c1ow;
        C45949KVa c45949KVa = c31741fH.A01;
        UserSession userSession = this.A00;
        C1ON A00 = AbstractC46911Kos.A00(userSession, "voice_item_seen", c45949KVa.A04, c45949KVa.A02, c45949KVa.A03, ((C1OW) c31741fH).A02.A09, c31741fH.A03);
        A00.A00 = AbstractC46987Kq6.A00(userSession, interfaceC37261GbE);
        C1GJ.A03(A00);
        C162337Ov.A0Y(c19260xA, C05F.A00);
    }

    public C31761fJ(UserSession userSession) {
        this.A00 = userSession;
    }
}
