package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.request.DirectThreadApi;
import java.util.List;

/* renamed from: X.1lj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35631lj implements InterfaceC29301b7 {
    public static final C0KV A01 = C35641lk.A00;
    public final UserSession A00;

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        return true;
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        C35611lh c35611lh = (C35611lh) c1ow;
        C14360o3.A0B(c35611lh, 0);
        C14360o3.A0B(interfaceC37261GbE, 2);
        UserSession userSession = this.A00;
        C32221EDu c32221EDu = new C32221EDu(AbstractC46987Kq6.A00(userSession, interfaceC37261GbE), userSession);
        List list = c35611lh.A00;
        if (list != null) {
            C1ON A0F = DirectThreadApi.A0F(userSession, list);
            A0F.A00 = c32221EDu;
            C1GJ.A03(A0F);
            return;
        }
        C14360o3.A0F("threadIds");
        throw C00O.createAndThrow();
    }

    public C35631lj(UserSession userSession) {
        this.A00 = userSession;
    }
}
