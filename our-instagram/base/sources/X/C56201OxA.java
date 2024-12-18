package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;

/* renamed from: X.OxA, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56201OxA implements InterfaceC43071ya {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C41551w4 A01;
    public final /* synthetic */ C3G4 A02;
    public final /* synthetic */ C145836hg A03;
    public final /* synthetic */ C141596ac A04;

    public C56201OxA(UserSession userSession, C41551w4 c41551w4, C3G4 c3g4, C145836hg c145836hg, C141596ac c141596ac) {
        this.A00 = userSession;
        this.A02 = c3g4;
        this.A04 = c141596ac;
        this.A01 = c41551w4;
        this.A03 = c145836hg;
    }

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        String str;
        UserSession userSession = this.A00;
        C41661wG A00 = C41661wG.A00(userSession);
        Reel reel = this.A02.A03;
        C41181vS c41181vS = (C41181vS) c59062n7.A03;
        A00.A04(reel, Long.valueOf(c41181vS.A03()));
        if (c41181vS.A0e != EnumC41231vY.A0Q) {
            C141596ac c141596ac = this.A04;
            if (!c141596ac.A0h) {
                C41551w4 c41551w4 = this.A01;
                C145836hg c145836hg = this.A03;
                User user = c41181vS.A0i;
                String str2 = null;
                if (user != null) {
                    str = user.getId();
                } else {
                    str = null;
                }
                C38321qM c38321qM = c41181vS.A0b;
                if (c38321qM != null) {
                    str2 = c38321qM.getId();
                }
                AbstractC54125NwN.A00(userSession, c145836hg, c41551w4, str, str2);
                c141596ac.A0h = true;
            }
        }
    }
}
