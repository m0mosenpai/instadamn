package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;

/* renamed from: X.1kO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34831kO implements InterfaceC29301b7 {
    public static final C0KV A01 = C34841kP.A00;
    public final UserSession A00;

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        return true;
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        String str;
        C34811kM c34811kM = (C34811kM) c1ow;
        C14360o3.A0B(c34811kM, 0);
        C14360o3.A0B(interfaceC37261GbE, 2);
        UserSession userSession = this.A00;
        DirectThreadKey C7Q = c34811kM.C7Q();
        List list = c34811kM.A02;
        if (list != null) {
            List list2 = c34811kM.A01;
            if (list2 != null) {
                C25621Ms c25621Ms = new C25621Ms(userSession);
                c25621Ms.A09(C05F.A01);
                c25621Ms.A0B(AbstractC13670mt.A06("direct_v2/threads/%s/delete_items_locally/", C7Q.A00));
                c25621Ms.A9s("item_ids", AnonymousClass001.A0g("[", C71473Il.A00(',').A02(list), "]"));
                c25621Ms.A9s("original_message_client_contexts", AnonymousClass001.A0g("[", C71473Il.A00(',').A02(list2), "]"));
                c25621Ms.A0S(C40781ul.class, C55702hA.class);
                C1ON A0N = c25621Ms.A0N();
                A0N.A00 = AbstractC46987Kq6.A00(userSession, interfaceC37261GbE);
                C1GJ.A03(A0N);
                return;
            }
            str = "clientContexts";
        } else {
            str = "itemIds";
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public C34831kO(UserSession userSession) {
        this.A00 = userSession;
    }
}
