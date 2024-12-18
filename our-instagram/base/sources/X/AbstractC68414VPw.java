package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.AdsAPIInstagramPosition;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.common.session.UserSession;

/* renamed from: X.VPw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68414VPw {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        XIGIGBoostCallToAction xIGIGBoostCallToAction;
        try {
            UserSession userSession = (UserSession) AbstractC31175DnJ.A0J(c6fq);
            FragmentActivity A04 = C6BQ.A04(c6fq);
            Object A01 = c6fw.A01();
            C14360o3.A0C(A01, "null cannot be cast to non-null type kotlin.String");
            String str = (String) A01;
            String str2 = (String) c6fw.A00.get(1);
            if (str2 != null) {
                xIGIGBoostCallToAction = (XIGIGBoostCallToAction) XIGIGBoostCallToAction.A02.get(AbstractC65702TsY.A0g(str2));
                if (xIGIGBoostCallToAction == null) {
                    xIGIGBoostCallToAction = XIGIGBoostCallToAction.A0S;
                }
            } else {
                xIGIGBoostCallToAction = XIGIGBoostCallToAction.A0N;
            }
            Object A03 = c6fw.A03(2);
            C14360o3.A0C(A03, "null cannot be cast to non-null type kotlin.String");
            AdsAPIInstagramPosition A00 = AbstractC68362VNw.A00(AbstractC65702TsY.A0g((String) A03));
            int ordinal = A00.ordinal();
            if (ordinal != 13 && ordinal != 7 && ordinal != 2) {
                if (ordinal == 9) {
                    AbstractC138316On.A04(A04, xIGIGBoostCallToAction, userSession, null, str, null);
                    return null;
                }
                throw new IllegalStateException("Native preview is not supported for this ad placement");
            }
            C6PZ.A01(A04, A00, xIGIGBoostCallToAction, userSession, str);
            return null;
        } catch (Exception e) {
            e.toString();
            return null;
        }
    }
}
