package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.Ld7, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48511Ld7 implements InterfaceC13000lm {
    public final UserSession A00;
    public final LI9 A01;
    public final Map A02;
    public final C19L A03;

    public final Object A00(Context context, Integer num, String str, String str2, InterfaceC23621Ds interfaceC23621Ds) {
        LI9 li9 = this.A01;
        C24891Jo A0s = JQ0.A0s(interfaceC23621Ds);
        li9.A01.A02(((C56138Ovy) li9.A05.getValue()).A00(context, LI9.A06), new C49720Lxp(num, li9, A0s, str, str2, 2));
        A0s.CPA(new DRQ(li9, 9));
        return A0s.A0E();
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        LI9 li9 = this.A01;
        li9.A01.A01();
        ((C56138Ovy) li9.A05.getValue()).A01();
        AnonymousClass194.A05(null, this.A03);
    }

    public C48511Ld7(C12N c12n, UserSession userSession, LI9 li9) {
        AbstractC167017dG.A1Q(userSession, c12n);
        this.A00 = userSession;
        this.A01 = li9;
        this.A03 = AnonymousClass194.A02(((C12M) c12n).A04);
        this.A02 = AbstractC166987dD.A1I();
    }
}
