package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;
import com.instagram.leadgen.core.ui.LeadGenFormDateTimeQuestionView;

/* loaded from: classes9.dex */
public final class NOR extends AbstractC51367MmS {
    public final CircularImageView A00;
    public final LeadGenFormDateTimeQuestionView A01;

    public static final void A01(C51654Mrl c51654Mrl, NOR nor, String str) {
        boolean z = false;
        LeadGenFormBaseQuestion leadGenFormBaseQuestion = (LeadGenFormBaseQuestion) c51654Mrl.A09.get(0);
        if (str == null) {
            str = leadGenFormBaseQuestion.A00;
        }
        IgdsBottomButtonLayout igdsBottomButtonLayout = nor.A09;
        if (igdsBottomButtonLayout != null) {
            C14360o3.A0B(leadGenFormBaseQuestion, 0);
            if (str == null) {
                str = leadGenFormBaseQuestion.A00;
            }
            if (!AbstractC001900j.A0T(str) || (c51654Mrl.A0B && leadGenFormBaseQuestion.A0I)) {
                z = true;
            }
            igdsBottomButtonLayout.setPrimaryButtonEnabled(z);
        }
    }

    public NOR(View view, UserSession userSession) {
        super(view, userSession);
        this.A01 = (LeadGenFormDateTimeQuestionView) AbstractC166997dE.A0R(view, R.id.date_time_view);
        this.A00 = AbstractC31176DnK.A0U(view, R.id.profile_image);
    }
}
