package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* loaded from: classes6.dex */
public final class FLP {
    public final ViewGroup A00;
    public final IgTextView A01;
    public final SpinnerImageView A02;

    public FLP(View view) {
        ViewGroup A0F = AbstractC31173DnH.A0F(view, R.id.row_search_for_x_container);
        this.A00 = A0F;
        A0F.setVisibility(0);
        IgTextView A0X = AbstractC31172DnG.A0X(view, R.id.row_search_for_x_textview);
        this.A01 = A0X;
        this.A02 = (SpinnerImageView) view.requireViewById(R.id.search_loading_spinner);
        A0X.A00 = true;
    }
}
