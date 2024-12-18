package X;

import android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.OTs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54984OTs {
    public static volatile C54984OTs A03;
    public boolean A00;
    public final C1QT A01;
    public final UserSession A02;

    public static final long A00(C54984OTs c54984OTs, String str, String str2) {
        C1QT c1qt = c54984OTs.A01;
        if (str2 == null) {
            str2 = "";
        }
        return c1qt.generateFlowId(R.drawable.ic_signal_cellular_2_5_bar, AnonymousClass001.A0R(str, str2).hashCode());
    }

    public C54984OTs(UserSession userSession) {
        this.A02 = userSession;
        this.A01 = C1QS.A00(userSession);
    }
}
