package X;

import com.instagram.common.session.UserSession;
import com.instagram.leadgen.organic.model.LeadFormCustomQuestion;
import com.instagram.leadgen.organic.model.LeadGenFormData;

/* renamed from: X.NOr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52596NOr extends AbstractC50993Mg0 {
    public final int A00;
    public final UserSession A01;
    public final LeadGenFormData A02;
    public final String A03;
    public final boolean A04;
    public final P4X A05;

    public C52596NOr(C152406tQ c152406tQ, UserSession userSession, P4X p4x) {
        super(c152406tQ, new O3S(p4x));
        int size;
        LeadFormCustomQuestion leadFormCustomQuestion;
        this.A01 = userSession;
        this.A05 = p4x;
        Object A00 = c152406tQ.A00("args_form_data");
        if (A00 != null) {
            LeadGenFormData leadGenFormData = (LeadGenFormData) A00;
            this.A02 = leadGenFormData;
            Number number = (Number) c152406tQ.A00("args_custom_question_index");
            if (number != null) {
                size = number.intValue();
            } else {
                size = leadGenFormData.A06.size();
            }
            this.A00 = size;
            int i = 0;
            this.A04 = AbstractC167007dF.A1Q(size, leadGenFormData.A06.size());
            this.A03 = MSZ.A0t(leadGenFormData.A01);
            if (this.A04 && (leadFormCustomQuestion = (LeadFormCustomQuestion) AbstractC001800i.A0O(leadGenFormData.A06, this.A00)) != null) {
                this.A08.Egh(leadFormCustomQuestion.A01);
                for (Object obj : leadFormCustomQuestion.A02) {
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
                return;
            }
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
