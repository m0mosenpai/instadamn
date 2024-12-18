package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.8MY, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8MY {
    public final Context A01;
    public final UserSession A02;
    public final C8MZ A03;
    public final HashMap A04 = new HashMap();
    public ArrayList A00 = new ArrayList();

    public C8MY(Context context, UserSession userSession) {
        this.A01 = context;
        this.A02 = userSession;
        this.A03 = new C8MZ(context, userSession);
    }
}
