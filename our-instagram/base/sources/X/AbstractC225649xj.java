package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import java.util.Collections;

/* renamed from: X.9xj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC225649xj {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        UserSession userSession;
        Integer num;
        boolean A01 = C6DZ.A01(c6fw.A03(0));
        boolean A012 = C6DZ.A01(c6fw.A02());
        Collections.unmodifiableList(c6fw.A00);
        AbstractC12990ll A0B = C6BQ.A0B(c6fq);
        if (!(A0B instanceof UserSession) || (userSession = (UserSession) A0B) == null) {
            return null;
        }
        if (A01) {
            C46552Bt A00 = AbstractC46542Bs.A00(userSession);
            if (A012) {
                num = C05F.A00;
            } else {
                num = C05F.A01;
            }
            InterfaceC19610xo ARD = A00.A04.ARD();
            ARD.E7K("PREFERENCE_CREATOR_DESTINATION_TYPE_STRING", C9H5.A00(num));
            ARD.apply();
        }
        CallerContext A013 = CallerContext.A01("BKBloksActionIgCxpRefreshAllImpl");
        C196058lv A002 = C196068lw.A00(userSession);
        C14360o3.A0A(A013);
        A002.A01(A013, null, "bloks");
        new C196188m9(userSession).A06("bloks", false);
        return null;
    }
}
