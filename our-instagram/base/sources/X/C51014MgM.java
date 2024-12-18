package X;

import com.instagram.common.session.UserSession;
import java.util.AbstractMap;

/* renamed from: X.MgM, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51014MgM extends AbstractC52922bZ {
    public final C25671My A00;
    public final OBK A01;
    public final InterfaceC06180Ui A02;
    public final InterfaceC06180Ui A03;
    public final InterfaceC15070pN A04;
    public final InterfaceC15070pN A05;

    public /* synthetic */ C51014MgM(UserSession userSession, OBK obk) {
        C25671My A00 = AbstractC25651Mw.A00(userSession);
        C14360o3.A0B(A00, 3);
        this.A01 = obk;
        this.A00 = A00;
        Integer num = C05F.A00;
        AnonymousClass057 A002 = C10M.A00(num, 1, 0);
        A002.F8m(AbstractC166987dD.A1I());
        this.A02 = A002;
        this.A04 = new C06160Ug(null, A002);
        AnonymousClass057 A003 = C10M.A00(num, 1, 0);
        this.A03 = A003;
        this.A05 = new C06160Ug(null, A003);
    }

    public static boolean A00(InterfaceC09390do interfaceC09390do) {
        int size = ((AbstractMap) AbstractC001800i.A0I(((C51014MgM) interfaceC09390do.getValue()).A02.Bn0())).size();
        if (1 <= size && size <= 1) {
            return true;
        }
        return false;
    }

    public final void A01(InterfaceC57886Plq... interfaceC57886PlqArr) {
        AbstractC166987dD.A1Z(new C57154PYy(this, interfaceC57886PlqArr, null, 29), AbstractC141776au.A00(this));
    }
}
