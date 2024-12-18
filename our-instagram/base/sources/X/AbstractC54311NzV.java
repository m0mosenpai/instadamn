package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.NzV, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54311NzV {
    public static final N5T A00(EnumC50631MWs enumC50631MWs, UserSession userSession, boolean z) {
        C14360o3.A0B(userSession, 0);
        Bundle A05 = AbstractC31178DnM.A05(userSession);
        A05.putBoolean("args_is_from_profile", z);
        if (enumC50631MWs != null) {
            A05.putSerializable("args_camera_surface_type", enumC50631MWs);
        }
        N5T n5t = new N5T();
        n5t.setArguments(A05);
        return n5t;
    }
}
