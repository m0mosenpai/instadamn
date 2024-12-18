package X;

import android.content.Context;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteState;
import com.instagram.business.promote.model.SpecialRequirementCategory;
import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public final class UFN extends AbstractC52922bZ {
    public final PromoteData A00;
    public final PromoteState A01;
    public final UserSession A02;
    public final C05A A03;
    public final C0UO A04;

    public UFN(Context context, PromoteData promoteData, PromoteState promoteState, UserSession userSession) {
        AbstractC167027dH.A0a(1, context, userSession, promoteData, promoteState);
        this.A02 = userSession;
        this.A00 = promoteData;
        this.A01 = promoteState;
        C008002u A00 = C10E.A00(new C38688GzT(A00(context, SpecialRequirementCategory.A08, this), A00(context, SpecialRequirementCategory.A06, this), A00(context, SpecialRequirementCategory.A05, this), A00(context, SpecialRequirementCategory.A04, this)));
        this.A03 = A00;
        this.A04 = A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r9.A00.A2r != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if (r0 == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C50525MSe A00(android.content.Context r7, com.instagram.business.promote.model.SpecialRequirementCategory r8, X.UFN r9) {
        /*
            com.instagram.business.promote.model.SpecialRequirementCategory r2 = com.instagram.business.promote.model.SpecialRequirementCategory.A08
            r6 = 0
            if (r8 == r2) goto Lc
            com.instagram.business.promote.model.PromoteData r0 = r9.A00
            boolean r0 = r0.A2r
            r3 = 0
            if (r0 == 0) goto Ld
        Lc:
            r3 = 1
        Ld:
            com.instagram.business.promote.model.PromoteData r1 = r9.A00
            java.util.List r0 = r1.A21
            boolean r5 = r0.contains(r8)
            if (r8 == r2) goto L1e
            boolean r0 = X.WFR.A03(r7, r1)
            r7 = 1
            if (r0 != 0) goto L1f
        L1e:
            r7 = 0
        L1f:
            r4 = 2
            X.MSe r2 = new X.MSe
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UFN.A00(android.content.Context, com.instagram.business.promote.model.SpecialRequirementCategory, X.UFN):X.MSe");
    }
}
