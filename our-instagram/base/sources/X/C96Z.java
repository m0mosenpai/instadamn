package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.96Z, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C96Z {
    public static C96Z A03;
    public static final C2051096a A04 = new Object();
    public final Context A00;
    public final UserSession A01;
    public final Map A02;

    public C96Z(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
        Map synchronizedMap = Collections.synchronizedMap(new HashMap());
        C14360o3.A07(synchronizedMap);
        this.A02 = synchronizedMap;
    }
}
