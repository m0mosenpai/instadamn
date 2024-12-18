package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class OBE {
    public final Context A00;
    public final C66362zD A01;
    public final UserSession A02;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.2zJ, java.lang.Object] */
    public OBE(Context context, UserSession userSession, O66 o66) {
        C14360o3.A0B(userSession, 2);
        this.A00 = context;
        this.A02 = userSession;
        C66392zG A00 = C66362zD.A00(context);
        A00.A01(new C52343NEh(userSession, o66));
        this.A01 = AbstractC31173DnH.A0R(A00, new Object());
    }
}
