package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.ExH, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33853ExH {
    public static final C0eB A00(C6FQ c6fq, C6FW c6fw) {
        FragmentActivity A04 = C6BQ.A04(c6fq);
        UserSession userSession = (UserSession) AbstractC31175DnJ.A0J(c6fq);
        Object A01 = c6fw.A01();
        String A0f = AbstractC31171DnF.A0f(A01);
        Object A02 = c6fw.A02();
        C14360o3.A0C(A02, A0f);
        FVI.A01().A05(A04, userSession, (String) A01, (String) A02);
        return C0eB.A00;
    }
}
