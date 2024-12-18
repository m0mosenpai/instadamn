package X;

import com.instagram.api.schemas.OrganicCTAType;
import com.instagram.common.session.UserSession;

/* renamed from: X.Gfv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37539Gfv extends AbstractC64162vb {
    public final C689238d A00;

    private final void A00(C120985dq c120985dq) {
        OrganicCTAType Atr;
        String str;
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            String A00 = AbstractC54949ORz.A00(c38321qM.BRp().A00);
            JLT BZV = c38321qM.A0C.BZV();
            if (BZV != null && (Atr = BZV.Atr()) != null && (str = Atr.A00) != null) {
                this.A00.A00(A00, str, "reels");
            }
        }
    }

    @Override // X.AbstractC64162vb
    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        C120985dq c120985dq = (C120985dq) obj;
        AbstractC167017dG.A1N(c120985dq, obj2);
        A00(c120985dq);
    }

    @Override // X.AbstractC64162vb
    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
        C120985dq c120985dq = (C120985dq) obj;
        AbstractC167017dG.A1N(c120985dq, obj2);
        A00(c120985dq);
    }

    public C37539Gfv(UserSession userSession, String str) {
        super(AbstractC37302Gc3.A0J(userSession));
        this.A00 = new C689238d(userSession, str);
    }
}
