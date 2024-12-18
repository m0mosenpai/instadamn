package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.NrE, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53824NrE {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Object A0a = MSY.A0a(c6fw);
        Object A03 = c6fw.A03(1);
        C14360o3.A0C(A03, AbstractC58317Pt9.A00(1));
        Map map = (Map) A03;
        if (C14360o3.A0K(A0a, "ig_ig_feed_cross_posting")) {
            UserSession A0S = AbstractC31177DnL.A0S(c6fq);
            Context context = C6BQ.A09(c6fq).A00;
            Object obj = map.get("linked_id");
            C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj;
            Object obj2 = map.get(AbstractC31581Du9.A01());
            C14360o3.A0C(obj2, "null cannot be cast to non-null type kotlin.String");
            String str2 = (String) obj2;
            C56137Ovx A00 = AbstractC53982Ntt.A00(A0S);
            AbstractC167007dF.A1D(str, 1, str2);
            C146106i8 A0Y = AbstractC31174DnI.A0Y();
            A0Y.A0D = AbstractC167007dF.A0f(context, str2, 2131963733);
            A0Y.A06();
            AbstractC167007dF.A0J().postDelayed(new PTH(A00, A0Y.A00(), str, str2), 1000L);
            return null;
        }
        return null;
    }
}
