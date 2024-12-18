package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.common.session.UserSession;

/* renamed from: X.Glm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37891Glm {
    public final InterfaceC19630xq A00;
    public final UserSession A01;

    public final void A00(C38321qM c38321qM, Integer num) {
        String str;
        int i;
        C14360o3.A0B(c38321qM, 0);
        InterfaceC19610xo ARD = this.A00.ARD();
        String id = c38321qM.getId();
        switch (num.intValue()) {
            case 0:
                i = 4950;
                str = AbstractC111324zv.A00(i);
                break;
            case 1:
                str = "positive_feedback";
                break;
            case 2:
                i = 2288;
                str = AbstractC111324zv.A00(i);
                break;
            default:
                str = NetInfoModule.CONNECTION_TYPE_NONE;
                break;
        }
        ARD.E7K(id, str);
        ARD.apply();
        c38321qM.AEH(this.A01);
    }

    public final boolean A01(C38321qM c38321qM) {
        return C14360o3.A0K(this.A00.getString(c38321qM.getId(), null), "positive_feedback");
    }

    public C37891Glm(InterfaceC19630xq interfaceC19630xq, UserSession userSession) {
        AbstractC167017dG.A1P(userSession, interfaceC19630xq);
        this.A01 = userSession;
        this.A00 = interfaceC19630xq;
    }
}
