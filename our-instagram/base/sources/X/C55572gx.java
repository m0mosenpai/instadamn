package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2gx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C55572gx implements InterfaceC13000lm {
    public static final long A02 = TimeUnit.DAYS.toMillis(1);
    public C55662h6 A00;
    public final UserSession A01;

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A01.A03(C55572gx.class);
    }

    public C55572gx(UserSession userSession) {
        this.A01 = userSession;
    }
}
