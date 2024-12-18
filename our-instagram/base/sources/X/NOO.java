package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.leadgen.core.ui.LeadGenFormSingleMultipleChoiceQuestionView;

/* loaded from: classes9.dex */
public final class NOO extends AbstractC51367MmS {
    public C51654Mrl A00;
    public final CircularImageView A01;
    public final LeadGenFormSingleMultipleChoiceQuestionView A02;

    public NOO(View view, UserSession userSession) {
        super(view, userSession);
        this.A02 = (LeadGenFormSingleMultipleChoiceQuestionView) AbstractC166997dE.A0R(view, R.id.multiple_choice_view);
        this.A01 = AbstractC31176DnK.A0U(view, R.id.profile_image);
    }
}
