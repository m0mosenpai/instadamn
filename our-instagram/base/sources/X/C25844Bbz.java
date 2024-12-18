package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Bbz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25844Bbz extends AbstractC52922bZ {
    public final C2GT A00;
    public final C2GT A01;
    public final C2GT A02;
    public final C2GT A03;
    public final C2GT A04;
    public final C2GT A05;
    public final UserSession A06;
    public final C38321qM A07;
    public final C52678NSa A08;
    public final CR5 A09;
    public final C05A A0A;
    public final C05A A0B;
    public final C05A A0C;
    public final C05A A0D;
    public final C05A A0E;
    public final C05A A0F;

    public C25844Bbz(UserSession userSession, C38321qM c38321qM, C52678NSa c52678NSa, CR5 cr5, List list, List list2, List list3) {
        AbstractC167027dH.A0a(1, userSession, list, list2, list3);
        C14360o3.A0B(c52678NSa, 7);
        this.A06 = userSession;
        this.A07 = c38321qM;
        this.A09 = cr5;
        this.A08 = c52678NSa;
        C008002u A1H = AbstractC25225BEi.A1H(list);
        this.A0E = A1H;
        this.A00 = AbstractC25235BEs.A0R(this, A1H);
        C008002u A1H2 = AbstractC25225BEi.A1H(list2);
        this.A0A = A1H2;
        this.A01 = AbstractC25235BEs.A0R(this, A1H2);
        C008002u A1H3 = AbstractC25225BEi.A1H(list3);
        this.A0F = A1H3;
        this.A02 = AbstractC25235BEs.A0R(this, A1H3);
        C008002u A1A = AbstractC25235BEs.A1A(true);
        this.A0D = A1A;
        this.A05 = AbstractC25235BEs.A0R(this, A1A);
        Boolean A0a = AbstractC166997dE.A0a();
        C008002u A1H4 = AbstractC25225BEi.A1H(A0a);
        this.A0C = A1H4;
        this.A04 = AbstractC25235BEs.A0R(this, A1H4);
        C008002u A1H5 = AbstractC25225BEi.A1H(A0a);
        this.A0B = A1H5;
        this.A03 = AbstractC25235BEs.A0R(this, A1H5);
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : list2) {
            if (obj instanceof AbstractC26915BuI) {
                A1E.add(obj);
            }
        }
        for (Object obj2 : A1E) {
            AbstractC166987dD.A1Z(new PZ0(obj2, this, null, 5), AbstractC141776au.A00(this));
        }
    }
}
