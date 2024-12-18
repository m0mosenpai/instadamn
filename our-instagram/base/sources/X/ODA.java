package X;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;

/* loaded from: classes9.dex */
public final class ODA {
    public final View A00;
    public final View A01;
    public final ConstraintLayout A02;
    public final IgTextView A03;
    public final IgTextView A04;

    public ODA(View view) {
        C14360o3.A0B(view, 1);
        this.A01 = view;
        this.A02 = (ConstraintLayout) AbstractC166987dD.A0c(view, R.id.ig_basic_metadata_footer_container);
        this.A04 = AbstractC31175DnJ.A0L(view, R.id.footer_title);
        this.A03 = AbstractC31175DnJ.A0L(view, R.id.footer_subtitle);
        this.A00 = AbstractC166987dD.A0c(view, R.id.footer_chevron_right);
    }
}
