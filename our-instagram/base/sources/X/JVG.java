package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes8.dex */
public abstract class JVG {
    public static final JVH A00(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im) {
        CharSequence charSequence;
        C14360o3.A0B(context, 0);
        AbstractC167027dH.A0a(1, c160787Im, userSession, c7im, anonymousClass988);
        C83403nh c83403nh = c160787Im.A0e;
        Object obj = c83403nh.A1T;
        CharSequence charSequence2 = null;
        if (obj instanceof C7QP) {
            C7QP c7qp = (C7QP) obj;
            String str = c7qp.A06;
            String str2 = c7qp.A05;
            if (str != null && str2 != null) {
                charSequence2 = JQ0.A0B(userSession, str);
                charSequence = JQ0.A0B(userSession, str2);
            } else {
                throw AbstractC166987dD.A14("A title and message for placeholder should be provided");
            }
        } else if (obj instanceof C7QR) {
            charSequence = AbstractC162687Qf.A0C(context, userSession, c160787Im);
            if (charSequence == null) {
                throw AbstractC166997dE.A0g();
            }
        } else if (C9C9.A00(obj, 6)) {
            C9C9 c9c9 = (C9C9) obj;
            charSequence2 = c9c9.A01;
            charSequence = c9c9.A00;
        } else if (obj instanceof List) {
            Object A0J = AbstractC001800i.A0J((List) obj);
            if (A0J != null && (A0J instanceof C910143t)) {
                charSequence = ((C910143t) A0J).A0v;
            } else {
                charSequence = c83403nh.A1V;
            }
        } else {
            throw AbstractC166987dD.A1D("Can't adapt content to ExpiredPlaceholderContentViewModel");
        }
        int i = c7im.A00;
        C2EY c2ey = C2EY.A0p;
        return new JVH(C7QM.A00(context, userSession, anonymousClass988, c160787Im, c2ey), AbstractC43594JPz.A0Z(userSession, anonymousClass988, c160787Im, c7im, c2ey), charSequence2, charSequence, i);
    }
}
