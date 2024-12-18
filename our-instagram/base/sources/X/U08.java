package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes11.dex */
public final class U08 {
    public static final XED A01 = new MZ6(0);
    public static final XDR A02 = new C65904TwA(0);
    public final C65739TtE A00;

    public final synchronized List A00() {
        return this.A00.A02();
    }

    public U08(UserSession userSession) {
        this.A00 = new C65739TtE(userSession, A01, A02, 15);
    }
}
