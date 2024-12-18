package X;

import com.instagram.common.session.UserSession;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;

/* renamed from: X.Ey2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33900Ey2 {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Object A03 = c6fw.A03(0);
        AbstractC25225BEi.A1S(A03);
        String str = (String) A03;
        InterfaceC11380iw A08 = C6BQ.A08(c6fq);
        if (C6BQ.A0B(c6fq) instanceof UserSession) {
            AbstractC31175DnJ.A1M(A08, new C63397SjR(C6BQ.A04(c6fq), AbstractC31179DnN.A0K(c6fq), C2Fb.A0V, str, false));
            return null;
        }
        SimpleWebViewActivity.A02.A02(C6BQ.A04(c6fq), C6BQ.A0B(c6fq), new SimpleWebViewConfig((String) null, (String) null, false, false, false, false, true, true, false, false, true, false, false, false, (String) null, str));
        return null;
    }
}
