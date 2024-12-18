package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.WmT, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71012WmT implements XDu {
    public final C66155U1w A00;

    public C71012WmT(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = new C66155U1w(userSession, AbstractC66154U1v.A00(userSession).A00());
    }

    @Override // X.XDu
    public final /* synthetic */ void DjE(C51621MrE c51621MrE) {
    }

    @Override // X.XDu
    public final /* synthetic */ C65956Tx8 E4l(String str, List list) {
        return VWU.A00(this, str);
    }

    @Override // X.XDu
    public final C65956Tx8 E4n(String str, String str2, List list, List list2) {
        C65965TxI c65965TxI = new C65965TxI(false, AbstractC25233BEq.A1b(str, list, list2), false);
        c65965TxI.A05(this.A00.A00(str), str2);
        c65965TxI.A06(list2, str2);
        c65965TxI.A07(list, str2);
        return c65965TxI.A00();
    }

    @Override // X.XDu
    public final C65956Tx8 E4m() {
        return U24.A00();
    }
}
