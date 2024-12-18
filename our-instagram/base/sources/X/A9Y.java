package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* loaded from: classes4.dex */
public final class A9Y {
    public final View A00;
    public final ImageView A01;
    public final TextView A02;
    public final TextView A03;
    public final CircularImageView A04;

    public A9Y(View view) {
        C14360o3.A0B(view, 1);
        this.A00 = view;
        this.A03 = AbstractC167007dF.A0N(view, R.id.row_feed_survey_title);
        this.A02 = AbstractC167007dF.A0N(view, R.id.row_feed_survey_subtitle);
        this.A04 = (CircularImageView) AbstractC166997dE.A0R(view, R.id.row_feed_survey_header_image);
        this.A01 = (ImageView) AbstractC166997dE.A0R(view, R.id.dotMoreLayout);
    }
}
