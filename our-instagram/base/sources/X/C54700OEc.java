package X;

import com.instagram.common.session.UserSession;
import java.util.HashSet;

/* renamed from: X.OEc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54700OEc {
    public final UserSession A00;
    public final O4Q A01;
    public final C56126Ovm A02;
    public final C4LM A03;
    public final HashSet A04;
    public final InterfaceC06180Ui A05;
    public final InterfaceC15070pN A06;

    public /* synthetic */ C54700OEc(UserSession userSession) {
        C4LM c4lm = C4LM.A02;
        O4Q o4q = new O4Q(userSession);
        C56126Ovm c56126Ovm = (C56126Ovm) userSession.A01(C56126Ovm.class, C57419PeH.A00);
        AbstractC43594JPz.A1P(c4lm, c56126Ovm);
        this.A00 = userSession;
        this.A03 = c4lm;
        this.A01 = o4q;
        this.A02 = c56126Ovm;
        this.A04 = AbstractC166987dD.A1H();
        AnonymousClass057 A0t = MSY.A0t();
        this.A05 = A0t;
        this.A06 = MSX.A0r(A0t);
    }
}
