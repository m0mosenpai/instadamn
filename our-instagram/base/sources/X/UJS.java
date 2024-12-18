package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.igds.components.button.IgdsButton;

/* loaded from: classes11.dex */
public final class UJS extends C3OO {
    public final View A00;
    public final View A01;
    public final IgEditText A02;
    public final IgdsButton A03;
    public final IgdsButton A04;

    public UJS(View view) {
        super(view);
        this.A01 = view;
        this.A03 = (IgdsButton) AbstractC166997dE.A0R(view, R.id.question_sheet_action_button);
        this.A00 = AbstractC166997dE.A0S(view, R.id.question_input);
        this.A04 = (IgdsButton) AbstractC166997dE.A0R(view, R.id.question_input_submit_button);
        this.A02 = (IgEditText) AbstractC166997dE.A0R(view, R.id.question_input_edit_text);
    }
}
