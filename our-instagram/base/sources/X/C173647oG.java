package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* renamed from: X.7oG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C173647oG {
    public final void A00(Activity activity, UserSession userSession, String str, InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        C14360o3.A0B(str, 2);
        C189448aO c189448aO = new C189448aO(userSession);
        c189448aO.A0a = false;
        C189478aR A00 = c189448aO.A00();
        N4Q n4q = new N4Q();
        n4q.setArguments(AbstractC61636Rr0.A00(new C09530e4(MSV.A00(1592), str), new C09530e4(MSV.A00(1300), Boolean.valueOf(z))));
        n4q.A00 = interfaceC16660sJ;
        A00.A02(activity, n4q);
    }
}
