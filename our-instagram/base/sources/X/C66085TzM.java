package X;

import com.instagram.autoplay.models.AutoplayLayout;
import com.instagram.common.session.UserSession;

/* renamed from: X.TzM, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66085TzM {
    public C38142Gq9 A00;
    public C66115Tzt A01;
    public C65868TvV A02;
    public final InterfaceC09390do A03 = AbstractC09440dt.A01(C66104Tzf.A00);

    /* JADX WARN: Type inference failed for: r12v1, types: [X.Van, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.XCG, java.lang.Object] */
    public final C65868TvV A00(UserSession userSession) {
        C65868TvV c65868TvV = this.A02;
        if (c65868TvV == null) {
            AutoplayLayout autoplayLayout = AutoplayLayout.EXPLORE_DIAGONAL;
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36320743125951339L) && C18U.A06(c06090Tz, userSession, 36320743126016876L)) {
                C66105Tzg c66105Tzg = (C66105Tzg) this.A03.getValue();
                boolean A1U = AbstractC167007dF.A1U(c66105Tzg);
                C65865TvS c65865TvS = new C65865TvS(autoplayLayout, userSession);
                C65863TvQ c65863TvQ = new C65863TvQ(new Object(), new C65866TvT(c65865TvS), new C65864TvR(userSession), autoplayLayout, userSession);
                C65873Tvc c65873Tvc = new C65873Tvc(c65863TvQ, C3Q3.A00(userSession));
                C13920nI c13920nI = C13920nI.A00;
                C65870TvX c65870TvX = new C65870TvX(c65863TvQ, c66105Tzg, c13920nI);
                C65871TvY c65871TvY = new C65871TvY(c66105Tzg, c65870TvX, c13920nI);
                c65870TvX.A00 = c65871TvY;
                ?? obj = new Object();
                obj.A00 = A1U;
                C66106Tzh c66106Tzh = new C66106Tzh(c65863TvQ, c65870TvX, c13920nI);
                C66107Tzi c66107Tzi = new C66107Tzi(c65863TvQ, c65865TvS, c13920nI);
                C66110Tzo c66110Tzo = new C66110Tzo(c65863TvQ, c65873Tvc, c66106Tzh, c66107Tzi, c65870TvX, c65871TvY);
                C66111Tzp c66111Tzp = new C66111Tzp(c65863TvQ, c66110Tzo, c65873Tvc, c66106Tzh, c66107Tzi);
                C66112Tzq c66112Tzq = new C66112Tzq(c66105Tzg, c66110Tzo, c66107Tzi, c65870TvX, c65871TvY);
                new C66113Tzr(c66107Tzi, c65865TvS, userSession);
                C65868TvV c65868TvV2 = new C65868TvV(c65863TvQ, c66110Tzo, c66111Tzp, c66112Tzq, obj, c65870TvX, c65871TvY);
                this.A02 = c65868TvV2;
                return c65868TvV2;
            }
            return null;
        }
        return c65868TvV;
    }
}
