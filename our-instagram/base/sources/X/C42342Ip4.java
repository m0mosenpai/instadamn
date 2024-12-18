package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Ip4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42342Ip4 implements InterfaceC13000lm {
    public String A00;
    public List A01;
    public final UserSession A02;
    public final C41627IbI A03;
    public final String A04;
    public final C19L A05;

    public C42342Ip4(C12N c12n, UserSession userSession, String str, String str2, List list) {
        C14360o3.A0B(c12n, 5);
        this.A02 = userSession;
        this.A04 = str;
        this.A01 = list;
        this.A00 = str2;
        this.A05 = AnonymousClass194.A02(c12n.CPG(594001069, 3));
        this.A03 = new C41627IbI(userSession);
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        AnonymousClass194.A05(null, this.A05);
    }
}
