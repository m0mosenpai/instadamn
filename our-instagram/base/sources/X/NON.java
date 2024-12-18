package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;

/* loaded from: classes9.dex */
public final class NON extends AbstractC51367MmS {
    public final IgTextView A00;
    public final IgTextView A01;

    public NON(View view, UserSession userSession) {
        super(view, userSession);
        this.A01 = AbstractC31175DnJ.A0L(view, R.id.disqualified_lead_title);
        this.A00 = AbstractC31175DnJ.A0L(view, R.id.disqualified_lead_subtitle);
    }
}
