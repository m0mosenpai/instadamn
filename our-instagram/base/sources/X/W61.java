package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.model.mapquery.MapQuery;
import java.util.List;

/* loaded from: classes11.dex */
public final class W61 {
    public final C65739TtE A00;
    public final C65739TtE A01;
    public final C65739TtE A02;
    public final UserSession A03;
    public static final XED A06 = new C37406Gdm(2);
    public static final XDR A09 = new C65904TwA(5);
    public static final XED A04 = new C37406Gdm(1);
    public static final XDR A07 = new C65904TwA(3);
    public static final XED A05 = new MZ6(2);
    public static final XDR A08 = new C65904TwA(4);

    public final synchronized List A00() {
        C01L A1I;
        A1I = C0eM.A1I();
        A1I.addAll(this.A02.A02());
        A1I.addAll(this.A00.A02());
        A1I.addAll(this.A01.A02());
        return C0eM.A1J(A1I);
    }

    public final synchronized void A01(Hashtag hashtag) {
        C14360o3.A0B(hashtag, 0);
        this.A00.A04(hashtag);
    }

    public final synchronized void A02(MapQuery mapQuery) {
        C14360o3.A0B(mapQuery, 0);
        this.A01.A04(mapQuery);
    }

    public final synchronized void A03(C69794Vvd c69794Vvd) {
        C14360o3.A0B(c69794Vvd, 0);
        this.A02.A04(c69794Vvd);
    }

    public W61(UserSession userSession) {
        this.A03 = userSession;
        this.A02 = new C65739TtE(userSession, A06, A09, 50);
        this.A00 = new C65739TtE(userSession, A04, A07, 50);
        this.A01 = new C65739TtE(userSession, A05, A08, 50);
    }
}
