package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* loaded from: classes9.dex */
public final class OD1 {
    public final View A00;
    public final View A01;
    public final View A02;
    public final RecyclerView A03;
    public final SpinnerImageView A04;

    public OD1(View view) {
        this.A00 = view;
        this.A02 = AbstractC166997dE.A0S(view, R.id.loading_indicator);
        this.A04 = (SpinnerImageView) AbstractC166997dE.A0R(view, R.id.loading_spinner);
        this.A01 = AbstractC166997dE.A0S(view, R.id.hashtag_suggestions_title);
        this.A03 = (RecyclerView) AbstractC166997dE.A0R(view, R.id.hashtag_suggestions_recycler_view);
    }
}
