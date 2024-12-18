package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.HLw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39168HLw extends AbstractC63592ug {
    public final Context A00;
    public final C145796hc A01;
    public final C146306iT A02;
    public final C1BX A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39168HLw(Context context, C1BX c1bx, UserSession userSession, InterfaceC60442pS interfaceC60442pS, InterfaceC63482uV interfaceC63482uV, C145796hc c145796hc, C146306iT c146306iT) {
        super(c1bx, userSession, new C42368IpV(userSession, c146306iT.A04), interfaceC60442pS, interfaceC63482uV, 944, 0L, false);
        C14360o3.A0B(interfaceC63482uV, 7);
        this.A00 = context;
        this.A03 = c1bx;
        this.A02 = c146306iT;
        this.A01 = c145796hc;
    }

    @Override // X.AbstractC63592ug
    public final /* bridge */ /* synthetic */ C82713mZ A01(Object obj, Object obj2) {
        C41181vS c41181vS = (C41181vS) obj;
        C149716oO c149716oO = (C149716oO) obj2;
        C14360o3.A0B(c41181vS, 0);
        if (c149716oO != null) {
            InterfaceC60442pS interfaceC60442pS = this.A07;
            C146306iT c146306iT = this.A02;
            C3G2 c3g2 = c146306iT.A03;
            C41551w4 c41551w4 = c149716oO.A00;
            C138356Or A00 = AbstractC138346Oq.A00(interfaceC60442pS, c41551w4.A0H, c3g2);
            UserSession userSession = this.A04;
            C82713mZ A02 = AbstractC37955Gmx.A02(userSession, A00, c41181vS, "impression");
            A02.A02();
            A02.A1w = AbstractC166997dE.A0b();
            C38321qM c38321qM = c41181vS.A0b;
            if (c38321qM != null) {
                A02.A8J = AbstractC41071vF.A0R(userSession, c38321qM);
            }
            AbstractC37303Gc4.A1D(userSession, A02);
            C3R6.A08(A02, c41181vS, c149716oO, c146306iT);
            C145796hc c145796hc = this.A01;
            String str = c41181vS.A0k;
            C14360o3.A07(str);
            C6YY c6yy = (C6YY) c145796hc.A05.get(str);
            if (c6yy != null) {
                C3R6.A00.A0B(this.A00, A02, c41181vS, c6yy, c149716oO, c146306iT);
            }
            C141596ac c141596ac = c149716oO.A02;
            A02.A7b = AbstractC139736Uc.A00(userSession, c41181vS, c41551w4, c3g2, c141596ac);
            C32U.A0A(userSession, A02, c41181vS.A09());
            A02.A1B = Boolean.valueOf(c41181vS.A11());
            AbstractC37302Gc3.A1R(A02);
            A02.A1Y = Boolean.valueOf(c41181vS.A1K());
            A02.A1e = Boolean.valueOf(c141596ac.A0l);
            A02.A2b = Double.valueOf(c141596ac.A03);
            A02.A2c = Double.valueOf((c141596ac.A0A / 1000.0d) - ((c141596ac.A0B * r1) / 1000.0d));
            A02.A03();
            return A02;
        }
        throw AbstractC166987dD.A15("Unexpected null mediaState");
    }

    @Override // X.AbstractC63592ug
    public final String A02() {
        return null;
    }

    @Override // X.AbstractC63592ug
    public final String A04() {
        return "ad_story";
    }
}
