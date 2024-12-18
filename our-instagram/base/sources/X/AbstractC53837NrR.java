package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.bugreporter.model.BugReport;
import com.instagram.common.session.UserSession;

/* renamed from: X.NrR, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53837NrR {
    public static final Object A00(C6FQ c6fq) {
        UserSession A0W = AbstractC31172DnG.A0W(c6fq);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        OWg oWg = new OWg();
        oWg.A08 = "636812293063672";
        oWg.A09 = "306244556460128";
        String str = A0W.userId;
        C14360o3.A0B(str, 0);
        oWg.A0I = str;
        BugReport A01 = oWg.A01();
        String A0p = AbstractC166997dE.A0p(A04, 2131962530);
        OJR ojr = new OJR(A04);
        ojr.A02 = A0p;
        ojr.A00 = AbstractC166997dE.A0p(A04, 2131962531);
        ojr.A01 = "";
        ojr.A04 = true;
        new NAU(A04, null, ojr.A00(), null, A01, A0W).A02(new Void[0]);
        return null;
    }
}
