package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Eyz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33959Eyz {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        EnumC31556Dtg enumC31556Dtg;
        Object A03 = c6fw.A03(0);
        AbstractC25225BEi.A1S(A03);
        UserSession A0W = AbstractC31172DnG.A0W(c6fq);
        User A10 = AbstractC166987dD.A10(A0W);
        C140966Yy A0r = AbstractC25225BEi.A0r(C6BQ.A04(c6fq), A0W);
        C1XQ A01 = AbstractC31412DrH.A01();
        if (C14360o3.A0K(A03, "self_following")) {
            enumC31556Dtg = EnumC31556Dtg.A05;
        } else if (C14360o3.A0K(A03, "self_following_simplified")) {
            enumC31556Dtg = EnumC31556Dtg.A06;
        } else {
            enumC31556Dtg = EnumC31556Dtg.A04;
        }
        A0r.A0B(null, A01.CsL(A0W, AbstractC31565Dtq.A00(enumC31556Dtg, A10.getId(), null, false)));
        A0r.A04();
        return null;
    }
}
