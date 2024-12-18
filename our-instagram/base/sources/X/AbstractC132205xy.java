package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import java.util.List;

/* renamed from: X.5xy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC132205xy {
    public static final ExtendedImageUrl A00(UserSession userSession, C38321qM c38321qM, Double d) {
        List AlQ;
        C14360o3.A0B(userSession, 0);
        Context A06 = userSession.deviceSession.A06();
        if (d != null) {
            double doubleValue = d.doubleValue();
            if (doubleValue > 0.0d) {
                return c38321qM.A1o((int) (AbstractC13890nF.A01(A06) * doubleValue));
            }
        }
        boolean A062 = C18U.A06(C06090Tz.A05, userSession, 36327743922781011L);
        ImageInfo A1t = c38321qM.A1t();
        if (A062) {
            if (A1t == null) {
                return null;
            }
            return AbstractC40161tk.A01(A06, A1t);
        }
        if (A1t == null || (AlQ = A1t.AlQ()) == null) {
            return null;
        }
        return (ExtendedImageUrl) AbstractC001800i.A0J(AlQ);
    }
}
