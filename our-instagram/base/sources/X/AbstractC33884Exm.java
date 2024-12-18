package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Exm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33884Exm {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        boolean A06;
        C6FG c6fg = c6fq.A03;
        InterfaceC103384lE A0G = AbstractC31175DnJ.A0G(c6fw);
        InterfaceC103384lE A0H = AbstractC31175DnJ.A0H(c6fw);
        UserSession A0L = AbstractC31179DnN.A0L(c6fq);
        C6FW A00 = AbstractC31179DnN.A0I(c6fg).A00();
        if (A0L == null) {
            A06 = false;
        } else {
            A06 = C18U.A06(C06090Tz.A05, A0L, 36313699379579081L);
        }
        if (!A06) {
            C131845xK.A00(c6fq, A00, A0H);
            return null;
        }
        FragmentActivity A03 = C6BQ.A03(C6BQ.A09(c6fq));
        C08790ch A002 = AbstractC018607g.A00(A03);
        C25621Ms A0C = AbstractC31179DnN.A0C(A0L);
        A0C.A0B("age_platform/age_verification/resume/");
        C1ON A0J = AbstractC31178DnM.A0J(A0C, C40781ul.class, C55702hA.class);
        A0J.A00 = new C32541EUr(0, c6fq, A00, A0G, A0H);
        C1GJ.A00(A03, A002, A0J);
        return null;
    }
}
