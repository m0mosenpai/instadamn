package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.9ka, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C218029ka extends ACt {
    public int A00;
    public List A01;
    public boolean A02;
    public final C88Y A03;
    public final Context A04;
    public final UserSession A05;

    public static final void A00(C5GJ c5gj, C218029ka c218029ka) {
        C221179pf c221179pf = new C221179pf(c218029ka.A04, c218029ka.A05, (AlD) c218029ka.A01.get(c218029ka.A00));
        c221179pf.A00 = !c218029ka.A02;
        c218029ka.A02 = true;
        c218029ka.A03.A0A(c221179pf, c5gj, C148276lx.A1J);
    }

    public C218029ka(Context context, UserSession userSession, C88Y c88y) {
        AbstractC167017dG.A1Q(c88y, userSession);
        this.A03 = c88y;
        this.A04 = context;
        this.A05 = userSession;
        this.A01 = C16930sl.A00;
    }
}
