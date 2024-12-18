package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgCheckBox;
import com.instagram.direct.ui.polls.PollMessageVotersView;

/* renamed from: X.JqC, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44667JqC extends C3OO {
    public final IgCheckBox A00;
    public final PollMessageVotersView A01;

    public C44667JqC(View view) {
        super(view);
        this.A00 = (IgCheckBox) AbstractC166997dE.A0R(view, R.id.poll_message_option_check_button);
        this.A01 = (PollMessageVotersView) AbstractC166997dE.A0R(view, R.id.option_voters);
    }
}
