package X;

import com.instagram.common.session.UserSession;
import java.util.Locale;

/* renamed from: X.KkV, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46653KkV {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Object A01 = c6fw.A01();
        AbstractC25225BEi.A1S(A01);
        String str = (String) A01;
        UserSession userSession = (UserSession) AbstractC31175DnJ.A0J(c6fq);
        C140966Yy A0r = AbstractC25225BEi.A0r(C6BQ.A04(c6fq), userSession);
        C27S.A00().A02();
        String str2 = userSession.userId;
        String A16 = AbstractC31172DnG.A16(Locale.ROOT, "REEL_INSIGHTS");
        AbstractC167017dG.A1N(str, str2);
        C45525KDq c45525KDq = new C45525KDq();
        c45525KDq.setArguments(AbstractC167027dH.A09("arg_full_screen", true, AbstractC166987dD.A1L("arg_media_id", str), AbstractC166987dD.A1L("arg_creator_id", str2), AbstractC166987dD.A1L("arg_entry_point", A16)));
        A0r.A0B(null, c45525KDq);
        A0r.A04();
        return null;
    }
}
