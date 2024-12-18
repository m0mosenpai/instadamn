package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;

/* renamed from: X.Kmt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46798Kmt {
    public static final KTA A00(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im, C38321qM c38321qM) {
        AbstractC25234BEr.A0j(0, context, userSession, c7im, anonymousClass988);
        User A2E = c38321qM.A2E(userSession);
        if (A2E != null) {
            float A0m = c38321qM.A0m();
            ImageUrl A1S = c38321qM.A1S();
            String id = c38321qM.getId();
            if (id != null) {
                EnumC40111tc BRp = c38321qM.BRp();
                String B3P = c38321qM.A0C.B3P();
                C83403nh c83403nh = c160787Im.A0e;
                String A0h = c83403nh.A0h();
                boolean A1X = AbstractC167007dF.A1X(c38321qM.A1y(), C3YU.A04);
                String id2 = A2E.getId();
                String str = c83403nh.A1u;
                C14360o3.A07(str);
                C45948KUz c45948KUz = new C45948KUz(BRp, id, B3P, A0h, id2, str, -1, A1X);
                return new KTA(A1S, AbstractC43592JPx.A0d(context, userSession, anonymousClass988, c160787Im, c83403nh), AbstractC43594JPz.A0Y(userSession, anonymousClass988, c160787Im, c7im, c83403nh), c45948KUz, A0m, c38321qM.A18());
            }
            throw AbstractC166997dE.A0g();
        }
        throw AbstractC166987dD.A12("Cannot get author for given media");
    }
}
