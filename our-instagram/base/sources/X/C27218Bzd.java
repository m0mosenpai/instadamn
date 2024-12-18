package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.Bzd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27218Bzd extends AbstractC27459CAb {
    public final IgTextView A00;
    public final IgImageView A01;
    public final IgdsButton A02;
    public final IgdsButton A03;

    public C27218Bzd(View view) {
        C14360o3.A0B(view, 1);
        this.A02 = (IgdsButton) AbstractC166997dE.A0R(view, R.id.control_view_left_button);
        this.A03 = (IgdsButton) AbstractC166997dE.A0R(view, R.id.control_view_right_button);
        this.A01 = AbstractC167007dF.A0T(view, R.id.control_view_close_button);
        this.A00 = AbstractC25231BEo.A0d(view, R.id.control_view_question);
    }
}
