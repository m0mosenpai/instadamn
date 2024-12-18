package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.9M5, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9M5 {
    public static final HashMap A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        HashMap A1G = AbstractC166987dD.A1G();
        C6AI A00 = C6AH.A00(userSession);
        A1G.put("mem_offline_sync_started", Boolean.valueOf(A00.A08));
        A1G.put("mem_offline_sync_completed", Boolean.valueOf(A00.A07));
        return A1G;
    }
}
