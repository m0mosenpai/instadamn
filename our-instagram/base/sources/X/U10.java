package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;

/* loaded from: classes11.dex */
public final class U10 {
    public static final XED A01 = new C37406Gdm(0);
    public static final XDR A02 = new C65904TwA(1);
    public final C65739TtE A00;

    public final synchronized void A00(Hashtag hashtag) {
        C14360o3.A0B(hashtag, 0);
        this.A00.A04(hashtag);
    }

    public U10(UserSession userSession) {
        this.A00 = new C65739TtE(userSession, A01, A02, 100);
    }
}
