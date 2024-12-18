package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgCheckBox;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.direct.ui.polls.PollMessageOptionView;

/* renamed from: X.JqY, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44689JqY extends C3OO {
    public final IgCheckBox A00;
    public final IgSimpleImageView A01;
    public final PollMessageOptionView A02;

    public C44689JqY(View view) {
        super(view);
        IgSimpleImageView A0T = AbstractC31176DnK.A0T(view, R.id.poll_message_add_icon);
        this.A01 = A0T;
        this.A00 = (IgCheckBox) AbstractC166997dE.A0R(view, R.id.poll_message_new_option_check_button);
        PollMessageOptionView pollMessageOptionView = (PollMessageOptionView) AbstractC166997dE.A0R(view, R.id.poll_message_new_option_view);
        this.A02 = pollMessageOptionView;
        IgEditText igEditText = pollMessageOptionView.A00;
        if (igEditText == null) {
            C14360o3.A0F("editText");
            throw C00O.createAndThrow();
        }
        igEditText.setBackground(null);
        ViewOnClickListenerC48072LPx.A01(A0T, 44, this);
    }
}
