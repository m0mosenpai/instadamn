package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ewc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33812Ewc {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        String str;
        EnumC33445EqI A00;
        C102884kP A0F = AbstractC31175DnJ.A0F(c6fw, 1);
        UserSession userSession = (UserSession) AbstractC31175DnJ.A0J(c6fq);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        if (A0F != null) {
            str = A0F.A0G();
        } else {
            str = null;
        }
        C15370ps A1F = AbstractC25225BEi.A1F();
        if (str == null) {
            A00 = EnumC33445EqI.A05;
        } else {
            A00 = AbstractC34347FCp.A00(str);
        }
        A1F.A00 = A00;
        if (A00 == null) {
            A00 = EnumC33445EqI.A05;
            A1F.A00 = A00;
        }
        double A01 = AbstractC31171DnF.A01();
        double A002 = AbstractC31171DnF.A00();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "ig_nux_started");
        AbstractC31172DnG.A1O(A0f);
        AbstractC31179DnN.A16(A0f, A01, A002);
        AbstractC31171DnF.A19(A0f, A00.A00);
        A0f.A7v("from_server", true);
        AbstractC31177DnL.A1G(A0f, "guid", AbstractC35274Fh9.A00(), A002);
        AbstractC35274Fh9.A0C(A0f, userSession, "waterfall_id", C1Q9.A01());
        A0f.Cht();
        AbstractC35794FrW.A06(userSession);
        C3BH.A00().A04(A04, userSession, new GB7(A04, userSession, A1F), (EnumC33445EqI) A1F.A00, false, true);
        return null;
    }
}
