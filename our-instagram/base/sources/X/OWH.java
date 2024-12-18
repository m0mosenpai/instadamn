package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes9.dex */
public final class OWH {
    public static final OWH A00 = new Object();

    public final void A01(Context context, UserSession userSession, String str, String str2, String str3, String str4, List list, List list2, int i, int i2, long j) {
        C14360o3.A0B(userSession, 1);
        AbstractC55065OaL abstractC55065OaL = (AbstractC55065OaL) userSession.A01(C51452Mny.class, new C50171MDy(7, context, userSession));
        C0K8.A0D("IpcQplConsts", AnonymousClass001.A0R("Unhandled action: ", "CallState"));
        Integer num = C05F.A0X;
        C14360o3.A0B(num, 2);
        abstractC55065OaL.A01(new C52046N0x(AbstractC55094Ob5.A02(num, "CallState", true), str, str2, str3, str4, list, list2, i, i2, j));
    }

    public final void A00(Context context, UserSession userSession) {
        boolean A1a = AbstractC167017dG.A1a(context, userSession);
        AbstractC55065OaL abstractC55065OaL = (AbstractC55065OaL) userSession.A01(C51452Mny.class, new C50171MDy(7, context, userSession));
        C0K8.A0D("IpcQplConsts", AnonymousClass001.A0R("Unhandled action: ", "ContactChangeEvent"));
        Integer num = C05F.A0X;
        C14360o3.A0B(num, 2);
        abstractC55065OaL.A01(new C52045N0w(AbstractC55094Ob5.A02(num, "ContactChangeEvent", A1a)));
    }
}
