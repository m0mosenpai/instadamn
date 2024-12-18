package X;

import android.text.TextWatcher;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.leadgen.core.ui.LeadGenFormShortAnswerQuestionView;

/* loaded from: classes9.dex */
public final class NOQ extends AbstractC51367MmS {
    public C51654Mrl A00;
    public boolean A01;
    public final CircularImageView A02;
    public final LeadGenFormShortAnswerQuestionView A03;

    public NOQ(View view, UserSession userSession) {
        super(view, userSession);
        this.A03 = (LeadGenFormShortAnswerQuestionView) AbstractC166997dE.A0R(view, R.id.short_answer_view);
        this.A02 = AbstractC31176DnK.A0U(view, R.id.profile_image);
    }

    @Override // X.AbstractC51367MmS
    public final void A02() {
        super.A02();
        LeadGenFormShortAnswerQuestionView leadGenFormShortAnswerQuestionView = this.A03;
        TextWatcher textWatcher = leadGenFormShortAnswerQuestionView.A00;
        if (textWatcher != null) {
            AbstractC31173DnH.A1D(textWatcher, leadGenFormShortAnswerQuestionView.A01);
            leadGenFormShortAnswerQuestionView.A00 = null;
        }
    }
}
