package X;

import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class L5E {
    public boolean A00;
    public final UserSession A01;
    public final AbstractRunnableC14200nk A02;
    public final C14270nr A03;
    public final C47581Kzr A04;
    public final C2DS A05;
    public final L8o A06;
    public final C132515ya A07;
    public final C47976LIn A08;
    public final List A09;
    public final List A0A;

    public L5E(UserSession userSession, C2DS c2ds, L8o l8o, C132515ya c132515ya) {
        AbstractC167027dH.A0a(1, userSession, l8o, c132515ya, c2ds);
        this.A01 = userSession;
        this.A06 = l8o;
        this.A07 = c132515ya;
        this.A05 = c2ds;
        this.A04 = new C47581Kzr(userSession);
        this.A08 = new C47976LIn(userSession);
        C14270nr A00 = C14270nr.A00();
        C14360o3.A07(A00);
        this.A03 = A00;
        this.A0A = AbstractC166987dD.A1E();
        List synchronizedList = Collections.synchronizedList(AbstractC166987dD.A1E());
        C14360o3.A07(synchronizedList);
        this.A09 = synchronizedList;
        this.A02 = new KLZ(this);
    }
}
