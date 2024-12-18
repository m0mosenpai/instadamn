package X;

import com.instagram.common.session.UserSession;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.Ewl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33821Ewl {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        String A0e = AbstractC31177DnL.A0e(c6fw, 1);
        Object A03 = c6fw.A03(3);
        C14360o3.A0C(A03, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.Any, kotlin.Any>");
        UserSession A0W = AbstractC31172DnG.A0W(c6fq);
        C38321qM A0C = C38321qM.A0h.A0C(C07950bF.A04.A01(A0W, AbstractC166987dD.A19(new JSONObject((Map) A03))), true, false);
        if (A0C != null) {
            A0C.AEH(A0W);
        }
        C25671My A00 = AbstractC25651Mw.A00(A0W);
        EnumC125765mR enumC125765mR = EnumC125765mR.A04;
        A00.E4s(new C154976xm(enumC125765mR, A0e));
        AbstractC25651Mw.A00(A0W).E4s(new C154976xm(enumC125765mR, A0W.userId));
        return null;
    }
}
