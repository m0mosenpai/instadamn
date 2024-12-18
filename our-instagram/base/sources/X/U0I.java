package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes11.dex */
public final class U0I {
    public List A00;
    public List A01;
    public final UserSession A02;
    public final U0H A03;
    public final C13920nI A04;

    public U0I(UserSession userSession, U0H u0h) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A03 = u0h;
        this.A00 = new ArrayList();
        this.A01 = new ArrayList();
        this.A04 = C13920nI.A00;
    }

    static {
        TimeUnit.HOURS.toMillis(1L);
    }
}
