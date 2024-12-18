package X;

import android.view.View;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;
import com.instagram.leadgen.core.ui.LeadGenFormSingleMultipleChoiceQuestionView;

/* renamed from: X.OjV, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnClickListenerC55420OjV implements View.OnClickListener {
    public final /* synthetic */ IgFrameLayout A00;
    public final /* synthetic */ LeadGenFormBaseQuestion A01;
    public final /* synthetic */ LeadGenFormSingleMultipleChoiceQuestionView A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;

    public ViewOnClickListenerC55420OjV(IgFrameLayout igFrameLayout, LeadGenFormBaseQuestion leadGenFormBaseQuestion, LeadGenFormSingleMultipleChoiceQuestionView leadGenFormSingleMultipleChoiceQuestionView, String str, boolean z) {
        this.A04 = z;
        this.A01 = leadGenFormBaseQuestion;
        this.A00 = igFrameLayout;
        this.A02 = leadGenFormSingleMultipleChoiceQuestionView;
        this.A03 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-2070608332);
        if (this.A04 && this.A01.A0I && this.A00.isSelected()) {
            C12500ku c12500ku = new C12500ku(this.A02.A00);
            while (c12500ku.hasNext()) {
                MSW.A0A(c12500ku).setSelected(false);
            }
        } else {
            LeadGenFormSingleMultipleChoiceQuestionView leadGenFormSingleMultipleChoiceQuestionView = this.A02;
            C12500ku c12500ku2 = new C12500ku(leadGenFormSingleMultipleChoiceQuestionView.A00);
            while (c12500ku2.hasNext()) {
                MSW.A0A(c12500ku2).setSelected(false);
            }
            this.A00.setSelected(true);
            leadGenFormSingleMultipleChoiceQuestionView.A0F(this.A01, this.A03);
        }
        C0f9.A0C(26296975, A05);
    }
}
