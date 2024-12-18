package X;

import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;
import com.instagram.leadgen.core.ui.LeadGenFormSliderQuestionView;

/* renamed from: X.PHx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56780PHx implements XDS {
    public final /* synthetic */ int A00;
    public final /* synthetic */ LeadGenFormBaseQuestion A01;
    public final /* synthetic */ LeadGenFormSliderQuestionView A02;

    @Override // X.XDS
    public final /* synthetic */ void DC5() {
    }

    @Override // X.XDS
    public final /* synthetic */ void DCA() {
    }

    public C56780PHx(LeadGenFormBaseQuestion leadGenFormBaseQuestion, LeadGenFormSliderQuestionView leadGenFormSliderQuestionView, int i) {
        this.A00 = i;
        this.A01 = leadGenFormBaseQuestion;
        this.A02 = leadGenFormSliderQuestionView;
    }

    @Override // X.XDS
    public final void Dbr(int i) {
        int i2 = this.A00;
        LeadGenFormBaseQuestion leadGenFormBaseQuestion = this.A01;
        this.A02.A0F(leadGenFormBaseQuestion, String.valueOf(i2 + (i * leadGenFormBaseQuestion.A02)));
    }
}
