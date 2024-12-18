package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.button.IgdsButton;

/* loaded from: classes11.dex */
public final class UJR extends C3OO {
    public final View A00;
    public final IgTextView A01;
    public final IgTextView A02;
    public final IgImageView A03;
    public final IgdsButton A04;

    public UJR(View view) {
        super(view);
        this.A00 = AbstractC166987dD.A0c(view, R.id.priority_action);
        this.A03 = AbstractC37302Gc3.A0K(view, R.id.priority_action_cell_icon);
        this.A02 = (IgTextView) AbstractC166987dD.A0c(view, R.id.priority_action_cell_title);
        this.A01 = (IgTextView) AbstractC166987dD.A0c(view, R.id.priority_action_cell_subtitle);
        this.A04 = (IgdsButton) AbstractC166987dD.A0c(view, R.id.priority_action_cell_button);
    }
}
