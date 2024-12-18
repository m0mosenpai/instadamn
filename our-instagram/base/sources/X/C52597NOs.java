package X;

import com.instagram.api.schemas.LeadGenEntryPoint;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.NOs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52597NOs extends AbstractC50993Mg0 {
    public final int A00;
    public final PromoteData A01;
    public final UserSession A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;
    public final P4U A06;

    public C52597NOs(C152406tQ c152406tQ, P4U p4u, PromoteData promoteData) {
        super(c152406tQ, new O3S(p4u));
        int size;
        this.A01 = promoteData;
        this.A06 = p4u;
        UserSession userSession = promoteData.A0y;
        C14360o3.A06(userSession);
        this.A02 = userSession;
        Number number = (Number) c152406tQ.A00("lead_form_custom_question_index");
        if (number != null) {
            size = number.intValue();
        } else {
            size = promoteData.A1t.size();
        }
        this.A00 = size;
        int i = 0;
        this.A05 = AbstractC167007dF.A1Q(size, promoteData.A1t.size());
        this.A03 = AbstractC167007dF.A0h(LeadGenEntryPoint.A06.A00);
        this.A04 = true;
        if (this.A05) {
            List list = promoteData.A1t;
            C14360o3.A06(list);
            MUW muw = (MUW) AbstractC001800i.A0O(list, this.A00);
            if (muw != null) {
                this.A08.Egh(muw.A03);
                List list2 = (List) muw.A00;
                if (list2 != null) {
                    for (Object obj : list2) {
                        int i2 = i + 1;
                        if (i < 0) {
                            AbstractC16960so.A1U();
                            throw C00O.createAndThrow();
                        }
                        C05A[] c05aArr = this.A0A;
                        if (i < c05aArr.length) {
                            c05aArr[i].Egh(obj);
                        }
                        i = i2;
                    }
                }
            }
        }
    }
}
