package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.model.direct.DirectThreadKey;

/* loaded from: classes8.dex */
public final class L5W {
    public C7QA A00;
    public final Activity A01;
    public final C49082Ln8 A02;
    public final C36414G4p A03;
    public final UserSession A04;
    public final Capabilities A05;
    public final C45518KDj A06;
    public final C49042LmU A07;
    public final C49084LnA A08;
    public final C7Q6 A09;
    public final C7Q8 A0A;
    public final InterfaceC164877Za A0B;
    public final InterfaceC165017Zq A0C;
    public final InterfaceC165077Zw A0D;
    public final InterfaceC163937Vh A0E;
    public final LnQ A0F;
    public final C7TT A0G;
    public final DirectThreadKey A0H;
    public final InterfaceC09390do A0I;
    public final C45518KDj A0J;

    public L5W(Activity activity, UserSession userSession, Capabilities capabilities, C45518KDj c45518KDj, C45518KDj c45518KDj2, InterfaceC164877Za interfaceC164877Za, InterfaceC165017Zq interfaceC165017Zq, InterfaceC165077Zw interfaceC165077Zw, InterfaceC163937Vh interfaceC163937Vh, LnQ lnQ, C7TT c7tt, DirectThreadKey directThreadKey) {
        C14360o3.A0B(userSession, 3);
        AbstractC167007dF.A1I(interfaceC165017Zq, 7, interfaceC164877Za);
        this.A0J = c45518KDj;
        this.A01 = activity;
        this.A04 = userSession;
        this.A0H = directThreadKey;
        this.A0D = interfaceC165077Zw;
        this.A0E = interfaceC163937Vh;
        this.A0C = interfaceC165017Zq;
        this.A0B = interfaceC164877Za;
        this.A06 = c45518KDj2;
        this.A0F = lnQ;
        this.A0G = c7tt;
        this.A05 = capabilities;
        this.A09 = new C49014Lm2(this, 0);
        this.A0A = new C49030LmI(this);
        this.A00 = new C49033LmL(activity, userSession, this, interfaceC163937Vh, directThreadKey);
        this.A0I = AbstractC09440dt.A01(new C50153MDg(this, 20));
        this.A02 = new C49082Ln8(1);
        this.A03 = new C36414G4p(this, 1);
        this.A07 = new C49042LmU(this);
        this.A08 = new C49084LnA();
    }
}
