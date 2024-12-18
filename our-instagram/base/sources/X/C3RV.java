package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.List;

/* renamed from: X.3RV, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3RV {
    public static final C3SC A00(Context context, C3RT c3rt, UserSession userSession) {
        C14360o3.A0B(c3rt, 0);
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(context, 3);
        C17050sx A01 = AbstractC09440dt.A01(new C206979Ec(userSession, 4));
        C17050sx A012 = AbstractC09440dt.A01(new C9FP(4, context, userSession, c3rt));
        C3RX A00 = C3RW.A00(userSession);
        InterfaceC73523Rd interfaceC73523Rd = (InterfaceC73523Rd) A01.getValue();
        List singletonList = Collections.singletonList(A012.getValue());
        C14360o3.A07(singletonList);
        return A00.A00(interfaceC73523Rd, c3rt, singletonList);
    }
}
