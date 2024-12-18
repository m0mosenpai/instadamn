package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.Calendar;

/* renamed from: X.Exv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33893Exv {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Object A03 = c6fw.A03(1);
        C14360o3.A0C(A03, "null cannot be cast to non-null type kotlin.Number");
        long A0N = AbstractC166987dD.A0N(A03);
        int A0D = AbstractC25230BEn.A0D(c6fw.A03(2), "null cannot be cast to non-null type kotlin.Number");
        UserSession A0S = AbstractC31177DnL.A0S(c6fq);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        Calendar calendar = Calendar.getInstance();
        C14360o3.A07(calendar);
        calendar.setTimeInMillis(A0N * 1000);
        int i = calendar.get(1);
        int i2 = calendar.get(2) + 1;
        int A05 = AbstractC31173DnH.A05(calendar);
        C08790ch A00 = AbstractC018607g.A00(A04);
        C25621Ms A0C = AbstractC31179DnN.A0C(A0S);
        A0C.A9s("day", AbstractC31181DnP.A0G(A0C, "age_platform/age_verification/start/", i, i2, A05));
        A0C.A9s("product_surface", String.valueOf(A0D));
        C1GJ.A00(A04, A00, AbstractC31178DnM.A0J(A0C, C40781ul.class, C55702hA.class));
        return null;
    }
}
