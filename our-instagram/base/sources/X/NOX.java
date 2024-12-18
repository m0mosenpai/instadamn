package X;

import com.instagram.common.session.UserSession;
import com.instagram.leadads.repository.LeadFormRepository;
import java.util.List;

/* loaded from: classes9.dex */
public final class NOX extends AbstractC51040Mgq {
    public boolean A00;
    public boolean A01;
    public OLJ A02;
    public final C2GT A03;
    public final UserSession A04;
    public final LeadFormRepository A05;
    public final OAT A06;
    public final String A07;
    public final String A08;
    public final List A09;
    public final C05A A0A;
    public final C05A A0B;
    public final C05A A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0103, code lost:
    
        if (r8 != null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x010f, code lost:
    
        if (r1 == 0) goto L90;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public NOX(X.C152406tQ r12, com.instagram.common.session.UserSession r13, X.P4V r14, com.instagram.leadads.repository.LeadFormRepository r15) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NOX.<init>(X.6tQ, com.instagram.common.session.UserSession, X.P4V, com.instagram.leadads.repository.LeadFormRepository):void");
    }

    public static /* synthetic */ OUJ A03(NOX nox) {
        String str;
        OUJ ouj;
        OLJ olj = nox.A02;
        if (olj == null) {
            str = "cacheData";
        } else {
            C69475Vny c69475Vny = olj.A00;
            OUJ ouj2 = c69475Vny.A06;
            if (ouj2 != null) {
                String str2 = nox.A08;
                if (str2 != null && (ouj = (OUJ) c69475Vny.A0C.get(str2)) != null) {
                    return ouj;
                }
                return ouj2;
            }
            str = "leadAdsThankYouPage";
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public NOX() {
        C008002u A0z = AbstractC25227BEk.A0z();
        this.A0C = A0z;
        this.A03 = AbstractC31172DnG.A0E(A0z);
    }
}
