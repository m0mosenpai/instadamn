package X;

import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public final class FQR {
    public Integer A00;
    public final UserSession A01;
    public final FG4 A02;
    public final C1P1 A03;
    public final C1GL A04;
    public final String A05;
    public final List A06;

    public FQR(UserSession userSession, C1GL c1gl, FG4 fg4, String str) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A04 = c1gl;
        this.A02 = fg4;
        this.A05 = str;
        this.A06 = AbstractC166987dD.A1J("reshared_content");
        this.A03 = EV0.A00(this, 15);
    }

    public final void A00(String str) {
        C14360o3.A0B(str, 0);
        Map A0n = AbstractC167007dF.A0n("reshared_content", str);
        this.A00 = C05F.A01;
        C1GL c1gl = this.A04;
        C1ON A00 = FUe.A00(this.A01, this.A05, this.A06, A0n);
        A00.A00 = this.A03;
        c1gl.schedule(A00);
    }
}
